
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
object Index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
   <div class="container">
     <div id="carousel-example-generic" class="carousel slide">
     
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
            <li data-target="#carousel-example-generic" data-slide-to="3"></li>
        </ol>
        
        <!-- Wrapper for Slides -->
        <div class="carousel-inner">
            <div class="item active">
                <div class="kalani-pic"></div>
                <div class="carousel-caption">
                    <h3>Kalani David</h3>
                </div>
            </div>
            <div class="item">
                <div class="moore-pic"></div>
                <div class="carousel-caption">
                    <h3>Clarissa Moore</h3>
                </div>
            </div>
            <div class="item">
                <div class="jake-pic"></div>
                <div class="carousel-caption">
                    <h3>Jake Marshall</h3>
                </div>
            </div>
            <div class="item">
                <div class="souza-pic"></div>
                <div class="carousel-caption">
                    <h3>Adriano de Souza</h3>
                </div>
            </div>
        </div>
        
        <!-- Controls -->
        <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
            <span class="icon-prev"></span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
            <span class="icon-next"></span>
        </a>
        
     </div> 
   </div>
""")))})),format.raw/*53.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 06 17:03:47 HST 2013
                    SOURCE: C:/dev/gitrepos/sanpei-repos/Surferpedia/app/views/Index.scala.html
                    HASH: a5d894f6e8ea04281fdc62cc78633a8dd6089edd
                    MATRIX: 774->1|885->18|924->23|944->35|983->37|2892->1915
                    LINES: 26->1|29->1|31->3|31->3|31->3|81->53
                    -- GENERATED --
                */
            