package ejercicio5;

public class EmpleadoAComision extends Empleado {
	
	private int incentivo;

	public EmpleadoAComision(String nombre, double sueldoBase, int nEmpleado, double recaudado, int incentivo) {
		super(nombre, sueldoBase, nEmpleado, recaudado);
		this.incentivo = incentivo;
	}

	public int getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(int incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "EmpleadoAComision [incentivo=" + incentivo + "]";
	}

	public double calcularSueldo(double porc) {
		double div=100.0;
		int mes=30;
		return super.getSueldoBase()+(mes*(super.getRecaudado()*porc/div));
	}

}
