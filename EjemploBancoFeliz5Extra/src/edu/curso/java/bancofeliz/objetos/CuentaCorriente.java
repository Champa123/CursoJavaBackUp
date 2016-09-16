package edu.curso.java.bancofeliz.objetos;

public class CuentaCorriente extends CuentaBancaria  {

	public CuentaCorriente(int numero, double saldo, double limiteExtra) {
		super(numero, saldo);
		setLimiteExtra(limiteExtra);
	}

	private double limiteExtra = 1000;

	
	@Override
	public String toString() {
		return "CuentaCorriente [numero=" + getNumero() + ", saldo=" + getSaldo() + "]";
	}

	
	public double getLimiteExtra() {
		return limiteExtra;
	}

	public void setLimiteExtra(double limiteExtra) {
		this.limiteExtra = limiteExtra;
	}

	@Override
	public void extraer(double monto) {
		double saldoActual = getSaldo();
		if(saldoActual - monto + limiteExtra >= 0) {
			saldoActual = saldoActual - monto;
			setSaldo(saldoActual);
		} else {
			System.out.println("No hay dinero....");
		}
	}

}
