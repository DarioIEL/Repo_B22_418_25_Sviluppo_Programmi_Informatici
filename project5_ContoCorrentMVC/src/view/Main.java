package view;

import controller.BancaCtrl;
import model.Banca;

public class Main {
	public static void main(String[] args) {
	
		Banca nuovaSede = new Banca("Immag e Lavoro - Carlo Alberto");
		BancaCtrl bancaCtrl = new BancaCtrl(nuovaSede);
		
		bancaCtrl.creaNuovoConto("Dario", "Mennillo", "MNNDRA77D45T123F", 550);
				
	}
}
