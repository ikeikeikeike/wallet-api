package domain.trans

import data.entity.Tables.UsersRow
import domain.model.User
import javax.inject.{Inject, Singleton}

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class UserTranslator @Inject() (implicit ec: ExecutionContext)
  extends Translator[Future[Option[UsersRow]], Future[Option[User]]] {

  def translate(entity: Future[Option[UsersRow]]): Future[Option[User]] = {
    for (entity <- entity) yield entity.map(e => User(
      id=e.id,
      name=e.name,
      email=e.email,
      password=e.password
    ))
  }
}
