package individus;

/**
 * <b> individu Animal de type Carnivore et d'espce Lynx.</b>
 * <p> cet individues est défini par les meme paramétre que l'individue @see Animal.</p>
 * 
 * @author Mélodia
 *
 */

public class Lynx extends Carnivore {
	
	/**
	 * Constructeur de l'espece Lynx
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
		super("Lynx", posx, posy, sexe, age, 7*365,25, 3 ,6*365,date_naissance,60);
		
		
	}

}
