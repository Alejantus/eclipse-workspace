package ejercicio2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0,idSocio=0;
		
		String nombre,nSocio,dni;
		
		Socio s;
		Club c = new Club();
		
		System.out.println("Bienvenido a nuestro club");
		do {
			System.out.println("¿Qué acciones quieres hacer?");
			System.out.println("1. Dar de alta a una persona");
			System.out.println("2. Dar de baja a un socio");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca un nombre");
				nombre = Leer.dato();
				System.out.println("Intrododuzca un numero de socio");
				nSocio = Leer.dato();
				System.out.println("Introduzca un dni");
				dni = Leer.dato();
				s = new Socio(nombre, dni, nSocio);
				c.agregarSocio(s);
				break;
			case 2:
				System.out.println("¿Qué socio quieres dar de baja?");
				idSocio = Leer.datoInt();
				c.quitarSocio(idSocio);
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcion!=0);
	}

}
