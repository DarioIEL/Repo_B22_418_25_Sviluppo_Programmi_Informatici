package lezione02_Statement;

import java.util.Scanner;

public class While_Statement {
	public static void main(String[] args) {
		//Con il while siamo nella famiglia dei cicli indefiniti. Non so a priori quante volte verrà eseguito il codice all'interno di un while
		
		/**
		 * while(condizione){
		 * 			..esegui se la condizione è true
		 * }
		 */
		
		//REplico un ciclo for con un while
		
		int i = 0;
		
		while(i < 10) {
			System.out.println("Ciao " + i);
			i++;
		}
		
		//Posso scrivere la tabellina di un numero
		int m = 1;
		
		while (m < 1) {
			int res = m * 5;
			System.out.println(m + " x " + 5 + " = " + res);
			m++;
		}
		
		//DO - while. Almeno 1 volta viene eseguito il codice nel do{}, poi dopo viene controllato con il while
		int d = 1;
		
		do {
			int res = d * 7;
			System.out.println(d + " x " + 7 + " = " + res);
			d++;
		}while(d < 1);
		
		
		//While con scanner
		//L'utente non entra in piattaforma fin quando non ha inserito la pass corretta
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci la pass");
		
		String pass = scan.nextLine();
		int tentativi = 1;
		
		while(!pass.equals("pippo123")) {
			tentativi++;
			System.out.println("Mi spiace, password errata");
			System.out.println("Riprova");
			pass = scan.nextLine();
		}
		
		System.out.println("Benvenuto, hai inserito pass corretta dopo " + tentativi + " tentativi");
		
	}
}
