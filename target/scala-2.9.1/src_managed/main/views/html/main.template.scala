
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
  <head>
    <meta charset="utf-8" />

    <!-- Set the viewport width to device width for mobile -->
    <meta name="viewport" content="width=device-width" />
        
	<title>"""),_display_(Seq[Any](/*16.10*/title)),format.raw/*16.15*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*17.50*/routes/*17.56*/.Assets.at("stylesheets/main.css"))),format.raw/*17.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*18.55*/routes/*18.61*/.Assets.at("images/favicon.png"))),format.raw/*18.93*/("""">
    <script src=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.Assets.at("javascripts/modernizr.foundation.js"))),format.raw/*19.74*/("""" type="text/javascript"></script>

    <!-- IE Fix for HTML5 Tags -->
    <!--[if lt IE 9]>
      <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
  </head>
  <body>
    <header>
    <div class="row">
      <div class="twelve columns">
        <nav class="top-bar">
          <ul>
            <!-- Title Area -->
            <li class="name">
              <h1>
                <a href=" """),_display_(Seq[Any](/*35.28*/routes/*35.34*/.Application.index)),format.raw/*35.52*/("""">TheWebApp</a>
              </h1>
            </li>
            <li class="toggle-topbar"><a href="#"></a></li>
          </ul>
          <section>
            <!-- Left Nav Section -->
            <ul class="left">
              <li class="divider"></li>
              <li class="has-dropdown">
            	<a class="active" href="#">Item 1</a>
            	<ul class="dropdown">
              	  <li><label>Section Name</label></li>
              	  <li class="has-dropdown">
                    <a href="#" class="">Level 1, Has Dropdown</a>
                    <ul class="dropdown">
                      <li><a href="#">Level 2</a></li>
                      <li><a href="#">Level 2</a></li>
                      <li class="has-dropdown"><a href="#">Level 2, Has Dropdown</a>
                        <ul class="dropdown">
                          <li><label>Section</label></li>
                          <li><a href="#">Level 3</a></li>
                          <li><a href="#">Level 3</a></li>
                          <li class="divider"></li>
                          <li><a href="#">Level 3</a></li>
                        </ul>
                      </li>
                      <li><a href="#">Level 2</a></li>
                      <li><a href="#">Level 2</a></li>
                    </ul>
                  </li>
                  <li><a href="#">Level 1</a></li>
                  <li><a href="#">Level 1</a></li>
                  <li class="divider"></li>
                  <li><label>Section Name</label></li>
                  <li><a href="#">Level 1</a></li>
                  <li><a href="#">Level 1</a></li>
                  <li><a href="#">Level 1</a></li>
                  <li class="divider"></li>
                  <li><a href="#">See all &rarr;</a></li>
                </ul>
              </li>
              <li class="divider hide-for-small"></li>
            </ul>
            
             <ul class="left">
        
               <li class="has-flyout">
            	<a class="active" href=" """),_display_(Seq[Any](/*83.40*/routes/*83.46*/.Registration.index("FALSE"))),format.raw/*83.74*/("""">Register</a>
				</li>
              </ul>
          </section>
        </nav>
      </div>
    </div>
    </header>
    
    <section id="mainContent">
      <div class="row">
        <div class="twelve columns">
      	  """),_display_(Seq[Any](/*95.11*/content)),format.raw/*95.18*/("""
      	</div>
      </div>
	</section>

    <footer class="row">
      <section class="twelve columns">
        <hr>
        <span>TheWebApp &copy; 2012 TheWebAppMaker</span>
      </section>
    </footer>

    <script src=""""),_display_(Seq[Any](/*107.19*/routes/*107.25*/.Assets.at("javascripts/jquery.js"))),format.raw/*107.60*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*108.19*/routes/*108.25*/.Assets.at("javascripts/jquery.foundation.reveal.js"))),format.raw/*108.78*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*109.19*/routes/*109.25*/.Assets.at("javascripts/jquery.foundation.orbit.js"))),format.raw/*109.77*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*110.19*/routes/*110.25*/.Assets.at("javascripts/jquery.foundation.forms.js"))),format.raw/*110.77*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*111.19*/routes/*111.25*/.Assets.at("javascripts/jquery.placeholder.js"))),format.raw/*111.72*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*112.19*/routes/*112.25*/.Assets.at("javascripts/jquery.foundation.tooltips.js"))),format.raw/*112.80*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*113.19*/routes/*113.25*/.Assets.at("javascripts/app.js"))),format.raw/*113.57*/("""" type="text/javascript"></script>
  </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 19 11:37:02 PHT 2012
                    SOURCE: /home/kendrickmanalo/git/codebase/play203_foundation322/app/views/main.scala.html
                    HASH: 6f43f5ee6e02e313f02d3d7b8d09d7902715cf5f
                    MATRIX: 509->1|616->31|1215->594|1242->599|1336->657|1351->663|1407->697|1500->754|1515->760|1569->792|1626->813|1641->819|1712->868|2181->1301|2196->1307|2236->1325|4310->3363|4325->3369|4375->3397|4637->3623|4666->3630|4929->3856|4945->3862|5003->3897|5093->3950|5109->3956|5185->4009|5275->4062|5291->4068|5366->4120|5456->4173|5472->4179|5547->4231|5637->4284|5653->4290|5723->4337|5813->4390|5829->4396|5907->4451|5997->4504|6013->4510|6068->4542
                    LINES: 19->1|22->1|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|56->35|56->35|56->35|104->83|104->83|104->83|116->95|116->95|128->107|128->107|128->107|129->108|129->108|129->108|130->109|130->109|130->109|131->110|131->110|131->110|132->111|132->111|132->111|133->112|133->112|133->112|134->113|134->113|134->113
                    -- GENERATED --
                */
            