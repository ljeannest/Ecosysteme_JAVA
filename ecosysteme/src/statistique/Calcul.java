package statistique;

import java.util.ArrayList;

import individus.*;

/**
 * <b>Permet de calculer les donn�es de la simulation</b>
 * <p> les donnes suivantes suivantes seront n�cessaire.</P>
 * <ul>
 * <li>les donnes des individus mort et vivant � la fin de la simultation</li>
 * </ul>
 * 
 * 
 * @author M�lodia
 *
 */

public class Calcul {
	
	/**
	 * Liste contenant les donn�es des individus vivant � la fin de la simulation.
	 */
	ArrayList<Animal> individus;
	
	/**
	 * Liste contenant les donn�es des individus mort � la fin de la simulation.
	 */
	ArrayList<Animal> individus_morts;
	
	/**
	 * Constructeur de la classe Calcul
	 * 
	 * @param individus
	 * 			Array liste de type animal.
	 * @param individus_morts
	 * 			Array liste de type animal.
	 */
	
	public Calcul(ArrayList<Animal> individus, ArrayList<Animal> individus_morts) {
		
		
		this.individus = individus;
		this.individus_morts = individus_morts;
	}
	
	/**
	 * Permet de compter le nombre d'individus par espece pr�sent durant toute la simulation.
	 */
	public compteurNbIndividus() {
		
		
	}
	
	

}
