package lezione15_PatternDAO;

import java.util.ArrayList;
import java.util.List;

public class SpettatoreDAOImpl implements SpettatoreDAO{
	
	//Questa classe gestirà tutto al suo interno, con un arrayList di spettatori
	private List<Spettatore> listaSpettatori;
	
	

	public SpettatoreDAOImpl() {
		this.listaSpettatori = new ArrayList<>();
	}

	@Override
	public Spettatore getSpettatore(int numBiglietto) {
//		for(Spettatore s: listaSpettatori) {
//			if(s.getNumBiglietto() == numBiglietto) {
//				return s;
//			}
//		}
//		return null;
	
		return listaSpettatori.stream()
				.filter(s -> s.getNumBiglietto() == numBiglietto)
				.findFirst()
				.orElse(null);
		
	}

	@Override
	public List<Spettatore> getAllSpettatori() {
		return new ArrayList<>(listaSpettatori);
	}

	@Override
	public void addSpettatore(Spettatore spett) {
		listaSpettatori.add(spett);
		System.out.println("Hai aggiunto lo spettatore: " + spett);
	}

	@Override
	public void updateSpettatore(Spettatore spett) {
		
	}

	@Override
	public void deleteSpettatore(Spettatore spett) {
		
	}

	@Override
	public void addSpettatori(List<Spettatore> spetts) {
		listaSpettatori.addAll(spetts);		
	}
	
	

}
