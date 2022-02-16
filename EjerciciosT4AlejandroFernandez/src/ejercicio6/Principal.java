package ejercicio6;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam=3,numC=0,opcion;
		double ingreso=0.0,retirada=0.0;
		
		Cuenta [] lista = new Cuenta[tam];
		Oficina o = new Oficina(lista);

		lista[numC++] = new CuentaCorriente(20000.0, "Alejandro", 1);
		lista[numC++] = new CuentaEmpresa(1000000, "Miguel", 2);
		lista[numC++] = new CuentaJoven(1500, "Mario", 3);
		
		System.out.println("Bienvenido, al banco Santander");
		
		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1. Ingresar dinero");
			System.out.println("2. Retirar dinero");
			System.out.println("3. Cambiar cuenta");
			System.out.println("4. Calcular total");
			System.out.println("5. Ganancia oficina");
			System.out.println("6. Perdida oficina");
			System.out.println("0. Salir");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 0:
				System.out.println("Hasta luego, vuelva pronto");
				break;
			case 1:
				System.out.println("¿Cuánto quieres ingresar?");
				ingreso=Leer.datoDouble();
				System.out.printf("Has ingresado %.2f €\n",lista[numC-1].ingresarDinero(ingreso));
				break;
			case 2:
				System.out.println("¿Cuánto quieres retirar?");
				retirada=Leer.datoDouble();
				System.out.printf("Has retirado %.2f €\n",lista[numC-1].retirarDinero(retirada));
			case 3:
				o.mostrarCuentas(numC);
				System.out.println("A que cuenta te quieres cambiar");
				numC=Leer.datoInt();
			case 4:
				System.out.printf("El total de todas las cuentas es de %.2f €\n",o.calcularTotal(numC));
			case 5:
				System.out.printf("La ganancia de la oficina es de %.2f €",o.ganarDineroEmpresa(numC, retirada));
			case 6:
				System.out.printf("Lo que ha perdido la oficina es de %.2f €",o.perderDineroJOven(numC, ingreso));
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcion!=0);
	}

}
