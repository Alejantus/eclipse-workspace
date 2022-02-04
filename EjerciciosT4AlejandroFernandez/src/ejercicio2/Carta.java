package ejercicio2;

public class Carta extends Documento {

	private int dia;
	private int mes;
	private int anio;
	
	public Carta(String titulo, String nombreEmpresa, int dia, int mes, int anio) {
		super(titulo, nombreEmpresa);
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return super.toString()+ "Carta [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
<<<<<<< HEAD
	public void mostrarDatos(String nombreEmpresa,String titulo,int dia,int mes,int anio) {
		super.mostrarDatos(titulo,nombreEmpresa);
=======
	public void mostrarDatos() {
		super.toString();
>>>>>>> 7ce430db6ea26355a680fe18b272e5c7da819bd1
		System.out.printf("La fecha es: %d/%d/%d",dia,mes,anio);
	}
	
}
