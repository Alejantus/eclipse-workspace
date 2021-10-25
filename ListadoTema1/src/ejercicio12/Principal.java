package ejercicio12;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double intensidad,tres=3,result;
		double resistencia = 20;
		double voltios = 250;
		
		System.out.println("Bienvenido, en este programa vamos a hacer el calculo de la"
				+ "intesidad electrica\n");
		
		intensidad = voltios/resistencia;
		
		System.out.printf("La intensidad electrica es de %.2f",intensidad);
		
		
		
	}

}
