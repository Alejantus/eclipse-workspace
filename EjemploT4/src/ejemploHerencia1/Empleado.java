package ejemploHerencia1;

//Lo primero que hay que hacer es declarar la clase madre

public class Empleado extends Trabajador {
	
	private double sueldo;
	private double impuestos;
	
	public Empleado(String nombre, String puesto, double sueldo, double impuestos) {
		super(nombre, puesto);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularPaga() {
		double division=100.0;
		return sueldo-sueldo*(impuestos/division);
	}
	

}
