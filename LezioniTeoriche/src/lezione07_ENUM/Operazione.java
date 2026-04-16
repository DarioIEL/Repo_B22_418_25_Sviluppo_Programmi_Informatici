package lezione07_ENUM;

public enum Operazione {

	SOMMA{
		public double calcola(double x, double y) {
			return x+y;
		}
		
	},
	
	PRODOTTO{
		@Override
		public double calcola(double x, double y) {
			return x*y;
		}
	};
	
	
	public abstract double calcola(double x, double y);
}
