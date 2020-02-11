
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/neha/NehaVerma/SunbirdKp/TestProj/Play2HelloWorld/conf/routes
// @DATE:Tue Feb 11 21:27:59 IST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
