package ejercicio2;

public class EspadaLaser extends Producto{
	
	private String tipoEspada;

	public EspadaLaser(double precioBase, int cantUni, String nombre, boolean vendido, String tipoEspada) {
		super(precioBase, cantUni, nombre, vendido);
		this.tipoEspada = tipoEspada;
	}

	public String getTipoEspada() {
		return tipoEspada;
	}

	public void setTipoEspada(String tipoEspada) {
		this.tipoEspada = tipoEspada;
	}

	@Override
	public String toString() {
		return super.toString()+"EspadaLaser [tipoEspada=" + tipoEspada + "]";
	}
	
	@Override
	public double calcularPvp(double porc) {
		double div=100.0, cantidadFija=100.0;
		if (tipoEspada.equalsIgnoreCase("doble")) {
			return getPrecioBase()+(getPrecioBase()*porc/div)+cantidadFija;
		}else {
			return getPrecioBase()+getPrecioBase()*porc/div;
		}	
	}
	
	public void mostrarAviso() {
		System.out.println("¡Cuidadín, que hace pupa!");
	}
}
