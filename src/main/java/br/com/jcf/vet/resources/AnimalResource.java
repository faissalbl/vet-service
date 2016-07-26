package br.com.jcf.vet.resources;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.jcf.vet.entity.AnimalResultList;
import br.com.jcf.vet.manager.AnimalManager;

@Path("/animal")
public class AnimalResource {
	
	@EJB
	private AnimalManager animalManager;

	@GET 
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response search() {
		
		//testing jpa
		List<br.com.jcf.vet.entity.Animal> animais = animalManager.getAnimais();
		
		AnimalResultList animalResultList = new AnimalResultList();
		animalResultList.setResultList(animais);
		
		return Response.status(Status.OK).entity(animalResultList).build();
	}
	
}
