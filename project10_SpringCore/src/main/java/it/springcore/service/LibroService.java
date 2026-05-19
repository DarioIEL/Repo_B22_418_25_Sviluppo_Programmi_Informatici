package it.springcore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import it.springcore.model.Libro;
import it.springcore.repository.LibroRepository;

/**
 * LAYER SERVICE - Logica di business
 * Anche questa classe è un Bean, cioè uno Sterotype, marcata con decorato @Service
 * Questa classe dirà a Spring "Qui dentro c'è la logica di business"
 */

/**
 * DEPENCY INJECTION. Questa classe per poter funzionare avrà necessario bisogno di LibroRepository.
 * NON LO CREO CON new ma lo inietto come parametro del costruttore del mio service.
 * 
 * Cosa succede all'avvio:
 * 1. Spring tenta di creare libroService
 * 2. Essendoci un LibroRepository iniettato lo cerca tra i component.
 * 3. Lo passa al costruttore
 */

@Service
public class LibroService {

	private final LibroRepository repo;  //final = una volta assegnato non cambia mai più
	
	
	//Questa sotto è una Dependency Injection (DI) via costruttore
	public LibroService(LibroRepository repo) {
		this.repo = repo; //ATT: il repo già contiene i 3 libri che vengono inseriti nel momento in cui viene letta la classe LibroRepository
		
	}
	
	public List<Libro> elencoLibri(){
		return repo.trovaTutti();
	}
	
	public Optional<Libro> cercaLibro(Long id){
		return repo.trovaById(id);
	}
	
	public Libro aggiungiLibro(String titolo, String autore, double prezzo) {
		
		//Qui vedo meglio la logica di business: validazioni, controlli, regole per l'inserimento
		if(prezzo < 0) {
			throw new IllegalArgumentException("Non hai inserito un prezzo valido");
		}
		
		//.....
		
		Libro nuovoLibro = new Libro(titolo, autore, prezzo);
		
		return repo.salva(nuovoLibro);
	}
	
	
}
