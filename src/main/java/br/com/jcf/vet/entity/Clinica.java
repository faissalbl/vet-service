package br.com.jcf.vet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Clinica extends GenericEntity<Long> {
	
	private static final long serialVersionUID = -6554065931424416647L;

	private Long id;
	private String nome;	
	private String logomarca;	
	private Long telefone;	
	private String email;	
	private Endereco endereco;	
	private Boolean plantao24;
	
	@Id @Column(name="ID") 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="NOME")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name="LOGOMARCA")
	public String getLogomarca() {
		return logomarca;
	}

	public void setLogomarca(String logomarca) {
		this.logomarca = logomarca;
	}

	@Column(name="TELEFONE")
	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToOne
	@JoinColumn(name="ID_ENDERECO")
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Column(name="PLANTAO_24")
	public Boolean getPlantao24() {
		return plantao24;
	}

	public void setPlantao24(Boolean plantao24) {
		this.plantao24 = plantao24;
	}

}
