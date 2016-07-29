package br.com.jcf.vet.manager;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.jcf.vet.dao.GenericDAO;
import br.com.jcf.vet.entity.IEntity;

public abstract class GenericManager<T extends IEntity<?>, D extends GenericDAO<T>> {

	protected abstract D getDAO();
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public T save(T entity) {
		return getDAO().save(entity);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void remove(T entity) {
		getDAO().remove(entity);
	}
}
