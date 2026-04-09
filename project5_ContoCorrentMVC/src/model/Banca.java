package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banca {

	private String nomeBanca;
	private List<ContoCorrente> conti;
	//String è il codFisca del correntista
	private Map<String, Correntista> correntisti;
	
	public Banca(String nomeBanca) {
		this.nomeBanca = nomeBanca;
		this.conti = new ArrayList<>();
		this.correntisti = new HashMap<>();
	}

	public String getNomeBanca() {
		return nomeBanca;
	}
	
	public Correntista getOrCreateCorrentista(String nome, String cognome, String codFisc) {
		if(correntisti.containsKey(codFisc)) {
			return correntisti.get(codFisc);
		}else {
			Correntista nuovoCorrentista = new Correntista(nome, cognome, codFisc);
			correntisti.put(codFisc, nuovoCorrentista);
			return nuovoCorrentista;
		}
	}

	public ContoCorrente creaConto(String numeroConto, double saldoIniziale, Correntista correntista) {
		
		ContoCorrente nuovoConto = new ContoCorrente(numeroConto, saldoIniziale, correntista);
		conti.add(nuovoConto);
		correntista.aggiungiConto(nuovoConto);
		
		return nuovoConto;
	}
	
	public List<ContoCorrente> getConti(){
		List<ContoCorrente> listaConti = new ArrayList<>(this.conti);
		return listaConti;
	}
	
	public ContoCorrente findContoById(String numeroConto) {	
		for(ContoCorrente conto: conti) {
			if(conto.getNumeroConto().equals(numeroConto)) {
				return conto;
			}
		}
		return null;
	}
	
	public boolean eliminaConto(String numeroConto) {
		ContoCorrente conto = findContoById(numeroConto);
		
		if(conto != null) {
			conto.getCorrentista().rimuoviConto(conto);
			conti.remove(conto);
			return true;
		}
		
		return false;
	}
	
	public List<Correntista> getCorrentisti(){
		List<Correntista> correntisti = new ArrayList<>(this.correntisti.values());
		return correntisti;
	}
	
}
