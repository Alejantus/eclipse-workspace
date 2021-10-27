package ejercicioarray2;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dos = 2,tam = 10;
		
		int enteros [] = new int [tam];
		
		//int enteros [] = {1,2,3,4,5,6,7,8,2,3};
		
		for(int i = 0;i<enteros.length;i++) {
			i *= dos;
			System.out.println(enteros[i]);
		}

	}

}
