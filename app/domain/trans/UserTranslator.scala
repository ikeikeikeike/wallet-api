package domain.trans

import data.entity.Tables.UsersRow
import domain.model.User
import javax.inject.{Inject, Singleton}

import scala.concurrent.ExecutionContext

@Singleton
class UserTranslator @Inject() (implicit ec: ExecutionContext)
  extends Translator[UsersRow, User] {

  def translate(entity: Option[UsersRow]): Option[User] = entity.map(translate)

  def translate(entity: Seq[UsersRow]): Seq[User] = entity.map(translate)

  def translate(entity: UsersRow): User = {
    val e = entity
    User(
      id=e.id,
      name=e.name,
      email=e.email,
      password=e.password
    )
  }

}
