package models;

import java.util.*;

import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;    



@Entity // mark as entity
public class User extends Model {

   @Id // Set as primary key 
   @Constraints.Required
   @Constraints.Email
   public  String email;

   @Constraints.Required 
   public  String message;


    // Retrieve all users from the database
    public static Finder <String,User> find = new Finder<>(User.class);


}