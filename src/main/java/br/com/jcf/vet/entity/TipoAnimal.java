package br.com.jcf.vet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="TIPO_ANIMAL")
public class TipoAnimal implements IEntity<Long> {
	
	private static final long serialVersionUID = -7060339027484059081L;

	protected Long id;
	private String desc;
	
	public TipoAnimal() {
		
	}
	
	public TipoAnimal(Long id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}

	@Id @Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="DS_TIPO_ANIMAL")
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
