package ejercicio;

public class Empresarios extends Visitante {

	private String nombreEmpresa;
	private double dineroPatrocinador;

	public Empresarios(String nombre, int id, double precioEntrada, int edad, String nombreEmpresa,
			double dineroPatrocinador) {
		super(nombre, id, precioEntrada, edad);
		this.nombreEmpresa = nombreEmpresa;
		this.dineroPatrocinador = dineroPatrocinador;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public double getDineroPatrocinador() {
		return dineroPatrocinador;
	}

	public void setDineroPatrocinador(double dineroPatrocinador) {
		this.dineroPatrocinador = dineroPatrocinador;
	}

	@Override
	public String toString() {
		return super.toString() + "Empresarios [nombreEmpresa=" + nombreEmpresa + ", dineroPatrocinador="
				+ dineroPatrocinador + "]";
	}

	public double calcularPrecioEntrada() {
		double patrocinio = 100.0, total = 0.0, porc = 10.0, div = 100.0;
		if (dineroPatrocinador > patrocinio) {
			total = super.calcularPrecioEntrada() - (super.calcularPrecioEntrada() * porc / div);
		} else {
			total = super.calcularPrecioEntrada();
		}
		return total;
	}

	public void invitarCafe() {
		System.out.println("Consumición gratis");
	}

}
