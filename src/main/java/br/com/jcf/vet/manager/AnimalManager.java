package br.com.jcf.vet.manager;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

import br.com.jcf.vet.dao.AnimalDAO;
import br.com.jcf.vet.entity.Animal;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class AnimalManager {

	@Inject
	private AnimalDAO animalDAO;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void insertTestData() {
		animalDAO.insertTestData();
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deleteData() {
		animalDAO.deleteData();
	}
	
	public List<Animal> getAnimais() {
		return animalDAO.getAnimais();
	}
	
}
