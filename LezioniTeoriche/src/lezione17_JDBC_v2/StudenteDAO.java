package lezione17_JDBC_v2;

import java.util.List;

//In questo caso l'interfaccia sta direttamente ereditando da GenericDAO
public interface StudenteDAO extends GenericDAO<Studente> {

	//Le costanti trattengono le query da fare sul DB
	String GET_ALL = "select * from studenti";
	String GET_BY_ID = "select * from studenti where id = ?";
	String GET_BY_EMAIL = "select * from studenti where email = ?";
	String GET_BY_CORSO = "select * from studenti where corso = ?";
	String ADD = "insert into studenti (nome, cognome, corso, email) values (?,?,?,?)";
	String DELETE = "delete from studenti where id = ?";
	
	
	//Questi metodi verranno utilizzati dall'implementazione dello studente ma adesso che abbiamo il Generic DAO non mi serve più poiché questi metodi sono già descritti nellìinterfaccia che sto estendendo
	
//	List<Studente> getAllStudenti();
//	Studente getStudenteById();
//	void addStudente();
//	void removeStudente();

	//Implemento solo i metodi che non sono presenti nel GenericDAO
	Studente getStudenteByEmail(String email);
	List<Studente> getStudentiByCorso(String corso);
	
	
}
