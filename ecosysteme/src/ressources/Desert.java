package ressources;

import individus.Animal;


/**
 * <b> Il s'agir de l'etat dans lequel se trouve une ressource lorsqu'elle est �puis�.</b>
 * <p> Ce type est definie avec des variable similaire � @see Ressource mais poss�de cette varible en plus:</p>
 * <ul>
 * <li> Une varaible boolean indiquant s'il y a pr�sence d'un individu mort. True si pr�sent sinon false. Par d�fault la varible est initialis� a false.</li>
 * </ul>
 * 
 * 
 * @author Augustin
 *
 */
public class Desert extends Ressource{
	
	/**
	 * Presence d'un idividue true sinon false
	 */
	public boolean individuMort;
	
	/**
	 * Constructeur du type Desert.
	 * 
	 * @param posx
	 * 			Position en X non modifiable.
	 * @param posy
	 * 			Position en Y non modifiable.
	 */

	
	public Desert(int posx, int posy) {
		super("Desert","desert",posx, posy, "marron clair", 0);

	
		
		this.posx = posx;
		this.posy = posy;
		this.individuMort = false;
		this.estVivant=false;
		
	}
	
	/**
	 * Indique si le type Desert peut �tre change.
	 * 
	 * @param A
	 * 			varaible de type Animal se trouvant � la meme position que le desert.
	 * 
	 * @return Un boolean true si le type Desert peut etre chang� false sinon.
	 */
	public boolean r�g�n�rationPossible(Animal A) {
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