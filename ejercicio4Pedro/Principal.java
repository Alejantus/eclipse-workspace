package ejercicio4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 1, porcentaje = 20, tam = 3, opcion, caducidad = 1;
		String empleado = "Pedro Puertas";
		Producto fruta = new Alimentacion(1.5, "Plátano", contador, caducidad);
		contador++;
		Producto movil = new Electronica(350, "Iphone SE 64GB", contador, porcentaje);
		contador++;
		Producto sudadera = new Ropa(20, "Sudadera", contador, "L");
		LineaVenta [] lista = new LineaVenta [tam];
		
		lista[0] = new LineaVenta (3, fruta);
		lista[1] = new LineaVenta (1, movil);
		lista[2] = new LineaVenta (2, sudadera);
		
		Venta operacion = new Venta (lista);
		
		System.out.println("Bienvenido a la tienda Pepe.");
		
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("0. Salir");
			System.out.println("1. Imprimir ticket.");
			System.out.println("2. Ver lista de productos.");
			
			opcion = Leer.datoInt();
			
			switch(opcion) {
				case 0:
					break;
				case 1:
					operacion.imprimirTicket(empleado);
					break;
				case 2:
					operacion.listarProductos();
					break;
				default:
					System.out.println("Seleccione una opción valida, por favor.");
			}
		}while(opcion != 0);
		
		System.out.println("Gracias por su visita. Vuelva pronto.");
		
	}

}
