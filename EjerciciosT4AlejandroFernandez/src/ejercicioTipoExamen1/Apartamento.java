package ejercicioTipoExamen1;

public class Apartamento extends Habitacion  {

	public Apartamento(double precioBase, boolean ocupado, String nombreCliente, int diasOcupacion, int numOcupantes) {
		super(precioBase, ocupado, nombreCliente, diasOcupacion, numOcupantes);
	}
	
	public boolean saberServicios(boolean b) {
		if (b) {
			return true;
		}else {
			return false;
		}
	}
	
	public double contratarServicios(boolean b,double precio) {
		if(b) {
			return super.getPrecioBase()+precio;
		}else {
			return super.getPrecioBase();
		}
	}
	
	public double calcularHabitacion(double precioServicios,boolean b) {
		return super.calcularHabitacion()+contratarServicios(b,precioServicios);
	}
	

}
