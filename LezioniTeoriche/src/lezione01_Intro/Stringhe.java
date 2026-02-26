package lezione01_Intro;

public class Stringhe {
	public static void main(String[] args) {
		
		//String non è un tipo primitivo. Le stringhe sono un tipo complesso. Servono a registrare testi, insiemi di caratteri.
		
		//Le stringhe sono degli oggetti 0-based. Il conteggio dei caratteri comincia con lo 0
		//					0								     
		String nomeCorso = "Tecnico sviluppo programmi informatici presso Immaginazione e lavoro";
		
		int lunghezzaString = nomeCorso.length();
		
		System.out.println("La stringa è composta da: " + lunghezzaString + " caratteri");
		System.out.println(nomeCorso.charAt(0));
		System.out.println(nomeCorso.charAt(37));
		
		int ultimoCarattere = nomeCorso.length() - 1;
		System.out.println(nomeCorso.charAt(ultimoCarattere));
		
		//  			  01234 
		String mioNome = "Dario";
		System.out.println(mioNome.length());
		System.out.println("La prima lettera è in posizione 0 : " + mioNome.charAt(0));
		System.out.println("L'ultima lettera è in posizione 4 : " + mioNome.charAt(mioNome.length() - 1));
		
		
		boolean ricerca1 = nomeCorso.contains("programmi");
		System.out.println("Il corso contiene la parola informatici: " + ricerca1);
		
		System.out.println("substring: " + nomeCorso.substring(0, 20));
		System.out.println("Replace: " + nomeCorso.replace('a', 'u'));
		System.out.println("IndexOf mi dice in che punto (indice) si trova un determinato pattern di lettere: " + nomeCorso.indexOf("programmi"));
		
		
		//Un altro modo di dichiarare una stringa usando il metodo costruttore con la parola chiave new
		String tuoNome = new String("Dario");
//		String nomeStudente = new String("Sahar");
		String nomeStudente = "Sahar";
		
		if(mioNome.equals(tuoNome)) {
			System.out.println("Abbiamo lo stesso nome");
		}else {
			System.out.println("Abbiamo due nomi diversi");
		}
		
	}
}
