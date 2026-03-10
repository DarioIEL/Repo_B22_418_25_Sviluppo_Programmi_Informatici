package giochi;

import java.util.Scanner;

public class Multipli {
	
	/**
	 * Questo metodo calcola solo i multipli di 3 per i numeri da 1 a 100
	 */
	public static void calcolaMultipli() {
		int numeroDiMultipli = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i + " Eccoloooo ");
				numeroDiMultipli++;
			}else {				
				System.out.println(i);
			}
		}
		
		System.out.println("Hai trovato " + numeroDiMultipli + " multipli");
	}
	
	//Questo calcola i multipli di 3 e 5 tra 1 e 100
	public static void calcolaMultipli35() {
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " Entrambi ");
			}else if(i % 3 == 0) {
				System.out.println(i + " BOOM");
			}else if(i % 5 == 0) {
				System.out.println(i + " ZOOM");
			}else {				
				System.out.println(i);
			}
		}
		
	}
	
	//Calcola i multipli di un numero a scelta
	public static void calcolaMultipli(int numero) {
		for(int i = 1; i <= 100; i++) {
			if(i % numero == 0) {
				System.out.println(i + " Questo è un multiplo");
				continue;
			}
			
			System.out.println(i);
		}
	}
	
	public static void menuMultipli() {
		Scanner scan = new Scanner(System.in);
		char scelta;
		
		do {
			System.out.println("Gioco dei multipli. Scegli quali multipli calcolare tra 1 e 100");
			System.out.println("1. Calcola i multipli di 3");
			System.out.println("2. Calcola i multipli di 3 e 5");
			System.out.println("3. Scegli i multipli di quale numero calcolare");
			scelta = scan.next().charAt(0);
			
			switch(scelta) {
			case '1':
				calcolaMultipli();
				break;
			case '2':
				calcolaMultipli35();
				break;
			case '3':
				System.out.println("Digita il numero del quale vorrai calcolare i multipli");
				int numero = scan.nextInt();
				calcolaMultipli(numero);
				break;
			case '4':
			case 'q':
			case 'Q':
				System.out.println("Stai uscendo dal gioco dei multipli...");
				break;
			default:
				System.out.println("Mi spiace, non ho capito il comando");
				
			}
		}while(scelta != '4' && scelta != 'q' && scelta != 'Q');
	}
	
}
