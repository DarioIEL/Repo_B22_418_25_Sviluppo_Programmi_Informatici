package lezione01_Intro;

public class EsercizioIF {
	public static void main(String[] args) {
		/**
		 * Un negozio offre uno sconto se si soddisfano almeno una delle due condizioni:
		 * 1. essere membri del club fedeltà 2. avere una spesa superiore a 100 euro
		 * nell'ultimo acquisto
		 * 
		 * Quando si verificano queste condizioni calcola uno sconto del 20% sul totale
		 */

		String nomeNegozio = "Piante e Fiori";

		boolean cartaFedelta = true;
		double ultimaSpesa = 10.99;

		if (cartaFedelta || ultimaSpesa >= 100) {
			System.out.println("Ciao, caro cliente. Hai diritto ad uno sconto del 20%");
			double prezzoScontato = ultimaSpesa * 0.8;
			System.out.println("Scontrino con sconto: " + prezzoScontato + " €");
		} else {
			System.out.println("Non hai diritto allo sconto");
			System.out.println("Scontrino: " + ultimaSpesa + " €");
		}

		// Cambia negozio. Si offre uno sconto solo quando si verificano entrambe le
		// condizioni
		if (cartaFedelta && ultimaSpesa >= 100) {
			System.out.println("Ciao, caro cliente. Hai diritto ad uno sconto del 20%");
			double prezzoScontato = ultimaSpesa * 0.8;
			System.out.println("Scontrino con sconto: " + prezzoScontato + " €");
		} else {
			System.out.println("Non hai diritto allo sconto");
			System.out.println("Scontrino: " + ultimaSpesa + " €");
		}

		/**
		 * Annaffiare le piante: Un dispositivo annaffia le piante in automatico quando
		 * la temperatura è superiore a 30° e l'umidità del suolo è inferiore al 40.
		 * Manda un messaggio all'utente
		 */

		double temp = Math.round(Math.random() * 40);
		double hum = Math.round(Math.random() * 90);

		System.out.println("TEMP Attuale: " + temp);
		System.out.println("HUM Attuale: " + hum);

		if (hum <= 40 && temp > 30) {
			System.out.println("Annaffia le piante");
		} else if (hum <= 40 && temp < 30) {
			System.out.println("Non preoccuparti, le temp sono ancora adatte. Non Annaffiare");
		} else if (hum > 40 && temp > 30) {
			System.out.println("Non annaffiare il terreno è ancora umido anche se le temp sono alte");
		} else {
			System.out.println("NON annaffiare. Ci sono le condizioni ottimali");
		}

		//					condizione			   ? se vero			 : se falso
		String messaggio = (hum <= 40 && temp > 30)? "Annaffia le piante": "Non annaffiare";
		System.out.println(messaggio);
		/**
		 * Crea una variabile numeroFortunato. Questo numero per essere fortunato deve
		 * trovarsi in un intervallo compreso tra 20 e 50. Se il numero fortunato scelto
		 * è il 42 manda un avviso con scritto "Sei stato fortunatissimo ma NIENTE
		 * PANICO"
		 */
//		int numeroFortunato = (int) Math.ceil(Math.random() * 100);
		int numeroFortunato = 42;

		System.out.println("Hai estratto il numero " + numeroFortunato);

		if (numeroFortunato == 42) {
			System.out.println("Sei stato fortunatissimo ma DON'T PANIC");
		} else if (numeroFortunato >= 20 && numeroFortunato <= 50) {
			System.out.println("Complimenti sei stato fortunato");
		} else {
			System.out.println("Ritenta");
		}

		if (numeroFortunato >= 20 && numeroFortunato <= 50) {

			if (numeroFortunato == 42) {
				System.out.println("Sei stato fortunatissimo ma DON'T PANIC");
				return;
			}
	
			System.out.println("Complimenti sei stato fortunato");
		
		} else {
			System.out.println("Ritenta");
		}

	}

}
