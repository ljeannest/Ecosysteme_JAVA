package ressources;

/**
 *<b> Ressource de type Vegetaux  et de sous-type Arbre pouvant �tre mang� par certains herbivores.</b>
 * <p> Lorsque la quantit� de ressources disponibles tombe � zero le type change en Desert.</p>
 * <p> Pour les variables d�finissant ce type voir @see Ressource </p>
 * <p> La variable quantite est par d�fault � zero pour le moment.</p>
 * 
 * @author M�lodia
 *
 */


public class Arbre extends Vegetaux{
	/**
	 * Constructeur du sous-type Arbre.
	 * 
	 * @param posx
	 * 			Position en X  non modifiable.
	 * @param posy
	 * 			Position en Y non modifiable.
	 */
	


	public Arbre (int posx, int posy) {
		
		super("Arbre",posx,posy,"vert fonce",0);
	}
	
}
	
	


