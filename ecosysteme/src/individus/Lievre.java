package individus;

/**
 * <b> Individu Animal de type Herbivore d'espèce Lievre.</b>
 * <p> Cet individu est défini par les mêmes paramètres que l'individu @see Animal.</p>
 * @author Mélodia
 *
 */

public class Lievre extends Herbivore {
	
	/**
	 * Constructeur de l'espèce Lievre.
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
		super("Lievre", posx, posy, sexe, age, 5*365,20,30,4*365,date_naissance,30);
		
	}
}
