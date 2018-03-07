package ui.controller

import javax.inject.Inject
import ui.presenter.LoginPresenter

import scala.concurrent.{ExecutionContext, Future}


class LoginController @Inject() (presenter: LoginPresenter)(implicit ec: ExecutionContext) extends BaseController {

  import play.api.libs.json._

  implicit val loginReads: Reads[LoginJson] = Json.reads[LoginJson]

  case class LoginJson(email: String, password: String)

  def index = Action.async { implicit request =>

    for (user <- presenter.findByEmail("unko")) yield {
      println(user)
    }

    Future.successful(Ok(Json.obj("status" -> "ok")))
  }

//  def login = Action.async(parse.json) { implicit request: Request[JsValue] =>
//    request.body.validate[LoginJson] match {
//      case s: JsSuccess[LoginJson] => {
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

