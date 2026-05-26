package it.springcorejpa.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;

//posso anhe sostituire tutti i vari import singolo con questo uno persistance.*
import jakarta.persistence.*;


@Entity
@Table(name = "libri")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //IL Generation.type.IDENTITY specifica la PK
	private Integer id;
	
	//Il nome della colonna viene automaticamente tradotto con il nome della singola proprietà: attenzione al caso in cui la colonna ha un nome diverso dalla proprietà che stai utilizzando
	@Column(nullable = false, length = 100)
	private String titolo;
	
	@Column(nullable = false, length = 100)
	private String autore;
	
	@Column(nullable = false)
	private double prezzo;
	
	
	protected Libro() {} //uso un costruttore protected perché voglio che sono JPA/hibernate lo possano utilizzare

	public Libro(String titolo, String autore, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
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

	
	
	
}
