package recap;

public class HelloWorld {
	public static void main(String[] args) {
	
	// istanzio la variabile
	//  tipo   nomeVar = valore
		String nomeUser = "Dario Mennillo"; 
		
	// Dichiaro la variabile
		String ruoloUser;
	
	// Assegno un valore
		ruoloUser = "Docente";
		
		String codFisc, sedeLavoro, indirizzo;
		
		codFisc = "fytcvgubhmko";
		sedeLavoro = "Immaginazione e Lavoro";
		indirizzo = "via Carlo Alberto 22";
		
		
		
		
	//leggo la variabile, uso, richiamo
		System.out.println("Hello, world !! Mi chiamo " + nomeUser);
		
		System.out.println("Sono un " + ruoloUser + "\npresso la sede di " + sedeLavoro + " in via " + indirizzo);
		
		
	}
}
