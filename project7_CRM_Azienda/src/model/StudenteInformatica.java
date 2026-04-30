package model;

import java.time.LocalDate;
import java.util.List;

public class StudenteInformatica extends Studente {

	public StudenteInformatica(String nome, String cognome, String email, LocalDate dataRegistrazione) {
		super(nome, cognome, email, dataRegistrazione);
	
	}

	@Override
	public void assegnaCorsi(List<Corso> nuoviCorsi) {
		nuoviCorsi.stream()
				.filter(c -> c.getCodice().startsWith("INF"))//questa lambda lascia passare solo gli elementi true
				
				.forEach(corsi::add); //metodo reference
	}

}
