package Reproduction;



import individus.*; 
import ressources.Ressource;
import ressources.Vegetaux;
import java.lang.*;
import java.util.ArrayList;

import affichage.ConteneurFenetre;

/**
 * <b> Cette classe regroupe les m�thodes n�cessaires � la reproduction de deux individus de type Animal.</b>
 * <p> Cette classe n'as pas besoin de variable pour se d�finir il s'agit d'un regroupement de m�thodes interagissant entre elles.</b>
 *
 * @author M�lodia
 *
 */

public class repro {
	
	
	/**
	 * Permet de tester les emplacements autour de les emplacements de la m�re pour trouver un emplacement vide.
	 * @param posx
	 * 		Position en X de la m�re.
	 * @param posy
	 * 		Position en Y de la m�re.
	 * @param A
	 * 		Liste de type Animal regroupant tous les individus de l'�cosyst�me.
	 * @param tableauRessource
	 * 		Tableau de type Ressource regroupant toutes les ressources de l'�cosyst�me.
	 * 
	 * @return Une contenant la position du futur animal s'il n'en existe pas la liste {-1,-1} est renvoy�e.
	 */
	
	public static int [] v�rificationNouvellePlace(int posx, int posy,ArrayList<Animal> A,Ressource[] ressource) {
		// on v�rifie avec cette fonction que le nouveau n� peut �tre plac� pr�s de sa m�re
		
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
	 * Permet de cr�er l'individu issue de l'accouplement de deux Animaux et de l'ajouter � la liste d'animaux.
	 * 
	 * @param A1
	 * 			Animal 1.
	 * @param A2
	 * 			Animal 2.
	 * @param A
	 * 			List de type Animal regroupant les animaux de l'�cosyst�me. 
	 * @param tableauRessource
	 * 			Tableau regroupant les ressources de l'�cosyt�me.
	 * 
	 */

	public static void creationNouvelIndividu(Animal A1, ArrayList<Animal> A, Ressource[] ressource,int duree_ecoulee) {

		String sexe;

		if (Math.random()<0.5) {// choix du sexe al�atoire avec une chance sur deux

			sexe = "F";

		}
		else {
			sexe = "M";

		}

		int positionNaissance[];
		// on cr�e les coordonn� du nouvel animal qu'on place aupr�s de sa m�re par d�fault
		positionNaissance = v�rificationNouvellePlace(A1.posx, A1.posy,A,ressource);
		
		
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
