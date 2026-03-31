package controller;

import model.Cambio;
import model.Cassa;

public class CassaCtrl {

	private Cassa cassa;

	public CassaCtrl(String nome, double fondoDollari) {
		this.cassa = new Cassa(nome, fondoDollari);
	}
	
	public boolean aggiungiDollari(double importo) {
		return cassa.aggiungiDollari(importo);
	}
	
	public String eseguiCambio(double importoEuro) {
		if(importoEuro <= 0) {
			return "Errore: l'importo deve essere positivo";
		}
		
		if(!cassa.verificaDisponibilita(importoEuro)) {
			return "Mi spiace, fondi insufficienti per eseguire il cambio";
		}
		
		Cambio cambio = cassa.eseguiCambio(importoEuro);
		
		if(cambio != null) {
			stampaScontrino(cambio);
			return "Cambio eseguito correttamente. Importo Dollari: " + cambio.getImportoDollari() +"\nEuro versati: " + cambio.getImportoEuro();
		}
		
		
		return "Non è stato possibile effettuare il cambio";
	}

	public void infoCassa() {
		System.out.println(cassa.toString());
	}

	private static String stampaScontrino(Cambio cambio) {
		return "";
	}
	
}
