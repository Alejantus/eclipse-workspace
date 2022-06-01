package ejemploHerencia1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0,tope=8,tam=3;
		double desc=15.5;
		
		Trabajador t=new Trabajador ("Angel","Jefe de departamento");
		//Empleado e=new Empleado("Pepe","Analista",1200.0,20.0);
		Consultor  c=new Consultor("Rafa","Junior",10,1);
		Trabajador tMezcla = new Consultor("Luismi", "Master and comander", 20, 1);
		
		Trabajador [] lista = new Trabajador[tam];
		lista[i++]=t;
		lista[i++]=c;
		lista[i]=tMezcla;
		
		
		/*System.out.println(t.calcularPaga(desc));
		//System.out.println(e.calcularPaga());
		System.out.println(c.calcularPaga(desc));
		System.out.println(tMezcla.calcularPaga(desc));*/
		
		//No se puede utilizar avisarHorasExtras, ya que no esta definida en la clase madre
		//c.avisarHorasExtras(tope);
		
		//Como avisarHorasExtras a tMezcla usando instanceof Consultor
		
		
		for (int j = 0; j < lista.length; j++) {
			System.out.println(lista[j].calcularPaga(desc));
			
			if (lista[j] instanceof Consultor) {
				/*forma a
				Consultor cCas;
				cCas=(Consultor)tMezcla;
				cCas.avisarHorasExtras(tope);
				*/
				//forma b
				((Consultor)lista[j]).avisarHorasExtras(tope);
			}
		}
	}

}
