package controllers


import play.api.data.Form
import play.api.mvc.Action
import play.api.mvc.Controller
import views.html
import play.api.Play.current
import play.api.data.Forms._
import views.html
import controllers.Registration$


case class User(fname: String, lname: String, add: String, bday: String, cnum: String)

object Registration extends Controller {
  
  
   val userForm: Form[User] = Form(
    mapping(
      "fname" -> nonEmptyText,
      "lname" -> nonEmptyText,
      "add" -> text,
      "bdate" -> nonEmptyText,
      "cnum" -> nonEmptyText
      )(User.apply)(User.unapply)
)

def index(validator:String) = Action {
     implicit request =>
    Ok(html.register(userForm, validator))

  }
  
  
  def processReg = Action {
    implicit request =>
      userForm.bindFromRequest.fold(
        error => {
          println(error)
          val validator = "FALSE"
          Ok(html.register(error, validator))
        },
        success = label => {
          println("save")
        // sid(label)
       //   val title  = "home page"
         // Ok(html.main(title))
              Redirect(controllers.routes.Registration.index("TRUE"))

        })
}
}