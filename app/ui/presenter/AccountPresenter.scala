package ui.presenter

import com.google.inject.ImplementedBy
import domain.model.User
import domain.usecase.AccountUseCase
import error.AccountError
import javax.inject.Inject

import scala.concurrent.Future

@ImplementedBy(classOf[AccountPresenterImpl])
trait AccountPresenter {
  def findByEmail(email: String): Future[Option[User]]
  def signIn(email: String, password: String): Future[Either[AccountError, User]]
  def signUp(email: String, password: String): Future[Either[AccountError, User]]
}

class AccountPresenterImpl @Inject() (accountUseCase: AccountUseCase) extends AccountPresenter {

  def findByEmail(email: String): Future[Option[User]] = {
    accountUseCase.findByEmail(email)
  }

  def signIn(email: String, password: String): Future[Either[AccountError, User]] = ???

  def signUp(email: String, password: String): Future[Either[AccountError, User]] = {
    accountUseCase.signUp(email, password)
  }

}
