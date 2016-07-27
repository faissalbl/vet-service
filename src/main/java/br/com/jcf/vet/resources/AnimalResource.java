//package br.com.jcf.vet.resources;
//
//import java.util.List;
//
//import javax.ejb.EJB;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
//import br.com.jcf.vet.entity.Animal;
//import br.com.jcf.vet.manager.AnimalManager;
//
//@Path("/animal")
//public class AnimalResource {
//	
//	@EJB
//	private AnimalManager animalManager;
//
//	@GET 
//	@Path("/search")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Animal> search() {
//		
//		//testing jpa
//		List<Animal> animais = animalManager.getAnimais();
//		return animais;
//	}
//	
//}
