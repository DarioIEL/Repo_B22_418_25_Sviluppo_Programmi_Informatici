package lezione07_ENUM;

public class Main {

	public static void main(String[] args) {
		Giorno oggi = Giorno.GIOVEDI;
		System.out.println("Oggi è " + oggi);
		
		
		Colore primoColore = Colore.BLUE;
		System.out.println(primoColore.getNomeITA());
		
		Colore secondoColore = Colore.ORANGE;
		System.out.println(secondoColore.getNomeITA());
		
		
		System.out.println(EstensioneFile.PDF.estensione());
		if(EstensioneFile.PDF.supportoImg()) {
			System.out.println("Questa estensione supporta le immagini");
		}else {
			System.out.println("Questa estensione NON supporta le immagini");
		}
		
		
		double risultato = Operazione.PRODOTTO.calcola(4.8, 9.2);
		System.out.println("Il risultato dell'operazione è: " + risultato);
	}
}
