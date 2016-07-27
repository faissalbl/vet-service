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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.jcf.vet.entity.Dono;
import br.com.jcf.vet.manager.DonoManager;

@Path("/dono")
public class DonoResource {
	
	@EJB
	private DonoManager donoManager;

	@GET 
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Dono> search() {
		List<Dono> donos = donoManager.getDonos();
		return donos;
	}
	
	@POST 
	@PUT 
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(Dono dono) {
		donoManager.save(dono);
		return Response.ok().build();
	}

	@DELETE 
	@Path("/delete/{id}")
	public Response delete(@PathParam("id") String id) {
		donoManager.remove(new Dono(Long.parseLong(id)));
		return Response.ok().build();
	}
	
}
