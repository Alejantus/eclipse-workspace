package prueba;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TreeSet<Integer> colec1 = new TreeSet<>();
	        colec1.add(2);
	        colec1.add(1);
	        colec1.add(4);
	        colec1.add(6);
	        
	        if (colec1.contains(2)){
	            System.out.println("El número 2 está en el conjunto");
	        }
	        System.out.printf("El tamaño del conjunto es:%d%n",colec1.size());
	        
	        HashSet<Integer> colec2 = new HashSet<>();
	        colec2.add(7);
	        colec2.add(9);
	        
	        colec1.addAll(colec2);
	        
	        if (colec1.contains(7)){
	            System.out.println("El número 7 está en el conjunto");
	        }
	        
	        colec1.removeAll(colec2);
	        
	        if (!colec1.contains(7)){
	            System.out.println("El número 7 YA NO está en el conjunto");
	        }
	        
	        System.out.println("Datos del array");
	        for (Integer dato: colec1){
	            System.out.println(dato);
	        }
	        /*
	        // A partir de Java 8 podemos usar este operador
	        System.out.println("Datos del array con operador Java 8");
	        colec1.forEach((dato) -> {
	                   System.out.println(dato);
	        }); 

	 
	        // MÉTODOS DE LA INTERFACE SortedSet
	        System.out.println("El primer elemento de la lista:" + colec1.first());
	        System.out.println("El último elemento de la lista:" + colec1.last());

	        // MÉTODOS DE LA INTERFACE NaveigableSet
	        System.out.println("El entero que haya en a lista que sea menor o igual que  2:" + colec1.floor(3));
	        System.out.println("El entero que haya en a lista que sea mayor o igual que 5:" + colec1.ceiling(5));
	        NavigableSet<Integer> inverso = colec1.descendingSet();
	        System.out.println("Datos invertidos:");
	        for (Integer dato: inverso){
	            System.out.println(dato);
	        }

	        colec1.clear();
	        
	        System.out.printf("El tamaño del conjunto es:%d%n",colec1.size());

	        // Si queremos obtener los datos de la colección en forma de array
	        Integer[] datosColec = colec1.toArray(new Integer[0]);   // Vale poner cualquier índice. Sólo usa el parámetro para saber a que tipo de dato tiene que realizar la conversión.
	         */
	}

}
