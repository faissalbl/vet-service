package br.com.jcf.vet.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="VET_CLINICA")
public class VeterinarioClinica implements IEntity<VeterinarioClinicaId> {

	private static final long serialVersionUID = -2142113128516526890L;
	
	private VeterinarioClinicaId id;
	private Veterinario veterinario;
	private Clinica clinica;

	@EmbeddedId
	@Override
	public VeterinarioClinicaId getId() {
		return id;
	}

	@Override
	public void setId(VeterinarioClinicaId id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name="ID_VETERINARIO", insertable = false, updatable = false)
	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	@ManyToOne
	@JoinColumn(name="ID_CLINICA", insertable = false, updatable = false)
	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

}
