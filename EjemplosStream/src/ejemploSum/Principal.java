package ejemploSum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Peliculas p1 = new Peliculas("Avengers", 200);
		Peliculas p2 = new Peliculas("Spiderman",150);
		Peliculas p3 = new Peliculas("Joker",120);
		
		Stream<Peliculas> st = Stream.of(p1,p2,p3);
		
		st.forEach((p) -> System.out.println(p.getNombre()));
		
		List<Peliculas> lista = st.collect(Collectors.toList());
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.printf("Pelicula Nº%d : %s",i+1,lista.get(i).getNombre());
		}*/
		
		List <Peliculas> lista = new ArrayList<Peliculas>();
		lista.add(new Peliculas ("Vengadores Endgame", 182));
		lista.add(new Peliculas ("Uncharted", 116));
		lista.add(new Peliculas ("The Batman", 176));
		
		Peliculas minimo = lista
				.stream()
				.min(Comparator.comparingInt(Peliculas::getHoras))
				.get();
		
		Peliculas maximo = lista
				.stream()
				.max(Comparator.comparingInt(Peliculas::getHoras))
				.get();
		
		System.out.println("Minimo = "+minimo);
		
		System.out.println("Máximo = "+maximo);

	}

}
