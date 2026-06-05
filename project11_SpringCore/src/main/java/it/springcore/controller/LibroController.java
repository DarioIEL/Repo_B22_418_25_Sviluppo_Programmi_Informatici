package it.springcore.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.springcore.dto.LibroRequest;
import it.springcore.dto.LibroResponse;
import it.springcore.model.Libro;
import it.springcore.service.LibroService;

/**
 * LAYER CONTROLLER - Gestisce le richieste HTTP 
 * 
 */

@RestController
@CrossOrigin()
@RequestMapping("/api/libri") //Questo sarà il prefisso comune a tutti i metodi
public class LibroController {
	
	private final LibroService service;

	public LibroController(LibroService service) {
		this.service = service;
	}
	
	@GetMapping //Avendo RequestMapping quando chiamo /api/libri chiamerò direttamente il metodo lista
	public ResponseEntity<List<LibroResponse>> lista(){ //Response Entity è il wrapper integrale della response HTTP. Alò suo interno c'è HEAD, BODY(Json),OPTION, STATUS CODE
		List<LibroResponse> libri = service.elencoLibri();
		return ResponseEntity.ok(libri);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<LibroResponse> getLibroSingolo(@PathVariable Long id){
		LibroResponse libro = service.cercaLibro(id);
		return ResponseEntity.ok(libro);	
	}
	
	@PostMapping
	public ResponseEntity<LibroResponse> crea(@RequestBody LibroRequest libroReq){
		LibroResponse creato = service.aggiungiLibro(libroReq);
		return ResponseEntity.status(HttpStatus.CREATED).body(creato); //status code della creazione è 201
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> elimina(@PathVariable Long id){
		service.eliminaLibro(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
