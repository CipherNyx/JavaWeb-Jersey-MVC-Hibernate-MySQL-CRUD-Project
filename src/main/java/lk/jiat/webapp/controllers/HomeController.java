package lk.jiat.webapp.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import lk.jiat.webapp.entity.User;
import lk.jiat.webapp.service.UserService;
import org.glassfish.jersey.server.mvc.Viewable;

import java.util.List;

@Path("/")
public class HomeController {

    @GET
    public Viewable index(){

        UserService userService = new UserService();
        List<User> users = userService.getAllUsers();

        return new Viewable("/frontend/home",users);
    }
}
