package lezione17_JDBC_v2;

public class StudenteService {
	private StudenteDAO dao;
	
	
	//DEPENDENCY INJECTION fatta a mano
	public StudenteService(StudenteDAO dao) {
		this.dao = dao;
	}
	
	public boolean aggiungiStudente(String nome, String cognome, String corso, String email) {
		Studente nuovoStudente = new Studente(nome, cognome, corso, email);
		return dao.create(nuovoStudente);
	}
}
