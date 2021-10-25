package ejercicio5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double euros = 100;
		double dolares = 0.86;
		double dolar = 1;
		double EuADo,DoAEu;
		
		System.out.println("Bienvenido, en este programa vamos a convertir de dolar a euro y de euro a dolares");
		
		EuADo = euros * dolares;
		
		System.out.printf("El cambio de %.2f euros es de %.2f",euros,EuADo);
		
		DoAEu = dolar * dolares;
		
		System.out.printf("Y el cambio de %.2f dolares es de %.2f ",dolar,DoAEu);

	}

}
