package data.repo

import com.google.inject.ImplementedBy
import data.entity.Tables._
import data.store.UserStore
import error.AccountError
import javax.inject.Inject
import util.RawPassword

import scala.concurrent.Future

@ImplementedBy(classOf[UserRepoImpl])
trait UserRepo {
  def findByEmail(email: String): Future[Option[UsersRow]]
  def register(email: String, rawPassword: RawPassword): Future[Either[AccountError, UsersRow]]
}

class UserRepoImpl @Inject()(userStore: UserStore) extends UserRepo {

  def findByEmail(email: String): Future[Option[UsersRow]] = userStore.findByEmail(email)

  def register(email: String, rawPassword: RawPassword):Future[Either[AccountError, UsersRow]] = {
    userStore.register(email, rawPassword)
  }

}
