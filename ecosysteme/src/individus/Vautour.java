package individus;

public class Vautour extends Charognard{

	Vautour partenaire;
	
	public Vautour(int posx, int posy, String sexe, int age) {
		super("Vautour", posx, posy, sexe, age, 100, 10, 4, 100);
	}
	
	public static void main (String args[]) {
		Vautour V = new Vautour(0,0, "M", 1);
		System.out.println(V.partenaire);
	}
	
	public void reproduction(Vautour V) {

	}

}
