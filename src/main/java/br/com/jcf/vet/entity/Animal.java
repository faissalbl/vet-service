package br.com.jcf.vet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

@Entity
public class Animal {

	@Id
	@TableGenerator(name="animalSeqTableGen", table="animalSeqTable")
	@GeneratedValue(strategy=GenerationType.TABLE, generator="animalSeqTableGen")
	private Long id;
	
	@Column
	private String nome;
	
	@Version
	private Integer version;
	
	public Animal() {
		
	}
	
	public Animal(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
}
