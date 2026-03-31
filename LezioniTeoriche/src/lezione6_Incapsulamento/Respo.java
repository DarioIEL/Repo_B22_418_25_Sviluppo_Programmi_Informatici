package lezione6_Incapsulamento;

import java.util.List;

public class Respo {
	
	private String nome;
	private String cognome;
	private int numCorsiAssegnati;
	private List<Corso> listaCorsiAssegnati;
	private Corso corso;

	public Respo(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
//	public void assegnaCorso(Corso corso) {
//		this.listaCorsiAssegnati.add(corso);
//	}
	
	public void assegnaCorsi(Corso... corsi) {
		for(Corso c: corsi) {
			this.listaCorsiAssegnati.add(c);
		}
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getNumCorsiAssegnati() {
		return numCorsiAssegnati;
	}


	public List<Corso> getListaCorsiAssegnati() {
		return listaCorsiAssegnati;
	}

	public void setListaCorsiAssegnati(List<Corso> listaCorsiAssegnati) {
		this.listaCorsiAssegnati = listaCorsiAssegnati;
		this.numCorsiAssegnati += listaCorsiAssegnati.size();
	}
	

	public Corso getCorso() {
		return corso;
	}

	public void setCorso(Corso corso) {
		this.corso = corso;
		this.numCorsiAssegnati++;
	}

	@Override
	public String toString() {
		return "Respo [nome=" + nome + ", cognome=" + cognome + ", numCorsiAssegnati=" + numCorsiAssegnati + "]";
	}
	
	
	
	
	
	

}
