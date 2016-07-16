package br.com.jcf.vet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.jcf.vet.entity.Animal;
import br.com.jcf.vet.entity.Raca;
import br.com.jcf.vet.entity.TipoAnimal;

public class AnimalDAO {

	@PersistenceContext(unitName="vet-pu")
	private EntityManager entityManager;
	
//	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("vet-pu");
//	private EntityManager entityManager = emf.createEntityManager();
		
	@SuppressWarnings("unchecked")
	public List<Animal> getAnimais() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Select new Animal(a.id, a.nome, r.id, r.desc, ta.id, ta.desc) ");
		sb.append("FROM Animal a ");
		sb.append("JOIN a.raca r ");
		sb.append("JOIN a.tipoAnimal ta ");
		
		final Query query = entityManager.createQuery(sb.toString());
		return (List<Animal>) query.getResultList();
	}
	
	public void insertTestData() {
//		entityManager.getTransaction().begin();
		for (int i = 0; i < 10; i++) {
			final Animal animal = new Animal();
			animal.setNome(String.valueOf(i));
			animal.setRaca(entityManager.find(Raca.class, 1L));
			
			animal.setTipoAnimal(entityManager.find(TipoAnimal.class, 1L));
			entityManager.persist(animal);
		}
//		entityManager.getTransaction().commit();
	}
	
	public void deleteData() {
		entityManager.createQuery("DELETE FROM Animal").executeUpdate();
	}
}
