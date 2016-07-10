package br.com.jcf.vet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.jcf.vet.entity.Animal;

public class AnimalDAO {

	@PersistenceContext(unitName="vet-pu")
	private EntityManager entityManager;
	
//	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("vet-pu");
//	private EntityManager entityManager = emf.createEntityManager();
		
	@SuppressWarnings("unchecked")
	public List<Animal> getAnimais() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Select new Animal(");
		sb.append("a.id, a.nome");
		sb.append(") ");
		sb.append("FROM Animal a");
		
		final Query query = entityManager.createQuery(sb.toString());
		return (List<Animal>) query.getResultList();
	}
	
	public void insertTestData() {
//		entityManager.getTransaction().begin();
		for (int i = 0; i < 10; i++) {
			entityManager.persist(new Animal(null, String.valueOf(i)));
		}
//		entityManager.getTransaction().commit();
	}
	
	public void deleteData() {
		entityManager.createQuery("DELETE FROM Animal").executeUpdate();
	}
}
