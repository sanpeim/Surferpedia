
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
object cmoore extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("cmoore")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
   <div class="container">
     <div class="row">
        <div class=col-md-4>
            <div class="well">
                <div class="moore-pic"></div>
            </div>
        </div>
        <div class=col-md-8>
            <div class="well">
                <h1>Clarissa Moore</h1>
                <p>"I think the best advice I ever received as a kid was to believe in myself. My dad was always trying to drill that into my head. When you're young, it's easy to get caught up in the small things that feel like a big deal at the time and lose self-confidence. But if you really believe in yourself and can find something you're passionate about, good things will happen. You've got to have fun with it too. There's a time and a place to focus and sweat and push yourself, but you also have to separate that and just relax and enjoy it. You'll hear people say that they perform their best when they're having fun, and I've definitely found that to be true."</p>
                <p>"Right now, the girls on Tour are surfing better than ever and are elevating women's surfing at every event. I'm loving being on the Tour and really couldn't be happier. As far as any personal improvements go, I do have a problem with letting everyone else get in my head sometimes, but I'm getting better at tuning that out and focusing on what I have to do."</p>
                <p>"I do worry about the future of women's professional surfing. For a while there, we only had five events and it's hard to look at something like that and not be left with a dismal feeling. But that being said, I do think it's coming back. How could it not? We have such a great thing here and there are so many good girls in the water and it sounds like we're going to be adding a few more events to the season-so I'm hopeful."</p>
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
                    SOURCE: /Users/scotthonda/Documents/Surferpedia/app/views/cmoore.scala.html
                    HASH: cb6eca168afeed8b08e9bf8e7ac2b3d4e26e619a
                    MATRIX: 775->1|886->18|923->21|945->35|984->37|2886->1908
                    LINES: 26->1|29->1|31->3|31->3|31->3|50->22
                    -- GENERATED --
                */
            