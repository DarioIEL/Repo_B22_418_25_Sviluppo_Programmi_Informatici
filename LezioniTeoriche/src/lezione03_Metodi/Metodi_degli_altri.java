package lezione03_Metodi;

public class Metodi_degli_altri {
	
	public static void main(String[] args) {
		//Posso richiamare metodi dichiarati in altre classi. Visto che tutti i metodi che abbiamo creato in questo package sono static vuol dire che appartengono alla classe e non all'istanza
		//Per poter richiamare un metodo static devo usare la seguente sintassi Classe.nomeMetodo

	Intro.salutaRespo("Benedetta");
	Overload_metodi.salutaRespo("Egle Risola", "TSS");
	
	}

}
