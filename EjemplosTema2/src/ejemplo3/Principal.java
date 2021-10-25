package ejemplo3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Si se declara una variable boolean llamada
		//opcion, si en la condicion del if se escribe opcion==false, esta mal y Ángel me suspende
		
		int edad =0,mayoria=18;

		System.out.println("Con cuantos se es mayor de edad en tu país");
		
		mayoria=Leer.datoInt();
		
		System.out.println("¿Cuántos años tienes?");
		
		edad=Leer.datoInt();
		
		if (edad>=mayoria) {
			System.out.println("Entre");
		}else {
			System.out.println("Katanazo en los ojos");
		}
	}

}
