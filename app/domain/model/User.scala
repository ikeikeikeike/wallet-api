package domain.model

import play.api.libs.json.Json
import util.jwt.JwtSupport

import scala.collection.mutable.Map

case class User(id: Option[Int], name: String, email: String, password: String) {
  def token: String = {
    val v = Map("id" -> id.asInstanceOf[AnyRef])
    val claim = JwtSupport.createClaims(v)
    JwtSupport.encode(claim)
  }
}

object User { implicit val userFormat = Json.format[User] }
