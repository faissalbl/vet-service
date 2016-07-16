package br.com.jcf.vet.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="ANIMAL_DONO")
public class AnimalDono extends GenericEntity<AnimalDonoId> {
	
	private static final long serialVersionUID = -3901178499115880914L;

	private AnimalDonoId id;

	private Animal animal;
	
	private Dono dono;
	
	@Override
	@EmbeddedId
	public AnimalDonoId getId() {
		return id;
	}

	@Override
	public void setId(AnimalDonoId id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name="ID_ANIMAL")
	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@ManyToOne
	@JoinColumn(name="ID_DONO")
	public Dono getDono() {
		return dono;
	}

	public void setDono(Dono dono) {
		this.dono = dono;
	}
}
