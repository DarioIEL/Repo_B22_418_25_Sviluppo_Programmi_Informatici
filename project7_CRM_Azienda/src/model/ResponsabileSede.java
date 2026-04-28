package model;

import java.time.LocalDate;

public class ResponsabileSede extends Dipendente {

	private final String sede;
	
	public ResponsabileSede(String nome, String cognome, String codFisc, LocalDate dataAssunzione, String sede) {
		super(nome, cognome, codFisc, dataAssunzione);
		this.sede = sede;
	}

	
	public String getSede() {
		return sede;
	}


	@Override
	public double calcolaStipendio() {
		return 3200.00;
	}

}
