package br.com.jcf.vet.resources;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.jcf.vet.entity.AnimalResultList;
import br.com.jcf.vet.entity.RestResultList;
import br.com.jcf.vet.manager.AnimalManager;

@Path("/animal")
public class Animal {
	
	@EJB
	private AnimalManager animalManager;

	@GET @Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test() {
		
		//testing jpa
		List<br.com.jcf.vet.entity.Animal> animais = animalManager.getAnimais();
		
		AnimalResultList animalResultList = new AnimalResultList();
		animalResultList.setResultList(animais);
		
		return Response.status(200).entity(animalResultList).build();
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
