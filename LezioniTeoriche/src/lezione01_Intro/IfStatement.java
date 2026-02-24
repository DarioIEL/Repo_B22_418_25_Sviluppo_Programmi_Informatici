package lezione01_Intro;

public class IfStatement {

	public static void main(String[] args) {
		
		/**
		 * SINTASSI:
		 *  if(condizione){
		 * 	    	corpo dell'if, viene eseguito quando la condiozione è true
		 *   }
		 *   else if(condizione){ [OPZIONALE]
		 *   
		 *   
		 *   }
		 *   else {  [OPZIONALE]
		 *   
		 *   		viene eseguito quando tutte le altre condizioni sono false
		 *   }
		 */
		
		boolean piove = true;
		
		if(piove) {
			System.out.println("Sta piovendo, porto l'ombrello");
		}else {
			System.out.println("Non piove, puoi lasciare l'ombrello a casa");
		}
		
		
		//Esempio
		
		int miaEta = 15;
		
		if(miaEta > 80) {
			System.out.println("Mi spiace, sei troppo grande per entrare");
		}else if(miaEta >= 18) {
			System.out.println("Benvenuto, puoi entrare");
		}else if(miaEta < 10) {
			System.out.println("Mi dispiace, non sei neppure accompagnato da un genitore");
		}else {
			System.out.println("Mi spiace, non puoi proprio entrare");
		}
		
	}
	
}
