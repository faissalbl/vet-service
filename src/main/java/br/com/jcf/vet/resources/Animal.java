package br.com.jcf.vet.resources;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.jcf.vet.manager.AnimalManager;

@Path("/animal")
public class Animal {
	
	@EJB
	private AnimalManager animalManager;

	@GET @Path("/test")
	@Produces("text/html")
	public Response test() {
		
		//testing jpa
		animalManager.getAnimais();
		
		return Response.status(200).entity("meu teste").build();
	}
	
	@GET @Path("/insert")
	@Produces(MediaType.TEXT_HTML)
	public String testInsert() {
		animalManager.insertTestData();
		return "testando inserir dados.";
	}

	@GET @Path("/delete")
	@Produces(MediaType.TEXT_HTML)
	public String testDelete() {
		animalManager.deleteData();
		return "testando deletar dados.";
	}
	
}
