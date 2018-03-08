package ui.controller

import io.kanaka.monadic.dsl._
import javax.inject.Inject
import play.api.libs.json.Json
import play.api.mvc.Request
import ui.presenter.AccountPresenter

import scala.concurrent.{ExecutionContext, Future}

case class AuthJson(email: String, password: String)

object AuthJson {
  implicit val authJsonFormat = Json.format[AuthJson]
}

class AccountController @Inject() (presenter: AccountPresenter)(implicit ec: ExecutionContext) extends BaseController {

  import play.api.libs.json._

  def index = Action.async { implicit req =>
    for (user <- presenter.findByEmail("unko")) yield {
      println(user)
    }

    Future.successful(Ok(Json.obj("status" -> "ok")))
  }

  def signUp = Action.async(parse.json) { implicit req: Request[JsValue] =>
    req.body.validate[AuthJson] match {
      case s: JsSuccess[AuthJson] =>
        val (email, password) = (s.value.email, s.value.password)
        for {
          user <- presenter.signUp(email, password) ?| (err => BadRequest(Json.obj("status" -> err.msg)))
        } yield Ok(Json.obj("status" -> "ok", "data" -> Json.obj("token" -> user.email))) // user.token
      case e: JsError =>
        Future.successful(BadRequest(Json.obj("status" -> "error", "data" -> JsError.toJson(e))))
    }
  }

//  def login = Action.async(parse.json) { implicit req: Request[JsValue] =>
//    request.body.validate[AuthJson] match {
//      case s: JsSuccess[AuthJson] => {
//        (for (
//          token <- loginService.login(s.value.email, s.value.password)
//        ) yield Ok(Json.obj("status" -> "ok", "data" -> Json.obj("token" -> token)))).recover {
//          case e: Exception => {
//            logger.error("Failed to get Json Web Token", e)
//            InternalServerError(Json.obj("status" -> "error"))
//          }
//        }
//      }
//      case e: JsError => {
//        Future.successful(BadRequest(Json.obj("status" -> "error")))
//      }
//    }
//  }
}

