package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min=0,max=0,dos=2,parOImpar=0,opcion=0,minChino=0,maxChino=0,chinos=0,minPrimi=0,
				maxPrimi=0,primi=0;
		
		Aleatorios al1=new Aleatorios();
		
		System.out.println("Bienvenido, en este programa vamos a usar varios métodos aleatorios");
		do {
			System.out.println("Introduzca un número");
			System.out.println("1. Generar quiniela");
			System.out.println("2. Generar par o none");
			System.out.println("3. Generar chinos");
			System.out.println("4. Generar sorteo de la primitiva");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 2:
				System.out.println("Diga un número mínimo que quiere generar:");
				min=Leer.datoInt();
				System.out.println("Diga un número máximo que quiere generar:");
				max=Leer.datoInt();
				System.out.println("Diga el número que usted quiera: ");
				parOImpar=Leer.datoInt();
				System.out.println(al1.generarParoNone(min, max, dos, parOImpar));
				break;
			case 3:
				System.out.println("Diga un número mínimo que quiere generar:");
				minChino=Leer.datoInt();
				System.out.println("Diga un número máximo que quiere generar:");
				maxChino=Leer.datoInt();
				System.out.println("Diga el número que usted quiera:");
				chinos=Leer.datoInt();
				System.out.println(al1.generarJuegoChinos(minChino, maxChino, chinos));
				break;
			case 4:
				System.out.println("Diga un número mínimo que quiere generar:");
				minPrimi=Leer.datoInt();
				System.out.println("Diga un número máximo que quiere generar:");
				maxPrimi=Leer.datoInt();
				System.out.println("Diga cuántos números quires generar:");
				primi=Leer.datoInt();
				System.out.println(al1.generarPrimitiva(minPrimi, maxPrimi, primi));
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcion!=0);
		
	}

}
