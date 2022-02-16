package ejercicioTipoExamen1;

public class Suite extends Habitacion {
	
	private double mCuadrados;
	private double dinero;
	
	public Suite(double precioBase, boolean ocupado, String nombreCliente, int diasOcupacion, int numOcupantes,
			double mCuadrados, double dinero) {
		super(precioBase, ocupado, nombreCliente, diasOcupacion, numOcupantes);
		this.mCuadrados = mCuadrados;
		this.dinero = dinero;
	}

	public double getmCuadrados() {
		return mCuadrados;
	}

	public void setmCuadrados(double mCuadrados) {
		this.mCuadrados = mCuadrados;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "Suite [mCuadrados=" + mCuadrados + ", dinero=" + dinero + "]";
	}
	/*
	public double realizarDescuento(double desc) {
		double div=100;
		return super.getPrecioBase()-super.getPrecioBase()*desc/div;
	}*/
	
	public double calcularHabitacion(double porc) {
		double div=100.0;
		return super.calcularHabitacion(porc)+dinero*(porc/div);
	}
	
	/*
	 * public void agregarHabitacion(Habitacion h,int numH){
	 * 	for(i = 0; i<lista.length;i++){
	 * 		lista[numH]=h;
	 * 	}
	 * }
	 * */

}
