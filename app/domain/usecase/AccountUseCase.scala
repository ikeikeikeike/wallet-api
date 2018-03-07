package domain.usecase

import com.google.inject.ImplementedBy
import data.repo.UserRepo
import domain.model.User
import domain.trans.UserTranslator
import javax.inject.Inject

import scala.concurrent.Future


@ImplementedBy(classOf[AccountUseCaseImpl])
trait AccountUseCase {
  def login(email: String, password: String): Future[String]
  def findByEmail(email: String): Future[Option[User]]
}

class AccountUseCaseImpl @Inject()(
  userRepo: UserRepo,
  userTrans: UserTranslator
) extends AccountUseCase {

  def login(email: String, password: String): Future[String] = ???

  def findByEmail(email: String): Future[Option[User]] = {
    val user = userRepo.findByEmail(email)
    userTrans.translate(user)
  }

}
