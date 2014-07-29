package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;
import models.Facebook;
import views.html.*;

public class Application extends Controller {
	
	static Form<Facebook> fbForm = Form.form(Facebook.class);

    public static Result index() {
        //return ok(index.render("Your new application is ready."));
    	return ok(views.html.index.render(fbForm));
    }
    
    public static Result facebook() {
    	return TODO;
    }

}
