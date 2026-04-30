package lezione12_Interfacce;

public class Cerchio implements Forma {

	private double raggio;
	private static final String MARCA = "Geometria Canaglia";
	
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public double calcolaArea() {
		double area = Math.PI * raggio * raggio;
		return area;
	}

	@Override
	public double calcolaPerimetro() {
		double perimetro = 2 * Math.PI * raggio;
		return perimetro;
	}

	@Override
	public String descrivi() {
		// TODO Auto-generated method stub
		return "Questo è un CERCHIO di marca " + this.MARCA + " " + Forma.super.descrivi();
	}

	
	//Sono obbligato ad implementare TUTTI i metodi, anche quelli in overload
	@Override
	public double calcolaPerimetro(double moltiplicatore) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcolaVolume(double profondita) {
		// TODO Auto-generated method stub
		return 0;
	}

	//Non sono obbligato a sviluppare il metodo descrivi perché ha già una sua implementazione
	
	
}
