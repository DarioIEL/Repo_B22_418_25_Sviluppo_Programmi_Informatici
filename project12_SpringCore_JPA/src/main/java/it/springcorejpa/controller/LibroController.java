package it.springcorejpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.springcorejpa.entity.Autore;
import it.springcorejpa.entity.Libro;
import it.springcorejpa.service.LibroService;

@RestController
@CrossOrigin()
@RequestMapping("/api")
public class LibroController {

	private final LibroService service;
	
	public LibroController(LibroService service) {
		this.service = service;
	}
	
	
	//CRUD  LIBRI
	@GetMapping("/libri")
	public ResponseEntity<List<Libro>> lista(){
		return ResponseEntity.ok(service.elencoLibri());
	}
	
	@GetMapping("/libri/{id}")
	public ResponseEntity<Libro> libroSingolo(@PathVariable Integer id){
		return ResponseEntity.ok(service.cercaLibro(id));
	}
	
	//Il client invia un oggetto {"titolo": "Il pendolo di Foucault", "prezzo": 20} senza autore
	@PostMapping("/libri")
	public ResponseEntity<Libro> creaLibro(@RequestBody Libro libro){
		Libro nuovoLibro = service.creaLibro(libro.getTitolo(), libro.getPrezzo());
		return ResponseEntity.status(HttpStatus.CREATED).body(nuovoLibro);
	}
	
	
	
	
	//CRUD AUTORI
	@GetMapping("/autori")
	public ResponseEntity<List<Autore>> autori(){
		return ResponseEntity.ok(service.elencoAutori());
	}
	
	//L'url di questa get sarà: http://localhost:8080/api/libri/cerca/autore?cognome=Eco
	@GetMapping("/cerca/autore")
	public ResponseEntity<List<Libro>> cercaPerAutore(@RequestParam String cognome){
		return ResponseEntity.ok(service.cercaPerAutore(cognome));
	}
	
	@PostMapping("/autori") //inserisce un autore ma senza libri
	public ResponseEntity<Autore> creaAutore(@RequestBody Autore autore){
		Autore nuovoAutore = service.creaAutore(autore.getNome(), autore.getCognome());
		return ResponseEntity.status(HttpStatus.CREATED).body(nuovoAutore);
	}
	
	@PostMapping("/libri/{libroId}/autori/{autoreId}")
	public ResponseEntity<Libro> aggiungiAutore(@PathVariable Integer libroId, @PathVariable Integer autoreId){
		Libro libroConAutore = service.aggiungiAutoreALibro(libroId, autoreId);
		return ResponseEntity.ok(libroConAutore);
	}
	
	
	/*
	 * Creo un metodo per accettare un oggetto completo (libro + autori)
	 * {
	 * 		"titolo": "Spring per Neofiti",
	 * 		"prezzo": 55.90,
	 * 		"autori" : [
	 * 				{"nome": "Dario", "cognome": "Mennillo"}
	 * 				{"nome": "Oscar", "cognome": "Vecchione"}
	 * 				]
	 * }
	 */
	
		
	@PostMapping("/libri/completo")
	public ResponseEntity<Libro> creaLibroCompleto(@RequestBody Libro libroCompleto){
		Libro nuovoCreato = service.creaLibroCompleto(libroCompleto);
		return ResponseEntity.status(HttpStatus.CREATED).body(nuovoCreato);
	}
	
	
	
	
	
}
