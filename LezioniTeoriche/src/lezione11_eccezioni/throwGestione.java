package lezione11_eccezioni;

public class throwGestione {
	
	public static void calcolaDivisione(int numero, int divisore) {
		double risultato = 0.0;
		
		if(divisore == 0) {
			throw new ArithmeticException();
		}else {
			risultato = numero / divisore;
			System.out.println(risultato);			
		}
	}
	
	//Utilizzando il throws aul metodo sono poi obbligato a sviluppare i vari catch 
	public static void stampaTesto(String testo) throws ArithmeticException, MieEccezioni {
		if (testo == null) {
			throw new MieEccezioni();
		}else if (testo == "Buongiorno") {
			throw new ArithmeticException();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		try {			
			calcolaDivisione(10, 0);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Non puoi dividere per 0");
		}
		
		
		
		try {
			stampaTesto(null);
		} catch (ArithmeticException ae) {
//			ae.printStackTrace();
			System.out.println("Mi stai dicendo buongiorno");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("IL testo è null");
		} catch (MieEccezioni e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		try {
			stampaTesto("Buongiorno");
		}catch ( ArithmeticException | MieEccezioni  e) {
			e.printStackTrace();
		}
		
		
	}

	
	
}
