package br.com.jcf.vet.entity;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.persistence.Version;

@MappedSuperclass
public abstract class GenericEntity<T> {
	
	private Integer version;
	
	@Transient
	public abstract T getId();
	
	public abstract void setId(T id);
	
	@Version
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
