package model;

import java.time.LocalDate;

public class ResponsabileCorso extends Dipendente {

	private final int numeroCorsi;

	public ResponsabileCorso(String nome, String cognome, String codFisc, LocalDate dataAssunzione, int numeroCorsi) {
		super(nome, cognome, codFisc, dataAssunzione);
		this.numeroCorsi = numeroCorsi;
	}

	@Override
	public double calcolaStipendio() {
		
		return 1800 + (numeroCorsi * 150.00);
	}

}
