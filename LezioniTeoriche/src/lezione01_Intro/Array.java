package lezione01_Intro;

public class Array {
	public static void main(String[] args) {
		//Gli array sono contenitori di informazioni simili tra loro (uguali nel tipo)
		//Anche gli array sono 0-based
		//Si dichiarano e vengono identificati attraverso le []
		//Stiamo parlando di oggetti -> salvati nella memoria heap
		
		//Definisco un array con dimensione predefinita a runtime e fissa
		
		//							 dimensione
		String[] colori = new String[4];
		
		//assegno un valore ad ogni posizione
		colori[0] = "Blue";
		colori[1] = "Rosso";
		colori[2] = "Verde";
		colori[3] = "Viola";
//		colori[4] = "Giallo"; NON POSSO Aggiungere in una posizione non esistente 
		
		System.out.println("Il mio array contiene " + colori.length + " elementi");
		System.out.println("Il primo elemento è il colore " + colori[0]);
		System.out.println("L'ultimo elemento è il colore: " + colori[colori.length - 1]);
		
		//Altro modo per dichiarare un array
		String[] frutti = {"mela", "pesca", "banana", "fragola"};
		
		System.out.println("I frutti sono: " + frutti); //stampo il puntatore alla memoria
		
		System.out.println("Frutti: " + frutti[0] + " " + frutti[1] + " " + frutti[2] + " " + frutti[3]);
		
		//Come stampare un array attraverso un ciclo for (foreach)
		for (String frutto: frutti) {
			System.out.println(frutto);
		}
			
		for(int i = 0 ; i < frutti.length; i++) {
			System.out.println(frutti[i]);
		}
		
		
		//Array Multi-dimensionali
		int[][] tempHum = new int[3][3];
		
		tempHum[0][0] = 14; 	
		tempHum[0][1] = 16;
		tempHum[0][2] = 18;
		
		tempHum[1][0] = 20;
		tempHum[1][1] = 22;
		tempHum[1][2] = 24;
		
		tempHum[2][0] = 33;
		tempHum[2][1] = 35;
		tempHum[2][2] = 37;
		
		for(int i = 0; i < tempHum.length; i++) {
			for(int j = 0; j < tempHum[i].length; j++) {
				System.out.print(tempHum[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		//
		
		
	}

}
