package model;

import java.time.LocalDate;

public class Consulente extends Dipendente {
	
	private final double tariffa;
	private final int oreLavorate;

	public Consulente(String nome, String cognome, String codFisc, LocalDate dataAssunzione, double tariffa, int oreLavorate) {
		super(nome, cognome, codFisc, dataAssunzione);
		this.tariffa = tariffa;
		this.oreLavorate = oreLavorate;
	}

	@Override
	public double calcolaStipendio() {
		return tariffa * oreLavorate;
	}

}
