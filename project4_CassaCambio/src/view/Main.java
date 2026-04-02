package view;

import java.util.List;

import controller.CassaCtrl;
import controller.RegistroCtrl;
import model.Cambio;


public class Main {
	
	
	
	public static void main(String[] args) {
		
		
		//Creo una cassa controller e aggiungo i fondi
		
		CassaCtrl cassaCtrl = new CassaCtrl("Aeroporto", 2500);
		

		
		String risultatoCambio = cassaCtrl.eseguiCambio(460);
		
		System.out.println(risultatoCambio);
		
		cassaCtrl.infoCassa();
		
		
	}
}
