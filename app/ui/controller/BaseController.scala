package ui.controller

import play.api.Logger
import play.api.mvc._

trait BaseController extends InjectedController {
  lazy protected[this] val logger = Logger(this.getClass.getSimpleName)
}
