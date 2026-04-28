package controller;

import dao.DipendentiDAO;
import model.Dipendente;

public class DipendenteCtrl {

	private final DipendentiDAO dao;

	public DipendenteCtrl(DipendentiDAO dao) {
		this.dao = dao;
	}
	
	public void aggiungiDipendente(Dipendente d) {
		dao.save(d);
	}
	
//	getTutti
//	cercaPerCodiceFiscale
//	esportaCSV
	
}
