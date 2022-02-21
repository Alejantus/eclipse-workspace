package ejercicio2;

import lectura.Leer;

public class Ppal {
	
	public static void main(String[] args) {
		
		int menu1, tam=7, numProd=0;
		double porc=0.0, precio=0.0, pagado=0.0;
		Producto[] lista = new Producto[tam];
		Venta v = new Venta(lista);
		
		lista[numProd++] = new Moviles(187, 3, "Movil", false, "Samsung");
		lista[numProd++] = new EspadaLaser(180, 3, "Movil", true, "Doble");
		lista[numProd++] = new Moviles(300, 3, "Movil", false, "Iphone");
		lista[numProd++] = new EspadaLaser(280, 3, "Movil", false, "Larga");
		lista[numProd++] = new Moviles(500, 3, "Movil", true, "Xiaomi");
		lista[numProd++] = new EspadaLaser(300, 3, "Movil", false, "Corta");
		lista[numProd++] = new Moviles(1000, 3, "Movil", true, "Alcatel");
		
		System.out.println("Bienvenido a este programa");
		
		do {
			imprimirMenu();
			menu1=Leer.datoInt();
			switch(menu1) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1: 
				v.mostrarEnVenta(numProd);
				break;
			case 2:
				System.out.printf("Este es el dinero total que se ha "
						+ "recaudado: %.2f",v.calcularTotal(numProd, porc));
				break;
			case 3: 
				System.out.println("Introduzca el precio del producto");
				precio=Leer.datoDouble();
				System.out.println("Diga con cuanto va a pagar");
				pagado=Leer.datoDouble();
				System.out.printf("Su cambio es de: %.2f", v.devolverCambio(pagado, precio));
				break;
			case 4:
				v.mostrarLista(numProd);
				break;
			default:
				System.out.println("Elija un número correcto");
				break;
			}
			
		}while(menu1!=0);
		
		System.out.println("Gracias por usar este programa");
	}
	
	public static void imprimirMenu() {
		System.out.println("\n1. Mostrar vendidos");
		System.out.println("2. Calcular dinero total recaudado");
		System.out.println("3. Devolver cambio");
		System.out.println("4. Mostrar lista de productos");
		System.out.println("0. Para salir");
	}
}
