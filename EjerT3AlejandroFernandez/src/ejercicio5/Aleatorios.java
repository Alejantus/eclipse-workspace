package ejercicio5;

public class Aleatorios {
	
	/*
	public int generarQuiniela() {
		
	}*/
	
	
	public String generarParoNone(int min, int max,int dos, int parOImpar) {
		int resultado=0;
		
		resultado=(max-min+1)+min;
		resultado+=parOImpar;
		
		
		if(resultado%dos==0) {
			return "El resultado es par: "+resultado;
		}else {
			return "El resultado es none: "+resultado;
		}
		
		
		
	}
	
	public String generarJuegoChinos(int minChino, int maxChino, int chinos){
		int resultado=0;
		
		resultado=(maxChino-minChino+1)+minChino;
		
		if(chinos==resultado) {
			return "Has acertado";
		}else {
			return "Has fallado";
		}
		
		
	}
	
	public int generarPrimitiva(int minPrimi, int maxPrimi, int primi) {
		int resultado=0;
		int cont=0;
				
		while(cont<primi) {
			cont++;
			resultado = (maxPrimi-minPrimi+1)+minPrimi;
		}
		
		return resultado;
		
	}
	

}
