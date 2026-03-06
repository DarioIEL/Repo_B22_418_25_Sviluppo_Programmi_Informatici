package giochi;

import java.util.Scanner;

public class Dadi {
	
	public static void lanciaDadiSemplice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quante facce devono avere i tuoi 2 dadi ?");		
		int facce = scan.nextInt();
		
		if(facce >= 4 && facce <= 20) {
			int lancio1 = (int) Math.ceil(Math.random() * facce);
			int lancio2 = (int) Math.ceil(Math.random() * facce);
			
			System.out.println("Dado1: " + lancio1);
			System.out.println("Dado2: " + lancio2);

			if(lancio1 == lancio2) {
				System.out.println("Complimenti, hai vinto");
			}else {
				System.out.println("Mi dispiace, hai perso");
			}
		}
	}
	
	public static void lanciaDadi2(int numeroDadi) {
		int[] lanci = new int[numeroDadi];
		int somma = 0;
		
		for(int i = 0; i < numeroDadi; i++) {
			int lancio = (int) Math.ceil(Math.random() * 6);
			lanci[i] = lancio;
			somma += lancio;
		}
		
		if(somma > 15) {
			System.out.println("Hai vinto");
		}else {
			System.out.println("Hai perso");
		}
			
		
	}
	
	
	public static void menuGiocoDadi() {
		char sceltaDadi;
		
		do {
		
		System.out.println("Hai scelto di giocare ai dadi");
		System.out.println("Quale dei due giochi sceglierai ?");
		
		Scanner scanDadi = new Scanner(System.in);
		System.out.println("1. Lancia i dadi semplici");
		System.out.println("2. Lancia i dadi scegliendo il numero");
		System.out.println("3. ESCI");
		
		sceltaDadi = scanDadi.next().charAt(0);
		switch(sceltaDadi) {
		case '1':
			lanciaDadiSemplice();
			break;
		case '2':
			int numeroDadi = 3;
			lanciaDadi2(numeroDadi);
			break;
		case '3':
			System.out.println("Ciao dal gioco dadi");
		}
		}while(sceltaDadi != '3');
	}

}
