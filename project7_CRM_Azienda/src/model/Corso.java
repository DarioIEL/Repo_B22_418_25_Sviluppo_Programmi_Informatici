package model;

public class Corso {
	
	private String nome;
	private String codice;
	
	public Corso(String nome, String codice) {
		this.nome = nome;
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public String getCodice() {
		return codice;
	}

	
}
