package ejercicioInterface2;

public class Guitarra implements IInstrumento {

	@Override
	public void tocar() {
		System.out.println("Guitarra.tocar()");
	}

	public String tipo() {
		return "Guitarra";
	}

	public void afinar() {}
	
}
