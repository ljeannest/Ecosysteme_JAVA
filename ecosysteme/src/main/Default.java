package main;

//import individus.Animal;
import individus.Lievre;
import individus.Lynx;
import individus.Vautour;
import ressources.Vegetaux;
import ressources.Eau;
import ressources.Riviere;
import ressources.Lac;


public class Default {

	Lievre populationLievre []= new Lievre [20];
	Lynx populationLynx[]=new Lynx [30];
	Vautour populationVautour[]=new Vautour[10];
	//Animal populationAnimal [] = new Animal [3];
	Vegetaux ressourceVegetal[];
	Eau ressouceEnEau[];
	Riviere riviere;
	Lac lac;

	public Default() {

		//creation des lievres
		String sexe="F";// on donne un sexe par default

		for(int i=0; i<20; i++) {

			if(i>10 && sexe=="F") {// on change le sexe à la moitité afin d'avoir une population egale en sexe
				sexe="M";

			}

			this.populationLievre[i]= new Lievre(0,0,sexe,1);// on cree le nouvel individu su'on insere dans sa population

		}
		// creation des lynx de même que pour les Lievres
		sexe="F";
		for(int i=0; i<30; i++) {

			if(i>15  && sexe=="F") {

				sexe="M";

			}

			this.populationLynx[i]= new Lynx (0,0, sexe,2);
		}

// création des Vautour
		sexe = "F";

		for(int i=0; i<10; i++) {

			if(i>5 && sexe=="F") {

				sexe="M";

			}

			this.populationVautour[i]= new Vautour(0,0,sexe,4);
			
		}
		
		this.riviere= new Riviere(3,0,3,29);
		this.lac = new Lac(29,29);
		
		
		//this.populationAnimal[0]=this.populationLievre;
		//this.populationAnimal[1]=this.populationLynx;
		//this.populationVautour[2]=this.populationVautour;


	}
}
