package ejercicio3;

public class Furgonetas extends Vehiculos {

	private int ruedas;
	private int plazas;
	
	public Furgonetas(String tipoGasolina, int caballos, int cilindrada, int ruedas, int plazas) {
		super(tipoGasolina, caballos, cilindrada);
		this.ruedas = ruedas;
		this.plazas = plazas;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	@Override
	public String toString() {
		return super.toString() + "Furgonetas [ruedas=" + ruedas + ", plazas=" + plazas + "]";
	}
	
	public double calcularImpuesto(double cantidadTransporte) {
		return super.calcularImpuesto(cantidadTransporte)+cantidadTransporte;
	}
}
