package ejercicio6;

public class Cuenta extends Cliente{
	
	private String nombreCliente;
	private int idBanco;

	public Cuenta(double saldo, String nombreCliente, int idBanco) {
		super(saldo);
		this.nombreCliente = nombreCliente;
		this.idBanco = idBanco;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}

	@Override
	public String toString() {
		return "Cuenta [nombreCliente=" + nombreCliente + ", idBanco=" + idBanco + "]";
	}
	
	public double retirarDinero(double retirada) {
		return super.getSaldo()-retirada;
	}
	
	public double ingresarDinero(double ingreso) {
		return super.getSaldo()+ingreso;
	}

}
