package giochi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tombola {
// Sviluppa i vari metodi per giocare al gioco della tombola
//Chiedi all'utente quanti numeri estrarre su un insieme di 90 numeri
//Chiedi all'utente quanti numeri estrarre su un  insieme impostato dall'utente stesso (1 - X)
//ATT: tutte le estrazioni dovranno essere univoche. Non posso estrarre 2 volte lo stesso numero

	public static void main(String[] args) {
//		estrai1();
//		estrai2();
		estrai3();

	}

	public static int chiediNumero() {

		Scanner mioScan = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi estrarre ?");

		int numeriDaEstrarre = mioScan.nextInt();
		if (numeriDaEstrarre <= 90) {
			return numeriDaEstrarre;
		} else {
			return 0;
		}
	}

	public static void estrai3() {
		int numDaEstrarre = chiediNumero();

		Random rand = new Random();

		int[] numEstratti = new int[numDaEstrarre];

		int contatore = 0; // Questo mi dice quanti numeri ho inserito nell'array

		while (contatore < numEstratti.length) {
			int numeroCasuale = rand.nextInt(1, 91);

			boolean presente = false;

			for (int i = 0; i < contatore; i++) {
				if (numEstratti[i] == numeroCasuale) {
					presente = true;
					break;
				}
			}

			if (!presente) {
				numEstratti[contatore] = numeroCasuale;
				contatore++;
			}

		}

		System.out.println(Arrays.toString(numEstratti));

	}

	public static void estrai2() {
		int numeriDaEstrarre = 60;

		int[] numEstratti = new int[numeriDaEstrarre];

		Random rand = new Random();

		int tentativi = 0;

		// QUesto for inserisce
		for (int i = 0; i < numEstratti.length; i++) {
			tentativi++;
			numEstratti[i] = rand.nextInt(1, 91);

			// Questo for controlla
			for (int j = 0; j < i; j++) {
				if (numEstratti[j] == numEstratti[i]) {
					i--;
				}
			}
		}

		System.out.println(Arrays.toString(numEstratti));
		System.out.println("Tentativi: " + tentativi);
	}

	public static void estrai1() {
		List<Integer> numEstratti = new ArrayList<>();
		int numeriDaEstrarre = 10; // Questo valore va aquisito dall'utente
		Random rand = new Random();
		int tentativi = 0;

		for (int i = 0; i < numeriDaEstrarre; i++) {
			int numeroCasuale = rand.nextInt(1, 91);

			if (!numEstratti.contains(numeroCasuale)) {
				numEstratti.add(numeroCasuale);
			} else {
				i--;
			}
			tentativi++;
		}

		System.out.println(numEstratti + "\nin " + tentativi + " tentativi");
	}
}
