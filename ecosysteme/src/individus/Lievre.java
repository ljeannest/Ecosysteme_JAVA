package individus;

/**
 * <b> Individu Animal de type Herbivore d'esp�ce Lievre.</b>
 * <p> Cet individu est d�fini par les m�mes param�tres que l'individu @see Animal.</p>
 * @author M�lodia
 *
 */

public class Lievre extends Herbivore {
	
	/**
	 * Constructeur de l'esp�ce Lievre.
	 * 
	 * @param posx
	 * 			Position en X.
	 * @param posy
	 * 			Position en Y.
	 * @param sexe
	 * 			Genre.
	 * @param age
	 * 			Age.
	 * 
	 */
	public Lievre(int posx, int posy, String sexe, int age,int date_naissance) {
		super("Lievre", posx, posy, sexe, age, 5*365,5,365/2,4*365+365/2,date_naissance,40);
		
	}
}
