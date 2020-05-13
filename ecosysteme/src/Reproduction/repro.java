package Reproduction;



import individus.Animal;

import ressources.Vegetaux;
import java.lang.Math;
import java.util.ArrayList;

/**
 * <b>Cette classe regroupe les methodes nécessaire à la reproduction de deux aindividus de type Animal.</b>
 * <p> cette classe n'as pas besoin de variables pour la définir il s'agit d'un regroupemetn de methodes interagissant entre elle.</b>
 *
 * @author Mélodia
 *
 */

public class repro {
	
	/**
	 * Permet de vérifier qu'un eplacement existe au prés de la mere.
	 * 
	 * @param posx
	 * 			Position en X à vérifier.
	 * @param posy
	 * 			Position en Y à vérifier.
	 * @param A
	 * 			Liste de type Animal regroupant de tous les animaux présent dans l'écosystéme.
	 * @param tableauRessource
	 * 			Tableau de type Ressource regroupant toute les ressources présentent dans l'ecosysteme.
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
	 * @return Une contenant la position du futur animal s'il n'en existe pas la liste {-1,-1} est renvoyé.
	 */
	
	public static int [] vérificationNouvellePlace(int posx, int posy,ArrayList<Animal> A,Vegetaux tableauRessource[]) {
		// on vérifie avec cette fonction que le nouveau né peut être placé prés de sa mére
		
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
	 * Peremet de créer l'individue issue de l'accouplement de deux Animaux et de l'ajouter à la liste d'animaux.
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

	public static void créationNouvelIndividu(Animal A1, Animal A2, ArrayList<Animal> A, Vegetaux tableauRessource[]) {

		String sexe;

		if (Math.random()<0.5) {// choix du sexe aléatoire avec une chance sur deux

			sexe = "F";

		}
		else {
			sexe = "M";

		}

		int positionNaissance[];
		// on crée les coordonné du nouvel animal qu'on place auprés de sa mére par défault
		if(A1.sexe == "F") {
			positionNaissance = vérificationNouvellePlace(A1.posx, A1.posy,A,tableauRessource);
		}
		else {
			positionNaissance = vérificationNouvellePlace(A2.posx, A2.posy,A,tableauRessource);
		}

		Animal A3= new Animal(A1.espece, A1.type, positionNaissance[0], positionNaissance[1], sexe, 0, A1.esp_de_vie, 100, 100, A1.qte_viande, A1.ageReproMin, A2.ageReproMax );
		
		A.add(A3);
	}






}
