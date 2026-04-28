package controller;

import dao.DipendentiDAO;

public class DipendenteCtrl {

	private final DipendentiDAO dao;

	public DipendenteCtrl(DipendentiDAO dao) {
		this.dao = dao;
	}
	
	public void aggiungiDipendente(Dipendente d) {
		dao.save(d);
	}
}
