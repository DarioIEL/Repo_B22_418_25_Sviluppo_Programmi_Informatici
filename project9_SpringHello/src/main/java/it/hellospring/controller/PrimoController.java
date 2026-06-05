package it.hellospring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/primoctrl")
@CrossOrigin()
public class PrimoController {
	
//	Creo il primo web service per ricevere dei dati formato String. Vado ad annotare con @GetMapping la quale mi dice quale meteodo dell'http verrà utilizzato
	
//	@RequestMapping(method = RequestMethod.GET)
//	@GetMapping(value = "/nomecorso")
	@GetMapping("/nomecorso")
	public String nomeCorso() {
		return "Tecnico sviluppo software";
	}
	
	@GetMapping(value = "/{nomeuser}")
	public String salutaUser(@PathVariable("nomeuser") String nome) {
		return "\"Ciao " + nome + "\"";
	}
}
