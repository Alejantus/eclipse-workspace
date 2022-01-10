package ejercicio7;

public class CuentaCorriente {
	
	//No se puede dar ningun valor e instanciar un objeto
	
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
	
	public void mostrarBienvenida() {
		System.out.println("Bienvenido al banco Santander");
	}
	
	public void mostrarAcciones() {
		System.out.println("¿Qué acción quieres realizar?");
		System.out.println("1. Ingresar dinero");
		System.out.println("2. Retirar dinero");
		System.out.println("3. Calcular euros a dólares");
		System.out.println("4. Consultar saldo");
		System.out.println("5. Identificarse");
		System.out.println("0. Salir");
	}
	
	public void identificarNombreTitular() {
		System.out.println("Identificase, escriba su nombre");
	}
	
	public void mostrarNombreTitular() {
		System.out.println("Usted es: ");
		System.out.printf(getTitular());
	}
	
	
	

}
