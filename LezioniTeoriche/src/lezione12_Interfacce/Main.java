package lezione12_Interfacce;

public class Main {
	public static void main(String[] args) {
		
		Cerchio cerchio1 = new Cerchio(4.5);
		System.out.println(cerchio1.descrivi());
		System.out.println("L'area del cerchio vale: " + cerchio1.calcolaArea());
		
		Rettangolo rett1 = new Rettangolo(5, 4);
		System.out.println(rett1.descrivi());
		
		//Applico il polimorfismo attraverso le interface
		Forma[] forme = {
				new Rettangolo(7, 8),
				new Cerchio(5),
				new Cerchio(9),
				new Rettangolo(3, 2)
		};
		

		
		for (Forma f : forme) {
			System.out.println(f.descrivi());
		}
		
		
		
		//Uso l'interfaccia funzionale con le lambda function
		Operazione somma = (a,b) -> a + b;
		Operazione prodotto = (a,b) -> a*b;
		
		System.out.println(somma.esegui(5, 4));
		System.out.println(prodotto.esegui(5, 4));
		
		Calcolatore calc = new Calcolatore();
		System.out.println(calc.calcola(6, 7, somma));
		System.out.println(calc.calcola(6, 7, prodotto));
		System.out.println(calc.calcola(10, 2, (a,b) -> a/b));
		
	}
}
