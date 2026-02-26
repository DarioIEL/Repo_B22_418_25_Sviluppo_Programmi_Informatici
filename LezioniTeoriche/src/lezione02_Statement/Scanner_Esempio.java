package lezione02_Statement;

import java.util.Scanner;

public class Scanner_Esempio {
	public static void main(String[] args) {

		//Acquisisce gli input utente
		
		//Stringhe
		Scanner mioScanner = new Scanner(System.in);
		
		System.out.print("Ciao, inserisci il tuo nome: ");
		String nomeUser = mioScanner.nextLine();
		
		if(nomeUser.equals("") || nomeUser.trim().equals("")) {
			System.out.println("Non hai inserito niente");
		}else {			
			System.out.println("Benvenuto " + nomeUser);
		}
		
		//Posso usarlo per inserire cose diverse
		
		System.out.println("Inserisci adesso la tua età");
		int etaUser = mioScanner.nextInt();
		
		System.out.println("Hai " + etaUser + " anni");
		
		System.out.println("Inserisci il tuo voto d'esame");
		double votoEsame = mioScanner.nextDouble();
		
		System.out.println("L'ultimo esame ha un voto di: " + votoEsame);

		//Pulisco lo scanner
		mioScanner.nextLine();
		
		System.out.println("Scrivi qualcosa");
		String qualcosa = mioScanner.nextLine();
		
		System.out.println("Hai scritto questo: " + qualcosa);
		
		
		Scanner altroScanner = new Scanner(System.in);
		
		try {
			System.out.println("Inserisci un numero");
			double mioNum = altroScanner.nextDouble();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Non hai inserito un numero");
		}
		
	}
}
