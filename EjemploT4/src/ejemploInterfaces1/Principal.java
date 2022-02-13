package ejemploInterfaces1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carta c = new Carta ("Salesianos Triana","Estaimados alumnos: \nBienvenidos a este centro");
		Web w = new Web("Salesianos Triana");
		
		c.imprimirAst();
		w.imprimirAst();
	}

}
