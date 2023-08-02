package uy.org.curso;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("")
@Produces({"text/plain"})
public class ServicioRestEjemplo {
	
	@GET
    @Path("/ping")
    public Response ping() {
        return Response.ok().entity("Hola mundo cruel REST").build();
    }

}
