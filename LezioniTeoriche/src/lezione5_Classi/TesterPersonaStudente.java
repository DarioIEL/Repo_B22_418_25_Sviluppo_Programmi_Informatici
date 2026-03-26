package lezione5_Classi;

public class TesterPersonaStudente {
	public static void main(String[] args) {
	
		Persona persona = new Persona("Dario", "Mennillo", 36, "ASDFGHJKL98765DFGHJK");
		
		System.out.println(persona);
		
		System.out.println(persona.presentati());
		System.out.println(persona.presentati("Laura"));
		
		
		/**
		 * Classe Studente:
		 * nome
		 * cognome
		 * email
		 * int matricola
		 * ArrayList<String> materie
		 * -------
		 * Studente(nome, cognome, email) {
		 * 	...quando lo creo calcolo la matricola con il metodo matricolatore
		 * }
		 * matricolatore() --- metodo casuale da 0 a 100
		 * saluta()
		 * studia() --- Questo metodo stampa le materie che sta studiando lo studente
		 * aggiungiMateria(String materia) --- Questo metodo aggiunge una materia
		 */
	}
}
