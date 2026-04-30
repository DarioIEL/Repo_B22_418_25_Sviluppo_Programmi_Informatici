package lezione12_Interfacce;

public interface Forma {

	//colore è una costatnte (implicitamente public static final). Ricorda: il modificatore static determina che quella prop o metodo appartengano solo alla classe, in questo caso all'interfaccia
	String COLORE = "blue";
	
	//Metodi implicitamente public abstract e senza implementazione
	double calcolaArea();
	double calcolaPerimetro();
	
	//Posso avere l'overload di metodi sapendo di doverli comunque sviluppare
	double calcolaPerimetro(double moltiplicatore);
	
	double calcolaVolume(double profondita);
	
	//A partire da Java 8 è stata inserita la possibilità di avere dei metodi di default (parola chiave per risolvere problemi di retrocompatibilità).
//	Il metodo di default non può: - accedere a campi d'istanza (tanto non esistono) -non può chiamare costruttori - può solo chiamare altri metodi dell'interfaccia, anche quelli astratti
	default String descrivi() {
		String descrizione = "La forma ha la seguente area: " + calcolaArea() + " e il seguente perimetro: " + calcolaPerimetro() + ". Il colore è sempre: " + COLORE;
		return descrizione;
	}
	
}
