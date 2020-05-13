package ressources;

/**
 * <b> Ressource de type Vegetaux  et de sous-type Herbe qui peuvant etre manger par les herbivores.</b>
 * <p> Lorsque la quantit� de ressource dispo tombe � zero le type change en Desert.</p>
 * <p> Pour les variables d�finissant se type voir @see Ressource </p>
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
	 * 			Position en X non modifiable.
	 * @param posy
	 * 			Position en Y non modifiable.
	 * @param couleur
	 * 			Couleur du sous-type induit selon la quantit� de ressource.
	 * @param quantiteRessource
	 * 			Quantit� de ressource absorbable par un individus.
	 * 
	 * 
	 */
	
	public Herbe (int posx, int posy,String couleur, int quantiteRessource) {
		
		super("Herbe",posx,posy,"vert clair", quantiteRessource);
	}

}
