package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Studente {
	
	protected String nome;
	protected String cognome;
	protected String email;
	protected LocalDate dataRegistrazione;
	protected List<Corso> corsi = new ArrayList<>();
	
	public Studente(String nome, String cognome, String email, LocalDate dataRegistrazione) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataRegistrazione = dataRegistrazione;
	}

	public abstract void assegnaCorsi(List<Corso> corsi);

	@Override
	public String toString() {
		return getClass().getSimpleName()
				+ nome + ", cognome=" + cognome + ", email=" + email + ", dataRegistrazione="
				+ dataRegistrazione + ", corsi=" + corsi ;
	}
	
	
	
}
