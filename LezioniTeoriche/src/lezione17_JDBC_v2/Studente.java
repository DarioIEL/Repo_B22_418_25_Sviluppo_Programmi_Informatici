package lezione17_JDBC_v2;

//POJO (Plain Old Java Object) --- in Spring chiameremo Bean
public class Studente {
	
	private int id;
	private String nome;
	private String cognome;
	private String corso;
	private String email;
	
	public Studente(String nome, String cognome, String corso, String email) {
		this.nome = nome;
		this.cognome = cognome;
		this.corso = corso;
		this.email = email;
	}

	public Studente(int id, String nome, String cognome, String corso, String email) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.corso = corso;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", corso=" + corso + ", email="
				+ email + "]";
	}

	
	
	
	

}
