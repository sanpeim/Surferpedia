
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
object jakem extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("jakem")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
   <div class="container">
     <div class="row">
        <div class=col-md-4>
            <div class="well">
                <div class="jake-pic"></div>
            </div>
        </div>
        <div class=col-md-8>
            <div class="well">
                <h1>Jake Marshall</h1>
                <p>Many young surfers have the potential to make an impact on our sport, but none look more poised to do so than Jake Marshall. Raised on the rippable beachbreaks and reefs of San Diego's North County, Jake has developed a solid base of smooth rail work as well as the kind of flair that few 14-year-old surfers can match. </p>
                <p>His progression is due in no small part to the numerous world-class talents in his neighborhood that have taught him a thing or two about tearing Seaside apart. "I see Rob Machado, Josh Kerr, Damien Hobgood, and Taylor Knox out all the time, and it's really fun to surf with guys on that level," says Jake. "I look at them and think, 'That's how I have to surf if I want to make the Tour one day.' That really helps me push my limits."</p>
                <p>Already, he's had remarkable success in a jersey, including a recent win at the U.S. Surfing Championships at Lower Trestles. But while surf stardom seems inevitable for Jake, he's still just a kid, and knows where his priorities should be. </p>
            </div>
        </div>
        
     </div>
   </div>
""")))})),format.raw/*22.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 07 10:59:31 HST 2013
                    SOURCE: /Users/scotthonda/Documents/Surferpedia/app/views/jakem.scala.html
                    HASH: 7620b555ea134cb1fdb2b99e2d2ac31c43a3494d
                    MATRIX: 774->1|885->18|922->21|943->34|982->36|2436->1459
                    LINES: 26->1|29->1|31->3|31->3|31->3|50->22
                    -- GENERATED --
                */
            