package Reproduction;



import individus.Animal;

import ressources.Vegetaux;
import java.lang.Math;
import java.util.ArrayList;

/**
 * <b>Cette classe regroupe les methodes n�cessaire � la reproduction de deux aindividus de type Animal.</b>
 * <p> cette classe n'as pas besoin de variables pour la d�finir il s'agit d'un regroupemetn de methodes interagissant entre elle.</b>
 *
 * @author M�lodia
 *
 */

public class repro {
	
	/**
	 * Permet de v�rifier qu'un eplacement existe au pr�s de la mere.
	 * 
	 * @param posx
	 * 			Position en X � v�rifier.
	 * @param posy
	 * 			Position en Y � v�rifier.
	 * @param A
	 * 			Liste de type Animal regroupant de tous les animaux pr�sent dans l'�cosyst�me.
	 * @param tableauRessource
	 * 			Tableau de type Ressource regroupant toute les ressources pr�sentent dans l'ecosysteme.
	 * 
	 * @return Un boolean true si l'emplacement est vide sinon false.
	 */

	public static boolean placeVide(int posx, int posy, ArrayList<Animal> A, Vegetaux tableauRessource[]){

		boolean placeLibre = true;

		for(int i = 0; i < A.size(); i++) {

			if (A.get(i).posx == posx && A.get(i).posy == posy) {

				placeLibre=false;

			}
		}
		if (placeLibre == true) {
			for(int j = 0; j< tableauRessource.length; j++) {

				if(tableauRessource[j].couleur=="marron") {

					if (tableauRessource[j].posx==posx && tableauRessource[j].posy==posx) {

						placeLibre = false;

					}
				}
				else if(tableauRessource[j].couleur=="vert fonce") {

					if (tableauRessource[j].posx==posx && tableauRessource[j].posy==posx) {
						placeLibre = false;
					}
				}
				else {
				}

			}
		}
			
			return placeLibre;
	}
	
	
	/**
	 * Peremet de tester les emplacement autour de les emplacements de la mere pour trouver un emplacement vide.
	 * @param posx
	 * 		Postion en X de la mere.
	 * @param posy
	 * 		Position en Y de la mere
	 * @param A
	 * 		Liste de type Animal regroupant tous les individus de l'ecosysteme.
	 * @param tableauRessource
	 * 		Tableau de type Ressource regroupant toutes les ressources de l'ecosysteme.
	 * 
	 * @return Une contenant la position du futur animal s'il n'en existe pas la liste {-1,-1} est renvoy�.
	 */
	
	public static int [] v�rificationNouvellePlace(int posx, int posy,ArrayList<Animal> A,Vegetaux tableauRessource[]) {
		// on v�rifie avec cette fonction que le nouveau n� peut �tre plac� pr�s de sa m�re
		
		int posX;
		int posY;
		
		if (placeVide(posx+1, posy,A,tableauRessource)==true) {
			posX = posx+1;
			posY = posy;
		}
		else if (placeVide(posx-1,posy,A,tableauRessource)==true) {
			posX = posx-1;
			posY = posy;
		}
		else if(placeVide(posx,posy+1,A,tableauRessource)==true) {
			posX = posx+1;
			posY = posy;
		}
		else if(placeVide(posx,posy-1,A,tableauRessource)==true) {
			posX = posx+1;
			posY = posy;
		}
		else {
			posX=-1;
			posY=-1;
		}
		
		int positionNaissance[]= {posX,posY};

		return positionNaissance;
	}

	/**
	 * Peremet de cr�er l'individue issue de l'accouplement de deux Animaux et de l'ajouter � la liste d'animaux.
	 * 
	 * @param A1
	 * 			Animal 1.
	 * @param A2
	 * 			Animal 2.
	 * @param A
	 * 			List de type Animal regroupant les animaux de l'ecosysteme. 
	 * @param tableauRessource
	 * 			Tableau regroupant les ressources de l'ecosyteme.
	 * 
	 */

	public static void cr�ationNouvelIndividu(Animal A1, Animal A2, ArrayList<Animal> A, Vegetaux tableauRessource[]) {

		String sexe;

		if (Math.random()<0.5) {// choix du sexe al�atoire avec une chance sur deux

			sexe = "F";

		}
		else {
			sexe = "M";

		}

		int positionNaissance[];
		// on cr�e les coordonn� du nouvel animal qu'on place aupr�s de sa m�re par d�fault
		if(A1.sexe == "F") {
			positionNaissance = v�rificationNouvellePlace(A1.posx, A1.posy,A,tableauRessource);
		}
		else {
			positionNaissance = v�rificationNouvellePlace(A2.posx, A2.posy,A,tableauRessource);
		}

		Animal A3= new Animal(A1.espece, A1.type, positionNaissance[0], positionNaissance[1], sexe, 0, A1.esp_de_vie, 100, 100, A1.qte_viande, A1.ageReproMin, A2.ageReproMax );
		
		A.add(A3);
	}






}
