package principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] pj1 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
				" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
				" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
				" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
				" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
		String [] linea1 = {"_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ",
				"_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ",
				"_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ",
				"_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ",
				"_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ "};
		String [] linea2 = {"_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ "};
		String [] linea3 = {"_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ "};
		String [] linea4 = {"_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ "};
		
		
		for (int i=0;i<pj1.length;i++) {
			System.out.print(pj1[i]);
			pj1[10]="A";
		}
		
		System.out.println();
		
		for (int i=0;i<linea1.length;i++) {
			System.out.print(linea1[i]);
		}
		
		System.out.println();
		
		for (int i=0;i<linea2.length;i++) {
			System.out.print(linea2[i]);
		}
		
		System.out.println();
		
		for (int i=0;i<linea3.length;i++) {
			System.out.print(linea3[i]);
		}
		
		System.out.println();
		
		for (int i=0;i<linea4.length;i++) {
			System.out.print(linea4[i]);
		}

	}

}
