package controllers;

import play.mvc.*;
import models.User;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.*;
import javax.inject.*;
import play.i18n.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
@Singleton
public class HomeController extends Controller {

    private Form<User> formFactory;
    private MessagesApi messagesApi;

    @Inject
    public HomeController(FormFactory f, MessagesApi messagesApi) {
        this.formFactory = f.form(User.class) ;
        this.messagesApi = messagesApi;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */


    @Transactional
    public Result addMessage(Http.Request request) {
        return ok(views.html.addUser.render(formFactory, request, messagesApi.preferred(request)));
    }
    

    
    public Result sentMessage(Http.Request request) {
        Form<User> newMessageForm =  formFactory.bindFromRequest(request);
    
        if(newMessageForm.hasErrors()) {
            
        return redirect(controllers.routes.HomeController.addMessage()).flashing("danger", "WARNING : some field errors should be fixed");
        //return badRequest(views.html.addUser.render(formFactory, request, messagesApi.preferred(request)));
        }
        User user = newMessageForm.get();
        user.save();
        String email = user.email;
        String message = user.message;
        return redirect(controllers.routes.MailerService.sendEmail(email,message)).flashing("success", "your message has been sent sucessfully");
    }


    public Result index() {
        return ok(views.html.index.render("Hello"));
    }
    
}
