package data.store

import com.google.inject.ImplementedBy
import data.entity.Tables._
import data.store.db._
import javax.inject.Inject
import play.api.db.slick.DatabaseConfigProvider

import scala.concurrent.{ExecutionContext, Future}

@ImplementedBy(classOf[UserStoreImpl])
trait UserStore extends Findable[UsersRow, Int] {
  def findByEmail(email: String): Future[Option[UsersRow]]
}

class UserStoreImpl @Inject()(val dbConfigProvider: DatabaseConfigProvider)(implicit val ec: ExecutionContext)
  extends DBStore {
  import dbConfig.profile.api._

  def findByEmail(email: String): Future[Option[UsersRow]] = {
    val q = for (u <- Users if u.email === email) yield u
    db.run(q.result.headOption)
  }

}
