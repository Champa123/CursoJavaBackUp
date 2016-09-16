package edu.curso.java.bancofeliz.objetos;

public abstract class CuentaBancaria {

	private int numero;
	private double saldo;

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public CuentaBancaria(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public abstract void extraer(double monto);
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
}
