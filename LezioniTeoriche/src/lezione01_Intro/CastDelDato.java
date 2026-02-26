package lezione01_Intro;

public class CastDelDato {
	public static void main(String[] args) {
		
		//Cast: mi permette di "forzare" un dato in un altro tipo
		
		int num1 = 10, num2 = 120, num3 = 270;
		
		//Cast da int a byte 
		
		byte num1B = (byte) num1;
		byte num2B = (byte) num2;
		byte num3B = (byte) num3; //Att: in questo caso sfora la dimensione del byte
		
		System.out.println(num1B);
		System.out.println(num2B);
		System.out.println(num3B);
		
		
		byte mioNumero = 3;
		
		int tuoNumero = (int) mioNumero;
		
		System.out.println("Il tuo numero vale: " + tuoNumero);
		
		
		//Operazione matematica
		int a = 25;
		int b = 3;
		
		int somma = a + b;
		int differenza = a - b;
		int prodotto = a * b;
		double quoziente = (double) a / (double) b;
		
		System.out.println(somma);
		System.out.println(differenza);
		System.out.println(prodotto);
		System.out.println(quoziente);
		
		
		
	}
}
