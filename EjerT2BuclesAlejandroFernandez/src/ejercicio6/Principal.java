package ejercicio6;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double  peso=0.0,mercurio=0.38,venus=0.91,tierra=1.0,marte=0.38,jupiter=2.53,saturno=1.06,urano=0.92,neptuno=1.2,equivalencia;
		int opcion=0;
		
		System.out.println("Bienvenido, vamos a calcular tu peso en otro planeta del sistema solar");
		System.out.println("Por favor, introduzca su peso actual:");
		
		peso = Leer.datoDouble();
		
		System.out.println("Sabiendo su peso, por favor elija entre los planetas de este sistema solar");
		
		System.out.println("1. Mercurio\n2. Venus\n3. Tierra\n4. Marte\n5. Júpiter\n6. Saturno\n7. Urano\n8. Neptuno");
		
		opcion = Leer.datoInt();
		
		switch (opcion) {
			case 1:
				System.out.println("Ha elegido calcular su peso con el de Mercurio");
				
				equivalencia = peso * mercurio;
				
				System.out.printf("Su peso en Mercurio es de %.2f",equivalencia);
				
				break;
				
			case 2:
				System.out.println("Ha elegido calcular su peso con el de Venus");
				
				equivalencia = peso * venus;
				
				System.out.printf("Su peso en Venus es de %.2f",equivalencia);
				
				break;
				
			case 3:
				System.out.println("Ha elegido calcular su peso con el de Tierra");
				
				equivalencia = peso * tierra;
				
				System.out.printf("Su peso en la Tierra es de %.2f",equivalencia);
				
				break;
				
			case 4:
				System.out.println("Ha elegido calcular su peso con el de Marte");
				
				equivalencia = peso * marte;
				
				System.out.printf("Su peso en Marte es de %.2f",equivalencia);
				
				break;
				
			case 5:
				System.out.println("Ha elegido calcular su peso con el de Júpiter");
				
				equivalencia = peso * jupiter;
				
				System.out.printf("Su peso en Júpiter es de %.2f",equivalencia);
				
				break;
				
			case 6:
				System.out.println("Ha elegido calcular su peso con el de Saturno");
				
				equivalencia = peso * saturno;
				
				System.out.printf("Su peso en Saturno es de %.2f",equivalencia);
				
				break;
				
			case 7:
				System.out.println("Ha elegido calcular su peso con el de Urano");
				
				equivalencia = peso * urano;
				
				System.out.printf("Su peso en Urano es de %.2f",equivalencia);
				
				break;
				
			case 8:
				System.out.println("Ha elegido calcular su peso con el de Neptuno");
				
				equivalencia = peso * neptuno;
				
				System.out.printf("Su peso en Neptuno es de %.2f",equivalencia);
				
				break;
				
			default:
				System.out.println("Error, no existe ese planeta en nuestro sistema solar");
				break;
		}
	}

}
