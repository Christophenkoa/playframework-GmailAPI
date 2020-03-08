// @GENERATOR:play-routes-compiler
// @SOURCE:/home/christophe/Downloads/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Wed Mar 04 16:59:56 WAT 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMailerService MailerService = new controllers.ReverseMailerService(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMailerService MailerService = new controllers.javascript.ReverseMailerService(RoutesPrefix.byNamePrefix());
  }

}
