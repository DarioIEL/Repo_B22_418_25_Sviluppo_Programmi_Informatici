package lezione05_Classi;

public class Segmento {
	
	// Sto dichiarando le proprietà della classe
	Punto a;
	Punto b;
	double lunghezza;
	
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	
	public double calcolaLunghezza() {
		
		this.lunghezza = Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
	
		return this.lunghezza;
	}

	@Override
	public String toString() {
		//Quando richiamo a e b vengono chiamati i rispettivi toString() della classe Punto
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza=" + lunghezza + "]";
	}
	
	
	
	

}
