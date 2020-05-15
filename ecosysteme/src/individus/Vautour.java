package individus;

/**
 * <b> individu Animal de type Charognard d'espce Vautour.</b>
 * <p> Cet individu est défini par les mêmes paramètres que l'individu @see Animal mais aussi de ces paramètres:.</p>
 * <ul>
 * <li> Partenaire de reproduction de l'individu qui une fois trouvé ne change pas.</li>
 * </ul> 
 * 
 * @author Mélodia
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
