package lezione02_Statement;

public class Esempio_For {
	public static void main(String[] args) {
		
		String[] nomiStudenti = {
				"Alice",
				"Giovanni",
				"Sahar",
				"Natascha",
				"Alessandro",
				"Federico"
		};
		
		for(int i = 0; i < nomiStudenti.length; i++) {
			System.out.println(nomiStudenti[i]);
		}
				
		//Leggo in senso contrario
		System.out.println("=== Nomi al contrario ===");
		for(int i = nomiStudenti.length -1; i >= 0; i--) {
			System.out.println(nomiStudenti[i]);
		}
		
		//L'Array può anche essere letto con il foreach che è un particolare tipo di for
		System.out.println("=== FOREACH ===");
		for(String nome: nomiStudenti) {
			System.out.println(nome);
		}
		
		
	}
}
