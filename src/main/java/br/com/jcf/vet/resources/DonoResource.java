package br.com.jcf.vet.resources;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import br.com.jcf.vet.entity.Dono;
import br.com.jcf.vet.manager.DonoManager;

@Path("/dono")
public class DonoResource {
	
	@EJB
	private DonoManager donoManager;

	@GET 
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response search() {
		GenericEntity<List<Dono>> donos = new GenericEntity<List<Dono>>(donoManager.getDonos()){
		};
		return ResourceHelper.addCorsHeaders(Response.ok(donos)).build();
	}
	
	@GET
	@Path("/{id}")
	public Response getDono(@PathParam("id") String id) {
		Dono dono = donoManager.getDono(id);
		return ResourceHelper.addCorsHeaders(Response.ok(dono)).build();
	}
	
	@POST 
	@PUT 
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(Dono dono) {
		donoManager.save(dono);
		ResponseBuilder responseBuilder;
		if (dono == null) {
			responseBuilder = Response.ok();
		} else {
			responseBuilder = Response.ok(dono);
		}
		return ResourceHelper.addCorsHeaders(responseBuilder).build();
	}

	@DELETE 
	@Path("/delete/{id}")
	public Response delete(@PathParam("id") String id) {
		donoManager.remove(new Dono(id));
		return ResourceHelper.addCorsHeaders(Response.ok()).build();
	}
	
}
