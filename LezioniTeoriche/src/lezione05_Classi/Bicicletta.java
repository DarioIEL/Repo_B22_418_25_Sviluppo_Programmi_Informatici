package lezione05_Classi;

public class Bicicletta {
		
	final byte numRuote = 2;
	int marcia = 1;
	double velocita = 0;
	int frequenza = 0;
	final String marca = "Bianchi";
	
	String modello;
	String tipologia;
	

	public Bicicletta() {}

	public Bicicletta(String modello, String tipologia) {
		this.modello = modello;
		this.tipologia = tipologia;
	}

	public void accelera(int incFreq) {
		this.frequenza = incFreq;
		System.out.println("Stai aumentando la frequenza, adesso vale: " + this.frequenza);
	}
	
	public void decelera(int decFreq) {
		this.frequenza = decFreq;
		System.out.println("Stai diminuendo la frequenza, adesso vale: " + this.frequenza);
	}
	
	
	public double calcolaVel(int marcia) {
		this.marcia = marcia;
		this.velocita = this.marcia * this.frequenza;
		return this.velocita;
	}

	@Override
	public String toString() {
		return "Bicicletta [velocita=" + velocita + ", marca=" + marca + ", modello=" + modello + ", tipologia="
				+ tipologia + "]";
	}
	
	
	
}
