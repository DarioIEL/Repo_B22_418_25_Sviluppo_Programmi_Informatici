package lezione02_Statement;

import java.util.Scanner;

public class EsamiUniversita {
	public static void main(String[] args) {
		
		/**
		 * Crea un programma per la gestione degli esami all'università. GEstisci
		 * un singolo esame alla volta. L'esame scritto farà da sogli adi sbarramento all'esame 
		 * orale (il mio voto scritto deve essere di almeno 18). Fornisci la possibilità 
		 * all'utente di inserire i voti uno alla volta. Quando sono inseriti entrambi i voti calcola il voto finale (media dei due)
		 */
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("=== INSERIMENTO VOTO ESAMI ===");
		
		System.out.println("Caro docente, inserisci il voto dell'esame scritto: ");
		
		int votoScritto  = scan.nextInt();
		
	}
}
