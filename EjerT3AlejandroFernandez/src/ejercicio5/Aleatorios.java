package ejercicio5;

public class Aleatorios {
	
	
	public String generarQuiniela(int quiniela) {
		int uno=1,dos=2,tres=3;
		int hasta=3,desde=1,resultado=0;
		
		resultado=(hasta-desde+1)+desde;		
		
		if(quiniela==uno) {
			return "El resultado de la quiniela es victoria"+resultado;
		}else if (quiniela==dos) {
			return "El resultado de la quiniela es derrota"+resultado;
		}else if(quiniela==tres) {
			return "El resultado de la quiniela es empate"+resultado;
		}
		return "El resultado es"+resultado;
		
	}
	
	
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
			return "Has acertado ya que el número es "+resultado;
		}else {
			return "Has fallado ya que el número es "+resultado;
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
