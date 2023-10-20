package lk.jiat.webapp.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import lk.jiat.webapp.entity.User;
import lk.jiat.webapp.service.UserService;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/login")
public class LoginController {

    @GET
    public Viewable index(){
        return new Viewable("/frontend/auth/login");
    }

    @POST
    public String loginAction(User user, @Context HttpServletRequest request){
        if(user.getUsername().isEmpty()){
            return "Please enter the username";
//            return Response.ok().entity("Please Enter product Title").build();
        } else if (user.getPassword().isEmpty()){
            return "Please enter the password";
        } else {
            UserService userService = new UserService();
            User isUser = userService.getByUsernameAndPassword(user.getUsername(), user.getPassword());

            if(isUser != null){
                request.getSession().setAttribute("userLogged",user);
                request.getSession().setAttribute("isUserLoggedIn",true);
                return "success";
            } else {
                return "Invalid username or password";
            }

        }
    }
}
