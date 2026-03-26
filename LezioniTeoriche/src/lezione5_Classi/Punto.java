package lezione5_Classi;

//La classe definisce sempre un tipo di dato COMPLESSO
public class Punto {
	
	//STATO della CLASSE (insieme delle proprietà della classe)
	double x;
	double y;
	
	//Dichiaro il metodo costruttore, nello specifico dichiaro il costruttore di DEFAULT (quello a firma vuota)
	//Se ho necessità di utilizzare il costruttore di default di una classe lo devo necessariamente dichiarare se sono in presenza di un costruttore a firma piena, altrimenti non ho questa necessità. Se non ho un costruttore a firma piena posso anche non dichiarare il costruttore di default

	public Punto() {}
	

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	//I metodi costruttori sono in overload
	
	//OSS: nella classe Main creerò le istanze della classe Punto
	//Alt + SHIFT + s -> Generate toString()
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	

}
