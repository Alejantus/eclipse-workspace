package ejemplo1Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String>lista=new ArrayList<String>();
		List <Integer>lista2=new ArrayList<Integer>();
		List <Alumno>lista3 = new ArrayList<Alumno>();
		Alumno a = new Alumno("Mario",20);
		
		
		lista.add("Ángel");
		lista.add("Miguel");
		lista2.add(2);
		lista2.add(13);
		
		lista3.add(new Alumno("Alejandro",19));
		lista3.add(0,a);
		
		System.out.println(lista3.get(1));
		//System.out.println(lista3);

	}

}
