package recap;


import java.util.ArrayList;
import java.util.List;

public class MetodiAusiliari {
	
//	Definisco i metodi ausiliari statici. I metodi static sono metodi di classe
	
	public static void iniziaCorso() {
		String nomeCorso = "TSPPI";
		System.out.println("Oggi comincia il corso " + nomeCorso);
	}

	
	private static void elencaStudenti() {
		List<String> studenti = new ArrayList<>();
		studenti.add("Laura");
		studenti.add("Marco");
		studenti.add("Anna");
		studenti.add("Luca");
		
		System.out.println("Questi sono gli studenti iscritti al corso");
		
		for(int i = 0; i < studenti.size(); i++) {
			System.out.println(studenti.get(i));
		}
		
	}
	
	public static void stampaNomi(String username, String password) {
		if(username.equals("Pippo") && password.equals("1234")) {
			elencaStudenti();
		}else {
			System.out.println("Mi spiace, non hai i permessi per questo");
		}
	}
	
	public static void main(String[] args) {
		//Voglio richiamare un metodo che appartiene alla mia classe
		iniziaCorso();
		elencaStudenti();
	}
	
}
