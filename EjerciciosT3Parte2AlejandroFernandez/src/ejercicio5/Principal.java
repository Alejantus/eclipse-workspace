package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0,tam=0,opcion=0,nEs=0,numE=0;
		double resultado=0;
		
		String color;
		char letra;
		double precioB;
		double peso;
		
		Electrodomesticos listado[];
		Tienda t;
		
		System.out.println("Bienvenido a nuestra tienda:\t Mediamarkt");
		do {
			System.out.println("¿Cuántos productos quieres añadir?");
			tam=Leer.datoInt();
			listado=new Electrodomesticos[tam];
			t=new Tienda(listado);
			do {
				System.out.println("¿Qué acción quieres realizar?");
				System.out.println("1. Añadir productos");
				System.out.println("2. Realizar media de todos los productos");
				System.out.println("3. Calcular precio eligiendo un producto");
				System.out.println("4. Calcular todos los productos");
				System.out.println("0. Salir");
				opcion = Leer.datoInt();
				switch (opcion) {
				case 1:
					do {
					System.out.println("¿Qué marca quieres?");
					precioB = Leer.datoDouble();
					System.out.println("¿Qué modelo quieres?");
					color = Leer.dato();
					System.out.println("¿Cuánto crees que cuesta el móvil?");
					letra = Leer.datoChar();
					System.out.println("Diga 1 si está vendido y 0 no está vendido");
					peso=Leer.datoDouble();
					listado[nEs]=new Electrodomesticos(precioB,color,letra,peso);
					nEs++;
					}while(listado.length>nEs);
					break;
				case 2:
					System.out.println("La media de todos los productos es de ");
					System.out.printf("%d €",t.calcularMediaPrecio());
					break;
				case 3:
					System.out.println("Vamos a calcular el precio de un producto.");
					System.out.println("Por favor escoja un producto:");
					numE=Leer.datoInt();
					System.out.printf("%d €",t.calcularPrecioElegido(numE, resultado));
					break;
				case 4:
					System.out.println("El precio de todos los productos es: ");
					System.out.printf("%d €",t.calcularTodosPrecios());
					break;
				case 0:
					System.out.println("Hasta luego");
					break;
				default:
					System.out.println("Error, opción incorrecta");
					break;
				}
			} while (opcion!=0);			
		} while (tam!=0);
	}

}
