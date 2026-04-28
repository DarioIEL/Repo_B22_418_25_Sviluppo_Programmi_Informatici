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
		
//		COMPARETO CON PIÙ CAMPI
		List<Studente> listaStudenti = new ArrayList<>();
		listaStudenti.add(new Studente("Nicola", "Rossi", 30));
		listaStudenti.add(new Studente("Mario", "Rossi", 25));
		listaStudenti.add(new Studente("Maria", "Rossi", 25));
		
		Collections.sort(listaStudenti);
		
		listaStudenti.forEach(System.out::println);
		
	}
}
