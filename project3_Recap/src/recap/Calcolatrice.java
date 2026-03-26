package recap;

import java.util.Scanner;

public class Calcolatrice {
	
	private static double addizione(double n1, double n2) {
		double somma = n1 + n2;
		return somma;
	}
	
	//Overload del metodo addizione
	private static double addizione(double n1, double n2, double n3) {
		double somma = n1 + n2 + n3;
		return somma;
	}
	
	private static double sottrai(double n1, double n2) {
		double sottrazione = n1 - n2;
		return sottrazione;
	}
	
	
	private static double moltiplica(double n1, double n2) {
		double prodotto = n1 * n2;
		return prodotto;
	}
	
	private static double dividi(double n1, double n2) {
		double quoziente = n1 / n2;
		return quoziente;
	}
	
	
	public static void inizializzaCalc() {
		Scanner scan = new Scanner(System.in);
		
		boolean uscita = false;
		
		while(!uscita) {
			
			System.out.println("Inserisci due numeri e poi l'operazione da svolgere");
			
			double n1 = scan.nextDouble();
			double n2 = scan.nextDouble();
			
			//Questo sotto serve a pulire lo scanner
			scan.nextLine();
			
			System.out.println("Scegli un'operazione: + * - /");
			
			char operazione = scan.nextLine().charAt(0);
			
			switch(operazione) {
			case '+':
				System.out.println("La somma vale: " + addizione(n1, n2));
				break;
			case '-':
				System.out.println("La sottrazione vale: " + sottrai(n1, n2));
				break;
			case '*':
				System.out.println("Il prodotto vale: " + moltiplica(n1, n2));
				break;
			case '/':
				System.out.println("La divisione vale: " + dividi(n1, n2));
				break;
			case 'q':
				System.out.println("Stai chiudendo la calcolatrice");
				uscita = true;
				break;
			default:
				System.out.println("Operazione non valida");
			}
			
		}
	}
	
}
