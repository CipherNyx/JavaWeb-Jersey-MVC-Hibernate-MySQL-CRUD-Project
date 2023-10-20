package lk.jiat.webapp.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;

@Path("/logout")
public class LogoutController {

    @GET
    public Response logoutAction(@Context HttpServletRequest request){
        String contextPath = request.getContextPath();
        request.getSession().setAttribute("user",null);
        request.getSession().setAttribute("isUserLoggedIn",false);
        return Response.status(Response.Status.FOUND).location(UriBuilder.fromUri(contextPath+"/").build()).build();
    }
}
