package ressources;

/**
 * <b> Ressource de type Eau et de sous-type flaque qui peuvant etre bu par touts le sindividus de l'ecosystme.</b>
 * <p> Son niveau de ressource disponible �tant limit�.</p>
 * <p> Pour les variables d�finissant se type voir @see Ressource </p>
 * 
 * 
 * @author M�lodia
 *
 */


public class Flaque extends Eau{
	
	/**
	 * Constructeur du sous-type Flaque.
	 * 
	 * @param posx
	 * 			Position en X. Non modifiable.
	 * @param posy
	 * 			Position en Y. Non modifiable.
	 * @param couleur
	 * 			Couleur non modifiable.
	 * @param quantiteRessource
	 * 			Quantit� de ressource accessible par les individus.
	 */

	
	public Flaque (int posx, int posy,String couleur, int quantiteRessource) {
		
		super("Flaque",posx,posy,"bleu clair", quantiteRessource);
	}
}
