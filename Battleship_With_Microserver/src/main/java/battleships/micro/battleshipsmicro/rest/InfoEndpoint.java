package battleships.micro.battleshipsmicro.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

//Path sets where this is, for example localhost:8080/faq
@Path("/info")
public class InfoEndpoint {
	
	private String welcome = "Welcome to my Battleships. To run the microservices, you need to\n" + 
			" start the microservice by choosing \"Run as Maven Build\"\n"+
			" and with the goal as \"thorntail:run\". When it says \"Thorntail is Ready\" in the console\n"+
			" you can enter through localhost:8080. \n\n"+
			
			" To get a (pseudo(as all random is)) random generated battleship board\n"+
			" run Main.java which connects to localhost:8080/battleship \n\n\n"+
			
			" Or you can run the 'battleships.micro-thorntail.jar' in a terminal as BASH or CMD \n"+
			" and then shut it down by aborting (ctrl+c).\n"+
			" If you run it in a IDE, remember to completely kill the process in the task manager to \n"+
			" shut down the service.";
	
	@GET
    @Produces("text/plain")
    public Response doGet() {
    	return Response.ok(welcome).build();
    }
}
