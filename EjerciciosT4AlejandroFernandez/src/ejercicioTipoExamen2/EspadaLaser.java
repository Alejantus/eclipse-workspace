package ejercicioTipoExamen2;

public class EspadaLaser extends Producto {

	private String tipo;

	public EspadaLaser(double precioBase, int cantidad, String nombre, String tipo) {
		super(precioBase, cantidad, nombre);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "EspadaLaser [tipo=" + tipo + "]";
	}

	public double calcularPVP(double porc) {
		double div=100.0,cantidadFija=1000.0;
		return super.getPrecioBase()*porc/div+cantidadFija;
	}
	
	public void mensajeCompra() {
		if(tipo.equalsIgnoreCase("doble")) {
			System.out.println("¡Cuidadín al sacarla de la bolsa, que hace pupa!");
		}
	}
	
	
}
