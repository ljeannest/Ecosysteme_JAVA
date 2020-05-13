package ressources;

/**
 *<b> Ressource de type Vegetaux  et de sous-type Arbre pouvant etre manger par certains herbivores.</b>
 * <p> Lorsque la quantité de ressource disponible tombe à zero le type change en Desert.</p>
 * <p> Pour les variables définissant ce type voir @see Ressource </p>
 * <p> la variable quantite est par défault à zero pour le moment.</p>
 * 
 * @author Mélodia
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
		
		super("Arbre",posx,posy,"vert fonce", 0);//quantité ressource de 0 car ce n'est pas comestible
	
	}
	
}
	
	


