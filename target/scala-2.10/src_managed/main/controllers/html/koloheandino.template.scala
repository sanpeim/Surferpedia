
package controllers.html

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
object koloheandino extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/(""" """),_display_(Seq[Any](/*1.21*/Main("Home")/*1.33*/ {_display_(Seq[Any](format.raw/*1.35*/("""
<div class="container">

  <div class="well">
    <div class="row">
      <div class="col-md-4">

        <div class="andino"></div>

      </div>


      <div class="col-md-8">
        <p>Kolohe Andino (born March 22, 1994 in San Clemente, California) is an American surfer. He began to surf
          at age 10 and holds the record for the most National Scholastic Surfing Association championships won by a
          male competitor (9) . He won both the ASP 6-Star Quicksilver Brazil Open of Surfing[1] and the Vans Pier
          Classic world tour events in 2011. Andino's sponsors include Oakley eyewear and Hurley wetsuits and clothing.</p>


      </div>
    </div>
  </div>

</div>
""")))})),format.raw/*25.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 07 10:59:31 HST 2013
                    SOURCE: /Users/scotthonda/Documents/Surferpedia/app/controllers/koloheandino.scala.html
                    HASH: b7e1b806fe60dc4fdab97ff01189129ba7e8028c
                    MATRIX: 787->1|898->18|935->20|955->32|994->34|1719->728
                    LINES: 26->1|29->1|29->1|29->1|29->1|53->25
                    -- GENERATED --
                */
            