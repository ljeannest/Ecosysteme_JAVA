package individus;

public class Vautour extends Charognard{

	Vautour partenaire;
	
	public Vautour(int[] position, String sexe, int age) {
		super("Vautour", position, sexe, age, 10,10);
	}
	
	public static void main (String args[]) {
		Vautour V = new Vautour(new int[0] , "M", 1);
		System.out.println(V.partenaire);
	}
	
	public void reproduction(Vautour V) {
		
	}

}
