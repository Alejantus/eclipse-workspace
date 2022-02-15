package ejemploInterface2;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam=5;
		
		IInstrumento [] orquesta= new IInstrumento[tam];
		int i=0;
		
		orquesta[i++] = new Guitarra();
		orquesta[i++] = new Piano();
		orquesta[i++] = new Saxofon();
		orquesta[i++] = new Guzla();
		orquesta[i++] = new Ukelele();
		Musica.afinarTodo(orquesta);

	}

}
