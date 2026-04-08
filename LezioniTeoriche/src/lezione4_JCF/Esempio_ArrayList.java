package lezione4_JCF;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Esempio_ArrayList {
	
	public static void main(String[] args) {
		//JCF Java Collection Framework
		
		//ArrayList come degli Array ridimensionabili
		
		//2° modo SCORRETTO
		ArrayList<String> parole = new ArrayList<>();
		parole.reversed();
		
		
		//1° modo per dichiarare un ArrayList ( DA UTILIZZARE )
		List<String> nomi = new ArrayList<>();
		
		//aggiungo degli elementi
		nomi.add("Dario");
		nomi.add("Anna");
		nomi.add("Paolo");
		nomi.add("Maria");
		
		//size() è come la prop length
		System.out.println("Nell' ArrayList ci sono " + nomi.size() + " elementi");
		
		System.out.println(nomi);
		System.out.println(nomi.reversed());
		System.out.println(nomi.isEmpty());
		
		//Valgono sempre gli indici applicati però al metodo get
		System.out.println(nomi.get(0)); //con il metodo get mi restituisce il valore in un determinato indice
		System.out.println(nomi.get(nomi.size() - 1));
		
		//Con il metodo set cambio il valore in un determinato indice
		System.out.println(nomi.set(0, "Mennillo"));
		System.out.println(nomi);
		
		//posso tranquillamente applicare i for
		for(int i = 0; i < nomi.size(); i++) {
			System.out.println(nomi.get(i));
		}
		
		System.out.println("APPLICO IL FOREACH");

		for (String nome : nomi) {
			System.out.println(nome);
		}
		
		nomi.forEach(nome -> System.out.println(nome));
		
		//TRASFORMO UN ARRAYLIST IN UN ARRAY
		String[] nomiPersone = new String[nomi.size()];
		for(int i = 0; i < nomi.size(); i++) {
			nomiPersone[i] = nomi.get(i);
		}
		
		//Voglio stampare il mio array in un colpo solo
		System.out.println(Arrays.toString(nomiPersone)); //Att: nomiPersone è un Array classico
		
		//ARRAYLIST di numeri. Non posso utilizzare il tipo primitivo ma dovrò utilizzare la classe wrapper da utilizzare nel genrics
		//La classe wrapper trasforma il tipo primitivo in un tipo compleso
		//int -> Integer
		//double -> Double
		//float -> Float
		//boolean -> Boolean
		
		List<Integer> numeri = new ArrayList<>();
		numeri.add(5);
		numeri.add(7);
		numeri.add(1);
		numeri.add(9);
		
		Integer miaEta = 36;
		int tuaEta = 10;

		
		//Aggiunta in simultanea di più elementi
		//Metodo Arrays.asList
		System.out.println("Aggiungo più valori contemporaneamente");
		
		List<String> frutta = new ArrayList<>();
		
		frutta.add("Mela");
		
		frutta.addAll(Arrays.asList("Pesca", "Pera", "Banana", "Fragola"));
		
		System.out.println(frutta);
		
		
		//Metodo Collections.addAll
		List<String> colori = new ArrayList<>();
		Collections.addAll(colori, "Rosso", "Verde", "Blu");
		System.out.println(colori);
		
		//Metodo List.of - crea una lista immutabile
		List<String> cittaImmutabili = List.of("Torino", "Milano", "Roma", "Napoli");
		
		//NON posso aggiungere o rimuovere elementi
//		cittaImmutabili.add("Palermo");
//		cittaImmutabili.remove(0);
		
		//Posso trasformarla in un alista modificabile
		List<String> cittaModificabili = new ArrayList<>(cittaImmutabili);
		System.out.println(cittaModificabili);
		
		//Nelle parentesi () di new ArrayList<>() posso passare le seguenti cose:
	
		//1. niente -> crea una lista vuota
		//2. numero -> creo una lista con una capacità iniziale prestabilita
		//3. collezione -> Passo una collezione preesistente
		
		List<String> regioni = new ArrayList<>(List.of("Piemonte", "Campania", "Lombardia", "Lazio", "Sicilia"));
		List<String> stati = new ArrayList<>(Arrays.asList("Italia", "Francia", "Germania", "Inghilterra"));
		
		System.out.println(regioni);
		System.out.println(stati);
		
		//aggiunta di una collezione in un altra collezione
		regioni.addAll(stati);
		System.out.println(regioni);
		
	}

}
