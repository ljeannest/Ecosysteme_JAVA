package ressources;

/**
 * <b> Ressource de type Vegetaux qui peut être mangée par les herbivores selon son sous type.</b>
 * <p> Pour les variables définissant ce type voir @see Ressource </p>
 * 
 * 
 * @author Mélodia
 *
 */

public class Vegetaux extends Ressource{
	
	/**
	 * Constructeur du type Vegetaux.
	 * 
	 * @param sous_type
	 * 			Sous-type(Herbe,Arbre,Buisson).
	 * @param posx
	 * 			Position en X.
	 * @param posy
	 * 			Position en Y.
	 * @param couleur
	 * 			Couleur associée selon le sous-type.
	 * @param quantiteRessource
	 * 			Quantite de ressource accessible pour un individus.
	 */
	public Vegetaux(String sous_type,int posx, int posy,String couleur, int quantiteRessource) {
		super("Vegetaux",sous_type,posx, posy,  couleur, quantiteRessource);


	}




}
