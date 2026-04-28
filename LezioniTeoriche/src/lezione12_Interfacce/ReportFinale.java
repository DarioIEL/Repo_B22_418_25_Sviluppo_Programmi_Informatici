package lezione12_Interfacce;

//Posso implementare più interfacce. EREDITARIETÀ MULTIPLA
public class ReportFinale implements Esportabile, Stampabile{

	@Override
	public void stampa() {
		System.out.println("Sto stampando il report finale");
	}

	@Override
	public void esporta() {
		// TODO Auto-generated method stub
		System.out.println("Sto esportando in formato .csv");
	}

}
