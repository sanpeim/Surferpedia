
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
object souza extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("jakem")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
   <div class="container">
     <div class="row">
      <div class="col-md-4">
        <div class="well">
          <div class="souza-pic"></div>
        </div>
      </div>
      
      <div class="col-md-8">
        <div class="well">
          <h1>Adriano De Souza</h1>
          <p>Adriano De Souza rode his first wave at eight years old and eight years later the surf world would take notice of this young, talented surfer at the Billabong ASP World Junior Championships. At the 2004 event, he defeated opponents four years his senior and was named the youngest ASP World Junior Champion ever at 16.</p>

          <p>Spectators observed his fast, energetic surfing and he quickly became known as one of the most exciting surfers to watch. In 2005, he won the ASP WQS by the widest margin in history. That win took him into his first year on the ASP World Tour where he finished an impressive 18th in the world. Although his style is more conducive to smaller beachbreaks, he is showing his competitors that he can also handle big wave surf, giving his country hope that he has what it takes to transition from a junior champion to something much more. To date, he's one of the most ferocious competitors the sport has ever seen and it shows in the ratings, with consistent top 10 overall finishes since 2008, positioning himself as a serious contender for a world title.</p>
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
                    DATE: Mon Oct 07 11:10:03 HST 2013
                    SOURCE: /Users/marc/github/Surferpedia/app/views/souza.scala.html
                    HASH: 0ce441c2a661e94dde885c4d7f27b5fd106c6dff
                    MATRIX: 774->1|885->18|922->21|943->34|982->36|2447->1470
                    LINES: 26->1|29->1|31->3|31->3|31->3|50->22
                    -- GENERATED --
                */
            