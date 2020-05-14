package ressources;

import individus.Animal;


/**
 * <b> Il s'agit de l'�tat dans lequel se trouve une ressource lorsqu'elle est �puis�.</b>
 * <p> Ce type est d�fini avec des variables similaires � @see Ressource mais poss�de cette variable en plus:</p>
 * <ul>
 * <li> Une variable boolean indiquant s'il y a pr�sence d'un individu mort. True si pr�sent sinon false. Par d�faut la variable est initialis�e � false.</li>
 * </ul>
 * 
 * 
 * @author Augustin
 *
 */
public class Desert extends Ressource{
	
	/**
	 * Pr�sence d'un individu true sinon false
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
	 * Indique si le type Desert peut �tre chang�.
	 * 
	 * @param A
	 * 			variable de type Animal se trouvant � la m�me position que le desert.
	 * 
	 * @return Un boolean true si le type Desert peut �tre chang� false sinon.
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