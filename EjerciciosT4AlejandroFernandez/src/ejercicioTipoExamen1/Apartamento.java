package ejercicioTipoExamen1;

public class Apartamento extends Habitacion  {

	private boolean contratar;
	private double precioServicio;
	private int mCuadrado;

	public Apartamento(double precioBase, boolean ocupado, String nombreCliente, int diasOcupacion, int numOcupantes,
			boolean contratar, double precioServicio, int mCuadrado) {
		super(precioBase, ocupado, nombreCliente, diasOcupacion, numOcupantes);
		this.contratar = contratar;
		this.precioServicio = precioServicio;
		this.mCuadrado = mCuadrado;
	}

	public boolean isContratar() {
		return contratar;
	}

	public void setContratar(boolean contratar) {
		this.contratar = contratar;
	}

	public double getPrecioServicio() {
		return precioServicio;
	}

	public void setPrecioServicio(double precioServicio) {
		this.precioServicio = precioServicio;
	}

	public int getmCuadrado() {
		return mCuadrado;
	}

	public void setmCuadrado(int mCuadrado) {
		this.mCuadrado = mCuadrado;
	}
	
	@Override
	public String toString() {
		return "Apartamento [contratar=" + contratar + ", precioServicio=" + precioServicio + ", mCuadrado=" + mCuadrado
				+ "]";
	}

	public double contratarServicios() {
		if(contratar) {
			return super.getPrecioBase()+precioServicio;
		}else {
			return super.getPrecioBase();
		}
	}
	
	public double calcularHabitacion(double porc) {
		return super.calcularHabitacion(porc)+contratarServicios();
	}
	

}
