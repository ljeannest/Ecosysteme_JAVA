package Reproduction;

import individus.Animal;
import ressources.Vegetaux;
import java.lang.Math;
import java.util.ArrayList;

public class repro {

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
