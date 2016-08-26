package br.com.jcf.vet.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import br.com.jcf.vet.entity.Dono;

@Component
public class DonoDAO extends GenericDAO<Dono> {

	@SuppressWarnings("unchecked")
	public List<Dono> getDonos() {
		final StringBuilder sb = buildQuery();
		
		final Query q = entityManager.createQuery(sb.toString());
		
		return q.getResultList();
	}
	
	public Dono getDono(String login) {
		final StringBuilder sb = buildQuery();
		sb.append("WHERE d.id = :login ");
		final Query q = entityManager.createQuery(sb.toString())
				.setParameter("login", login);
		Dono result = null;
		try {
			result = (Dono) q.getSingleResult();
		} catch (NoResultException e) {
		}
		
		return result;
	}

	private StringBuilder buildQuery() {
		final StringBuilder sb = new StringBuilder();
		sb.append("SELECT new Dono( ");
		
		sb.append("d.id, d.nome, d.cpf, d.dtNascimento, d.telefone, d.email, e.id, ");
		sb.append("e.bairro, e.rua, e.numero, e.complemento, e.cidade, e.estado, e.cep ");
		
		sb.append(") ");
		sb.append("FROM Dono d ");
		sb.append("LEFT OUTER JOIN d.endereco e ");
		return sb;
	}
	
}
