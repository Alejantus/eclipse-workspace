package ejercicio4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 1, porcentaje = 20, tam = 3, opcion, caducidad = 1;
		String empleado = "Alejandro Fernández";
		Producto fruta = new Alimentacion(1.5, "Plátano Can", contador, caducidad);
		contador++;
		Producto movil = new Electronica(350, "Iphone SE 64GB", contador, porcentaje);
		contador++;
		Producto sudadera = new Ropa(20, "Sudadera", contador, "L");
		LineaDeVenta [] lista = new LineaDeVenta [tam];
		
		lista[0] = new LineaDeVenta (fruta, 3);
		lista[1] = new LineaDeVenta (movil, 1);
		lista[2] = new LineaDeVenta (sudadera, 2);
		
		Venta operacion = new Venta (lista);
		
		System.out.println("Bienvenido al MediaMarkt.");
		
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
					operacion.listarProductos(caducidad);
					break;
				default:
					System.out.println("Seleccione una opción valida, por favor.");
			}
		}while(opcion != 0);
		
		System.out.println("Gracias por su visita. Vuelva pronto.");
	}

}
