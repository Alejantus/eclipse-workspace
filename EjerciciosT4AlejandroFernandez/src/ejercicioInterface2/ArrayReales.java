package ejercicioInterface2;

import java.util.Arrays;
import java.util.Random;

public class ArrayReales implements IEstadisticas {

	private double num[];

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}

	public double[] getNum() {
		return num;
	}

	public void setNum(double[] num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "ArrayReales [num=" + Arrays.toString(num) + "]";
	}

	public void rellenarArray(int hasta, int desde) {
		Random r = new Random(System.nanoTime());
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(hasta - desde + 1) + desde;
		}
	}

	public double calcularMinimo() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double calcularMaximo() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double calcularSumatorio() {
		double suma =0.0;
		for (int i = 0; i < num.length; i++) {
			suma+=num[i];
		}
		return suma;
	}

}
