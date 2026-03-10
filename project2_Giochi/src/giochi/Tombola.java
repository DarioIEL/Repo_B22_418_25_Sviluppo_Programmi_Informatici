package giochi;

import java.util.Random;

public class Tombola {
// Sviluppa i vari metodi per giocare al gioco della tombola
//Chiedi all'utente quanti numeri estrarre su un set di 90 numeri
//Chiedi all'utente quanti numeri estrarre su un set impostato dall'utente stesso (1 - X)
//ATT: tutte le estrazioni dovranno essere univoche. Non posso estrarre 2 volte lo stesso numero
	
	public static void numRandom() {
//		Random rand = new Random();
//		int numeroCasuale = rand.nextInt(1, 90);
		
		int numeroCasuale = (int) Math.ceil(Math.random() * 90);
		System.out.println(numeroCasuale);
	}
	
	public static void main(String[] args) {
		numRandom();
	}
}
