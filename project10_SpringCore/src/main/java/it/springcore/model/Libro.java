package it.springcore.model;

public class Libro {
	
	private Long id;
	private String titolo;
	private String autore;
	private double prezzo;
	
	public Libro() {} //Il costruttore vuoto mi serve eventualmente per i JSON deserialize

	public Libro(String titolo, String autore, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", autore=" + autore + ", prezzo=" + prezzo + "]";
	}
	
	
	
	
	

}
