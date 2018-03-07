package data.repo

import com.google.inject.ImplementedBy
import data.entity.Tables._
import data.store.UserStore
import javax.inject.Inject

import scala.concurrent.Future

@ImplementedBy(classOf[UserRepoImpl])
trait UserRepo {
  def findByEmail(email: String): Future[Option[UsersRow]]
}

class UserRepoImpl @Inject()(userStore: UserStore) extends UserRepo {
  def findByEmail(email: String): Future[Option[UsersRow]] = userStore.findByEmail(email)
}
