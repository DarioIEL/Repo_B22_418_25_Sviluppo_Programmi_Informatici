package lezione06_Incapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Corso {
	
	private int id = 0;
	private String nomeCorso;
	private int durataCorso;
	private List<Studente> studenti;
	private Respo respoCorso;
	
	public Corso(String nomeCorso, int durataCorso) {
		this.nomeCorso = nomeCorso;
		this.durataCorso = durataCorso;
		this.studenti = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getDurataCorso() {
		return durataCorso;
	}

	public void setDurataCorso(int durataCorso) {
		this.durataCorso = durataCorso;
	}

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}

	public Respo getRespoCorso() {
		return respoCorso;
	}

	public void setRespoCorso(Respo respoCorso) {
		this.respoCorso = respoCorso;
	}

	@Override
	public String toString() {
		String studentiIscritti = "";
		
		if(!studenti.isEmpty()) {
			for(Studente s: studenti) {
				studentiIscritti += "\n" + s.getNome() + " " + s.getCognome() + " mat: " + s.getMatricola();
			}
		}
		
		return "Corso [id=" + id + ", nomeCorso=" + nomeCorso + ", durataCorso=" + durataCorso + ", studenti="
				+ studentiIscritti + "\nrespoCorso=" + respoCorso + "]";
	}
	
	
	
	

}
