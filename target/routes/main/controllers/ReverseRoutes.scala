
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/neha/NehaVerma/SunbirdKp/TestProj/Play2HelloWorld/conf/routes
// @DATE:Tue Feb 11 21:27:59 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
