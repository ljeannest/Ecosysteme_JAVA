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
	 * @return 
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant le nombre d'individus pr�sent lors de toute la simulation: Herbivore, Carnivore, Charognard.
	 */
	public int[] compteurNbIndividus() {

		int [] nbIndividus = new int [3];
		for(int i=0; i<individus.size(); i++) {

			if (individus.get(i).type==0) {

				nbIndividus[0]+=1;

			}
			else if (individus.get(i).type==1) {

				nbIndividus[1]+=1;

			}
			else {
				nbIndividus[2]+=1;
			}
		}
		for(int j=0; j<individus_morts.size();j++) {
			
			if(individus_morts.get(j).type==0) {
				
				nbIndividus[0]+=1;
			}
			
			else if (individus_morts.get(j).type==1) {
				
				nbIndividus[1]+=1;
				
			}
			
			else {
				
				nbIndividus[2]+=1;
				
			}
		
		}
		return nbIndividus;

		}




}
