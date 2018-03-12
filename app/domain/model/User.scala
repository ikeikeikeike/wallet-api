package domain.model

import play.api.libs.json.Json
import util.jwt.JwtSupport

import scala.collection.mutable

case class User(id: Option[Int], name: String, email: String, password: String) {
  def token: Option[String] = {
    id match {
      case Some(i) =>
        val v = mutable.Map("id" -> i.asInstanceOf[AnyRef])
        Some(JwtSupport.encode(JwtSupport.createClaims(v)))
      case None    =>
        None
    }
  }
}

object User { implicit val userFormat = Json.format[User] }
