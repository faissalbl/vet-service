//package br.com.jcf.vet.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Painel extends GenericEntity<Long> {
//	
//	private static final long serialVersionUID = 657948448560014264L;
//
//	private Long id;
//	private Clinica clinica;
//	private Veterinario veterinario;
//	private TipoAnimal tipoAnimal;
//	private String observacao;
//	private Boolean lido;
//
//	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="ID")
//	@Override
//	public Long getId() {
//		return id;
//	}
//
//	@Override
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	@ManyToOne
//	@JoinColumn(name="ID_CLINICA")
//	public Clinica getClinica() {
//		return clinica;
//	}
//
//	public void setClinica(Clinica clinica) {
//		this.clinica = clinica;
//	}
//
//	@ManyToOne
//	@JoinColumn(name="ID_VETERINARIO")
//	public Veterinario getVeterinario() {
//		return veterinario;
//	}
//
//	public void setVeterinario(Veterinario veterinario) {
//		this.veterinario = veterinario;
//	}
//
//	@ManyToOne
//	@JoinColumn(name="ID_TIPO_ANIMAL")
//	public TipoAnimal getTipoAnimal() {
//		return tipoAnimal;
//	}
//
//	public void setTipoAnimal(TipoAnimal tipoAnimal) {
//		this.tipoAnimal = tipoAnimal;
//	}
//
//	@Column(name="OBSERVACAO")
//	public String getObservacao() {
//		return observacao;
//	}
//
//	public void setObservacao(String observacao) {
//		this.observacao = observacao;
//	}
//
//	@Column(name="LIDO")
//	public Boolean getLido() {
//		return lido;
//	}
//
//	public void setLido(Boolean lido) {
//		this.lido = lido;
//	}
//
//}
