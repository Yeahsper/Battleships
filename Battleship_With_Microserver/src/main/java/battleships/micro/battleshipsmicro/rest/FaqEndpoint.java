package battleships.micro.battleshipsmicro.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

//Path sets where this is, for example localhost:8080@Path
@Path("/faq")
public class FaqEndpoint {
	@GET
    @Produces("text/plain")
    public Response doGet() {
    	return Response.ok("Welcome to my program. To run the microservices, you need to\n" + 
    						" start the microservice by choosing \"Run as Maven Build\"\n"+
    						" and with the goal as \"thorntail:run\". When it says \"Thorntail is Ready\" in the console\n"+
    						" you can enter through localhost:8080. \n\n"+
    						" To get a (pseudo(as all random is)) random generated battleship board\n"+
    						" run Main.java which connects to localhost:8080/battleship").build();
    }
}
