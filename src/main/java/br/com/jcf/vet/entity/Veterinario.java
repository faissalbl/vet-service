package br.com.jcf.vet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Veterinario implements IEntity<Long> {
	
	private static final long serialVersionUID = -9194671952296695425L;

	private Long crmv;
	private String nome;	
	private String foto;	
	private String especialidade;	
	private Boolean atendeDomicilio;

	@Id @Column(name="CRMV")
	@Override
	public Long getId() {
		return this.crmv;
	}

	@Override
	public void setId(Long id) {
		this.crmv = id;
	}

	@Column(name="CRMV", insertable = false, updatable = false)
	public Long getCrmv() {
		return crmv;
	}

	public void setCrmv(Long crmv) {
		this.crmv = crmv;
	}

	@Column(name="NOME")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name="FOTO")
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Column(name="ESPECIALIDADE")
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Column(name="ATEND_DOMICILIO")
	public Boolean getAtendeDomicilio() {
		return atendeDomicilio;
	}

	public void setAtendeDomicilio(Boolean atendeDomicilio) {
		this.atendeDomicilio = atendeDomicilio;
	}

}
