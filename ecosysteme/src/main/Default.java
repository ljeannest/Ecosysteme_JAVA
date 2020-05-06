package main;

import individus.Animal;
import individus.Lievre;
import individus.Lynx;
import individus.Vautour;
import ressources.Vegetaux;
import ressources.Eau;


public class Default {

	Lievre populationLievre []= new Lievre [20];
	Lynx populationLynx[]=new Lynx [30];
	Vautour populationVautour[]=new Vautour[10];
	Animal populationAnimal []= new Animal [60];
	Vegetaux ressourceVegetal[];
	Eau ressouceEnEau[];

	public Default() {

		//creation des lievres
		String sexe="F";// on donne un sexe par default

		for(int i=0; i<20; i++) {

			if(i>10 && sexe=="F") {// on change le sexe à la moitité afin d'avoir une population egale en sexe
				sexe="M";

			}

			this.populationLievre[i]= new Lievre(0,0,sexe,1);// on cree le nouvel individu su'on insere dans sa population

		}
		// creation des lynx
		sexe="F";
		for(int i=0; i<30; i++) {

			if(i>15  && sexe=="F") {

				sexe="M";

			}

			this.populationLynx[i]= new Lynx (0,0, sexe,2);
		}


		sexe = "F";

		for(int i=0; i<10; i++) {

			if(i>5 && sexe=="F") {

				sexe="M";

			}

			this.populationVautour[i]= new Vautour(0,0,sexe,4);
			
		}


	}
}
