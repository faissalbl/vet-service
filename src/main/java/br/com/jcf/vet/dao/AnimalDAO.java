package br.com.jcf.vet.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.jcf.vet.entity.Animal;

public class AnimalDAO extends GenericDAO<Animal> {

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
	
}
