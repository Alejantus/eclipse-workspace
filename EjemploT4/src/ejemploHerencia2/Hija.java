package ejemploHerencia2;

public class Hija extends Madre{
	
	protected int atributo_x=2;
	
	public int metodo_x() {
		return super.atributo_x*(-10);
	}
}
