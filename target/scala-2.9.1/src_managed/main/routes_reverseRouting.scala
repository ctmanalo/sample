// @SOURCE:/home/kendrickmanalo/git/codebase/play203_foundation322/conf/routes
// @HASH:9424051b3b5f4b5b24a26cea6aa06528b11b69a5
// @DATE:Wed Dec 19 11:37:02 PHT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:11
class ReverseLogin {
    


 
// @LINE:11
def index() = {
   Call("GET", "/login")
}
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:9
// @LINE:8
class ReverseRegistration {
    


 
// @LINE:8
def index(validator:String) = {
   Call("GET", "/register" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("validator", validator)))))
}
                                                        
 
// @LINE:9
def processReg() = {
   Call("POST", "/register")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:11
class ReverseLogin {
    


 
// @LINE:11
def index = JavascriptReverseRoute(
   "controllers.Login.index",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:9
// @LINE:8
class ReverseRegistration {
    


 
// @LINE:8
def index = JavascriptReverseRoute(
   "controllers.Registration.index",
   """
      function(validator) {
      return _wA({method:"GET", url:"/register" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("validator", validator)])})
      }
   """
)
                                                        
 
// @LINE:9
def processReg = JavascriptReverseRoute(
   "controllers.Registration.processReg",
   """
      function() {
      return _wA({method:"POST", url:"/register"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {

// @LINE:11
class ReverseLogin {
    


 
// @LINE:11
def index() = new play.api.mvc.HandlerRef(
   controllers.Login.index(), HandlerDef(this, "controllers.Login", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:9
// @LINE:8
class ReverseRegistration {
    


 
// @LINE:8
def index(validator:String) = new play.api.mvc.HandlerRef(
   controllers.Registration.index(validator), HandlerDef(this, "controllers.Registration", "index", Seq(classOf[String]))
)
                              
 
// @LINE:9
def processReg() = new play.api.mvc.HandlerRef(
   controllers.Registration.processReg(), HandlerDef(this, "controllers.Registration", "processReg", Seq())
)
                              

                      
    
}
                            
}
                    
                