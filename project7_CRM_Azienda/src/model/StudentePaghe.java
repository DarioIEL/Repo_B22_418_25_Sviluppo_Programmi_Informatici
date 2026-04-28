package model;

import java.time.LocalDate;
import java.util.List;

public class StudentePaghe extends Studente {

	public StudentePaghe(String nome, String cognome, String email, LocalDate dataRegistrazione) {
		super(nome, cognome, email, dataRegistrazione);
	}

	@Override
	public void assegnaCorsi(List<Corso> nuoviCorsi) {
		nuoviCorsi.stream()
			.filter(c -> c.getCodice().startsWith("PAG")) 
				.forEach(corsi::add); 
	}
}
