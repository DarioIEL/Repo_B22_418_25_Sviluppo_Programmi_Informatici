package it.springcore.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import it.springcore.model.Libro;
import jakarta.annotation.PostConstruct;

/**
 * Layer Repository - permette l'accesso ai dati
 * L'annotation @Repository sta dicendo a Spring "questa classe è un Bean che gestirà la persistenza del dato"
 * Essendo un Bean non ho bisgno di specificare nessun costruttore. 
 * Il bean viene registrato nel container di Spring come un Singleton (esisterà una sola istanza di qyesta classe per tutta la vita dell'applicazione
 */
@Repository
public class LibroRepository {

	private long prossimoId;
	private List<Libro> archivio = new ArrayList<>();
	
	//Voglio inizializzare l'archivio inserendo determinati libri. Uso una annotation @PostConstruct (lifecycle hook). Il metodo "inizializza" verrà lanciato una volta sola nel momento in cui spring chiama il costruttore di questa classe
	@PostConstruct
	public void inizializza() {
		salva(new Libro("Il barone rampante", "Italo Calvino", 11.0));
		salva(new Libro("Il nome della rosa", "Umberto Eco", 14.0));
		salva(new Libro("Il processo", "Kafka", 12.0));
		System.out.println("Ho inizializzato l'archivio di libri. Ci sono attualmente " + archivio.size() + " libri");
	}
	
	
	public Libro salva(Libro libro) {
		libro.setId(prossimoId++);
		archivio.add(libro);
		return libro;
	}
	
	public List<Libro> trovaTutti(){
		return archivio;
	}
	
	public Optional<Libro> trovaById(Long id) {
		return archivio.stream()
				.filter(lib -> lib.getId().equals(id))
				.findFirst();
	}
	
	
	
}
