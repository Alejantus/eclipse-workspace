package ejemplo1;

public class Cohete {
	
	private static int numCohetes;
	
	public Cohete() {
		numCohetes++;
	}
	
	public static int getNumCohetes() {
		return numCohetes;
	}
	
	/*
	public static void setNumCohetes(int numCohete) {
		Cohete.numCohetes = numCohete;
	}*/

}
