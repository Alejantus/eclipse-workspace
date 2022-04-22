package ejercicio1;

public class CEcuacion2Grado {
	
	private int a;
	private int b;
	private int c;

	public CEcuacion2Grado(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "CEcuacion2Grado [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	public void comprobarNumeros(int a, int b) throws EcuacionDegenerada {
		if (a == 0 && b == 0) {
			throw new EcuacionDegenerada("Ecuacion degenarada");
		}
	}

	public double calcularDiscriminante() throws RaizExc{
		double total = 0;
		total = (Math.pow(b, 2) - 4 * a * c);
		if(total < 0) {
			throw new RaizExc("Las raices son complejas");
		}else {
		return total;
		}
	}

	public double[] calcularEc() throws RaizExc {
		double[] total;
		if (calcularDiscriminante()==0) {
			total = new double [1];
			total[0] =(-b - (4 * a * c)/(2*a)); 
		} else {
			total = new double[2];
			total[0] = (-b + Math.sqrt(calcularDiscriminante())/(2*a));
			total[1] = (-b - Math.sqrt(calcularDiscriminante())/(2*a));
		}
		return total;
	}

	

}
