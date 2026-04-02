package lezione7_ENUM;

public enum Colore {

	RED("rosso"),
	BLUE("blu"),
	GREEN("verde"),
	WHITE("bianco"),
	ORANGE("arancione"),
	BLACK("nero"),
	YELLOW("giallo");
	
	private String nomeITA;
	
	private Colore(String nomeITA) {
		this.nomeITA = nomeITA;
	}
	
	public String getNomeITA() {
		return nomeITA;
	}
}
