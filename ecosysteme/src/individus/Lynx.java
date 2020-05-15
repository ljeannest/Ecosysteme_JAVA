package individus;

/**
 * <b> Individu Animal de type Carnivore et d'espèce Lynx.</b>
 * <p> Cet individu est défini par les mêmes paramètres que l'individu @see Animal.</p>
 * 
 * @author Mélodia
 *
 */

public class Lynx extends Carnivore {
	
	/**
	 * Constructeur de l'espèce Lynx
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
