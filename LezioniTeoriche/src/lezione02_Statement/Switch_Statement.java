package lezione02_Statement;

import java.util.Scanner;

public class Switch_Statement {
	public static void main(String[] args) {
//		Lo switch mi permette di valutare, in base ai casi, il valore di una variabile

		Scanner scan = new Scanner(System.in);

		System.out.println("Inserisci il numero del giorno della settimana");

		if (scan.hasNext()) {

			int giornoSettimana = scan.nextInt();

			switch (giornoSettimana) {

			case 1:
				System.out.println("Lunedì");
				int miaVar = 10;
				for(int i = 0; i < 100; i++) {
					if(i == miaVar) {
						System.out.println("Succede qualcosa");
					}
				}
				break;
			case 2:
				System.out.println("Martedì");
				break;
			case 3:
				System.out.println("Mercoledì");
				break;
			case 4:
				System.out.println("Giovedì");
				break;
			case 5:
				System.out.println("Venerdì");
				break;
			case 6:
				System.out.println("Sabato");
				break;
			case 7:
				System.out.println("Domenica");
				break;
			default:
				System.out.println("Non riconosco il numero inserito");
				break;
			}

		}

		String nomeGiorno = "Venerdì";
		switch(nomeGiorno) {
		case "Lunedì":
			System.out.println("Siamo al giorno:" + 1);
			break;
		case "Martedì":
			System.out.println("Siamo al giorno: " + 2);
		default:
			System.out.println("Non capisco il nome del giorno");
			break;
		}

	}
}
