package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Ángel Naranjo González", sexo = "V", estadoC = "C";
		int peso = 86, dos = 2;
		double altura = 1.83, indice = 0.0;
		
		System.out.println("Bienvenido, en este programa vamos a calcular el índice de masa corporal de una persona.");
		
		System.out.println("\n\tFarmacia de Ronda de Triana");
		
		System.out.println("-----------------------------------------");
		
		System.out.printf("Nombre: \t%s",nombre);
		
		System.out.printf("\nSexo: \t\t%s",sexo);
		
		System.out.printf("\nEstado Civil: \t%s",estadoC);
		
		System.out.printf("\nPeso: \t\t%d kg",peso);
		
		System.out.printf("\nAltura: \t%.2f m",altura);
		
		indice = peso / Math.pow(altura, dos);
		
		System.out.printf("\nMasa Corporal \t%.2f",indice);
		
		System.out.println("\n-----------------------------------------");
		
		System.out.println("Hasta luego, que tenga un buen día");
		
		

	}

}
