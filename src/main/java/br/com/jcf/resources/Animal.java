package br.com.jcf.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/animal")
public class Animal {

	@GET
	@Produces("text/html")
	public Response test() {
		return Response.status(200).entity("meu teste").build();
	}
	
}
