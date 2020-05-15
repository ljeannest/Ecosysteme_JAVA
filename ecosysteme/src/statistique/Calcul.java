package statistique;

import java.util.ArrayList;

import individus.*;

/**
 * <b>Permet de calculer les données de la simulation</b>
 * <p> les données suivantes  seront nécessaires.</P>
 * <ul>
 * <li>les données des individus morts et vivants à la fin de la simulation</li>
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
	 * Durée de la simulation précisée au lancement de la simulation.
	 */

	int dureeSimulPara;

	/**
	 * Durée réelle de la simulation.
	 */

	int dureeSimulReel;

	/**
	 * nombre d'individus par espèces au début de la simulation.
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
	 * Permet de compter le nombre d'individus par espèce présents durant toute la simulation.
	 * @return 
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant le nombre d'individus présents lors de toute la simulation: Herbivore, Carnivore, Charognard.
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
	 * Permet de compter le nombre d'individus par espèce vivants à la fin de la simulation.
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant le nombre d'individus présents à la fin de la simulation: Herbivore, Carnivore, Charognard.
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
	 * Permet de calculer l'âge moyen des populations à la fin de la simulation.
	 * @return Une liste de type int contenant dans l'ordre suivant la moyenne d'âge à la fin de la simulation: Herbivore, Carnivore, Charognard.
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
	 * Permet de calculer l'âge moyen des individus morts.
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant l'âge moyen des individus morts: Herbivore, Carnivore, Charognard.
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
	 * Permet de déterminer la cause de la fin de la simulation.
	 * 
	 * @return Une phrase indiquant la raison de fin de la simulation.
	 */
	public String CauseFinSimul() {

		String causeFinSimul;
		if(individus.size()==0) {

			causeFinSimul = "La simulation a pris fin car tous les individus de l'écosystème sont morts.";

		}
		else if(dureeSimulPara==dureeSimulReel){
			causeFinSimul = "La durée de simulation entrée en paramètre de début a été atteinte.";
		}
		else {
			causeFinSimul = "L'utilisateur a demandé la fin de la simulation.";
		}

		return causeFinSimul;

	}
	/**
	 * Permet de déterminer le temps écoulée en année mois et jours de la simulation.
	 * 
	 * @return Une phrase indiquant la durée de la simulation en année mois jours.
	 */
	public String tSimulation() {
		
		if (dureeSimulReel>0) {
			

		int an = dureeSimulReel/365;
		int mois = (dureeSimulReel%365)/30;
		int jours = ((dureeSimulReel%365)%30);
		String tSimul="La simulation a duré " + an +" ans, " + mois + " mois et  " + jours + " jours.";

		return tSimul;
		}
		else {
			
			int an = dureeSimulPara;
			int mois = 0;
			int jours = 0;
			String tSimul="La simulation a duré " + an +" ans, " + mois + " mois et  " + jours + " jours.";

			return tSimul;
			
		}
	}
	
	public int nbEspeceDebut() {
		
		int nbEspeceDebut = 0;

		if(individus.size()==0) {
			return nbEspeceDebut;
		}
		if(nbIndividuDebut[0]>0) {
			nbEspeceDebut+=1;
		}

		if (nbIndividuDebut[1]>0) {
			nbEspeceDebut+=1;
		}

		if(nbIndividuDebut[2]>0) {
			nbEspeceDebut+=1;
		}

		return nbEspeceDebut;
		
	}
	/**
	 * Permet de calculer nombre d'espèces présentes à la fin de la simulation.
	 * 
	 * @return Le nombre d'espèces présentes à la fin de la simulation.
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
	 * Permet de donner la moyennne des naissances par jour et par espèce.
	 * 
	 * @return Une liste de type double contenant dans l'ordre suivant la moyenne des naissances par jour et par type: Herbivore, Carnivore, Charognard.
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
	 * Permet de retourner le nombre de naissance par espèce durant la simulation.
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant le nombre de naissances par espèces durant la simulation: Herbivore, Carnivore, Charognard.
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
	 * Permet de donner le nombre de morts dus à l'âge par espèce.
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant le nombre de mort de viellesse: Herbivore, Carnivore, Charognard.
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
	
	/**
	 * permet de retourner le nombre d'individus morts de faim par espèce.
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant le nombre d'individus mort de faim : Herbivore, Carnivore, Charognard.
	 */
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
	
	/**
	 * Permet de retourner le nombre d'individus mort de soif par espèce.
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant le nombre d'individus mort de soif par espèce: Herbivore, Carnivore, Charognard.
	 */

	public int [] nbMortSoif() {

		int [] nbMortSoif=new int [3];

		for(int i=0; i < individus.size(); i++) {

			if(individus.get(i).jauge_eau==0) {

				if(individus.get(i).type == 0) {

					nbMortSoif[0]+=1;
				}
				else if(individus.get(i).type == 1) {

					nbMortSoif[1]+=1;
				}

				else{
					nbMortSoif[2]+=1;
				}
			}
		}
		return nbMortSoif;

	}
	
	/**
	 * permet de donner le nombre de morts dus à la chasse par espèce.
	 * 
	 * @return Une liste de type int contenant dans l'ordre suivant le nombre de morts dus à la chasse par espèce: Herbivore, Carnivore, Charognard.
	 */
	public int [] nbMortChasse() {

		int [] nbMortChasse = new int [3];

		for(int i = 0; i > individus.size();i++) {
			if(individus.get(i).esp_de_vie < individus.get(i).age) {
				if(individus.get(i).jauge_nourriture > 0) {
					if(individus.get(i).jauge_eau > 0) {

						if(individus.get(i).type == 0) {

							nbMortChasse[0]+=1;
						}
						else if(individus.get(i).type == 1) {

							nbMortChasse[1]+=1;
						}

						else{
							nbMortChasse[2]+=1;
						}
					}
				}
			}
		}
		return nbMortChasse;
	}
	
	/**
	 * Donne le nombre moyen de petits par femelle selon l'espèce.
	 * 
	 * @return
	 */
	//public int [] nbMoyenPetit () {
		
	//}
	
	public int [] nbMort() {
		
		int [] nbMort = new int [3];
		int [] nbMortNorm = nbMortNorm();
		int [] nbMortFaim= nbMortFaim();
		int [] nbMortSoif = nbMortSoif();
		int [] nbMortChasse= nbMortChasse();
		
		nbMort[0]= nbMortNorm[0] + nbMortFaim[0] + nbMortSoif[0] + nbMortChasse[0];
		nbMort[1]= nbMortNorm[1] + nbMortFaim[1] + nbMortSoif[1] + nbMortChasse[1];
		nbMort[2]= nbMortNorm[2] + nbMortFaim[2] + nbMortSoif[2] + nbMortChasse[2];
		
		return nbMort;
	}
	
	

}
