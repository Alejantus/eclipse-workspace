package ejercicio2;

public class Operaciones {
	
	private int num;
	
	public Operaciones(int num) {
		this.num=num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num=num;
	}
	
	public int positivoONegativo(int positivo, int negativo) {
		if(num>positivo) {
			positivo=num;
			System.out.printf("Este número es positivo: ");
			return positivo;
		}else {
			negativo=num;
			System.out.printf("Este número es negativo: ");
			return negativo;
		}
	}
	
	public int parOImpar(int par,int impar,int dos) {
		if(num%dos==0) {
			System.out.printf("Este número es par: ");
			return num;
		}else {
			System.out.printf("Este número es impar: ");
			return num;
		}
	}

}
