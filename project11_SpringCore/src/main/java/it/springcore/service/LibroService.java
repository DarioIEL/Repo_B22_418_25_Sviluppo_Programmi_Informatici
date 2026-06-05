package it.springcore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.springcore.dto.LibroRequest;
import it.springcore.dto.LibroResponse;
import it.springcore.model.Libro;
import it.springcore.repository.LibroRepository;

@Service
public class LibroService {

	
//  APPROCCIO Injection via Costruttore
	private final LibroRepository repo; 
	

	public LibroService(LibroRepository repo) {
		this.repo = repo; //ATT: il repo già contiene i 3 libri che vengono inseriti nel momento in cui viene letta la classe LibroRepository
	}
	
	//METODI DI CONVERSIONE DA MODEL A DTO: sono metodi private interni
	//Model -> DTO quindi il controller riceverà solo LibroResponse e non Libro
	
	private LibroResponse toResponse(Libro libro) {
		return new LibroResponse(libro.getId(), libro.getTitolo(), libro.getAutore(), libro.getPrezzo());
	}

	
	//CRUD
	//READ
	public List<LibroResponse> elencoLibri(){
		return repo.trovaTutti()
				.stream()
				.map(this::toResponse)
				.toList();
	}
	
	//READ
	public LibroResponse cercaLibro(Long id){
		Libro libro = repo.trovaById(id).orElseThrow();
				
		return toResponse(libro);
	}
	
	
	//CREATE
	//Qui adesso vado ad utilizzare il mio LibroRequest.
	//Ricevo in nput un LibroRequest (DTO) -> crea un Libro (model)-> salvo il libro -> restituisce un DTO
	public LibroResponse aggiungiLibro(LibroRequest request) {
		Libro nuovo = new Libro(request.getTitolo(), request.getAutore(), request.getPrezzo());
		Libro libroSalvato = repo.salva(nuovo);
		
		return toResponse(libroSalvato);
	}
	
	
	//UPDATE (devo aggiungere il metodo nel Repository
	
	//DELETE
	public void eliminaLibro (Long id) {
		boolean libroRimosso = repo.elimina(id);
	}
	
	public void eliminaLibro (LibroRequest libro) {
		Libro libroDaRimuovere = new Libro(libro.getTitolo(), libro.getAutore(), libro.getPrezzo());
		boolean libroRimosso = repo.eliminaByObj(libroDaRimuovere);
	}
	
}
