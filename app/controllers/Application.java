package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.KeliaMoniz;
import views.html.Page1;
import views.html.kalanid;
import views.html.cmoore;
import views.html.jakem;
import views.html.souza;
import views.html.kolohe;
import views.html.KeliaMoniz;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result page1() {
    return ok(Page1.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result kalanid() {
    return ok(kalanid.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result cmoore() {
    return ok(cmoore.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result jakem() {
    return ok(jakem.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result souza() {
    return ok(souza.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result kolohe() {
    return ok(kolohe.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result keliamoniz() {
    return ok(KeliaMoniz.render("Welcome to Page1."));
    
  }
  
}
