package it.springcorejpa.service;

import java.util.List;
import java.util.Optional;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import it.springcorejpa.entity.Libro;
import it.springcorejpa.repository.LibroRepository;

@Service
public class LibroService {
	
	private final LibroRepository repository;
	
	
	public LibroService(LibroRepository repository) {
		this.repository = repository;
	}
	
	//Aggiungere il metodo toResponse
	
	
	
	//--- CRUD ----
	public List<Libro> elencoLibri(){
		return repository.findAll(); //Questo findAll() è un metodo di JPA che "nasconde" : SELECT * from libri
	}

	public Optional<Libro> cercaLibro(Integer id) {
		return repository.findById(id);
	}
}
