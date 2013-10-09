
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
object KeliaMoniz extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/(""" """),_display_(Seq[Any](/*1.21*/Main("Kelia")/*1.34*/ {_display_(Seq[Any](format.raw/*1.36*/("""
<div class="container">
  <div class="row">

    <div class="col-md-4">
      <div class="keliamoniz"></div>
    </div>

    <div class="col-md-8">
      <h2>Kelia Moniz</h2>
      <p>Multi-talented Japanese, Hawaiian, Portuguese, Chinese, Irish beauty Kelia Moniz grew up in a surfing family that
      spends more time in the water than on land. Raised with four brothers and an ex-professional surfer for a father,
      Kelia (known by friends and family as Sister) definitely knows how to surf with the boys. She proved her merit
      last year by being the only girl to make it to the semifinals in the noseriding event at the Corona Hawaiian Open.
      </p>
      <p>Growing up on Oahu, Kelia began surfing at the age of five and spent most of her life as a longboarder, recently
      adding shortboarding to her repeptoire in order to enjoy riding with her brothers. Her family's strong bond and
      ties to surfing - they own and operate Faith Surf School in Waikiki and all of the children are homeschooled -
      have been an important influence in her life, both in and out of the water. When asked about her favorite surf
      memory, Kelia quickly responds, "watching my Dad teach a man with no arms or legs to surf, it was absolutely
      amazing!"</p>
      <p>A born competitor, Kelia began her amateur career amongst her brothers and friends in unofficial
      contests organized and judged by her father. Recently, Kelia has been boldly competing against top adult pros in
      contests across the globe, including Europe and California. This past year she has demonstrated her contest
      prowess on both a longboard and shortboard with a second place finish in the Roxy Jam Honolulu (longboard) and a
      first place finish at the NSSA High School Nationals (shortboard). The ease with which she competes on both a long
      and short board makes Kelia a force to watch in the coming years.</p>

    </div>

  </div>
</div>
""")))})),format.raw/*33.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 09 10:57:10 HST 2013
                    SOURCE: /Users/rckndn/git/sanpeim/Surferpedia/app/views/KeliaMoniz.scala.html
                    HASH: d48855b1ab1cabe185c8ebbe5ec720501b424b6e
                    MATRIX: 779->1|890->18|927->20|948->33|987->35|2980->1997
                    LINES: 26->1|29->1|29->1|29->1|29->1|61->33
                    -- GENERATED --
                */
            