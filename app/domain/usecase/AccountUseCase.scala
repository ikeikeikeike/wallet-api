package domain.usecase

import com.google.inject.ImplementedBy
import data.repo.UserRepo
import domain.model.User
import domain.trans._
import error.AccountError
import javax.inject.Inject
import util.crypto.RawPassword

import scala.concurrent.{ExecutionContext, Future}


@ImplementedBy(classOf[AccountUseCaseImpl])
trait AccountUseCase {

  def find(id: Int): Future[Option[User]]

  def findByEmail(email: String): Future[Option[User]]

  def signIn(email: String, password: String): Future[Either[AccountError, User]]

  def signUp(email: String, password: String): Future[Either[AccountError, User]]
}

class AccountUseCaseImpl @Inject()(userRepo: UserRepo, userTrans: UserTranslator)(implicit ec: ExecutionContext)
  extends AccountUseCase {

  def find(id: Int): Future[Option[User]] =
    for (user <- userRepo.find(id))
      yield userTrans.translate(user)

  def findByEmail(email: String): Future[Option[User]] =
    for (user <- userRepo.findByEmail(email))
      yield userTrans.translate(user)

  def signIn(email: String, password: String): Future[Either[AccountError, User]] = {
    for (raw <- userRepo.findByEmail(email))
      yield raw match {
        case Some(user) if RawPassword(password).checkPassword(user.password) =>
          Right(userTrans.translate(user))
        case Some(_) =>
          Left(AccountError.InvalidPassword)
        case _ =>
          Left(AccountError.UserNotFound)
      }
  }

  def signUp(email: String, password: String): Future[Either[AccountError, User]] =
    for (either <- userRepo.register(email, RawPassword(password)))
      yield either.right.map(userTrans.translate)

}
