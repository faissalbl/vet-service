package br.com.jcf.vet.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VeterinarioClinicaId implements Serializable {

	private static final long serialVersionUID = -3258175604189487649L;

	private Long idVeterinario;
	private Long idClinica;
	
	public VeterinarioClinicaId() {
	}
	
	public VeterinarioClinicaId(Long idVeterinario, Long idClinica) {
		this.idVeterinario = idVeterinario;
		this.idClinica = idClinica;
	}
	
	@Column(name="CRMV", insertable = false, updatable = false)
	public Long getIdVeterinario() {
		return idVeterinario;
	}
	
	public void setIdVeterinario(Long idVeterinario) {
		this.idVeterinario = idVeterinario;
	}
	
	@Column(name="ID_CLINICA")
	public Long getIdClinica() {
		return idClinica;
	}
	
	public void setIdClinica(Long idClinica) {
		this.idClinica = idClinica;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idClinica == null) ? 0 : idClinica.hashCode());
		result = prime * result + ((idVeterinario == null) ? 0 : idVeterinario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VeterinarioClinicaId other = (VeterinarioClinicaId) obj;
		if (idClinica == null) {
			if (other.idClinica != null)
				return false;
		} else if (!idClinica.equals(other.idClinica))
			return false;
		if (idVeterinario == null) {
			if (other.idVeterinario != null)
				return false;
		} else if (!idVeterinario.equals(other.idVeterinario))
			return false;
		return true;
	}
	
}
