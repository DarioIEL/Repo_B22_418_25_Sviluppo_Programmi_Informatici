package it.springcore.dto;

public class LibroResponse {

	//In questoi caso la faccio identica a Libro anche se la separazione tra Request e Response è netta
	
	private Long id;
	private String titolo;
	private String autore;
	private double prezzo;

	public LibroResponse(Long id, String titolo, String autore, double prezzo) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
	}

	public Long getId() {
		return id;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public double getPrezzo() {
		return prezzo;
	}
	
	
	
	
	
}
