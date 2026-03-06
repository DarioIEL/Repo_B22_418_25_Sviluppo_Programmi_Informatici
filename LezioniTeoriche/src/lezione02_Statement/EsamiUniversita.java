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
		
		//CREO Delle costanti utilizzando la parola chiave final
		final String NOME_APPLICAZIONE = "Inserimento voti Esami";
		final int VOTO_MAX = 30;
		final int VOTO_MIN = 0;
		final int SOGLIA = 18;
		
		
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("===" + NOME_APPLICAZIONE +"===");
		System.out.println("Caro docente, inserisci il voto dell'esame scritto: ");
		
		int votoScritto  = scan.nextInt();
		
		if(votoScritto <= VOTO_MAX && votoScritto >= VOTO_MIN) {
			if(votoScritto >= SOGLIA) {
				System.out.println("Voto scritto: " + votoScritto);
				System.out.println("Adesso inserisci il voto dell'orale:");
				
				int votoOrale = scan.nextInt();
				if(votoOrale <= VOTO_MAX && votoOrale >= VOTO_MIN) {
					
					if(votoOrale >= 18) {
						//superato, calcola voto finale
						System.out.println("Voto Orale: " + votoOrale);
						double votoFinale = Math.round((votoOrale + votoScritto)/2);
						System.out.println("Voto Finale: " + votoFinale);
					}else {
						//Esame non superato
						System.out.println("Mi spiace, non hai superato l'esame orale. Quindi no hai superato l'intero esame");
					}
					
				}else {
					System.out.println("Voto orale non valido");
				}
			}else {
				System.out.println("Mi spiace non hai passato lo scritto. Non puoi accedere all'orale");
			}
		}else {
			System.out.println("Voto inserito non valido");
		}
		
	}
}
