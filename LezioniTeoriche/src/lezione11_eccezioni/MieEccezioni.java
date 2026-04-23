package lezione11_eccezioni;

public class MieEccezioni extends Throwable{
	
	@Override
	public String getMessage() {
		return "Attenzione, mi stai dando un testo inesistente";
	}
}
