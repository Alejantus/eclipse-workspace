package ejercicio2;

public class Operaciones {
	
	public String positivoONegativo(int num) {
		String positivoNegativo;
		if(num>0) {
			return "Positivo";
		}else {
			return "Negativo";
		}
	}
	
	public String parOImpar(int dos,int num) {
		if(num%dos==0) {
			return "Par";
		}else {
			return "Impar";
		}
	}

}
