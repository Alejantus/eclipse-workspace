package principal;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//No esta mal pero podría ser mejor
		
		String texto = "abc";
		
		List<String> lista = new ArrayList<String>();
		
		
		//Esto está mejor 
		
		var texto2 = "abc";
		
		var lista2 = new ArrayList<String>();
		
		lista.add("Alejandro");
		
		lista2.add("Piña");
		
		System.out.println("el primer texto es "+texto);
		System.out.println("y en la lista hay "+lista);
		System.out.println("mientras que en el segundo texto tiene "+texto2+" que es lo mismo que el primer texto");
		System.out.println("y en la segunda lista hay "+lista2);

	}

}
