package lezione4_JCF;

public class PassBy {

	public static void modificaValore(int x) {
		x = 20;
		System.out.println("Il numero dentro il metodo vale: " + x);
	}
	
	static class Persona{
		String nome;
	}
	
	public static void modificaNome(Persona persona) {
		persona.nome = "Dario";
		System.out.println("Dentro il metodo il nome della persona vale: " + persona.nome);
	}
	
	
	public static void modificaValoreInteger(Integer i) {
		i = 10;
		System.out.println("Dentro il metodo il valore vale: " + i);
	}
	
	
	public static void main(String[] args) {
		//PASS BY VALUE si applica ai tipi primitivi
		int numero = 50;
		modificaValore(numero);
		System.out.println("Fuori dal metodo il numero vale: " + numero);
		
		
		//PASS BY REFERENCE
		Persona nuovaPersona = new Persona();
		nuovaPersona.nome = "Anna";
		modificaNome(nuovaPersona);
		System.out.println("Fuori dal metodo il nome della persona è: " + nuovaPersona.nome);
		
		
		//Provo con i tipi wrapper
		Integer mioNumero = 50;
		modificaValoreInteger(mioNumero);
		System.out.println("Fuori dal metodo vale: " + mioNumero);
	}
	
}
