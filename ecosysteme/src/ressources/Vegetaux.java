package ressources;

/**
 * <b> Ressource de type Vegetaux qui peuvent etre manger par les herbivores selon son sous type.</b>
 * <p> Pour les variables définissant se type voir @see Ressource </p>
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
	 * 			Position en y.
	 * @param couleur
	 * 			Couleur associé selon le sous-type.
	 * @param quantiteRessource
	 * 			Quantite de ressource accessible par un individus.
	 */
	public Vegetaux(String sous_type,int posx, int posy,String couleur, int quantiteRessource) {
		super("Vegetaux",sous_type,posx, posy,  couleur, quantiteRessource);


	}




}
