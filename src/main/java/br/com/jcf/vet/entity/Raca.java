package br.com.jcf.vet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="raca")
@Entity
public class Raca extends GenericEntity<Long> {
	
	private static final long serialVersionUID = 2689779534830737909L;

	protected Long id;

	private String desc;
	
	public Raca() {
		
	}

	public Raca(Long id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}

	@XmlElement(name="id")
	@Id @Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@XmlElement(name="desc")
	@Column(name="DS_RACA")
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
