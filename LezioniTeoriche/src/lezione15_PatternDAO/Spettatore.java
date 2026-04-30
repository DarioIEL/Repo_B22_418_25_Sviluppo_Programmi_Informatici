package lezione15_PatternDAO;

public class Spettatore {
	private String nome;
	private int numBiglietto;
	
	public Spettatore(String nome, int numBiglietto) {
		this.nome = nome;
		this.numBiglietto = numBiglietto;
	}

	public String getNome() {
		return nome;
	}

	public int getNumBiglietto() {
		return numBiglietto;
	}

	@Override
	public String toString() {
		return "Spettatore [nome=" + nome + ", numBiglietto=" + numBiglietto + "]";
	}

	
	
}
