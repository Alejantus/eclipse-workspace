package ejercicioInterface2;

public class Piano implements IInstrumento {

	@Override
	public void tocar() {
		System.out.println("Piano.tocar()");
	}

	public String tipo() {
		return "Piano";
	}

	public void afinar() {}

}
