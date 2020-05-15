package ressources;

/**
 * <b> Ressource de type Vegetaux  et de sous-type Herbe qui peut être mangée par les herbivores.</b>
 * <p> Lorsque la quantité de ressource disponible tombe à zero le type change en Desert.</p>
 * <p> Pour les variables définissant ce type voir @see Ressource </p>
 * 
 * 
 * @author Mélodia
 *
 */

public class Herbe extends Vegetaux{
	/**
	 * Constructeur du sous-type Herbe.
	 * 
	 * @param posx
	 * 			Position en X. Non modifiable.
	 * @param posy
	 * 			Position en Y. Non modifiable.
	 * @param couleur
	 * 			Couleur du sous-type induite selon la quantité de ressource.
	 * @param quantiteRessource
	 * 			Quantité de ressource accessible pour les individus.
	 * 
	 * 
	 */
	
	public Herbe (int posx, int posy, int quantiteRessource) {
		
		super("Herbe",posx,posy,"vert clair", quantiteRessource);
	}

}
