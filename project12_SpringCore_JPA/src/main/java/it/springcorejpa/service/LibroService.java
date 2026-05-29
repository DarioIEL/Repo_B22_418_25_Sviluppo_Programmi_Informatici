package it.springcorejpa.service;

import java.util.List;
import java.util.Optional;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import it.springcorejpa.entity.Autore;
import it.springcorejpa.entity.Libro;
import it.springcorejpa.repository.AutoreRepository;
import it.springcorejpa.repository.LibroRepository;

@Service
public class LibroService {
	
	private final LibroRepository repository;
	private final AutoreRepository repoAutori;
	
	
	public LibroService(LibroRepository repository, AutoreRepository repoAutori) {
		this.repository = repository;
		this.repoAutori = repoAutori;
	}
	
	//Aggiungere il metodo toResponse
	
	
	
	//--- CRUD ----
	public List<Libro> elencoLibri(){
		return repository.findAll(); //Questo findAll() è un metodo di JPA che "nasconde" : SELECT * from libri
	}

	public Libro cercaLibro(Integer id) {
		return repository.findById(id)
				.orElse(null);
	}
	
	public Libro creaLibro(String titolo, double prezzo) {
		Libro nuovo = new Libro(titolo, prezzo);
		return repository.save(nuovo);
	}

	
	//Questo metodo sotto trattiene la relazione @ManyToMany
	public List<Libro> cercaPerAutore(String cognome){
		return repository.findByAutoriCognome(cognome);
	}

	
	public List<Autore> elencoAutori(){
		return repoAutori.findAll();
	}
	
	public Autore creaAutore(String nome, String cognome) {
		Autore nuovoAutore = new Autore(nome, cognome);
		return repoAutori.save(nuovoAutore);
	}
	
	public Libro aggiungiAutoreALibro(Integer libroId, Integer autoreId) {
		Libro libro = repository.findById(libroId).orElse(null);
		Autore autore = repoAutori.findById(autoreId).orElse(null);
		
		libro.aggiungiAutore(autore);
		return repository.save(libro); //salva lato Owner e aggiorna la tabella ponte
	}
	
	public Autore cercaAutoreById(Integer id) {
		return repoAutori.findById(id).orElse(null);
	}
	
}
