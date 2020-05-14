package individus;

/**
 * <b> individu Animal de type Charognard d'espce Vautour.</b>
 * <p> cet individues est d�fini par les meme param�tre que l'individue @see Animal mais aussi de cee parametre:.</p>
 * <ul>
 * <li> Partenaire de reproduction de l'individue qui une fois trouv� ne change pas.</li>
 * </ul> 
 * 
 * @author M�lodia
 *
 */

public class Vautour extends Charognard{
	
	/**
	 * Parnetaire du vautour non  modifiable.
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
		
		super("Vautour", posx, posy, sexe, age, 10*365, 10, 4, 100,date_naissance);
	}
	


}
