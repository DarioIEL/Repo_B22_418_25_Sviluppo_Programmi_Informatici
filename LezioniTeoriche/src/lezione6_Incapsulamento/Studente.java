package lezione6_Incapsulamento;

public class Studente {

	private String nome;
	private String cognome;
	private int eta;
	private int matricola;
	private boolean presenza;
	
	public Studente() {}

	public Studente(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String username, String password, String nome) {
		if(username.equals("Pippo") && password.equals("12345")) {
			this.nome = nome;
		}else {
			System.out.println("Mi spiace, non hai i permessi per modificare il nome");
		}
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public boolean isPresenza() {
		return presenza;
	}

	public void setPresenza(boolean presenza) {
		this.presenza = presenza;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", matricola=" + matricola
				+ ", presenza=" + presenza + "]";
	}
	
	
	
	
	
}
