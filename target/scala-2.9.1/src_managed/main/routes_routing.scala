// @SOURCE:/home/kendrickmanalo/git/codebase/play203_foundation322/conf/routes
// @HASH:9424051b3b5f4b5b24a26cea6aa06528b11b69a5
// @DATE:Wed Dec 19 11:37:02 PHT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:8
val controllers_Registration_index1 = Route("GET", PathPattern(List(StaticPart("/register"))))
                    

// @LINE:9
val controllers_Registration_processReg2 = Route("POST", PathPattern(List(StaticPart("/register"))))
                    

// @LINE:11
val controllers_Login_index3 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:14
val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/register""","""controllers.Registration.index(validator:String)"""),("""POST""","""/register""","""controllers.Registration.processReg"""),("""GET""","""/login""","""controllers.Login.index"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:8
case controllers_Registration_index1(params) => {
   call(params.fromQuery[String]("validator", None)) { (validator) =>
        invokeHandler(_root_.controllers.Registration.index(validator), HandlerDef(this, "controllers.Registration", "index", Seq(classOf[String])))
   }
}
                    

// @LINE:9
case controllers_Registration_processReg2(params) => {
   call { 
        invokeHandler(_root_.controllers.Registration.processReg, HandlerDef(this, "controllers.Registration", "processReg", Nil))
   }
}
                    

// @LINE:11
case controllers_Login_index3(params) => {
   call { 
        invokeHandler(_root_.controllers.Login.index, HandlerDef(this, "controllers.Login", "index", Nil))
   }
}
                    

// @LINE:14
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                