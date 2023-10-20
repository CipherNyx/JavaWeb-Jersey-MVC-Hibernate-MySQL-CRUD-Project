package lk.jiat.webapp.controllers;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import lk.jiat.webapp.entity.User;
import lk.jiat.webapp.service.UserService;

@Path("/delete")
public class DeleteController {
    @POST
    public Response deleteUser(User user){
        UserService userService = new UserService();
        User byUserId = userService.getByUserId(user.getId());
        userService.deleteUser(byUserId);
        return Response.ok().entity("success").build();
    }
}
