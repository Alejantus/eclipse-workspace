package ejercicio;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam = 3, anio = 2022, opcion = 0, numV = 0;

		Visitante[] lista = new Visitante[tam];

		lista[numV++] = new Visitante("Angel", 1, 100, 40);
		lista[numV++] = new Empresarios("Beatriz", 2, 100, 50, "Grupo Mas", 110);
		lista[numV++] = new Familiar("Miguel", 3, 100, 38, 5);

		Feria f = new Feria(anio, lista);

		System.out.println("Bienvenido a la feria ExpoFP");
		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1. Mostrar el listado de visitantes");
			System.out.println("2. Calcular cuanto cuesta una entrada");
			System.out.println("3. Mostrar recaudado de todas las entradas");
			System.out.println("4. Mostrar recaudado solo por las familias");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				f.mostrarListado(numV);
				break;
			case 2:
				System.out.println("¿Qué cliente quieres calcular la entrada?");
				f.mostrarListado(numV);
				numV = Leer.datoInt();
				// No devuelve ningun valor auqnue los ejecutes/selecciones
				// System.out.printf("La entrada de este visitante es de
				// %.2f",f.calcularPrecioEntradaUnVisitante(lista));
				break;
			case 3:
				System.out.printf("El total recaudado es de %.2f €\n", f.calcularTotalRecaudado(numV));
				break;
			case 4:
				System.out.printf("El total recaudado por las familias es de %.2f €\n",
						f.calcularTotalRecaudadoSoloFamiliares(numV));
				break;
			case 0:
				System.out.println("Hasta luego y que tenga un buen día");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcion != 0);
	}

}
