package lezione05_Classi;

public class Main {
	
	public static void main(String[] args) {
		
		//Dichiaro un Punto creando un oggetto di classe Punto. Oppure: creo un punto di tipo Punto
		
		Punto primoPunto = new Punto(1, 2);
		System.out.println("Il punto si trova nella seguenti coordinate:\n X: " + primoPunto.x + "\n Y: " + primoPunto.y);
		
		Punto secondoPunto = new Punto(3.2,4.1);
		System.out.println("Il punto si trova nella seguenti coordinate:\n X: " + secondoPunto.x + "\n Y: " + secondoPunto.y);
		
		//Utilizzo il costruttore di default.
		Punto terzoPunto = new Punto();
		//Posso valorizzare i parametri dall'esterno solo perché hanno un modificatore di accesso "default" e quindi visibili all'interno dello stesso package
		terzoPunto.x = 14;
		terzoPunto.y = 5;
		System.out.println("Il punto si trova nella seguenti coordinate:\n X: " + terzoPunto.x + "\n Y: " + terzoPunto.y);
		System.out.println(terzoPunto); //Questo Syso funziona solo se ho il toString() dichiarato nella classe, altrimenti vedo l'indirizzo alla memoria
		
		
		//Creo un segmento passante per i punti "primoPunto" e "secondoPunto"
		Segmento segm1 = new Segmento(primoPunto, secondoPunto);
		double lungSegm1 = segm1.calcolaLunghezza();
		System.out.println("Il segmento misura: " + lungSegm1 + " cm ");
		System.out.println(segm1);
		
		Segmento segm2 = new Segmento(new Punto(9,8), new Punto(3, 2));
		segm2.calcolaLunghezza();
		System.out.println(segm2);
		
	}
	

}
