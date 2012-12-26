
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Homepage")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
  <h2>Home Page</h2>  
""")))})),format.raw/*5.2*/("""
"""))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 14 15:07:04 PHT 2012
                    SOURCE: /home/kendrickmanalo/git/codebase/play203_foundation322/app/views/index.scala.html
                    HASH: b431cbcef6d1520e070d4213a70405442c4c837c
                    MATRIX: 505->1|599->18|636->21|660->37|699->39|754->64
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5
                    -- GENERATED --
                */
            