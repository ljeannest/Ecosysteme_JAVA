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
	 * Dur�e de la simulation pr�ciser au lancement de la simulation.
	 */

	int dureeSimulPara;

	/**
	 * Dur�e r�elle de la simulation.
	 */

	int dureeSimulReel;
	
	/**
	 * nombre d'individu par esp�ce au d�but de la simulation.
	 */
	int [] nbIndividuDebut = new int [3];
	

	/**
	 * Constructeur de la classe Calcul
	 * 
	 * @param individus
	 * 			Array liste de type animal.
	 * @param individus_morts
	 * 			Array liste de type animal.
	 */

	public Calcul(ArrayList<Animal> individus, ArrayList<Animal> individus_morts,int dureeSimulPara, int dureeSimulReel, int [] nbIndividuDebut) {


		this.individus = individus;
		this.individus_morts = individus_morts;
		this.dureeSimulPara = dureeSimulPara;
		this.dureeSimulReel = dureeSimulReel;
		this.nbIndividuDebut = nbIndividuDebut;
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

	/**
	 * Permet de compter le nombre d'individus par esp�ce vivant � la fin de la simulation.
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant le nombre d'individus pr�sent � la fin de la simulation: Herbivore, Carnivore, Charognard.
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
	/**
	 * Permet de calculer l'age moyen des populations � la fin de la simulation.
	 * @return Une liste de type int contenant dans l'ordre suivant la moyenne d'age � la fin de la simulation: Herbivore, Carnivore, Charognard.
	 */
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
	/**
	 * Permet de calculer l'age moyen des individus morts.
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant l'age moyend des individus mort: Herbivore, Carnivore, Charognard.
	 */

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

	/**
	 * Permet de d�terminer la cause de la fin de la simulation.
	 * 
	 * @return Une phrase indiquant la raison de fin de la simulation.
	 */
	public String CauseFinSimul() {

		String causeFinSimul;
		if(individus.size()==0) {

			causeFinSimul = "La simulation a pris fain car tous les individus de l'ecosystems sont mort.";

		}
		else if(dureeSimulPara==dureeSimulReel){
			causeFinSimul = "La dur�e de simulation entr� en param�tre de d�but a �t� atteinte.";
		}
		else {
			causeFinSimul = "L'utilisateur a demander la fin de simulation.";
		}

		return causeFinSimul;

	}
	/**
	 * Permet de d�terminer le temps �coul�e en ann�e mois et jours de la simulation.
	 * 
	 * @return Une phrase indiquant la dur�e de la simulation en ann�e mois jours.
	 */
	public String tSimulation() {

		int an = dureeSimulReel/365;
		int mois = (dureeSimulReel%365)/30;
		int jours = ((dureeSimulReel%365)%30);
		String tSimul="La simulation a dur�e " + an +" ans, " + mois + " mois et  " + jours + " jours.";

		return tSimul;
	}
	
	/**
	 * Permet de calculer nombre d'espece pr�sent � la fin de la simulation.
	 * 
	 * @return 
	 */
	public int nbEspeceFin() {
		
		int nbEspeceFinSimu = 0;
		int [] nbIndividusFin = compteurNbIndividus();
		
		if(individus.size()==0) {
			return nbEspeceFinSimu;
		}
		if(nbIndividusFin[0]>0) {
			nbEspeceFinSimu+=1;
		}
		
		if (nbIndividusFin[1]>0) {
			nbEspeceFinSimu+=1;
		}
		
		if(nbIndividusFin[2]>0) {
			nbEspeceFinSimu+=1;
		}
		
		return nbEspeceFinSimu;
	}
	
	/**
	 * Permet de donner le moyen de naissance par jour.
	 * 
	 * @return
	 */
	
	public double [] nbMoyenNaissance() {
		
		double []nbMoyenNaissance = new double [3];
		int [] nbTotalIndi = compteurNbIndividus();
		nbMoyenNaissance[0] = ((double) nbTotalIndi[0]- (double) nbIndividuDebut[0])/(double)dureeSimulReel;
		nbMoyenNaissance[1] = ((double)nbTotalIndi[1]- (double)nbIndividuDebut[1])/(double)dureeSimulReel;
		nbMoyenNaissance[2] = ((double)nbTotalIndi[2]- (double)nbIndividuDebut[2])/(double)dureeSimulReel;
		
		return nbMoyenNaissance;
		
	}
	/**
	 * 
	 * @return
	 */
	public int [] nbNaissance() {
		
		int [] nbNaissance = new int[3];
		int [] nbTotalIndi = compteurNbIndividus();
		nbNaissance[0] = nbTotalIndi[0]-nbIndividuDebut[0];
		nbNaissance[1] = nbTotalIndi[1]-nbIndividuDebut[1];
		nbNaissance[2] = nbTotalIndi[2]-nbIndividuDebut[2];
		
		return nbNaissance;
	}
	/**
	 * 
	 * @return
	 */
	public int [] nbMortNorm() {
		int [] nbMortNorm =new int [3];
		for(int i=0; i < individus.size(); i++) {
			if(individus.get(i).esp_de_vie==individus.get(i).age) {
				if(individus.get(i).type == 0) {
					nbMortNorm[0]+=1;
				}
				else if(individus.get(i).type == 1) {
					nbMortNorm[1]+=1;
				}
				
				else{
					nbMortNorm[2]+=1;
				}
			}
		}
		return nbMortNorm;
	}
	
	public int [] nbMortFaim(){
		
		int [] nbMortFaim = new int[3];
		for(int i=0; i < individus.size(); i++) {
			if(individus.get(i).jauge_nourriture==0) {
				if(individus.get(i).type == 0) {
					nbMortFaim[0]+=1;
				}
				else if(individus.get(i).type == 1) {
					nbMortFaim[1]+=1;
				}
				
				else{
					nbMortFaim[2]+=1;
				}
			}
		}
		return nbMortFaim;
		
	}


}
