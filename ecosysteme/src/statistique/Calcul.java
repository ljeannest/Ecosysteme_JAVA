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
	 * @return 
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant le nombre d'individus présent lors de toute la simulation: Herbivore, Carnivore, Charognard.
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
	
	/**
	 * Permet de compter le nombre d'individus par espéce vivant à la fin de la simulation.
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant le nombre d'individus présent à la fin de la simulation: Herbivore, Carnivore, Charognard.
	 */
	public int[] compteurNbIndividusFin(){
		
		int [] nbIndividusFin = new int[3];
		
		for(int i=0; i<individus.size(); i++) {
			
			if(individus.get(i).type==0) {
				
				nbIndividusFin[0]+=1;
				
			}
			else if(individus.get(i).type==1) {
				
				nbIndividusFin[1]+=1;
			}
			else {
				nbIndividusFin[2]+=1;
			}
		}
		return nbIndividusFin;
	}
	
	public int[] MoyenneAgeParEsp() {
		
		int [] moyenAgeParEspece = new int [3];
		int compteurType0 = 0;
		int compteurType1 = 0;
		int compteurType2 = 0;
		
		for(int i=0; i<individus.size(); i++) {
			
			if(individus.get(i).type==0) {
				
				moyenAgeParEspece[0]+=individus.get(i).age;
				compteurType0+=1;
				
			}
			else if(individus.get(i).type==1) {
				
				moyenAgeParEspece[1]+=individus.get(i).age;
				compteurType1+=1;
			}
			else {
				
				moyenAgeParEspece[2]+=individus.get(i).age;
				compteurType2+=1;
			}
			
		}
		if(compteurType0>0) {
			
			moyenAgeParEspece[0]=moyenAgeParEspece[0]/compteurType0;
			
		}
		if(compteurType1>0) {
			
			moyenAgeParEspece[1]=moyenAgeParEspece[1]/compteurType1;
			
		}
		
		if (compteurType2>0) {
			moyenAgeParEspece[2]=moyenAgeParEspece[2]/compteurType2;
			
		}
		
		return moyenAgeParEspece;
		
	}
	
	public int [] MoyenAgeALaMort () {
		
		int [] moyenAgeALaMort = new int [3];
		int compteurType0 = 0;
		int compteurType1 = 0;
		int compteurType2 = 0;
		
		for(int i=0; i<individus_morts.size();i++) {
			
			if(individus_morts.get(i).type == 0) {
				
				compteurType0+=1;
				moyenAgeALaMort[0]+=individus_morts.get(i).age;
			}
			else if(individus_morts.get(i).type == 1) {
				
				compteurType1+=1;
				moyenAgeALaMort[1]+=individus_morts.get(i).age;
			}
			
			else {
				
					compteurType2+=1;
					moyenAgeALaMort[2]+=individus_morts.get(i).age;
			}
		}
		
		if (compteurType0>0) {
			moyenAgeALaMort[0]=moyenAgeALaMort[0]/compteurType0;
		}
		
		if(compteurType1>0) {
			moyenAgeALaMort[1]=moyenAgeALaMort[1]/compteurType1;
		}
		
		if(compteurType2>0) {
			moyenAgeALaMort[2]=moyenAgeALaMort[2]/compteurType2;
		}
		
		return moyenAgeALaMort;
	}

	public String CauseFinSimul() {
		
		String causeFinSimul;
		if(individus.size()==0) {
			
			causeFinSimul = "La simulation a pris fain car tous les individus de l'ecosystems sont mort.";
			
		}
		else {
			causeFinSimul = "La durée de simulation entré en paramétre de début a été atteinte.";
		}
		
		return causeFinSimul;
		
	}


}
