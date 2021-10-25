package ejemplo3;

public class Operaciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double saldo = 100;
		double reintegro = 50, olvido = 20;
		//double resultado;
		
		//Una forma de hacer operaciones
		
		
		System.out.printf("Tienes %.2f y sacas %.2f",saldo,reintegro);

		saldo= saldo - reintegro;
		
		System.out.printf("\nTe quedan %.2f euros",saldo);
		
		saldo= saldo - olvido;
		
		System.out.printf("\nTu nuevo saldo despues de sacar el olvido"
				+ "es %.2f",saldo);
		
		
	}

}
