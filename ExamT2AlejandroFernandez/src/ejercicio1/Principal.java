package ejercicio1;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 0, opcion = 0, hasta = 0, desde = 0, dia = 0, uno = 1, suma = 0, litrosPueblo = 15, porcentaje = 100,
				llovido = 15;
		double porcentajeTotal = 0.0, media = 0.0;

		Random r = new Random(System.nanoTime());

		int listaLitros[];

		System.out.println(
				"Bienvenido, en este programa vamos a recoger los datos de un pluviómetro y realizar unos cálculos con esos datos");
		System.out.println("¿Cuántos días quieres guardar?");
		tam = Leer.datoInt();
		listaLitros = new int[tam];

		do {
			media = 0;
			suma = 0;
			porcentajeTotal = 0;

			System.out.println("¿Qué acción quieres realizar?");
			System.out.println("1. Generar litros aleatoreamente");
			System.out.println("2. Mostrar todos los datos");
			System.out.println("3. Mostrar litros caídos por posición");
			System.out.println("4. Mostrar días que ha llovido");
			System.out.println("5. Calcular media diaria de lluvia");
			System.out.println("6. Calcular porcentaje de lluvia en un día");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca desde donde quieres empezar");
				desde = Leer.datoInt();
				System.out.println("Y hasta donde quierer llegar");
				hasta = Leer.datoInt();
				for (int i = 0; i < listaLitros.length; i++) {
					listaLitros[i] = r.nextInt(hasta - desde + 1) + desde;
				}
				break;
			case 2:
				System.out.println("Día\t\tCantidad");
				for (int i = 0; i < listaLitros.length; i++) {
					System.out.println((i + uno) + "\t\t" + listaLitros[i]);
				}
				break;
			case 3:
				// Se genera un buble infinito
				System.out.println("¿Qué día quieres mirar?");
				dia = Leer.datoInt();
				System.out.println("Día\t\tCantidad");
				while (dia < listaLitros.length+uno) {
						System.out.println((i+uno)+"\t\t"+listaLitros[dia - uno]);
				}
				break;
			case 4:
				for (int i = 0; i < listaLitros.length; i++) {
					if (listaLitros[i] < llovido) {
						System.out.println("Los días que ha llovido algo han sido el :" + i + uno);
					}
				}
				break;
			case 5:
				for (int i = 0; i < listaLitros.length; i++) {
					suma += listaLitros[i];
				}
				media = suma / listaLitros.length;
				System.out.printf("La media diaria es de: %.2f\n", media);
				break;
			case 6:
				System.out.println("¿Qué día quieres calcular?");
				dia = Leer.datoInt();
				for (int i = 0; i < listaLitros.length; i++) {
					porcentajeTotal = listaLitros[dia - uno] * porcentaje / litrosPueblo;
				}
				System.out.printf("El porcentaje de ese del dia %d es del %.2f%%\n", dia, porcentajeTotal);
				break;
			case 0:
				System.out.println("Hasta luego, esperamos su regreso");
				break;
			}

		} while (opcion != 0);

	}

}
