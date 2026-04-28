package model;

import java.time.LocalDate;
import java.util.List;

public class StudenteGrafica extends Studente{

	
	public StudenteGrafica(String nome, String cognome, String email, LocalDate dataRegistrazione) {
		super(nome, cognome, email, dataRegistrazione);
	}

	//Gli passo un elenco di corsi e lui assegna allo studente di grafica solo i corsi con il codice GRF davanti
	@Override
	public void assegnaCorsi(List<Corso> nuoviCorsi) {
		for(Corso c: nuoviCorsi) {
			if(c.getCodice().startsWith("GRF")) {
				corsi.add(c);
			}
		}
	}

}
