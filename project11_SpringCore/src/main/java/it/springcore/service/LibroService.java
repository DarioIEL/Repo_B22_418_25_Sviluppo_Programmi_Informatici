package it.springcore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
 * Questa classe "dipende" da libroREpository
 * NON LO CREO CON new ma lo inietto come parametro del costruttore del mio service.
 * 
 * Cosa succede all'avvio:
 * 1. Spring tenta di creare libroService
 * 2. Essendoci un LibroRepository iniettato lo cerca tra i component.
 * 3. Lo passa al costruttore
 */

@Service
public class LibroService {

	
//  APPROCCIO Injection via Costruttore
	private final LibroRepository repo; //final = una volta assegnato non cambia mai più
	
	//Questa sotto è una Dependency Injection (DI) via costruttore con il @Autowired implicito
	
	@Autowired
	public LibroService(LibroRepository repo) {
		this.repo = repo; //ATT: il repo già contiene i 3 libri che vengono inseriti nel momento in cui viene letta la classe LibroRepository
	}
	
	public LibroService(LibroRepository repo, String nomeRepo) {
		this.repo = repo;
		System.out.println(nomeRepo);
	}
	
// Regola: è preferibile utilizzare l'Injection via Costruttore. Nel caso in cui io sono in presenza di più costruttori allora annoto uno dei due con @Autowired per far capire a Spring quale iniettare (situazione molto rara)
/////////////////////////////////////
	
//// APPROCCIO con @Autowired. Inietta direttamente (usando la reflection per accedere al campo private). Il campo però non può più essere "final"
//	@Autowired
//	private LibroRepository repo;
//	
///////////////////////////////////////
	
////	APPROCCIO con i setters 
//	private LibroRepository repo;
//	
//	@Autowired
//	public void setRepository(LibroRepository repo) {
//		this.repo = repo;
//	}
//	
//////////////////////////////////////////

	
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
