package ejemplo4Colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String,String> mapa = new HashMap<String, String>();
		
		mapa.put("one", "1st");
		mapa.put("two", "2nd");
		mapa.put("three", "3rd");
		
		mapa.put("three", "III");
		
		Set <String> set1 = mapa.keySet();
		
		Collection <String> collection = mapa.values();
		
		Set<Entry<String, String>>set2 = mapa.entrySet();
		
		System.out.println(set1+"\n"+collection+"\n"+set2);

	}

}
