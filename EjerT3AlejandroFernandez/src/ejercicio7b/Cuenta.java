package ejercicio7b;

public class Cuenta {
	
	private double saldo;
	private String nombreTitular;
	
	public Cuenta(double sueldo, String nombreTitular) {
		super();
		this.saldo = sueldo;
		this.nombreTitular = nombreTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double sueldo) {
		this.saldo = sueldo;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	@Override
	public String toString() {
		return "Cuenta [sueldo=" + saldo + ", nombreTitular=" + nombreTitular + "]";
	}
	
	
	
	

}
