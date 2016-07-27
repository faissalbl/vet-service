//package br.com.jcf.vet.manager;
//
//import java.util.List;
//
//import javax.ejb.Stateless;
//import javax.ejb.TransactionManagement;
//import javax.ejb.TransactionManagementType;
//import javax.inject.Inject;
//
//import br.com.jcf.vet.dao.AnimalDAO;
//import br.com.jcf.vet.entity.Animal;
//
//@Stateless
//@TransactionManagement(TransactionManagementType.CONTAINER)
//public class AnimalManager extends GenericManager<Animal, AnimalDAO> {
//
//	@Inject
//	private AnimalDAO animalDAO;
//	
//	public List<Animal> getAnimais() {
//		return animalDAO.getAnimais();
//	}
//	
//	@Override
//	protected AnimalDAO getDAO() {
//		return animalDAO;
//	}
//}
