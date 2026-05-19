package it.hellospring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class SalutiController {

	 //Verrà eseguita una richiesta di tipo GET all'indirizzo localhost:8050/
	@GetMapping("/")
	public String helloWorld() {
		return "Ciao Mondo";
	}
	
	@GetMapping("/Sahar")
	public String helloSahar() {
		return "Ciao Sahar questo servizio risponde a nome tuo";
	}
	
}
