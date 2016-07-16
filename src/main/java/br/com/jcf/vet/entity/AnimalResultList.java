package br.com.jcf.vet.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AnimalResultList {

	private List<Animal> resultList;

	@XmlElement
	public List<Animal> getResultList() {
		return resultList;
	}

	public void setResultList(List<Animal> resultList) {
		this.resultList = resultList;
	}

	
}
