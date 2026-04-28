package lezione13_esempiInterfacce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//COMPARETO SOLO CON IL VOTO
//		List<Studente> listaStudenti = new ArrayList<>();
//		listaStudenti.add(new Studente("Maria", 27));
//		listaStudenti.add(new Studente("Marco", 18));
//		listaStudenti.add(new Studente("Laura", 30));
//		
//		Collections.sort(listaStudenti); //Il mio sort() utilizzerà il metodo compareTo per ordinare gli studenti. Questo però succede solo se la classe Studente implementa correttamente il Comparable. Questo funziona con Collections e Arrays in automatico
//		
//		for (Studente stud : listaStudenti) {
//			System.out.println(stud);
//		}
		
//		COMPARETO CON PIÙ CAMPI - ORDINAMENTO
//		List<Studente> listaStudenti = new ArrayList<>();
//		listaStudenti.add(new Studente("Nicola", "Rossi", 30));
//		listaStudenti.add(new Studente("Mario", "Rossi", 25));
//		listaStudenti.add(new Studente("Maria", "Rossi", 25));
//		
//		Collections.sort(listaStudenti);
//		
//		listaStudenti.forEach(System.out::println);
		
//		CompareTo su tutti i campi allo stesso momento
		
		Studente s1 = new Studente("Anna", "Rossi", 30);
		Studente s2 = new Studente("Anna", "Verdi", 27);
		
		int res = s1.compareTo(s2);
		
		if(res == 0) {
			System.out.println("Attenzione: hai due studenti identici");
		}else if (res < 0 ) {
			System.out.println(s1 + " precede " + s2);
		}else {
			System.out.println(s1 + " segue " + s2);
		}
		
	}
}
