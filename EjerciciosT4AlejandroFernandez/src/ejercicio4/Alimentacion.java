package ejercicio4;

public class Alimentacion extends Producto{

	private int alergias;

	public Alimentacion(double precioUnitario, String nombre, int codigo, int alergias) {
		super(precioUnitario, nombre, codigo);
		this.alergias = alergias;
	}

	public int getAlergias() {
		return alergias;
	}

	public void setAlergias(int alergias) {
		this.alergias = alergias;
	}

	@Override
	public String toString() {
		return "Alimentaci�n [alergias=" + alergias + "]";
	}
	
	public double calcularPrecio() {
		double div=100,porc=20;
		return super.getPrecioUnitario()-super.getPrecioUnitario()*(porc/div);
	}
	
	public void avisarCaducidad(int caducidad) {
		if(caducidad <= 2) {
			System.out.printf("El producto: %s caducará en %d dias.\n", super.getNombre(), caducidad);
		}else if(caducidad <= 0){
			System.out.printf("El producto: %s ha caducado.\n", super.getNombre());
		}else {
			System.out.printf("El producto: %s no ha caducado, lo hará en %d días.\n", super.getNombre(), caducidad);
		}
		
	}
}
