package recap;

public class Accessoria {
	
//	da questa classe voglio richiamare i metodi della classe denominata MetodiAusialiari
	
	public static void main(String[] args) {
		
		MetodiAusiliari.iniziaCorso();
//		MetodiAusiliari.elencaStudenti(); //NON posso chiamare direttamente elencaStudenti perché private
		
		MetodiAusiliari.stampaNomi("Pippo", "1234");
		
		
	}

}
