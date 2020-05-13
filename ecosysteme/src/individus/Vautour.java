package individus;

/**
 * <b> individu Animal de type Charognard d'espce Vautour.</b>
 * <p> cet individues est défini par les meme paramétre que l'individue @see Animal mais aussi de cee parametre:.</p>
 * <ul>
 * <li> Partenaire de reproduction de l'individue qui une fois trouvé ne change pas.</li>
 * </ul> 
 * 
 * @author Mélodia
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
	public Vautour(int posx, int posy, String sexe, int age) {
		
		super("Vautour", posx, posy, sexe, age, 10*365, 10, 4, 100);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		Vautour V = new Vautour(0,0, "M", 1);
		System.out.println(V.partenaire);
	}
	
	public void reproduction(Vautour V) {

	}

}
