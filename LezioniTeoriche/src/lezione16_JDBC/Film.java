package lezione16_JDBC;

public class Film {
	private int id;
	private String titolo;
	private String autore;
	private int anno;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	@Override
	public String toString() {
		return "Film [id=" + id + ", titolo=" + titolo + ", autore=" + autore + ", anno=" + anno + "]";
	}
	
	
}
