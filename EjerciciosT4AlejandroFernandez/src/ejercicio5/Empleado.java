package ejercicio5;

public abstract class Empleado {
	
	private String nombre;
	private double sueldoBase;
	private int nEmpleado;
	private double recaudado;
	public Empleado(String nombre, double sueldoBase, int nEmpleado, double recaudado) {
		super();
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.nEmpleado = nEmpleado;
		this.recaudado = recaudado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getnEmpleado() {
		return nEmpleado;
	}
	public void setnEmpleado(int nEmpleado) {
		this.nEmpleado = nEmpleado;
	}
	public double getRecaudado() {
		return recaudado;
	}
	public void setRecaudado(double recaudado) {
		this.recaudado = recaudado;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", nEmpleado=" + nEmpleado + ", recaudado="
				+ recaudado + "]";
	}
	
	public abstract double calcularSueldo(double porc);

}
