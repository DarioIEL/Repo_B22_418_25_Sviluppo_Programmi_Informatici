package lezione12_Interfacce;

public class Calcolatore {

	//Passare un'iunterfaccia funzionale come parametro di un metodo si chiama Dependency Inversion. 
	//è la D si SOLID
	public int calcola(int a, int b, Operazione op) {
		return op.esegui(a, b);
	}
}
