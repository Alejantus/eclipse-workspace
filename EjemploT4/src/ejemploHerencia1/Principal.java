package ejemploHerencia1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tope=8;
		
		Trabajador t=new Trabajador ("Angel","Jefe de departamento");
		Empleado e=new Empleado("Pepe","Analista",1200.0,20.0);
		Consultor c=new Consultor("Rafa","Junior",42,55.50);
		
		System.out.println(t.calcularPaga());
		System.out.println(e.calcularPaga());
		System.out.println(c.calcularPaga());
		
		c.avisarHorasExtras(tope);
	}

}
