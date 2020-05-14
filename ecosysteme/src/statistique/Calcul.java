package statistique;

import java.util.ArrayList;

import individus.*;

/**
 * <b>Permet de calculer les données de la simulation</b>
 * <p> les donnes suivantes suivantes seront nécessaire.</P>
 * <ul>
 * <li>les donnes des individus mort et vivant à la fin de la simultation</li>
 * </ul>
 * 
 * 
 * @author Mélodia
 *
 */

public class Calcul {
	
	/**
	 * Liste contenant les données des individus vivant à la fin de la simulation.
	 */
	ArrayList<Animal> individus;
	
	/**
	 * Liste contenant les données des individus mort à la fin de la simulation.
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
	 * Permet de compter le nombre d'individus par espece présent durant toute la simulation.
	 */
	public compteurNbIndividus() {
		
		
	}
	
	

}
