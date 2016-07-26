package br.com.jcf.vet.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DonoResultList {

	private List<Dono> resultList;

	@XmlElement
	public List<Dono> getResultList() {
		return resultList;
	}

	public void setResultList(List<Dono> resultList) {
		this.resultList = resultList;
	}

	
}
