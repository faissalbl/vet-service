package br.com.jcf.vet.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public interface GenericEntity<T> extends Serializable {
	
	T getId();
	
	public void setId(T id);
	
}
