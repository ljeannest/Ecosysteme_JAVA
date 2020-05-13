package ressources;

/**
 *<b> Ressource de type Vegetaux  et de sous-type Arbre pouvant etre manger par certains herbivores.</b>
 * <p> Lorsque la quantit� de ressource disponible tombe � zero le type change en Desert.</p>
 * <p> Pour les variables d�finissant ce type voir @see Ressource </p>
 * <p> la variable quantite est par d�fault � zero pour le moment.</p>
 * 
 * @author M�lodia
 *
 */


public class Arbre extends Vegetaux{
	/**
	 * Constructeur du sous-type Arbre
	 * 
	 * @param posx
	 * 			Position en X  non modifiable.
	 * @param posy
	 * 			Position en Y non modifiable.
	 */
	


	public Arbre (int posx, int posy) {
		
		super("Arbre",posx,posy,"vert fonce", 0);//quantit� ressource de 0 car ce n'est pas comestible
	
	}
	
}
	
	


