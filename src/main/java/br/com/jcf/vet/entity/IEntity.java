package br.com.jcf.vet.entity;

import java.io.Serializable;

public interface IEntity<T> extends Serializable {
	
	T getId();
	
	public void setId(T id);
	
}
