package ressources;

/**
 * <b> Ressource de type Eau et de sous-type Flaque qui peut être bue par tous les individus de l'écosystème.</b>
 * <p> Son niveau de ressource disponible étant limité.</p>
 * <p> Pour les variables définissant ce type voir @see Ressource </p>
 * 
 * 
 * @author Mélodia
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
	 * 			Couleur. Non modifiable.
	 * @param quantiteRessource
	 * 			Quantité de ressource accessible pour les individus.
	 */

	
	public Flaque (int posx, int posy,String couleur, int quantiteRessource) {
		
		super("Flaque",posx,posy,"bleu clair", quantiteRessource);
	}
}
