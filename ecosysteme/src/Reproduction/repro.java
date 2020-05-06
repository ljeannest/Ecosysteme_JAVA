package reproduction;

import individus.Animal;
import java.lang.Math;



public class main {

	public static boolean placeVide(int posX, int posY, int tableauIndividu[],int tableauRessource[]){

		boolean placeLibre = true;

		for(int i = 0; i < tableauIndividu.length; i++) {

			if (tableauIndividu[i].posx == posX && tableauIndividu[i].posy == posY) {

				placeLibre=false;

			}
		}
		if (placeLibre == true) {
			for(int j = 0; j< tableauRessource.length; j++) {

				if(tableauRessource[j].couleur="marron") {

					if (tableauRessource[j].posx==posX && tableauRessource[j].posy==posX) {

						placeLibre = false;

					}
				}
				else if(tableauRessource[j].couleur="vert fonce") {

					if (tableauRessource[j].posx==posX && tableauRessource[j].posy==posX) {
						placeLibre = false;
					}
				}
				else {
				}

			}
			
			return placeLibre;


		}



	}
	
	public static int [] v�rificationNouvellePlace(int posx, int posy,int tableauIndividu[],int tableauRessource[]) {
		// on v�rifie avec cette fonction que le nouveau n� peut �tre plac� pr�s de sa m�re
		
		int posX;
		int posY;
		
		if (placeVide(posx+1, posy,tableauIndividu,tableauRessource)==true) {
			posX = posx+1;
			posY = posy;
		}
		else if (placeVide(posx-1,posy,tableauIndividu,tableauRessource)==true) {
			posX = posx-1;
			posY = posy;
		}
		else if(placeVide(posx,posy+1,tableauIndividu,tableauRessource)==true) {
			posX = posx+1;
			posY = posy;
		}
		else if(placeVide(posx,posy-1,tableauIndividu,tableauRessource)==true) {
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


	public static Animal cr�ationNouvelIndividu(Animal A1, Animal A2, int tableauIndividu[], int tableauRessource[]) {

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
			positionNaissance = v�rificationNouvellePlace(A1.posx, A1.posy,tableauIndividu,tableauRessource);
		}
		else {
			positionNaissance = v�rificationNouvellePlace(A2.posx, A2.posy,tableauIndividu,tableauRessource);
		}

		Animal A3= new Animal(A1.espece, A1.type, positionNaissance[0], positionNaissance[1], sexe, 0, A1.esp_de_vie, 100, 100, A1.qte_viande );
		
		return A3;
	}






}