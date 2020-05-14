package ressources;

/**
 *<b> Ressource de type Eau  et de sous-type Lac qui peut �tre bue par les individus.</b>
 * <p> Lorsque la quantit� de ressource disponible tombe � zero le type change en Desert.</p>
 * <p> Pour les variables d�finissant ce type voir @see Ressource </p>
 * 
 * @author M�lodia
 *
 */

public class Lac extends Eau{
	
	/**
	 * Constructeur du sous-type Lac.
	 * 
	 * @param posx
	 * 			Position en X. Non modifiable.
	 * @param posy
	 * 			Position en Y. Non modifiable.
	 * @param quantiteRessource
	 * 			Quantite de ressource accessible pour les individus.
	 */
	
	public Lac (int posx, int posy, int quantiteRessource) {
		
		super("Lac",posx,posy,"bleu fonce", quantiteRessource);
	}
		
		
		
	}


