package individus;

/**
 * <b> individu Animal de type Charognard d'espce Vautour.</b>
 * <p> Cet individu est d�fini par les m�mes param�tres que l'individu @see Animal mais aussi de ces param�tres:.</p>
 * <ul>
 * <li> Partenaire de reproduction de l'individu qui une fois trouv� ne change pas.</li>
 * </ul> 
 * 
 * @author M�lodia
 *
 */

public class Vautour extends Charognard{
	
	/**
	 * Partenaire du vautour. Non  modifiable.
	 */
	Vautour partenaire;
	
	/**
	 * Constructeur de l'espece Vautour.
	 * @param posx
	 * 			Position en X.
	 * @param posy
	 * 			Position en Y.
	 * @param sexe
	 * 			Genre.
	 * @param age
	 * 			Age.
	 */
	public Vautour(int posx, int posy, String sexe, int age,int date_naissance) {
		
		super("Vautour", posx, posy, sexe, age, 15*365, 10, 5*365, 14*365,date_naissance,9*30);
	}
	


}
