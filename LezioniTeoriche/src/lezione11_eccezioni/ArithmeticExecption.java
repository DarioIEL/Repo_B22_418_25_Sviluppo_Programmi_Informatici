package lezione11_eccezioni;

public class ArithmeticExecption {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		double r = 0.0;
		
		try {
			r = x/y;
			System.out.println(r);			
		}catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Mi spiace, non puoi dividere per 0");
		}finally {
			System.out.println("Questo blocco verrà sempre eseguito");
		}
		
		System.out.println("Provo di nuovo ma stavolta con una Exception generica");
		try {
			r = x/y; 
		} catch (Exception e) {
			System.out.println(e);
		} 
		
		
		///////////////////
		int[] mioArray = new int[4];
		mioArray[0] = 10;
		mioArray[1] = 7;
		mioArray[2] = 4;
		mioArray[3] = 3;

	
		//Posso racogliere con il catch più eccezioni contemporaneamente
		
		try {
			System.out.println(mioArray[3]);
			System.out.println(10/0);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Stai richiedendo un elemento non valido");
		} catch (ArithmeticException e) {
			System.out.println("Non puoi fare quell'operazione");
		}
	
	
	}

}
