// @SOURCE:/Users/rckndn/git/sanpeim/Surferpedia/conf/routes
// @HASH:046d421eb2986d61e8a83c808c716fdbdc41606a
// @DATE:Wed Oct 09 10:57:59 HST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def kalanid(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "kalanid")
}
                                                

// @LINE:7
def page1(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "page1")
}
                                                

// @LINE:12
def kolohe(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "kolohe")
}
                                                

// @LINE:9
def cmoore(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cmoore")
}
                                                

// @LINE:10
def jakem(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jakem")
}
                                                

// @LINE:13
def keliamoniz(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "kelia")
}
                                                

// @LINE:11
def souza(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "souza")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def kalanid : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.kalanid",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kalanid"})
      }
   """
)
                        

// @LINE:7
def page1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.page1",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "page1"})
      }
   """
)
                        

// @LINE:12
def kolohe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.kolohe",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kolohe"})
      }
   """
)
                        

// @LINE:9
def cmoore : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cmoore",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cmoore"})
      }
   """
)
                        

// @LINE:10
def jakem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jakem",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jakem"})
      }
   """
)
                        

// @LINE:13
def keliamoniz : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.keliamoniz",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kelia"})
      }
   """
)
                        

// @LINE:11
def souza : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.souza",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "souza"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def kalanid(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.kalanid(), HandlerDef(this, "controllers.Application", "kalanid", Seq(), "GET", """""", _prefix + """kalanid""")
)
                      

// @LINE:7
def page1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.page1(), HandlerDef(this, "controllers.Application", "page1", Seq(), "GET", """""", _prefix + """page1""")
)
                      

// @LINE:12
def kolohe(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.kolohe(), HandlerDef(this, "controllers.Application", "kolohe", Seq(), "GET", """""", _prefix + """kolohe""")
)
                      

// @LINE:9
def cmoore(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cmoore(), HandlerDef(this, "controllers.Application", "cmoore", Seq(), "GET", """""", _prefix + """cmoore""")
)
                      

// @LINE:10
def jakem(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jakem(), HandlerDef(this, "controllers.Application", "jakem", Seq(), "GET", """""", _prefix + """jakem""")
)
                      

// @LINE:13
def keliamoniz(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.keliamoniz(), HandlerDef(this, "controllers.Application", "keliamoniz", Seq(), "GET", """""", _prefix + """kelia""")
)
                      

// @LINE:11
def souza(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.souza(), HandlerDef(this, "controllers.Application", "souza", Seq(), "GET", """""", _prefix + """souza""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    