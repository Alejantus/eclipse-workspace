package ejercicio7b;

public class Oficina {

	// Otra posible versión sería sin objeto

	private Cuenta c;
	private int id;

	public Oficina(Cuenta c, int id) {
		super();
		this.c = c;
		this.id = id;
	}

	public Cuenta getC() {
		return c;
	}

	public void setC(Cuenta c) {
		this.c = c;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Oficina [c=" + c + ", id=" + id + "]";
	}

	// Metodos

	public void ingresar(double cantidad) {
		c.setSaldo(c.getSaldo() + cantidad);

	}

	public boolean retirar(double cantidad) {
		if (cantidad <= c.getSaldo()) {
			c.setSaldo(c.getSaldo() - cantidad);
			return true;
		} else {
			return false;
		}
	}

	public void imprimirMensaje(boolean b) {
		if (b) {
			System.out.println("Todo ok");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
}
