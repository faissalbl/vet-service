package br.com.jcf.vet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Animal implements IEntity<Long> {
	
	private static final long serialVersionUID = 3307232959650547535L;

	protected Long id;	
	private String nome;	
	private TipoAnimal tipoAnimal;	
	private Raca raca;	
	private String codChip;	
	private Date dtNascimento;
	
	public Animal() {
		
	}
	
	public Animal(Long id, String nome, Long idRaca, String dsRaca, Long idTipoAnimal, String dsTipoAnimal) {
		this.id = id;
		this.nome = nome;
		this.raca = new Raca(idRaca, dsRaca);
		this.tipoAnimal = new TipoAnimal(idTipoAnimal, dsTipoAnimal);
	}

	@XmlElement
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
	
	@XmlElement
	@Column(name="NOME")
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@XmlElement
	@ManyToOne
	@JoinColumn(name = "ID_TIPO_ANIMAL")
	public TipoAnimal getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(TipoAnimal tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	@XmlElement
	@ManyToOne
	@JoinColumn(name = "ID_RACA")
	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	@XmlElement
	@Column(name = "COD_CHIP")
	public String getCodChip() {
		return codChip;
	}

	public void setCodChip(String codChip) {
		this.codChip = codChip;
	}

	@XmlElement
	@Column(name="DT_NASCIMENTO") @Temporal(TemporalType.DATE)
	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}


}
