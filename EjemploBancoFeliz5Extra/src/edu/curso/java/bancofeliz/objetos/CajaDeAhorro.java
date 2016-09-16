package edu.curso.java.bancofeliz.objetos;

public class CajaDeAhorro extends CuentaBancaria {

	public CajaDeAhorro(int numero, double saldo) {
		super(numero, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CajaDeAhorro [numero=" + getNumero() + ", saldo=" + getSaldo() + "]";
	}

	@Override
	public void extraer(double monto) {
		double saldoActual = getSaldo();
		if(saldoActual - monto >= 0) {
			saldoActual = saldoActual - monto;
			setSaldo(saldoActual);
		} else {
			System.out.println("No hay dinero....");
		}
	}

	
	
}
