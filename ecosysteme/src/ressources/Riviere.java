package ressources;

/**
 *<b> Ressource de type Eau  et de sous-type Riviere pouvant etre bu par les individus.</b>
 * <p> Lorsque la quantit� de ressource disponible tombe � zero le type change en Desert.</p>
 * <p> Pour les variables d�finissant ce type voir @see Ressource </p>
 * 
 * @author M�lodia
 *
 */

public class Riviere extends Eau{
	
	/**
	 * Constructeur du sous-type riviere.
	 * 
	 * @param posx
	 * 			Position en X non modifiable.
	 * @param posy
	 * 			Position en Y non modifiable.
	 * @param couleur
	 * @param quantiteRessource
	 * 			Quantite de ressource accessible.
	 */
	
	public Riviere (int posx, int posy,String couleur, int quantiteRessource) {
		
		super("Riviere",posx,posy,"bleu fonce", quantiteRessource);
	}
		
		
	

}
