package ejemploInterface2;

public class Saxofon implements IInstrumento {

	@Override
	public void tocar() {
		System.out.println("Saxofon.tocar()");
	}

	@Override
	public String tipo() {
		return "Saxofon";
	}

	@Override
	public void afinar() {}

}
