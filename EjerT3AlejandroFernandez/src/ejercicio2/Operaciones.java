package ejercicio2;

public class Operaciones {
	
	public String positivoONegativo(int num) {
		String result;
		if(num>0) {
			result= "Positivo";
		}else {
			result= "Negativo";
		}
		return result;
	}
	
	public String parOImpar(int dos,int num) {
		String result;
		if(num%dos==0) {
			result= "Par";
		}else {
			result= "Impar";
		}
		
		return result;
	}

}
