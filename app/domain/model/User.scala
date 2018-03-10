package domain.model

import play.api.libs.json.Json

case class User(id: Option[Int], name: String, email: String, password: String) {
  def token: String = {
    email

    //  def getToken(id: Int): Future[String] = {
    //    val v = Map("id" -> id.asInstanceOf[AnyRef])
    //    val claim = JwtSupport.createClaims(v)
    //    Future.successful(JwtSupport.encode(claim))
    //  }

  }
}

object User { implicit val userFormat = Json.format[User] }
