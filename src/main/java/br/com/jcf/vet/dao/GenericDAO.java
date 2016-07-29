package br.com.jcf.vet.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.jcf.vet.entity.IEntity;

public class GenericDAO<T extends IEntity<?>> {

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
	
	@SuppressWarnings("unchecked")
	public void remove(T entity) {
		entity = (T) entityManager.find(entity.getClass(), entity.getId());
		entityManager.remove(entity);
	}
}
