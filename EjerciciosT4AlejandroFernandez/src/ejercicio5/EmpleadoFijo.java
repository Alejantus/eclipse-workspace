package ejercicio5;

public class EmpleadoFijo extends Empleado {

	public EmpleadoFijo(String nombre, double sueldoBase, int nEmpleado, double recaudado) {
		super(nombre, sueldoBase, nEmpleado, recaudado);
	}

	@Override
	public double calcularSueldo(double porc) {
		double div=100.0;
		return super.getSueldoBase()-(super.getSueldoBase()*porc/div);
	}
	
	

}
