package it.springcorejpa.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

//Visto che sto creando una relazione @ManyToMany devo stabilire chi è l'OWNER (gerstisce la tabella ponte) e chi L'INVERSE(legge la tabella)
////Regola
///Libro -> (@ManyToMany + @JoinTable) -> Owner
///Autore -> @ManyToMany(mappedBy= "autori") -> INVERSE
///
///OSS: il mappedby diche ad Hibernate: la relazione è già definita nel campo autori dell'entità Libto quindi non ti serve creare una tabella ponte  ma usa quella che è già definita


@Entity
@Table(name = "autori")
public class Autore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(nullable = false, length = 50)
	private String cognome;

	//ATT ATT ATT: il mappedBy = "autori" fa riferimento alla proprietà autori dell'entità owner cioè Libro
	@JsonIgnoreProperties("autori")
	@ManyToMany(mappedBy = "autori", fetch = FetchType.LAZY)
	Set<Libro> libri = new HashSet<>();

	public Autore() {}
	
	public Autore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public Set<Libro> getLibri() {
		return libri;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setLibri(Set<Libro> libri) {
		this.libri = libri;
	}
	
	
	
	
	
	
}
