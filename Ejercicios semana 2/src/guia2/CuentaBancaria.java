package guia2;

public class CuentaBancaria {
	private String cuenta;
	private int saldo;
	
	
	public void setCuenta(String cuenta){
		this.cuenta= cuenta;
	}
	
	public String getCuenta(){
		return this.cuenta;
	}
	
	public void setSaldo (int saldo){
		this.saldo=saldo;
	}
	public int getSaldo(){
		return this.saldo;
	}
	
	public CuentaBancaria (String cuenta,int saldo){
		setCuenta(cuenta);
		setSaldo(saldo);
		
	}
	
	public int extraerDinero(int cantAExtraer){
		if(cantAExtraer<= this.saldo){
			int aux = saldo-cantAExtraer;
			setSaldo(aux);
			System.out.println("Extrajo "+ cantAExtraer + "su saldo es de "+ this.saldo);
			return cantAExtraer;
		}
		else{
			System.out.println("No se puede realizar la extraccion, saldo insuficiente");
			int aux = saldo-cantAExtraer;
			System.out.println("Le faltan " + aux + " para realizar la extraccion.");
			return 0;
		}
		
	}
}
