package ejercicio7;

public class CuentaCorriente {
	
	private double saldo;
	
	private String titular;

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public CuentaCorriente(int saldo, String titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public double ingresarDinero(int ingreso) {
				
		saldo=saldo+ingreso;
		
		return saldo;
	}
	
	public double retirarDinero(int retiro) {
		saldo=saldo-retiro;
		
		return saldo;
	}
	
	public double cambiarDolar() {
		double dolar=1.0,cambio=0.0,euro=0.88;
		
		cambio=(saldo*dolar)/euro;
	
		return cambio;
	}
	
	public double consultarSaldo() {
		return saldo; 
	}
	
	public String identificarTitular() {
		return titular;
	}
	
	
	

}
