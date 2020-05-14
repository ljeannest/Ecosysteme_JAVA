package ressources;

/**
 * <b> Ressource de type Eau qui peut �tre bue par tous les individus composant l'�cosyt�me.</b>
 * <p> Pour les variables d�finissant ce type voir @see Ressource </p>
 * 
 * 
 * @author M�lodia
 *
 */

public class Eau extends Ressource{
	
	/**
	 * Constructeur du type Eau.
	 * 
	 * @param sous_type
	 * 			Sous-type. Non modifiable.
	 * @param posx
	 * 			Position en X. Non modifiable.
	 * @param posy
	 * 			Position en Y. Non modifiable.
	 * @param couleur
	 * 			Couleur selon le sous-type. Non modifiable.
	 * @param quantiteRessource
	 * 			Quantite de Ressouce accessible pour les individus.
	 */
	
	
	
	
	public Eau(String sous_type,int posx, int posy,String couleur, int quantiteRessource) {
		super("Eau",sous_type,posx, posy,  couleur, quantiteRessource);
	
		
		}
	
	


}
