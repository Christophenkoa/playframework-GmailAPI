// @GENERATOR:play-routes-compiler
// @SOURCE:/home/christophe/Downloads/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Wed Mar 04 16:59:56 WAT 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def sentMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sentMessage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sentMessage"})
        }
      """
    )
  
    // @LINE:6
    def addMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addMessage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseMailerService(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def sendEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MailerService.sendEmail",
      """
        function(email0,message1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "testEmail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", email0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("message", message1))})
        }
      """
    )
  
  }


}
