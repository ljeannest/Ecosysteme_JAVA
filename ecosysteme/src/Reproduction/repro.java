package Reproduction;



import individus.*; 
import ressources.Ressource;
import ressources.Vegetaux;
import java.lang.*;
import java.util.ArrayList;

import affichage.ConteneurFenetre;

/**
 * <b> Cette classe regroupe les méthodes nécessaires à la reproduction de deux individus de type Animal.</b>
 * <p> Cette classe n'as pas besoin de variable pour se définir il s'agit d'un regroupement de méthodes interagissant entre elles.</b>
 *
 * @author Mélodia
 *
 */

public class repro {
	
	
	/**
	 * Permet de tester les emplacements autour de les emplacements de la mère pour trouver un emplacement vide.
	 * @param posx
	 * 		Position en X de la mère.
	 * @param posy
	 * 		Position en Y de la mère.
	 * @param A
	 * 		Liste de type Animal regroupant tous les individus de l'écosystème.
	 * @param tableauRessource
	 * 		Tableau de type Ressource regroupant toutes les ressources de l'écosystème.
	 * 
	 * @return Une contenant la position du futur animal s'il n'en existe pas la liste {-1,-1} est renvoyée.
	 */
	
	public static int [] vérificationNouvellePlace(int posx, int posy,ArrayList<Animal> A,Ressource[] ressource) {
		// on vérifie avec cette fonction que le nouveau né peut être placé prés de sa mére
		
		int posX;
		int posY;
		
		if (Animal.pos_libre(A, ressource,-1,posx+1, posy)==true && posx+1<ConteneurFenetre.NB_LIGNES) {
			posX = posx+1;
			posY = posy;
		}
		else if (Animal.pos_libre(A,  ressource, -1, posx-1, posy)==true && posx>0) {
			posX = posx-1;
			posY = posy;
		}
		else if(Animal.pos_libre(A,  ressource, -1, posx, posy+1)==true && posy+1<ConteneurFenetre.NB_COLONNES) {
			posX = posx;
			posY = posy+1;
		}
		else if(Animal.pos_libre(A,  ressource, -1, posx, posy-1)==true && posy>0) {
			posX = posx;
			posY = posy-1;
		}
		else {
			posX=0;
			posY=0;
		}
		
		int positionNaissance[]= {posX,posY};

		return positionNaissance;
	}

	/**
	 * Permet de créer l'individu issue de l'accouplement de deux Animaux et de l'ajouter à la liste d'animaux.
	 * 
	 * @param A1
	 * 			Animal 1.
	 * @param A2
	 * 			Animal 2.
	 * @param A
	 * 			List de type Animal regroupant les animaux de l'écosystème. 
	 * @param tableauRessource
	 * 			Tableau regroupant les ressources de l'écosytème.
	 * 
	 */

	public static void creationNouvelIndividu(Animal A1, ArrayList<Animal> A, Ressource[] ressource,int duree_ecoulee) {

		String sexe;

		if (Math.random()<0.5) {// choix du sexe aléatoire avec une chance sur deux

			sexe = "F";

		}
		else {
			sexe = "M";

		}

		int positionNaissance[];
		// on crée les coordonné du nouvel animal qu'on place auprés de sa mére par défault
		positionNaissance = vérificationNouvellePlace(A1.posx, A1.posy,A,ressource);
		
		
		if(A1.espece=="Lievre") {
			Animal A3= new Lievre(positionNaissance[0], positionNaissance[1], sexe, 0, duree_ecoulee);
			if (A3.posx==0 && A3.posy==0) {
				A3.deplacementAleatoire(A, ressource, -1, ConteneurFenetre.NB_LIGNES, ConteneurFenetre.NB_COLONNES);
			}
			A.add(A3);
		}
		
		else if(A1.espece=="Lynx") {
			Animal A3= new Lynx(positionNaissance[0], positionNaissance[1], sexe, 0, duree_ecoulee);
			A.add(A3);
		}
		
		else if(A1.espece=="Vautour") {
			Animal A3= new Vautour(positionNaissance[0], positionNaissance[1], sexe, 0, duree_ecoulee);
			A.add(A3);
		}
		
	}






}
