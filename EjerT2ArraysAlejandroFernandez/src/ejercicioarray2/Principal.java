package ejercicioarray2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dos = 2, tam = 10, mult = 0;

		int enteros[] = new int[tam];

		// int enteros [] = {1,2,3,4,5,6,7,8,2,3};
		
		//Se usan dos bucles for uno para imprimir y otro para introducir

		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = i * dos;
		}
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.println(enteros[i]);
		}

	}

}
