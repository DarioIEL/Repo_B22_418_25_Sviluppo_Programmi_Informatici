package it.springcorejpa.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

//Commento la colonna autore per poter fare il ManyToMany
//	@Column(nullable = false, length = 100)
//	private String autore;
	
	@Column(nullable = false)
	private double prezzo;
	
	@JsonIgnoreProperties("libri") //FONDAMENTALE per far si che Jackson(JSON serializer) non vada in ridondanza
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable( //L'entità che possiede @Jointable è l'entità Owner
		name = "libri_autori", //nome tabella ponte
		joinColumns = @JoinColumn(name = "libro_id"),  //FK->libri.id
		inverseJoinColumns = @JoinColumn(name = "autore_id")  //FK-autori.id
	)
	private Set<Autore> autori = new HashSet<>();
	
	
	protected Libro() {} //uso un costruttore protected perché voglio che sono JPA/hibernate lo possano utilizzare

	public Libro(String titolo, double prezzo) {
		this.titolo = titolo;
		this.prezzo = prezzo;
	}



	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}



	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Set<Autore> getAutori() {
		return autori;
	}

	//Metodi per gestire la relazione libro->autore
	public void aggiungiAutore(Autore autore) {
		this.autori.add(autore);
	}
	
	public void rimuoviAutore(Autore autore) {
		this.autori.remove(autore);	
	}
	
	
	
}
