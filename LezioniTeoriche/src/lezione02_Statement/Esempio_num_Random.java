package lezione02_Statement;

import java.util.Random;

public class Esempio_num_Random {
	public static void main(String[] args) {
		
		double numRand = Math.random(); //num casuale tra 0.0 e 1.0(non compreso)
		System.out.println(numRand); 
	
		int num190 = (int) Math.ceil(Math.random() * 90);
		System.out.println(num190);
		
		//Posso utilizzare l'oggetto Random()
		
		Random rand = new Random();
		int numeroCasuale = rand.nextInt(15,25);
		System.out.println(numeroCasuale);
		
		int numCasRange = (int) Math.ceil((Math.random()*10) + 15);
		System.out.println(numCasRange);
		
	}
}
