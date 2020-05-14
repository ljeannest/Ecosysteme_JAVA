package ressources;

/**
 *<b> Ressource de type Eau  et de sous-type Riviere pouvant être bue par les individus.</b>
 * <p> Lorsque la quantité de ressource disponible tombe à zero le type change en Desert.</p>
 * <p> Pour les variables définissant ce type voir @see Ressource </p>
 * 
 * @author Mélodia
 *
 */

public class Riviere extends Eau{
	
	/**
	 * Constructeur du sous-type Riviere.
	 * 
	 * @param posx
	 * 			Position en X. Non modifiable.
	 * @param posy
	 * 			Position en Y. Non modifiable.
	 * @param couleur
	 * @param quantiteRessource
	 * 			Quantite de ressource accessible.
	 */
	
	public Riviere (int posx, int posy,String couleur, int quantiteRessource) {
		
		super("Riviere",posx,posy,"bleu fonce", quantiteRessource);
	}
		
		
	

}
