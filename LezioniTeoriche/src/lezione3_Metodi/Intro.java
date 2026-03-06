package lezione3_Metodi;

import java.util.Scanner;

public class Intro {

	//METODI STATIC: il metodo dichiarato static appartiene alla classe e NON all'istanza(oggetto)
	//La keyword static se applicata ad una variabile (proprietà) fa la stessa
	
	//Quando il tipo di ritorno è void il metodo non mi restituisce nulla ma esegue solo del codice

//  modificatore  tipo restituito
	public static void salutaUser() {
		//nomeUser è una variabile locale, quindi visibile solo ed esclusivamente all'interno di questo metodo
		String nomeUser = "Dario";
		System.out.println("Ciao utente " + nomeUser);
	}
	
	//Metodo con un parametro (posso avere n parametri)
	public static void salutaRespo(String nomeRespo) {
		String saluto = "Un saluto alla responsabile corso: " + nomeRespo;
		System.out.println(saluto);
		
	}
	
	public static void salutaStudente() {
		Scanner mioScann = new Scanner(System.in);
		System.out.println("Scrivi il nome dello studente che vuoi salutare");
		String nomeStud = mioScann.nextLine();
		System.out.println("Ciao " + nomeStud);
	}

	public static void salutaTutti() {
		salutaUser();
		salutaRespo("Valentina Favole");
		salutaStudente();
	}
	
	//Metodo con un valore restituito con il return. ATT: i return non sono obbligatori, se non ho nulla da restituire inbserisco void. Avere un valore in return non mi obbliga ad avere un parametro
	public static double cambiaNumero(int tuoNumero) {
		double numeroUscita = tuoNumero * 6;
		return numeroUscita;
	}
	
	public static int generaDouble() {
		int numCasuale = (int) (Math.random() * 50);
		//Posso anche richiamare un metodo da un altro metodo
		int numAltroMet = (int) cambiaNumero(numCasuale);
		
		int numFinale = numCasuale * numAltroMet;
		
		return  numFinale;
	}
	
//	In una classe posso avere più metodi tra cui il metodo main 
	
	public static void main(String[] args) {
		//Richiamo il metodo che mi interessa
		salutaUser();
		salutaRespo("Stefania Vipiana");
		salutaRespo("Egle Risola");
		
		//teniamo presente che adesso, nel richiamare il metodo avente il return, devo andare a "raccogliere" il valore in uscita
		double numeroCambiato = cambiaNumero(7);
		System.out.println("Il tuo numero cambiato adesso vale: " + numeroCambiato);
		
		int numCasuale = generaDouble();
		System.out.println("E' stato generato il seguente numero: " + numCasuale);
		
		
		salutaTutti();
		
		
	}
}
