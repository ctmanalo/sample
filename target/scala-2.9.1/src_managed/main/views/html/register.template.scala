
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
object register extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[controllers.User],String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(registerForm: Form[controllers.User], validator : String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.60*/("""

"""),_display_(Seq[Any](/*3.2*/main("Register")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
  <h2 align="center">Registration Form</h2>
  <br/><br/> 
<form class="eight columns offset-by-three" method="POST" action=""""),_display_(Seq[Any](/*6.68*/routes/*6.74*/.Registration.processReg)),format.raw/*6.98*/("""" id="regForm">

<div class="row">
	<div class="nine columns">
   		 <div class="row collapse">
 			 <div class="nine columns push-three">
   			 <input required="required" type="text" name="fname"  value=""""),_display_(Seq[Any](/*12.69*/registerForm("fname")/*12.90*/.value)),format.raw/*12.96*/("""">
 			 </div>
 			 <div class="three columns pull-nine">
 			<label class="left inline">First Name: </label>
			</div>
 		 </div>
	</div>
</div>

<div class="row">
	<div class="nine columns">
   		 <div class="row collapse">
 			 <div class="nine columns push-three">
   			 <input required="required" type="text" name="lname"  value=""""),_display_(Seq[Any](/*25.69*/registerForm("lname")/*25.90*/.value)),format.raw/*25.96*/("""">
 			 </div>
 			 <div class="three columns pull-nine">
			 <label class="left inline">Last Name: </label>
 			</div>
 		 </div>
	</div>
</div>

<div class="row">
	<div class="nine columns">
   		 <div class="row collapse">
 			 <div class="nine columns push-three">
   			   <input type="text" required="required" name="add"  value=""""),_display_(Seq[Any](/*38.69*/registerForm("add")/*38.88*/.value)),format.raw/*38.94*/("""">
              <input type="text"  >
			  <input type="text"  > 
 			 </div>
 			 <div class="three columns pull-nine">
 			<label class="left inline">Address: </label>
			</div>
 		 </div>
	</div>
</div>

<div class="row">
	<div class="nine columns">
   		 <div class="row collapse">
 			 <div class="nine columns push-three">
   			  <input required="required" type="date" name="bdate"  value=""""),_display_(Seq[Any](/*53.70*/registerForm("bdate")/*53.91*/.value)),format.raw/*53.97*/(""""> 
 			 </div>
 			 <div class="three columns pull-nine">
 			<label class="left inline">Birth Date:</label>
			</div>
 		 </div>
	</div>
</div>

<div class="row">
	<div class="nine columns">
   		 <div class="row collapse">
 			 <div class="nine columns push-three">
   			 <input required="required" type="text" name="cnum"  value=""""),_display_(Seq[Any](/*66.68*/registerForm("cnum")/*66.88*/.value)),format.raw/*66.94*/("""">
 			 </div>
 			 <div class="three columns pull-nine">
 			  <label class="left inline">Contact Number: </label>
			</div>
 		 </div>
	</div>
</div>


<br/>
<br/>
		<div class="five columns centered">
    <input type="submit" class="radius button "value="Register" onclick="return Validate()"/>

     </div>
      </form>
          
</div>


      
    </form>
""")))})),format.raw/*89.2*/("""

<script type="text/javascript">
  $(document).ready(function() """),format.raw("""{"""),format.raw/*92.33*/("""
    """),_display_(Seq[Any](/*93.6*/if(validator == "TRUE")/*93.29*/{_display_(Seq[Any](format.raw/*93.30*/("""
    	$("#myModal").reveal();
    """)))})),format.raw/*95.6*/("""
  
  """),format.raw("""}"""),format.raw/*97.4*/(""");
  function Validate()
  """),format.raw("""{"""),format.raw/*99.4*/("""
          var x = document.sform.phone_no.value;
         
          if (x==null || x=="")
   	 """),format.raw("""{"""),format.raw/*103.7*/("""
   		 alert("Phone no. cannot be left blank");
   		 return false;
   	 """),format.raw("""}"""),format.raw/*106.7*/("""       

         	 if(isNaN(x)|| x.indexOf(" ")!=-1)
  	"""),format.raw("""{"""),format.raw/*109.5*/("""
                			alert("Enter numeric value");
  			return false;
                  """),format.raw("""}"""),format.raw/*112.20*/("""
         			 if (x.length > 10)
  			"""),format.raw("""{"""),format.raw/*114.7*/("""
                  			alert("enter 10 characters"); 
  				return false;
            			 """),format.raw("""}"""),format.raw/*117.18*/("""
         
  """),format.raw("""}"""),format.raw/*119.4*/("""

</script>

 <div id="myModal" class="reveal-modal [expand]">
  <h2>Sample Message</h2>
  <p class="lead">You Have Successfully Registered.</p>
  <p> Thank you! </p>
  <a class="close-reveal-modal">&#215;</a>
  <a href=""""),_display_(Seq[Any](/*128.13*/routes/*128.19*/.Login.index)),format.raw/*128.31*/("""" class="radius button" >Login</a>
</div>

"""))}
    }
    
    def render(registerForm:Form[controllers.User],validator:String) = apply(registerForm,validator)
    
    def f:((Form[controllers.User],String) => play.api.templates.Html) = (registerForm,validator) => apply(registerForm,validator)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 19 17:12:58 PHT 2012
                    SOURCE: /home/kendrickmanalo/git/codebase/play203_foundation322/app/views/register.scala.html
                    HASH: fdb426be7540badcf89c91b7d1fb54237eedb10a
                    MATRIX: 531->1|666->59|703->62|727->78|766->80|927->206|941->212|986->236|1229->443|1259->464|1287->470|1660->807|1690->828|1718->834|2091->1171|2119->1190|2147->1196|2582->1595|2612->1616|2640->1622|3012->1958|3041->1978|3069->1984|3465->2349|3578->2415|3619->2421|3651->2444|3690->2445|3756->2480|3809->2487|3883->2515|4028->2613|4149->2687|4254->2745|4390->2833|4476->2872|4614->2962|4675->2976|4934->3198|4950->3204|4985->3216
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|27->6|33->12|33->12|33->12|46->25|46->25|46->25|59->38|59->38|59->38|74->53|74->53|74->53|87->66|87->66|87->66|110->89|113->92|114->93|114->93|114->93|116->95|118->97|120->99|124->103|127->106|130->109|133->112|135->114|138->117|140->119|149->128|149->128|149->128
                    -- GENERATED --
                */
            