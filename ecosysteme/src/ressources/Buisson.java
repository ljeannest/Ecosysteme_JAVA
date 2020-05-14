
package ressources;
/**
 * <b> Ressource de type Vegetaux qui peut �tre mang�e par les herbivores selon son sous-type mais aussi si il est fruitier.</b>
 * <p> 
 * Les caract�ristiques sont dans l'ensemble semblables � celle d�finissant Ressource mais avec cette variable en suppl�ment:</p>
 * <ul>
 * <li> Un buisson peut �tre fruitier si le boolean l'indiquant a pour valeur true.</li>
 * </ul>
 * 
 * 
 * @author M�lodia
 *
 */
public class Buisson extends Vegetaux {
	
	//int dimension;
	/**
	 * Boolean indiquant par true si le buisson est fruitier, false sinon.
	 */
	boolean fruitier;
	
	/**
	 * Constructeur du sous-type buisson.
	 * 
	 * @param posx
	 * 			Position en X. Non modifiable.
	 * @param posy
	 * 			Position en Y. Non modifiable
	 * @param couleur
	 * 			Couleur du buisson. Non modifiable.
	 * @param quantiteRessource
	 * 			Quantit� de ressources accessibles pour les individus.
	 */
	
	public Buisson (int posx, int posy,String couleur, int quantiteRessource) {
		
		super("Buisson",posx,posy,"vert clair", 0);
	
		
		//this.dimension = dimension;
		this.fruitier= true;
	}

}
