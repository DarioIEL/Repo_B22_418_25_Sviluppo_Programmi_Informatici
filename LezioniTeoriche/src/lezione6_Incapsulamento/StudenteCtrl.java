package lezione6_Incapsulamento;

import java.util.ArrayList;
import java.util.List;

public class StudenteCtrl {
	
	private List<Studente> studenti;

	public StudenteCtrl() {
		this.studenti = new ArrayList<>();
	}
	
	public void iscriviStudente(String nome, String cognome, int eta, String passAccesso) {
		if(passAccesso == "12345") {
			Studente stud = new Studente(nome, cognome, eta);
			stud.setMatricola(42);
			this.studenti.add(stud);
		}
	}
	
	public void stampaListaStudenti() {
		for(Studente stud: studenti) {
			System.out.println(stud);
		}
	}

	public List<Studente> getStudenti() {
		return studenti;
	}
	

}
