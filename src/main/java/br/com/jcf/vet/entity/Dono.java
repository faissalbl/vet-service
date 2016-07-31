package br.com.jcf.vet.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Dono implements IEntity<String> {
	
	private static final long serialVersionUID = -2426414970161957935L;

	private String login;	
	private String nome;	
	private Long cpf;
	private Date dtNascimento;	
	private Long telefone;	
	private String email;	
	private Endereco endereco;
	
	public Dono() {
		
	}
	
	public Dono(String login) {
		this.login = login;
	}
	
	public Dono(String login, String nome, Long cpf, Date dtNascimento, Long telefone, String email, 
			Long idEndereco, String bairro, String rua, String numero, String complemento, 
			String cidade, String estado, Long cep) {
		this.login = login;
		this.nome = nome;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.telefone = telefone;
		this.email = email;
		
		if (idEndereco != null) {
			this.endereco = new Endereco(idEndereco, bairro, rua, numero, complemento, cidade, estado, cep);
		}
	}

	@XmlElement
	@Id @Column(name="LOGIN") 
	@Override
	public String getId() {
		return login;
	}

	@Override
	public void setId(String id) {
		this.login = id;
	}

	@XmlElement
	@Column(name="NOME")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@XmlElement
	@Column(name="CPF")
	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	@XmlElement
	@Column(name="DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@XmlElement
	@Column(name="TELEFONE")
	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	@XmlElement
	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_ENDERECO")
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
