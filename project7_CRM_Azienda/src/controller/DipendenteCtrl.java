package controller;

import dao.DipendentiDAOImpl;
import model.Dipendente;

public class DipendenteCtrl {

	//Il controller usa il dao
	private final DipendentiDAOImpl dao;

	public DipendenteCtrl(DipendentiDAOImpl dao) {
		this.dao = dao;
	}
	
	public void aggiungiDipendente(Dipendente d) {
		dao.add(d);
	}
	
//	getTutti
//	cercaPerCodiceFiscale
//	esportaCSV
	
}
