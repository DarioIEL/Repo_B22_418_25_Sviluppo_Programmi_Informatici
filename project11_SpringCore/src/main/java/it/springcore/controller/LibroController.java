package it.springcore.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.springcore.dto.LibroResponse;
import it.springcore.model.Libro;
import it.springcore.service.LibroService;

/**
 * LAYER CONTROLLER - Gestisce le richieste HTTP 
 * 
 */

@RestController
@CrossOrigin()
public class LibroController {
	private final LibroService service;

	public LibroController(LibroService service) {
		this.service = service;
	}
	
	@GetMapping("/libri")
	public ResponseEntity<List<LibroResponse>> lista(){
		List<LibroResponse> libri = service.elencoLibri();
		return ResponseEntity.ok(libri);
	}
	
	
	
	
	
}
