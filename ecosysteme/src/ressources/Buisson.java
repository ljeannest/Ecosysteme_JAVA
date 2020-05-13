
package ressources;
/**
 * <b> Ressource de type Vegetaux qui peuvent etre manger par les herbivores selon son sous type mais aussi si'il est fruitier.</b>
 * <p> 
 * Les caractéristiques sont dans l'ensemble semblable a celle définissant Ressource avec cette varibles suplémentaire:</p>
 * <ul>
 * <li> Un buisson peut etre fruitier si le boolean l'indiquant a pour valeur true</li>
 * </ul>
 * 
 * 
 * @author Mélodia
 *
 */
public class Buisson extends Vegetaux {
	
	//int dimension;
	/**
	 * Boolean indiquant par true si le buisson est fruitier, false sinon.
	 */
	boolean fruitier;
	
	/**
	 * Constructeur du sous-type buisson
	 * 
	 * @param posx
	 * 			Position en X non modifiable.
	 * @param posy
	 * 			Position en Y non modifiable
	 * @param couleur
	 * 			Couleur du buisson non modifiable.
	 * @param quantiteRessource
	 * 			quantite de ressource accessible our les individus.
	 */
	
	public Buisson (int posx, int posy,String couleur, int quantiteRessource) {
		
		super("Buisson",posx,posy,"vert clair", quantiteRessource);
	
		
		//this.dimension = dimension;
		this.fruitier= true;
	}

}
