package lezione01_Intro;

public class Operatori {
	public static void main(String[] args) {
		
		//Operatori di assegnazione = 
		//Operatori matematici + - * /
		
		//Operatore modulo o resto della divisione
		int resto = 12 % 7;
		System.out.println(resto);
		
		int resto2 = 22 % 11;
		System.out.println(resto2);
		
		//Operatori di confronto o relazionale --> producono sempre un valore boolean
		//> (maggiore) < (minore) >= (maggiore uguale) <= (minore uguale)
		// == (uguale a)
		// != (diverso da) --> ! (NOT logico)
		
		int num1 = 10;
		int num2 = 12;
		
		boolean c1 = num1 > num2; //false
		System.out.println(c1);
		
		boolean c2 = num1 < num2; //true
		System.out.println(c2);
		
		boolean c3 = num1 == num2; //false
		System.out.println(c3);
		
		boolean c4 = num1 != num2; //true
		System.out.println(c4);
		
		
		//operatori di incremento (++) e decremento (--)
		int a = 3;
		
		a++;
		System.out.println("Il numero a vale: " + a);
		
		a--;
		System.out.println("Adesso il numero a vale: " + a);
		
		//operatori di assegnazione
		int b = 5;
		
		//b = b + 2;
		b += 2;
		
		System.out.println("IL numero b vale: " + b);

		b -= 4;
		System.out.println("Adesso il numero b vale: " + b);
		
		b *= 5;
		System.out.println("Adesso il numero b vale: " + b);

		b /= 3;
		System.out.println("Adesso il numero b vale: " + b);

		
	}
}
