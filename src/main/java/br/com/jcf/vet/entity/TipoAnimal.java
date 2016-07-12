package br.com.jcf.vet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class TipoAnimal extends GenericEntity<Long> {
	
	protected Long id;

	private String desc;
	
	public TipoAnimal() {
		
	}

	@Id
	@TableGenerator(name="tipoAnimalSeqTableGen", table="tipoAnimalSeqTable")
	@GeneratedValue(strategy=GenerationType.TABLE, generator="tipoAnimalSeqTableGen")
	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Column
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
