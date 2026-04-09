package model;

public class ContoCorrente {

	private String numeroConto;
	private double saldo;
	private Correntista correntista;

	public ContoCorrente(String numeroConto, double saldo, Correntista correntista) {
		this.numeroConto = numeroConto;
		this.saldo = saldo;
		this.correntista = correntista;
	}

	public String getNumeroConto() {
		return numeroConto;
	}

	public double getSaldo() {
		return saldo;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void deposita(double importo) {
		if (importo > 0) {
			this.saldo += importo;
		}
	}
	
	public void preleva(double importo) {
		if(importo > 0 && saldo >= importo) {
			this.saldo -= importo;
		}
	}

	@Override
	public String toString() {
		return "ContoCorrente [numeroConto=" + numeroConto + ", saldo=" + saldo + ", correntista=" + correntista + "]";
	}
	
	

}
