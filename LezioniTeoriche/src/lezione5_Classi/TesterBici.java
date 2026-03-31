package lezione5_Classi;

public class TesterBici {

	public static void provaBici(Bicicletta bici) {
		if(bici.numRuote == 2) {
			System.out.println("Stai usando una bicicletta");
		}else {
			System.out.println("Mi spiace, non è una bicicletta");
		}
	}

	public static void main(String[] args) {
			
		Bicicletta miaBici = new Bicicletta();
		miaBici.modello = "Street B";
		miaBici.tipologia = "Stradale";
		miaBici.frequenza = 30;
		miaBici.velocita = 60;
		System.out.println(miaBici);
		provaBici(miaBici);
		
		
		Bicicletta tuaBici = new Bicicletta("City", "city bike");
		System.out.println(tuaBici);
		
	}
}
