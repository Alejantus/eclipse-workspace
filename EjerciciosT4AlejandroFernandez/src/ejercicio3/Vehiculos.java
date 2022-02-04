package ejercicio3;

public class Vehiculos {
	
	private String tipoGasolina;
	private int caballos;
	private int cilindrada;
	
	public Vehiculos(String tipoGasolina, int caballos, int cilindrada) {
		this.tipoGasolina = tipoGasolina;
		this.caballos = caballos;
		this.cilindrada = cilindrada;
	}

	public String getTipoGasolina() {
		return tipoGasolina;
	}

	public void setTipoGasolina(String tipoGasolina) {
		this.tipoGasolina = tipoGasolina;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Vehiculos [tipoGasolina=" + tipoGasolina + ", caballos=" + caballos + ", cilindrada=" + cilindrada
				+ "]";
	}
	
	public double calcularImpuesto(double procentaje) {
		return 2*caballos+cilindrada;
	}

}
