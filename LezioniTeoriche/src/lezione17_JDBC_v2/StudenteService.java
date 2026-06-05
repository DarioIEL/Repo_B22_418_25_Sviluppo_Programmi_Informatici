package lezione17_JDBC_v2;

import java.util.List;

public class StudenteService {
	private StudenteDAO dao;
	
	
	//DEPENDENCY INJECTION fatta a mano
	public StudenteService(StudenteDAO dao) {
		this.dao = dao;
	}
	
	public boolean aggiungiStudente(String nome, String cognome, String corso, String email) {
		if(nome == null || cognome == null || nome.isBlank() || cognome.isBlank()) {
			System.out.println("Stai dimenticando qualcosa");
			return false;
		}
		if(email == null || email.isBlank() || !email.contains("@")) {
			System.out.println("Email non valida");
		}
		
		//Controllo sulla duplicazione
		Studente giaEsistente = dao.getStudenteByEmail(email);
		if(giaEsistente != null) {
			System.out.println("Esiste già uno studente con questa email");
			return false;
		}
		
		Studente nuovoStudente = new Studente(nome, cognome, corso, email);
		return dao.create(nuovoStudente);
	}
	
	
	public Studente cercaStudente(int id) {
		Studente s = dao.readById(id);
		if(s == null) {
			System.out.println("Studente non trovato");
		}
		return s;
	}
	
	public List<Studente> tuttiGliStudenti(){
		return dao.readAll();
	}
	
	public List<Studente> studentiPerCorso(String corso){
		return dao.getStudentiByCorso(corso);
	}
	
	public boolean aggiornaStudente(Studente studente) {
		if(dao.readById(studente.getId())== null) {
			System.out.println("Non c'è nessuno studente con questo ID");
			return false;
		}
		return dao.update(studente);
	}
	

	public boolean eliminaStudente(int id) {
		if(dao.readById(id) == null) {
			System.out.println("Studente non esistente");
			return false;
		}
		
		return dao.delete(id);
	}
}
