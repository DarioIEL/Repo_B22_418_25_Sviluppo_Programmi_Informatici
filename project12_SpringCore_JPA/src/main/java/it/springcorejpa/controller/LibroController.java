package it.springcorejpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.springcorejpa.entity.Libro;
import it.springcorejpa.service.LibroService;

@RestController
@CrossOrigin()
@RequestMapping("/api/libri")
public class LibroController {

	private final LibroService service;
	
	public LibroController(LibroService service) {
		this.service = service;
	}
	
	
	//CRUD
	@GetMapping
	public ResponseEntity<List<Libro>> lista(){
		return ResponseEntity.ok(service.elencoLibri());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Libro>> libroSingolo(@PathVariable Integer id){
		return ResponseEntity.ok(service.cercaLibro(id));
	}
	
}
