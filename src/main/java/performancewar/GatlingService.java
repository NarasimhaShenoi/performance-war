package performancewar;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// http://localhost:8080/performance-war/rest/gatling/runGatling
@Path("/gatling")
public class GatlingService {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/runGatling")
	public String runGatling() {
		return "mock gatling rest endpoint!!!";
	}

}