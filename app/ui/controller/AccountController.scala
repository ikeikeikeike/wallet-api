package ui.controller

import io.kanaka.monadic.dsl._
import javax.inject.Inject
import play.api.libs.json.Json
import play.api.mvc.Request
import ui.presenter.AccountPresenter

import scala.concurrent.{ExecutionContext, Future}

case class AuthJson(email: String, password: String)
object AuthJson { implicit val authJsonFormat = Json.format[AuthJson] }

class AccountController @Inject() (authAction: AuthAction, presenter: AccountPresenter)(implicit ec: ExecutionContext) extends BaseController {

  import play.api.libs.json._

  def index = authAction.async { implicit req =>
    Future.successful(Ok(Json.obj("user" -> req.ctx.user)))
  }

  def signIn = Action.async(parse.json) { implicit req: Request[JsValue] =>
    req.body.validate[AuthJson] match {
      case s: JsSuccess[AuthJson] =>
        val (email, password) = (s.value.email, s.value.password)
        for {
          user <- presenter.signIn(email, password) ?| (e => BadRequest(Json.obj("status" -> e.message)))
        } yield Ok(Json.obj("status" -> "ok", "data" -> Json.obj("token" -> user.token)))
      case e: JsError =>
        Future.successful(BadRequest(Json.obj("status" -> "error", "data" -> JsError.toJson(e))))
    }
  }

  def signUp = Action.async(parse.json) { implicit req: Request[JsValue] =>
    req.body.validate[AuthJson] match {
      case s: JsSuccess[AuthJson] =>
        val (email, password) = (s.value.email, s.value.password)
        for {
          user <- presenter.signUp(email, password) ?| (e => BadRequest(Json.obj("status" -> e.message)))
        } yield Ok(Json.obj("status" -> "ok", "data" -> Json.obj("token" -> user.token)))
      case e: JsError =>
        Future.successful(BadRequest(Json.obj("status" -> "error", "data" -> JsError.toJson(e))))
    }
  }

}

