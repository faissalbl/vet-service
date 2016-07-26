package br.com.jcf.vet.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.jcf.vet.entity.Dono;

public class DonoDAO extends GenericDAO<Dono> {

	@SuppressWarnings("unchecked")
	public List<Dono> getDonos() {
		final StringBuilder sb = new StringBuilder();
		sb.append("SELECT new Dono( ");
		
		sb.append("d.id, d.nome, d.cpf, d.dtNascimento, d.telefone, d.email, ");
		sb.append("e.id, e.bairro, e.rua, e.numero, e.complemento, e.cidade, e.estado, e.cep ");
		
		sb.append(") ");
		sb.append("FROM Dono d ");
		sb.append("LEFT OUTER JOIN d.endereco e ");
		
		final Query q = entityManager.createQuery(sb.toString());
		
		return q.getResultList();
	}
	
}
