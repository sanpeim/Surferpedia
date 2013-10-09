
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object kolohe extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/(""" """),_display_(Seq[Any](/*1.21*/Main("Home")/*1.33*/ {_display_(Seq[Any](format.raw/*1.35*/("""
<div class="container">
     <div class="row">
        <div class=col-md-4>
            <div class="well">
                <div class="kolohe-pic"></div>
            </div>
        </div>
        <div class=col-md-8>
            <div class="well">
                <h1>Kolohe Andino</h1>
                <p>Kolohe Andino (born March 22, 1994 in San Clemente, California) is an American surfer. He began to surf
          at age 10 and holds the record for the most National Scholastic Surfing Association championships won by a
          male competitor (9) . He won both the ASP 6-Star Quicksilver Brazil Open of Surfing[1] and the Vans Pier
          Classic world tour events in 2011. Andino's sponsors include Oakley eyewear and Hurley wetsuits and clothing.</p>
            </div>
        </div>
     </div>
   </div>
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 09 10:51:08 HST 2013
                    SOURCE: /Users/rckndn/git/sanpeim/Surferpedia/app/views/kolohe.scala.html
                    HASH: ca997fb4557c9c9a1f339ec6125ca21f116ba35f
                    MATRIX: 775->1|886->18|923->20|943->32|982->34|1837->858
                    LINES: 26->1|29->1|29->1|29->1|29->1|48->20
                    -- GENERATED --
                */
            