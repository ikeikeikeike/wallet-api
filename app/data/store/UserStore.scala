package data.store

import com.google.inject.ImplementedBy
import com.mysql.jdbc.exceptions.jdbc4.{MySQLIntegrityConstraintViolationException => DuplicatedError}
import data.entity.Tables._
import data.store.db._
import error.AccountError
import javax.inject.Inject
import play.api.db.slick.DatabaseConfigProvider
import util.RawPassword

import scala.concurrent.{ExecutionContext, Future}

@ImplementedBy(classOf[UserStoreImpl])
trait UserStore  {
  def findByEmail(email: String): Future[Option[UsersRow]]
  def register(email: String, password: RawPassword): Future[Either[AccountError, UsersRow]]
}

class UserStoreImpl @Inject()(val dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext)
  extends DBStore with UserStore {
  import dbConfig.profile.api._

  def findByEmail(email: String): Future[Option[UsersRow]] = {
    val q = for (u <- Users if u.email === email) yield u
    db.run(q.result.headOption)
  }

  def register(email: String, password: RawPassword): Future[Either[AccountError, UsersRow]] = {
    val user = UsersRow(None, email, email, password.encrypt, None, None)
    val query = Users returning Users.map(_.id) into ((user, id) => user.copy(id=Some(id))) += user

    db.run(query.transactionally).map { row =>
      Right(row)
    } recover {
      case _: DuplicatedError => Left(AccountError.DuplicatedEmail)
      case e                  => Left(AccountError.Unknown(e.toString))
    }
  }
}
