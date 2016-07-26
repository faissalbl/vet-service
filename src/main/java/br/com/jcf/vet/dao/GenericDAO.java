package br.com.jcf.vet.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.jcf.vet.entity.GenericEntity;

public class GenericDAO<T extends GenericEntity<?>> {

	@PersistenceContext(unitName="vet-pu")
	protected EntityManager entityManager;
	
	public T save(T entity) {
		if (entity.getId() == null) {
			entityManager.persist(entity);
		} else {
			entity = entityManager.merge(entity);
		}
		return entity;
	}
	
	public void remove(T entity) {
		entityManager.remove(entity);
	}
}
