package ejercicio1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0, id=1,idAgenda=0;
		String titulo,cuerpo;
		boolean urgente =false;

		Notas n;
		Agenda a = new Agenda();
		
		System.out.println("Bienvenido a tu agenda de confianza");
		
		do {
			System.out.println("¿Qué opción quieres usar?");
			System.out.println("1. Añadir nota a la lista");
			System.out.println("2. Mostrar lista");
			System.out.println("3. Quitar nota de la lista");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca un titulo");
				titulo=Leer.dato();
				System.out.println("Introduzca un cuerpo");
				cuerpo=Leer.dato();
				System.out.println("Introduzca 1 Si y 2 No");
				urgente = a.comprobarUrgente(Leer.datoInt());
				n = new Notas(id++, titulo, cuerpo, urgente);
				a.agregarNota(n);
				break;
			case 2:
				a.mostrarNotas();
				break;
			case 3:
				a.mostrarNotas();
				System.out.println("¿Qué nota quieres quitar?");
				idAgenda=Leer.datoInt();
				a.quitarNota(idAgenda);
				break;
			case 0:
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcion!=0);
	}

}
