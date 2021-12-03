package prueba;

public class Tablero {
	int dimension;
	String caracterSinDestapar;
	String caracterDestapado;
	String tablero[][];
	String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
			"u", "v", "w", "x", "y", "z" };

	Tablero(int dimension, String caracterSinDestapar, String caracterDestapado) {
		this.dimension = dimension;
		this.caracterSinDestapar = caracterSinDestapar;
		this.caracterDestapado = caracterDestapado;

		tablero = new String[dimension][dimension];

		for (int i = 1; i < dimension; i++)
			for (int j = 1; j < dimension; j++)
				tablero[i][j] = caracterSinDestapar;

		for (int i = 1; i < dimension; i++)
			tablero[i][0] = String.valueOf(i); // Aquí se añaden los números de la
												// izquierda aprovechando el indice del for

		for (int j = 1; j < dimension; j++) // Aquí rellenamos con las vocales del array
			tablero[0][j] = abc[j - 1];

//para eliminar el null que queda en la posicion [0][0] tan fácil como:
		tablero[0][0] = "";
	}

}