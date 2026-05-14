package lezione17_JDBC_v2;

import java.util.List;

public class Main {
	public static void main(String[] args) {
	
//		Test della connesione
		DatabaseConnection dbConn = DatabaseConnection.getInstance();
		dbConn.testaConnessione();
		
//		Aggiunta nuovoStudente
		StudenteDAO dao = new StudenteDAOImpl();
		StudenteService service = new StudenteService(dao);

//		Studente stud = new Studente("Mario", "Rossi", "Sviluppo Software", "mario@mail.com");
//		boolean creato = dao.create(stud);
//		System.out.println("Studente creato: " + creato);
		
		boolean creato = service.aggiungiStudente("Anna", "Verdi", "Sviluppo Software", "anna@mail.com");
		System.out.println("Studente Creato");
		
// Leggi tutti
		List<Studente> tuttiStudenti = dao.readAll();
		System.out.println("Lista Studenti completa");
		for(Studente s: tuttiStudenti) {
			System.out.println(s);
		};
	}
}
