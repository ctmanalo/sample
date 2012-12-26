package controllers

import play.api.mvc._
import play.api.libs.ws.Response
import play.api.mvc.Action
import views._
import play.api.mvc.Controller
import play.api.libs.ws.WS


object Login extends Controller {
  def index = Action {
    Ok(html.login("Your new application is ready."))
  }
  
}
