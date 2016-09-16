package edu.curso.java.bancofeliz.objetos;

public class Banco {

	public void extraerDeCuenta(double monto, CuentaBancaria cuentaBancaria) {
		System.out.println("* Ejecutando extraer en banco *");
		System.out.println(cuentaBancaria);
		cuentaBancaria.extraer(monto);
		System.out.println(cuentaBancaria);
	}
	
	public CajaDeAhorro crearCajaDeAhorro(int numero, double saldo) {
		CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(numero, saldo);
		return cajaDeAhorro;
	}

	public CuentaCorriente crearCuentaCorriente(int numero, double saldo, double limiteExtra) {
		CuentaCorriente cuentaCorriente = new CuentaCorriente(numero, saldo, limiteExtra);
		return cuentaCorriente;
	}

}
