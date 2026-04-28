package lezione12_Interfacce;

public class Rettangolo implements Forma{

	private double base, altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double calcolaArea() {
		double area = base * altezza;
		return area;
	}

	@Override
	public double calcolaPerimetro() {
		return 2 * (base + altezza);
	}

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
	
	
	
}
