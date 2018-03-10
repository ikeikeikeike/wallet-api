package ui.controller

import domain.model.User
import domain.usecase.AccountUseCase
import javax.inject.Inject
import play.api.libs.json.Json
import play.api.mvc._
import util.jwt.JwtSupport

import scala.concurrent.{ExecutionContext, Future}

case class AuthContext(user: User)

class AuthRequest[A](val context: AuthContext, request: Request[A]) extends WrappedRequest[A](request)

class AuthAction @Inject() (
  userCase: AccountUseCase
)(val parser: BodyParsers.Default, implicit val executionContext: ExecutionContext)
  extends BaseController
    with ActionBuilder[AuthRequest, AnyContent]
    with ActionRefiner[Request, AuthRequest] {

  def refine[A](request: Request[A]) = {
    val id = for {
      token <- getToken(request.headers.toSimpleMap)
      decoded <- JwtSupport.decode(token)
      id = decoded.get("id", classOf[Integer])
    } yield id
    retrieve[A](id.map(_.toInt), request)
  }

  def retrieve[A](idOpt: Option[Int], request: Request[A]): Future[Either[Result, AuthRequest[A]]] = {
    idOpt match {
      case Some(id) =>
        for (userOpt <- userCase.find(id))
          yield userOpt match {
            case Some(user) =>
              Right(new AuthRequest(AuthContext(user), request))
            case None =>
              Left(NotFound(Json.obj("status" -> "error", "meessage" -> "user does not exists")))
          }
      case _ =>
        Future.successful(Left(Forbidden(Json.obj("status" -> "error", "message" -> "not authorized"))))
    }
  }

  def getToken(headerMap: Map[String, String]): Option[String] = {
    val bearer = "Bearer "
    val header = headerMap.get("Authorization")
    header.filter(_.startsWith(bearer)).map(_.drop(bearer.length))
  }
}
