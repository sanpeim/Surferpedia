// @SOURCE:/Users/rckndn/git/sanpeim/Surferpedia/conf/routes
// @HASH:046d421eb2986d61e8a83c808c716fdbdc41606a
// @DATE:Wed Oct 09 10:57:59 HST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_page11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("page1"))))
        

// @LINE:8
private[this] lazy val controllers_Application_kalanid2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("kalanid"))))
        

// @LINE:9
private[this] lazy val controllers_Application_cmoore3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cmoore"))))
        

// @LINE:10
private[this] lazy val controllers_Application_jakem4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jakem"))))
        

// @LINE:11
private[this] lazy val controllers_Application_souza5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("souza"))))
        

// @LINE:12
private[this] lazy val controllers_Application_kolohe6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("kolohe"))))
        

// @LINE:13
private[this] lazy val controllers_Application_keliamoniz7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("kelia"))))
        

// @LINE:16
private[this] lazy val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """page1""","""controllers.Application.page1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """kalanid""","""controllers.Application.kalanid()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cmoore""","""controllers.Application.cmoore()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jakem""","""controllers.Application.jakem()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """souza""","""controllers.Application.souza()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """kolohe""","""controllers.Application.kolohe()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """kelia""","""controllers.Application.keliamoniz()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_page11(params) => {
   call { 
        invokeHandler(controllers.Application.page1(), HandlerDef(this, "controllers.Application", "page1", Nil,"GET", """""", Routes.prefix + """page1"""))
   }
}
        

// @LINE:8
case controllers_Application_kalanid2(params) => {
   call { 
        invokeHandler(controllers.Application.kalanid(), HandlerDef(this, "controllers.Application", "kalanid", Nil,"GET", """""", Routes.prefix + """kalanid"""))
   }
}
        

// @LINE:9
case controllers_Application_cmoore3(params) => {
   call { 
        invokeHandler(controllers.Application.cmoore(), HandlerDef(this, "controllers.Application", "cmoore", Nil,"GET", """""", Routes.prefix + """cmoore"""))
   }
}
        

// @LINE:10
case controllers_Application_jakem4(params) => {
   call { 
        invokeHandler(controllers.Application.jakem(), HandlerDef(this, "controllers.Application", "jakem", Nil,"GET", """""", Routes.prefix + """jakem"""))
   }
}
        

// @LINE:11
case controllers_Application_souza5(params) => {
   call { 
        invokeHandler(controllers.Application.souza(), HandlerDef(this, "controllers.Application", "souza", Nil,"GET", """""", Routes.prefix + """souza"""))
   }
}
        

// @LINE:12
case controllers_Application_kolohe6(params) => {
   call { 
        invokeHandler(controllers.Application.kolohe(), HandlerDef(this, "controllers.Application", "kolohe", Nil,"GET", """""", Routes.prefix + """kolohe"""))
   }
}
        

// @LINE:13
case controllers_Application_keliamoniz7(params) => {
   call { 
        invokeHandler(controllers.Application.keliamoniz(), HandlerDef(this, "controllers.Application", "keliamoniz", Nil,"GET", """""", Routes.prefix + """kelia"""))
   }
}
        

// @LINE:16
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     