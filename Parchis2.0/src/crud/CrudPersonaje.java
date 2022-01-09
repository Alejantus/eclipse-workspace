package crud;

import model.Personajes;

public class CrudPersonaje {

	
	public void reiniciarVida (Personajes p) {
		
		p.setColumActual(0);
		p.setVidas(6);
	}
}
