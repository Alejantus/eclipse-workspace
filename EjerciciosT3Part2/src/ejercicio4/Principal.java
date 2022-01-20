package ejercicio4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result=0;
		int numC=0,nCs=0,tam=0,opcion=0,numActivo=0;
		
		String dni,nombre,apellidos;
		boolean activo;
		double peso,altura;
		
		Cliente listado[];
		Gimnasio g;

		System.out.println("Bienvenido a nuestro gimnasio");
		
		do {
			System.out.println("Diga cuantos clientes quiere guardar");
			tam = Leer.datoInt();
			listado = new Cliente[tam];
			g = new Gimnasio(listado);
			do {
				System.out.println("¿Qué acción quieres realizar?");
				System.out.println("1. Rellenar lista de clientes");
				System.out.println("2. Realizar IMC de un cliente");
				opcion = Leer.datoInt();
				switch (opcion) {
				case 1:
					System.out.println("Diga su dni");
					dni = Leer.dato();
					System.out.println("Diga su nombre");
					nombre = Leer.dato();
					System.out.println("Diga sus apellidos");
					apellidos = Leer.dato();
					System.out.println("Diga 1 si es activo y 0 si no es activo");
					numActivo=Leer.datoInt();
					if(numActivo==1) {
						activo=true;
					}else {
						activo=false;
					}
					System.out.println("Diga su peso");
					peso = Leer.datoDouble();
					System.out.println("Diga su altura");
					altura = Leer.datoDouble();
					listado[nCs]=new Cliente(dni,nombre,apellidos,activo,peso,altura);
					nCs++;
					break;
				case 2:
					System.out.println("Diga que cliente calcular");
					numC=Leer.datoInt();
					g.calcularIMCCliente(result, numC);
					break;
				default:
					System.out.println("Opcion incorrecta");
					break;
				}
			} while (opcion!=0);
		} while (tam>0);
	
	}

}
