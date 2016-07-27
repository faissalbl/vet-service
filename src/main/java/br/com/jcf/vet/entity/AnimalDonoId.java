//package br.com.jcf.vet.entity;
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//
//@Embeddable
//public class AnimalDonoId implements Serializable {
//
//	private static final long serialVersionUID = 6895204696246647389L;
//
//	private Long idAnimal;
//	private Long idDono;
//	
//	public AnimalDonoId() {
//		
//	}
//	
//	public AnimalDonoId(Long idAnimal, Long idDono) {
//		this.idAnimal = idAnimal;
//		this.idDono = idDono;
//	}
//
//	@Column(name="ID_ANIMAL", insertable = false, updatable = false)
//	public Long getIdAnimal() {
//		return idAnimal;
//	}
//
//	public void setIdAnimal(Long idAnimal) {
//		this.idAnimal = idAnimal;
//	}
//
//	@Column(name="ID_DONO", insertable = false, updatable = false)
//	public Long getIdDono() {
//		return idDono;
//	}
//
//	public void setIdDono(Long idDono) {
//		this.idDono = idDono;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((idAnimal == null) ? 0 : idAnimal.hashCode());
//		result = prime * result + ((idDono == null) ? 0 : idDono.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		AnimalDonoId other = (AnimalDonoId) obj;
//		if (idAnimal == null) {
//			if (other.idAnimal != null)
//				return false;
//		} else if (!idAnimal.equals(other.idAnimal))
//			return false;
//		if (idDono == null) {
//			if (other.idDono != null)
//				return false;
//		} else if (!idDono.equals(other.idDono))
//			return false;
//		return true;
//	}
//
//	
//}
