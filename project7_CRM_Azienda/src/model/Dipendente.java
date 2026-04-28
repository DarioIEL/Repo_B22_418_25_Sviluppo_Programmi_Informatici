package model;

import java.time.LocalDate;

public abstract class Dipendente {

	protected String nome;
	protected String cognome;
	protected String codFisc;
	protected LocalDate dataAssunzione;

	
	public Dipendente(String nome, String cognome, String codFisc, LocalDate dataAssunzione) {
		this.nome = nome;
		this.cognome = cognome;
		this.codFisc = codFisc;
		this.dataAssunzione = dataAssunzione;
	}


	public abstract double calcolaStipendio();


	@Override
	public String toString() {
		return getClass().getSimpleName()
				+ ", nome=" + nome + ", cognome=" + cognome + ", codFisc=" + codFisc + ", dataAssunzione="
				+ dataAssunzione + ", Stipendio: " + calcolaStipendio() ;
	}


	public String getCodFisc() {
		return codFisc;
	}
	
	
}
