package ge.edu.btu.web_services;

import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/home-controller")
public class HomeController extends HttpServlet {

    @GET
    @Path("/hello")
    public String sayHi() {
        return "Hello";
    }

}
