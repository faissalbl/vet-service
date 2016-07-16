package br.com.jcf.vet.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.persistence.Version;

@MappedSuperclass
public abstract class GenericEntity<T> implements Serializable {
	
	private static final long serialVersionUID = -5873280887857281959L;

	private Integer version;
	
	@Transient
	public abstract T getId();
	
	public abstract void setId(T id);
	
	@Version @Column(name="VERSION")
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
