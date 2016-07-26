package br.com.jcf.vet.manager;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

import br.com.jcf.vet.dao.DonoDAO;
import br.com.jcf.vet.entity.Dono;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DonoManager extends GenericManager<Dono, DonoDAO> {

	@Inject
	private DonoDAO donoDAO;
	
	public List<Dono> getDonos() {
		return donoDAO.getDonos();
	}
	
	@Override
	protected DonoDAO getDAO() {
		return donoDAO;
	}
	
}
