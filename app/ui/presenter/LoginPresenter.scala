package ui.presenter

import com.google.inject.ImplementedBy
import domain.model.User
import domain.usecase.AccountUseCase
import javax.inject.Inject

import scala.concurrent.Future

@ImplementedBy(classOf[LoginPresenterImpl])
trait LoginPresenter {
  def findByEmail(email: String): Future[Option[User]]
}

class LoginPresenterImpl @Inject() (accountUseCase: AccountUseCase) extends LoginPresenter {
  def findByEmail(email: String): Future[Option[User]] = {
    accountUseCase.findByEmail(email)
  }
}
