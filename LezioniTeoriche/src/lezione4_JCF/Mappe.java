package lezione4_JCF;

import java.util.HashMap;
import java.util.Map;

public class Mappe {
	
	//Le mappe trattengono i dati secondo il principio "Key - Value", "Chiave - Valore"
	//L'implementazione più diffusa è HashMap
	
	public static void main(String[] args) {
		
		Map<String, Integer> nomeEta = new HashMap<>();
		
		nomeEta.put("Dario", 36);
		nomeEta.put("Anna", 35);
		nomeEta.put("Luca", 40);
		
		//cercare elementi by key
		
		System.out.println(nomeEta.get("Dario")); //36
		
		if(nomeEta.containsKey("Anna")) {
			System.out.println("La chiave Anna ha " + nomeEta.get("Anna") + " anni") ;
		}
		
		
		//Posso iterare una mappa
		System.out.println("--- entryset ---");
		for(Map.Entry<String, Integer> entry: nomeEta.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
	}
	

}
