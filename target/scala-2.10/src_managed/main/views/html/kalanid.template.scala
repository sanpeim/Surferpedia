
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
object kalanid extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("kalanid")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
   <div class="container">
     <div class="row">
        <div class=col-md-4>
            <div class="well">
                <div class="kalani-pic"></div>
            </div>
        </div>
        <div class=col-md-8>
            <div class="well">
                <h1>Kalani David</h1>
                <p>Kalani David. The 14-year-old Costa-Rica-born-Hawaiian-pro-skater-slash-pro-surfer is looking very uncomfortable seated across from me at a roadside eatery in Bali. The World Junior Championships are on and as of yesterday, he is now the highest ranked surfer in the world for his age (having lost out in Round 4 to one of the event favorite's, Conner Coffin).</p>
                <p>His strengths are airs and his weaknesses are definitely turns. He's working on turns. He's been filming a lot lately, and has some footage of his turns, so he wants to improve that. If he could combine more rail surfing with airs, he thinks he'd do a lot better.</p>
                <p>As David confronts the painstaking decision of whether to pursue a career in skating or surfing, you might think the injury toll alone would be enough to make up his mind. But you'd be wrong. "If it was life or death, and I had to choose skating or surfing, I'd choose death," he says. </p>
            </div>
        </div>
     </div>
   </div>
""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 07 10:59:31 HST 2013
                    SOURCE: /Users/scotthonda/Documents/Surferpedia/app/views/kalanid.scala.html
                    HASH: a25c31de89bef7e77170f1e560f0deb716af32a6
                    MATRIX: 776->1|887->18|924->21|947->36|986->38|2345->1366
                    LINES: 26->1|29->1|31->3|31->3|31->3|49->21
                    -- GENERATED --
                */
            