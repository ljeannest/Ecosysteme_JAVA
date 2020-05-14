package ressources;

import individus.Animal;


/**
 * <b> Il s'agit de l'état dans lequel se trouve une ressource lorsqu'elle est épuisé.</b>
 * <p> Ce type est défini avec des variables similaires à @see Ressource mais possède cette variable en plus:</p>
 * <ul>
 * <li> Une variable boolean indiquant s'il y a présence d'un individu mort. True si présent sinon false. Par défaut la variable est initialisée à false.</li>
 * </ul>
 * 
 * 
 * @author Augustin
 *
 */
public class Desert extends Ressource{
	
	/**
	 * Présence d'un individu true sinon false
	 */
	public boolean individuMort;
	
	/**
	 * Constructeur du type Desert.
	 * 
	 * @param posx
	 * 			Position en X. Non modifiable.
	 * @param posy
	 * 			Position en Y. Non modifiable.
	 */

	
	public Desert(int posx, int posy) {
		super("Desert","desert",posx, posy, "marron clair", 0);

	
		
		this.posx = posx;
		this.posy = posy;
		this.individuMort = false;
		this.estVivant=false;
		
	}
	
	/**
	 * Indique si le type Desert peut être changé.
	 * 
	 * @param A
	 * 			variable de type Animal se trouvant à la même position que le desert.
	 * 
	 * @return Un boolean true si le type Desert peut être changé false sinon.
	 */
	public boolean régénérationPossible(Animal A) {
		 if (this.posx == A.posx) {
			 if (this.posy == A.posy) {
				 if (A.est_vivant == false) {
					 this.individuMort = true;
				 }
			 }
		 }
		 else {
			 this.individuMort = false;
		 }
		 
		 return individuMort;
		 
	}
}