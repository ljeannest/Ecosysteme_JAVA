package ressources;

/**
 * <b> Ressource de type Vegetaux  et de sous-type Herbe qui peut �tre mang�e par les herbivores.</b>
 * <p> Lorsque la quantit� de ressource disponible tombe � zero le type change en Desert.</p>
 * <p> Pour les variables d�finissant ce type voir @see Ressource </p>
 * 
 * 
 * @author M�lodia
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
	 * 			Couleur du sous-type induite selon la quantit� de ressource.
	 * @param quantiteRessource
	 * 			Quantit� de ressource accessible pour les individus.
	 * 
	 * 
	 */
	
	public Herbe (int posx, int posy, int quantiteRessource) {
		
		super("Herbe",posx,posy,"vert clair", quantiteRessource);
	}

}
