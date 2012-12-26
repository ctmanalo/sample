
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*2.2*/main("Login")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""

 <h2>LOGIN</h2>  


""")))})),format.raw/*7.2*/("""



"""))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 19 11:04:06 PHT 2012
                    SOURCE: /home/kendrickmanalo/git/codebase/play203_foundation322/app/views/login.scala.html
                    HASH: 2326c35014d59993d8794928937ab308f0f5282f
                    MATRIX: 505->1|599->18|635->20|656->33|695->35|748->58
                    LINES: 19->1|22->1|23->2|23->2|23->2|28->7
                    -- GENERATED --
                */
            