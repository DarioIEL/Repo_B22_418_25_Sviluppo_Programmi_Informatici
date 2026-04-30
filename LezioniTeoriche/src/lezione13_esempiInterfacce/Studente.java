package lezione13_esempiInterfacce;

public class Studente implements Comparable<Studente>{

	private String nome;
	private String cognome;
	private int voto;
	
	public Studente(String nome, String cognome, int voto) {
		this.nome = nome;
		this.cognome = cognome;
		this.voto = voto;
	}

	
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", voto=" + voto + "]";
	}


	//il metodo compareTo restituisce un valore:
	// < 0 (this viene prima di altroStudente)
	// = 0 (this è uguale ad altro)
	// > 0 (this viene dopo altro)

	//	@Override
//	public int compareTo(Studente altroStudente) {
//		//Voglio fare un ordinamento per voto crescente
//		return Integer.compare(this.voto, altroStudente.voto);
//	}


//	oRDINAMENTO con più campi
//	@Override
//	public int compareTo(Studente altroStudente) {
//		int cmp = this.cognome.compareTo(altroStudente.cognome);
//		if(cmp != 0) return cmp;
//		
//		cmp = this.nome.compareTo(altroStudente.nome);
//		if(cmp != 0) return cmp;
//		
//		return Integer.compare(this.voto, altroStudente.voto);
//	}
	
//	Uguaglianza Totale
	@Override
	public int compareTo(Studente altroStudente) {
		int cmp = Double.compare(this.voto, altroStudente.voto);
		if(cmp != 0) return cmp;
		
		cmp = this.nome.compareTo(altroStudente.nome);
		if(cmp != 0 ) return cmp;
		
		cmp = this.cognome.compareTo(altroStudente.cognome);
		if(cmp != 0) return cmp;
		
		return cmp;
	}
	
	
	
}
