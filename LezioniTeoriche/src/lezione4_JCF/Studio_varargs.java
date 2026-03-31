package lezione4_JCF;

import java.util.ArrayList;
import java.util.List;

public class Studio_varargs {
	//Permette di passare ad un metodo un numero variabile di argomenti, da 0 a n. Questo mi aiuta perché non devo costruire obbligatoriamente una lista

	private static List<String> materie = new ArrayList<>();
	
	//il ... mi dice "accetto 0 oppure N stringhe" . IL compilatore le strasforma in un String[]
	
	private static void aggiungiMaterie(String... listaMaterie) {
			for(String m: listaMaterie) {
				materie.add(m);
			}
			System.out.println("Hai aggiunto " + listaMaterie.length + " materie");
	}
	
	//1. Posso usare 1 solo varargs a metodo
	//2. Se lo utilizzo insieme ad altri parametri il varargs va sempre al fondo
	
	private static void mioMetodo(String nome, String cognome, String... materie) {} //Corretto
	//private static void mioMetodo2(String...materie, String nome, String cognome) {}; //ERRATO 
	
	
	public static void main(String[] args) {
		
		aggiungiMaterie("Matematica", "Fisica", "Chimica");

		for(String mat: materie) {
			System.out.println(mat);
		}
		
	}
}
