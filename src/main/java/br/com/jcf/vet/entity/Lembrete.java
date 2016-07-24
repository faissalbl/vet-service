package br.com.jcf.vet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Lembrete extends GenericEntity<Long> {
	
	private static final long serialVersionUID = -3733618083692103573L;

	protected Long id;
	private String desc;	
	private Animal animal;	
	private Frequencia frequencia;	
	private Date data;	
	private Boolean lido;
	
	public Lembrete() {
		
	}

	@Id @Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="DS_LEMBRETE")
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@ManyToOne
	@JoinColumn(name="ID_ANIMAL")
	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Column(name="FREQUENCIA")
	@Enumerated(EnumType.STRING)
	public Frequencia getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(Frequencia frequencia) {
		this.frequencia = frequencia;
	}

	@Column(name="DATA")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name="LIDO")
	public Boolean getLido() {
		return lido;
	}

	public void setLido(Boolean lido) {
		this.lido = lido;
	}
	
	
}
