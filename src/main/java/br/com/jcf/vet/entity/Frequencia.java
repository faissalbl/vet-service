package br.com.jcf.vet.entity;

public enum Frequencia {
	
	U("Único"),
	D("Diário"),
	S("Semanal"),
	M("Mensal"),
	A("Anual");
	
	private String desc;
	
	private Frequencia(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
