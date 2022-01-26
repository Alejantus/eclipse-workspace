package ejercicio;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 0, opcion = 0, numDs = 0, porcentaje = 0;
		double precioLitro = 0.70, result = 0.0;

		Plataforma p = new Plataforma();

		System.out.println("Bienvenido, a la petrolífera de Repsol");
		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1.Añadir un depósito");
			System.out.println("2.Calcular precio venta");
			System.out.println("3.Calcular número de litros total");
			System.out.println("4.Calcular precio ganancia un depósito");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				p.agregarDeposito(tam);
				break;
			case 2:
				System.out.println("Diga que depósito quieres calcular");
				numDs = Leer.datoInt();
				System.out.println("Diga un tanto porciento");
				porcentaje = Leer.datoInt();
				p.calcularPrecioVenta(numDs, porcentaje);
				break;
			case 3:
				System.out.println("El total de litros es de");
				System.out.printf("%d litros\n", p.calcularLitros());
				break;
			case 4:
				System.out.println("Diga que depósito quiere calcular");
				numDs = Leer.datoInt();
				System.out.println("El precio de venta de un solo depósito es de ");
				System.out.printf("%.2f €\n", p.calcularGananciaUno(numDs, precioLitro));
				break;
			case 5:
				System.out.println("El precio de venta de todos los depositos es de");
				System.out.printf("%.2f €\n",p.calcularGanaciaTodos(precioLitro, result));
				break;
			case 6:
				System.out.println("El precio de venta de todos los depósitos llenos es de");
				System.out.printf("%.2f €\n",p.calcularGananciaTope(precioLitro));				
			default:
				System.out.println("Opción incorrecta, por favor elija otra opción");
				break;
			}
		} while (opcion != 0);

	}

}
