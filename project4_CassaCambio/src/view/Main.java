package view;

import controller.CassaCtrl;

public class Main {
	public static void main(String[] args) {
		
		
		//Creo una cassa cntroller e aggiungo i fondi
		
		CassaCtrl cassaCtrl = new CassaCtrl("Aeroporto", 2500);
		
		String risultatoCambio = cassaCtrl.eseguiCambio(460);
		
		System.out.println(risultatoCambio);
		
		cassaCtrl.infoCassa();
		
		
	}
}
