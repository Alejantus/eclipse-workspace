package ejercicioTipoExamen2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=2,numP=0,opcion=0;
		
		Producto [] lista = new Producto[tam];
		Ventas v = new Ventas(lista);
		
		lista[numP++]=new Movil(2000, 1, "Telefono", "Samsumg");
		lista[numP++]=new EspadaLaser(5000, 1, "Espada", "doble");
		
		System.out.println("Bienvenido a nuestra tienda");
		do {
			System.out.println("Acciones");
			System.out.println("1. Mostrar lista");
			System.out.println("2. Calcular recaudación");
			System.out.println("3. Devolver cambio");
			System.out.println("4. Mostrar lista con avisos");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				
				break;

			default:
				break;
			}
		} while (opcion!=0);

	}

}
