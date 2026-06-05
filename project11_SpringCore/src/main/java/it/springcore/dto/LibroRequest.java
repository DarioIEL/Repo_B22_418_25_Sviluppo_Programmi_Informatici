package it.springcore.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LibroRequest {
	
	private String titolo;
	private String autore;
	private double prezzo;
	
	
	@NotBlank(message = "Il titolo non può essere vuoto")
	@Size(min = 1, max = 100, message = "Il titolo deve avere tra 1 e 200 caratteri")
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
	

}
