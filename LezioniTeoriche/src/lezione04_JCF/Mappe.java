package lezione04_JCF;

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
		
		Map<String, String> regCitta = new HashMap<>();
		regCitta.put("Piemonte", "Torino");
		regCitta.put("Lazio", "Roma");
		regCitta.put("Lombardia", "Milano");
		regCitta.put("Campania", "Napoli");
		
		
		String capoluogo = regCitta.get("Campania");
		System.out.println(capoluogo);
		
		//byKey
		if(regCitta.containsKey("Marche")) {
			System.out.println("Il capoluogo delle Marche è " + regCitta.get("Marche"));
		}else {
			System.out.println("Non hai questa chiave nella tua mappa");
			System.out.println(regCitta.containsKey("Marche"));
		}
		
		
		//byValue
		if(regCitta.containsValue("Napoli")) {
			System.out.println("Napoli è il capoluogo della regione ");
		}else {
			System.out.println("Non esiste questa associazione");
		}
		
		System.out.println("---- EntrySet per iterare una mappa ---");
		for(Map.Entry<String, String> entry: regCitta.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		//Itero solo chiavi
		System.out.println("Leggere solo le chiavi");
		for(String key: regCitta.keySet()) {
			System.out.println(key);
		}
		
		//Itero solo i valori
		System.out.println("LEggere solo valori");
		for(String val: regCitta.values()) {
			System.out.println(val);
		}
		
		
		//Posso iterare con il foreach classico ma mi servono le arrow function
		System.out.println("Itero con foreach");
		
		//Altri metodi
		//Inserimento se assente
		regCitta.putIfAbsent("Veneto", "Venezia");

		//rimozione
		regCitta.remove("Lombardia");
		
		//dimensione
		regCitta.size();
		
		//Controllare se vuota
		regCitta.isEmpty();
		
		//Alterare un valore
		regCitta.replace("Veneto", "Padova");
		
		//clear
		regCitta.clear();
		
		regCitta.forEach((regione, cap)-> System.out.println(regione + ": " + cap));
		

	}
	

}
