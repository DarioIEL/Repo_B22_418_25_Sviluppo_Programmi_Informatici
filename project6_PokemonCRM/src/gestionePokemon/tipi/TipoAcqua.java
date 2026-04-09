package gestionePokemon.tipi;

public class TipoAcqua extends Tipo {

	public TipoAcqua(String nome, int hp, int livello) {
		super(nome, hp, livello, "Acqua", 1.3);
	}

	@Override
	public void attacca() {
		System.out.println("Sto attaccando ");
	}


}
