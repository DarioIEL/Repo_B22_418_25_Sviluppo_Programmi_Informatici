package lezione01_Intro;

public class EsempioVariabili {
	public static void main(String[] args) {
		
		/**
		 * Istanzia 3 variabili: speseGenerali, speseAuto, speseViaggi. Assegna un valore a ciascuna. Calcola il totale, calcola una media trimestrale. Rappresenta il tutto nella console.
		 * Istanzia poi una variabile totaleAnnoPre e assegna un valore. Confronta il valore dell'anno attuale con il precedente e stampa il risultato (es: annoAtt > annoPre)
		 */
		
		double speseGenerali = 2500, speseViaggi = 3673.99, speseAuto = 650.5;
		
		double totale = speseAuto + speseGenerali + speseViaggi;
		
		double mediaTrimestre = totale / 4;
		
		System.out.println("=== SPESE SOSTENUTE ===");
		System.out.println("Spese Generali: " + speseGenerali + " €");
		System.out.println("Spese Viaggi: " + speseViaggi + " €");
		System.out.println("Spese Auto: " + speseAuto + " €");
		System.out.println("---- TOTALE: € " + totale + " ----");
		System.out.println("-- Media Trimestre: " + mediaTrimestre + " € ogni 3 mesi --");
		System.out.println("========================");

		
		double totaleAnnoPre = 8856.89;
		
		//voglio confrontare i due totali
		
		boolean confronto = totaleAnnoPre > totale;
		
		if(totaleAnnoPre > totale) {
			System.out.println("L'anno precedente hai spese di più rispetto a quello attuale");
		}else {
			System.out.println("L'anno precedente hai speso di meno");
		}
		
		
		//NON posso dichiarare 2 variabili con lo stesso nome
		String mioNome = "Dario";
//		String mioNome = "Anna";
		
		//Posso riassegnare una variabile
		mioNome = "Anna";
		mioNome = "Paolo";
		mioNome = "Gennaro";
		
		
	}
}
