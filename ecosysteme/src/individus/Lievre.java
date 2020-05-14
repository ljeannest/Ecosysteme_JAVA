package individus;

/**
 * <b> individu Animal de type Herbivore d'espce Lievre.</b>
 * <p> cet individues est d�fini par les meme param�tre que l'individue @see Animal.</p>
 * @author M�lodia
 *
 */

public class Lievre extends Herbivore {
	
	/**
	 * Constructeur de l'espece Lievre.
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
		super("Lievre", posx, posy, sexe, age, 5*365,20,1,20,date_naissance);
		
	}
}
