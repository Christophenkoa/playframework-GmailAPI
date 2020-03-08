package controllers;

import play.mvc.*;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import javax.inject.Inject;
import java.io.File;
import org.apache.commons.mail.EmailAttachment;
import models.User;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.*;
import javax.inject.*;
import play.i18n.*;

public class MailerService extends Controller{

    private Form<User> formFactory;
    private MessagesApi messagesApi;

    @Inject
    public MailerService(FormFactory f, MessagesApi messagesApi) {
        this.formFactory = f.form(User.class) ;
        this.messagesApi = messagesApi;
    }


  @Inject MailerClient mailerClient;

  public Result sendEmail(String emailReceive , String message , Http.Request request) {
    Email email = new Email()
      .setSubject("This is a test from play Framework")
      .setFrom("nkoachristophe@gmail.com")
      .addTo("nkoachristophe@gmail.com")
      // sends text
      .setBodyText("------")
      .setBodyHtml("<html><body><p>"+ "Hi!<br> " +emailReceive+ " sent you the following message : <br><h2>" + message + "</h2></p></body></html>");
    mailerClient.send(email);
    return ok(views.html.addUser.render(formFactory, request, messagesApi.preferred(request)));
  }
}