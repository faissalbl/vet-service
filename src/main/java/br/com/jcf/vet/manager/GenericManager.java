package br.com.jcf.vet.manager;

import org.springframework.transaction.annotation.Transactional;

import br.com.jcf.vet.dao.GenericDAO;
import br.com.jcf.vet.entity.IEntity;

public abstract class GenericManager<T extends IEntity<?>, D extends GenericDAO<T>> {

	protected abstract D getDAO();
	
	@Transactional
	public T save(T entity) {
		return getDAO().save(entity);
	}
	
	@Transactional
	public void remove(T entity) {
		getDAO().remove(entity);
	}
}
