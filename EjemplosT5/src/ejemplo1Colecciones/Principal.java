package ejemplo1Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String>lista=new ArrayList<String>();
		List <Integer>lista2=new ArrayList<Integer>();
		
		lista.add("Ángel");
		lista.add("Miguel");
		lista2.add(2);
		lista2.add(13);
		
		System.out.println(lista);
		System.out.println(lista2);

	}

}
