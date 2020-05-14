package Reproduction;



import individus.*;
import ressources.Ressource;
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
	
	public static int [] vérificationNouvellePlace(int posx, int posy,ArrayList<Animal> A,Ressource[] ressource) {
		// on vérifie avec cette fonction que le nouveau né peut être placé prés de sa mére
		
		int posX;
		int posY;
		
		if (Animal.pos_libre(A, ressource,-1,posx+1, posy)==true) {
			posX = posx+1;
			posY = posy;
		}
		else if (Animal.pos_libre(A,  ressource, -1, posx-1, posy)==true) {
			posX = posx-1;
			posY = posy;
		}
		else if(Animal.pos_libre(A,  ressource, -1, posx, posy+1)==true) {
			posX = posx;
			posY = posy+1;
		}
		else if(Animal.pos_libre(A,  ressource, -1, posx, posy-1)==true) {
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
