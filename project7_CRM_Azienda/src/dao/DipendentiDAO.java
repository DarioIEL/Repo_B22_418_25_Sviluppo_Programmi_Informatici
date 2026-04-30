package dao;

import model.Dipendente;

public interface DipendentiDAO {

	
	void add(Dipendente d);
	void remove();
	Dipendente findByCodFisc(String cf);
}
