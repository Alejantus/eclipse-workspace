package ejercicio1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nPs=0,opcion=0, numF=0,tam =5,suma=0,op=0;
		boolean b = true;
		double precio=0.0,ganancia=0.0;
		String marca = null,tamanio = null,forma = null,calidad = null;
		
		Gestion g =new Gestion(precio, calidad, forma, tamanio, marca);
		
		Gestion lista[]=new Gestion[tam];
		
		System.out.println("Bienvenido, a nuestra tienda");
		
		do {
			System.out.println("¿Qué acción quieres realizar?");
			System.out.println("1. Añadir un producto");
			System.out.println("2. Listar productos");
			System.out.println("3. Comprobar fragilidad");
			System.out.println("4. Calcular precio venta público");
			System.out.println("0. Salir");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 1:
				do {
					System.out.println("¿Cuánto cuesta el producto?");
					precio = Leer.datoDouble();
					System.out.println("Diga la marca del producto");
					marca = Leer.dato();
					System.out.println("Diga el tamaño del producto");
					tamanio = Leer.dato();
					System.out.println("Diga la forma del producto");
					forma = Leer.dato();
					System.out.println("Diga la calidad del producto");
					calidad = Leer.dato();
					lista[nPs] = new Gestion(precio,marca,tamanio,forma,calidad);
					nPs++;
				} while (nPs<lista.length);
				break;
			case 2:
					g.mostrarLista(nPs);
				break;
			case 3:
				System.out.println("El producto es frágil");
				System.out.println("1. Es frágil");
				System.out.println("2. No es frágil");
				numF = Leer.datoInt();
				g.comprobarFragilidad(numF);
				g.mostrarComprobarFragilidad(b);
				break;
			case 4:
				System.out.println("Diga un numero entre el 1 y el 5");
				op = Leer.datoInt();
				g.calcularVentaPublico(op, ganancia ,suma);
				break;
			case 0:
				System.out.println("Hasta luego.");
				break;
			default:
				System.out.println("Error, opcion incorrecta");
				break;
			}
		} while (opcion!=0);

	}

}
