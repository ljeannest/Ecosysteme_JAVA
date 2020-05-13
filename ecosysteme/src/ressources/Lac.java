package ressources;

/**
 *<b> Ressource de type Eau  et de sous-type Lac pouvant etre bu par les individus.</b>
 * <p> Lorsque la quantité de ressource disponible tombe à zero le type change en Desert.</p>
 * <p> Pour les variables définissant ce type voir @see Ressource </p>
 * 
 * @author Mélodia
 *
 */

public class Lac extends Eau{
	
	/**
	 * Constructeur du sous-type Lac.
	 * 
	 * @param posx
	 * 			Position en X non modifiable.
	 * @param posy
	 * 			Position en Y non modifiable.
	 * @param quantiteRessource
	 * 			Quantite de ressource accessible.
	 */
	
	public Lac (int posx, int posy, int quantiteRessource) {
		
		super("Lac",posx,posy,"bleu fonce", quantiteRessource);
	}
		
		
		
	}


