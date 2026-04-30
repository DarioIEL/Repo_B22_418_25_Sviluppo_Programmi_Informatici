package lezione15_PatternDAO;

import java.util.List;

public class SpettatoreDAOImplMySql implements SpettatoreDAO{

	@Override
	public Spettatore getSpettatore(int numBiglietto) {
		String sql = "Select * from Spettatori where biglietto =" + numBiglietto;
		//.....
		return null;
	}

	@Override
	public List<Spettatore> getAllSpettatori() {
		String sql = "SELECT * from spettatori";
		return null;
	}

	@Override
	public void addSpettatore(Spettatore spett) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSpettatore(Spettatore spett) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSpettatore(Spettatore spett) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSpettatori(List<Spettatore> spetts) {
		// TODO Auto-generated method stub
		
	}

}
