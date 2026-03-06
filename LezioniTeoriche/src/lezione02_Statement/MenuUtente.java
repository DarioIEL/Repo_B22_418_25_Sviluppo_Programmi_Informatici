package lezione02_Statement;

import java.util.Random;
import java.util.Scanner;

public class MenuUtente {
	public static void main(String[] args) {

		Scanner mioScan = new Scanner(System.in);

		char scelta;

		do {
			System.out.println("=== MENU ===");
			System.out.println("1. Gioca ai dadi");
			System.out.println("2. Gioca con i numeri");
			System.out.println("3. Gioca con i triangoli");
			System.out.println("4. ESCI");
			System.out.println("============");
			System.out.println("Inserisci un numero per effettuare la scelta");

			scelta = mioScan.next().charAt(0);

			System.out.println("Hai scelto: " + scelta);

			switch (scelta) {
			case '1':
				System.out.println("Hai scelto di giocare ai dadi");
				int d1, d2;
				d1 = (int) Math.ceil(Math.random() * 6);
				d2 = (int) Math.ceil(Math.random() * 6);

				System.out.println("Dado Rosso: " + d1 + " - Dado Blu: " + d2);

				if (d1 == d2) {
					System.out.println("Numeri uguali, hai vinto");
				} else {
					System.out.println("Mi spiace, hai perso");
				}
				break;
			case '2':
				System.out.println("Hai scelto di giocare con i numeri");
				System.out.println("Inserisci un numero da 0 a 20. Scopri se è quello fortunato !!");
				Scanner scanUser = new Scanner(System.in);
				
//				Random rand = new Random();
//				int numFortunato = rand.nextInt(0,20);
				
				int numFortunato = (int) Math.ceil(Math.random() * 20);
				int numeroUser = scanUser.nextInt();
				
				
				if(numeroUser == numFortunato) {
					System.out.println("Bravo, hai indovinato");
					System.out.println("Numero fortunato: " + numFortunato);
				}else {
					System.out.println("Mi spiace, non hai indovinato");
					System.out.println("Numero fortunato: " + numFortunato);
				}
				

				break;
			case '3':
				System.out.println("Hai scelto di giocare con i triangoli");
				break;
			case '4':
			case 'q':
			case 'Q':
				System.out.println("Chiusura in corso....");
				break;
			default:
				System.out.println("Mi spiace, comando non riconosciuto");
			}

		} while (scelta != '4' && scelta != 'q' && scelta != 'Q');

		System.out.println("Sei uscito dal menu");
	}
}
