package lezione01_Intro;

public class OperatoriLogici {
	public static void main(String[] args) {
		
		//Operatori logici: per espandere condizioni, mi permettono di valutare più cose
		
		/**
		 * && AND logico
		 * || OR logico
		 * ! NOT logico
		 */

		/** TABELLA DELLE VERITA'
		 * 	c1  |  c2  |  c1 && c2 | c1 || c2
		 * 	 T 	|	T  |	 T	   |    T
		 *   F  |   T  |   	 F     |    T
		 *   T  |   F  |     F     |    T
		 *   F  |   F  |     F     |    F
		 */
		
		int miaEta = 2;
		
		//Posso guidare la moto se ho un'età compresa tra 24 e 80 anni
		
		if( miaEta >= 24 && miaEta <= 80) { // 24 <= miaEta <= 80
			System.out.println("Puoi guidare la moto");
		}else if( miaEta < 24 && miaEta >= 18) {
			System.out.println("Sei ancora troppo piccolo per guidare la moto");
		}else if( miaEta > 80) {
			System.out.println("Mi spiace, la legge non ti permette di guidare a quest'età");
		}else {
			System.out.println("Forse non hai neppure la patente");
		}
		
		
		//Esempio festa: posso partecipare solo se sono maggiore e ho un invito
		
		int etaUser = 30;
		boolean invito = false;
		
		if( etaUser >= 18 && invito) {
			System.out.println("Benvenuto, puoi entrare");
		}else if( etaUser >= 18 && !invito) {
			System.out.println("Mi spiace, non hai l'invito anche se hai più di 18 anni");
		}else if( etaUser < 18 && invito) {
			System.out.println("Mi spiace, non hai l'età adatta anche se hai l'invito");
		}else {
			System.out.println("Mi spiace, non hai l'età giusta nè l'invito");
		}
		
		
		//Devo fare un esame composto da parte scritta e parte orale. L'esame viene superato anche solo con uno dei due voti > 18. Il voto segnato a libretto sarà quello maggiore
		
		int votoScritto = 15;
		int votoOrale = 30;
		
		if( votoScritto >= 18 || votoOrale >= 18) {
			System.out.println("Complimenti, hai superato l'esame. Ti verrà assegnato il voto maggiore tra i due. ");
			if(votoScritto > votoOrale) {
				System.out.println("Il tuo voto finale é " + votoScritto);
			}else {
				System.out.println("Il tuo voto finale è " + votoOrale);
			}
			
		}else {
			System.out.println("Mi spiace, non hai superato l'esame");
		}
		
		
		
	}
}
