package lezione15_PatternDAO;

import java.util.List;

public interface SpettatoreDAO {

	//Essendo un DAO contiene tutti i metodi per il CRUD (Create, Read, Update, DElete)
	
	Spettatore getSpettatore(int numBiglietto);
	List<Spettatore> getAllSpettatori();
	void addSpettatore(Spettatore spett);
	void updateSpettatore(Spettatore spett);
	void deleteSpettatore(Spettatore spett);
	void addSpettatori(List<Spettatore> spetts);
	
}
