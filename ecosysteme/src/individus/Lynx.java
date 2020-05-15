package individus;

/**
 * <b> Individu Animal de type Carnivore et d'esp�ce Lynx.</b>
 * <p> Cet individu est d�fini par les m�mes param�tres que l'individu @see Animal.</p>
 * 
 * @author M�lodia
 *
 */

public class Lynx extends Carnivore {
	
	/**
	 * Constructeur de l'esp�ce Lynx
	 * 
	 * @param posx
	 * 			Position en X.
	 * @param posy
	 * 			Position en Y.
	 * @param sexe
	 * 			Genre.
	 * @param age
	 * 			Age.
	 */

	public Lynx(int posx, int posy, String sexe, int age,int date_naissance) {
		super("Lynx", posx, posy, sexe, age, 7*365,20, 2*365 ,6*365,date_naissance,60);
		
		
	}

}
