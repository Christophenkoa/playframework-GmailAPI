
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import models.User
/*2.2*/import play.mvc.Http.Request

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[User],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.6*/(addMessageForm : Form[User])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*17.10*/import helper._


Seq[Any](format.raw/*4.92*/(""" 

        """),format.raw/*6.9*/("""<!DOCTYPE html>
        <html>
         <head>
         <title>Form page</title>
         <link rel="stylesheet" media="screen" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("stylesheets/form.css")),format.raw/*10.102*/("""">
         </head>
         <body>

        <h1>WELCOME TO OUR REGISTRATION PLATFORM</h1>


        """),format.raw/*18.1*/("""
        """),_display_(/*19.10*/helper/*19.16*/.form(action = routes.HomeController.sentMessage())/*19.67*/ {_display_(Seq[Any](format.raw/*19.69*/("""
        """),_display_(/*20.10*/helper/*20.16*/.CSRF.formField),format.raw/*20.31*/("""
        """),_display_(/*21.10*/helper/*21.16*/.inputText(addMessageForm("email"))),format.raw/*21.51*/("""
        """),_display_(/*22.10*/helper/*22.16*/.inputText(addMessageForm("message"))),format.raw/*22.53*/("""

        """),format.raw/*24.9*/("""<input type="submit" class="btn-primary" value="send">

        """)))}),format.raw/*26.10*/("""

"""),_display_(/*28.2*/if(request.flash.data.contains("danger"))/*28.43*/ {_display_(Seq[Any](format.raw/*28.45*/("""
    """),format.raw/*29.5*/("""<h1>"""),_display_(/*29.10*/request/*29.17*/.flash.get("danger")),format.raw/*29.37*/(""" """),format.raw/*29.38*/("""</h1>
""")))}),format.raw/*30.2*/("""

"""),_display_(/*32.2*/if(request.flash.data.contains("success"))/*32.44*/ {_display_(Seq[Any](format.raw/*32.46*/("""
    """),format.raw/*33.5*/("""<h1>"""),_display_(/*33.10*/request/*33.17*/.flash.get("success")),format.raw/*33.38*/(""" """),format.raw/*33.39*/("""</h1>
""")))}),format.raw/*34.2*/("""

"""),format.raw/*36.1*/("""<!--"""),_display_(/*36.6*/if(addMessageForm .hasGlobalErrors)/*36.41*/ {_display_(Seq[Any](format.raw/*36.43*/("""
    """),format.raw/*37.5*/("""<p class="error">
        """),_display_(/*38.10*/for(error <- addMessageForm .globalErrors) yield /*38.52*/ {_display_(Seq[Any](format.raw/*38.54*/("""
            """),format.raw/*39.13*/("""<p>"""),_display_(/*39.17*/error/*39.22*/.format(messages)),format.raw/*39.39*/("""</p>
        """)))}),format.raw/*40.10*/("""
    """),format.raw/*41.5*/("""</p>
""")))}),format.raw/*42.2*/("""-->
    </body>
    </html>

"""))
      }
    }
  }

  def render(addMessageForm:Form[User],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(addMessageForm)(request,messages)

  def f:((Form[User]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (addMessageForm) => (request,messages) => apply(addMessageForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-03-07T14:05:46.213485
                  SOURCE: /home/christophe/Downloads/play-samples-play-java-hello-world-tutorial/app/views/addUser.scala.html
                  HASH: fb8379b38844566d3725760cd8759464a1a2aa8a
                  MATRIX: 611->1|637->21|1003->56|1164->437|1209->142|1246->153|1408->288|1423->294|1486->335|1614->453|1651->463|1666->469|1726->520|1766->522|1803->532|1818->538|1854->553|1891->563|1906->569|1962->604|1999->614|2014->620|2072->657|2109->667|2205->732|2234->735|2284->776|2324->778|2356->783|2388->788|2404->795|2445->815|2474->816|2511->823|2540->826|2591->868|2631->870|2663->875|2695->880|2711->887|2753->908|2782->909|2819->916|2848->918|2879->923|2923->958|2963->960|2995->965|3049->992|3107->1034|3147->1036|3188->1049|3219->1053|3233->1058|3271->1075|3316->1089|3348->1094|3384->1100
                  LINES: 23->1|24->2|29->4|32->17|35->4|37->6|41->10|41->10|41->10|48->18|49->19|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|52->22|52->22|54->24|56->26|58->28|58->28|58->28|59->29|59->29|59->29|59->29|59->29|60->30|62->32|62->32|62->32|63->33|63->33|63->33|63->33|63->33|64->34|66->36|66->36|66->36|66->36|67->37|68->38|68->38|68->38|69->39|69->39|69->39|69->39|70->40|71->41|72->42
                  -- GENERATED --
              */
          