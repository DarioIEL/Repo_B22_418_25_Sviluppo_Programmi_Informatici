package dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import model.Dipendente;

//In futuro la classe DAO sarà un'interfaccia con una classe implemntata
public class DipendentiDAOImpl implements DipendentiDAO{

	private final List<Dipendente> archivioDipendenti = new ArrayList<>();
	
	@Override
	public void add(Dipendente d) {
		// TODO Auto-generated method stub
		archivioDipendenti.add(d);		
	}
	
	public List<Dipendente> findAll() {
		return Collections.unmodifiableList(archivioDipendenti);
	}
	
	@Override
	public Dipendente findByCodFisc(String cf) {
		return archivioDipendenti.stream()
				.filter(d -> d.getCodFisc().equalsIgnoreCase(cf))
				.findFirst()
				.orElse(null);
	}
	
	public void exportCSV(String path) {
		try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
			pw.println("Ruolo, Nome, Cognome, CodFisc, Data Assunzione, Stipendio");
			
			for(Dipendente d: archivioDipendenti) {
				pw.println(d.toString());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	
	

}
