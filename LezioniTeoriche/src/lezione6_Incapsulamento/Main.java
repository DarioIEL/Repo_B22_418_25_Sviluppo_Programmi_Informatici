package lezione6_Incapsulamento;

public class Main {
public static void main(String[] args) {
	
	Studente stud = new Studente();
	
	Studente stud2 = new Studente("Laura", "Verdi", 27);	
	System.out.println(stud2.getNome() + " " + stud2.getCognome());
	stud2.setNome("Pippo", "abcd", "Lauretta");
	
	StudenteCtrl studCtrl = new StudenteCtrl();
	
	studCtrl.iscriviStudente("Luca", "Gialli", 25, "12345");
	studCtrl.iscriviStudente("Anna", "Verdi", 28, "12345");
	studCtrl.iscriviStudente("Paolo", "Gialli", 27, "12345");
	studCtrl.iscriviStudente("Marco", "Marchi", 26, "12345");
	
	studCtrl.stampaListaStudenti();
	
	Respo respo = new Respo("Egle", "Risola");
	
	//NUOVO CORSO
	System.out.println("==== NUOVO CORSO ====");
	Corso corsoTSS = new Corso("Tecnico Sviluppo Software", 750);
		
	corsoTSS.setStudenti(studCtrl.getStudenti());
	corsoTSS.setRespoCorso(respo);
	respo.setCorso(corsoTSS);

	System.out.println(corsoTSS);
	
	
	
}
}
