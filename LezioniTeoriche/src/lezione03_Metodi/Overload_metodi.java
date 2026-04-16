package lezione03_Metodi;

public class Overload_metodi {
	
	public static void salutaRespo() {
		System.out.println("Ciao Respo");
	}
	
	public static void salutaRespo(String nome) {
		System.out.println("Ciao " + nome + " responsabile");
	}
	
	//Un qualsiasi metodo può essere mandato in overload. Stesso nome del metodo ma con firma diversa
	public static void salutaRespo(String nome, String corso) {
		System.out.println("Ciao " + nome + " sei respo sul corso di " + corso);
	}

	public static void saluta(String nome) {
		System.out.println("Ciao " + nome);
	}
	
	public static void saluta(String nome, String cognome) {
		System.out.println("Ciao " +  nome + " " + cognome);
	}
	
	public static void saluta(int numero) {
		for(int i = 0; i < numero; i++) {
			saluta("Anna");
		}
	}

// NON POSSO MANDARE IN OVERLOAD UN METODO UTILIZZANDO LA STESSA FIRMA
//	public static void saluta(String nomeCompleto, String cognomeCompleto) {
//		System.out.println("Benvenuto");
//	}
	
	
	public static void metodoProva(String parola, int numero) {
		System.out.println("Questa è la parola: " + parola + ". Questo è il numero: " + numero);
	}
	
	public static void metodoProva(int numero, String parola) {
		System.out.println("Questa è la parola: " + parola + ". Questo è il numero: " + numero);
	}
	
	
	public static void main(String[] args) {
		
		salutaRespo();
		salutaRespo("Stefania Vipiana");
		salutaRespo("Egle Risola", "TPAS");
		
		saluta("Dario");
		saluta("Dario", "Mennillo");
		saluta(5);
		
		metodoProva("Ciao", 7);
		metodoProva(9, "Scuola");
	}
}
