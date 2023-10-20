package lk.jiat.webapp.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import lk.jiat.webapp.entity.User;
import lk.jiat.webapp.service.UserService;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/register")
public class RegisterController {

    @GET
    public Viewable index(){
        return new Viewable("/frontend/auth/register");
    }

    @POST
    public String registerAction(User user){
        if(user.getUsername().isEmpty()){
            return "Please enter the username";
        } else if (user.getPassword().isEmpty()){
            return "Please enter the password";
        } else {
            UserService userService = new UserService();
            userService.saveUser(user);
            return "success";
        }
    }
}
