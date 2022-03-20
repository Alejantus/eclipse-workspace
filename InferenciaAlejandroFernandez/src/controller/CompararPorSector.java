package controller;

import java.util.Comparator;

import model.Sector;

public class CompararPorSector implements Comparator<Sector>{

	@Override
	public int compare(Sector s1, Sector s2) {
		
		String nombres1 = s1.getNombre();
		String nombres2 = s2.getNombre();
		
		return (nombres1.toLowerCase().compareTo(nombres2.toLowerCase()));
	}

}
