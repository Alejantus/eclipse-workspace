package ejercicio5;

public class Aleatorios {
	
	/*
	public int generarQuiniela() {
		
	}*/
	
	
	public String generarParoImpar(int min, int max,int dos) {
		int resultado=0;
		
		resultado=(max-min+1)+min;
		
		if(resultado%dos==0) {
			return "Par";
		}else {
			return "Impar";
		}
		
		
		
	}
	
	public int generarPrimitiva(int minPrimi, int maxPrimi) {
		int resultado=0;
		
		resultado = (maxPrimi-minPrimi+1)+minPrimi;
		
		return resultado;
	}
	

}
