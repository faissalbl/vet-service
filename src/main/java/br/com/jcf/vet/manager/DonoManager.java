package br.com.jcf.vet.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jcf.vet.dao.DonoDAO;
import br.com.jcf.vet.entity.Dono;
import br.com.jcf.vet.repository.DonoRepository;

@Component
public class DonoManager extends GenericManager<Dono, DonoDAO> {
	
	@Autowired
	private DonoDAO donoDAO;
	
	@Autowired
	private DonoRepository donoRepository;
	
	public List<Dono> getDonos() {
		return donoRepository.findAll();
	}
	
	public Dono getDono(String login) {
		return donoDAO.getDono(login);
	}
	
	@Override
	protected DonoDAO getDAO() {
		return donoDAO;
	}
	
}
