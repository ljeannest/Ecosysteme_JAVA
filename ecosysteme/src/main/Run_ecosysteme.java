package main;

import affichage.FenetreInitOuverture;
import affichage.fenetre;
import individus.Animal;
import affichage.FenetreInitInfo;

public class Run_ecosysteme {

	public static void main(String[] args) throws InterruptedException  {
		
		
		//ouverture d'une premiere fenetre permettant à l'utilisateur de sélectionner les paramètres de la simulation.

//		FenetreInitOuverture f1 = new FenetreInitOuverture();
		int[] info = FenetreInitOuverture.recuperation_info();
		
		//une fois les paramètres validés, la fenetre se ferme, et les paramètres sont enregistrés.
		
		int nb_lievre = info[0];
		int nb_lynx = info[1];
		int nb_vautour =info[2];
		int nb_flaque = info[3];
		int duree = info[4];
		
		//création de l'écosystème, ainsi que des différents individus
		
		Animal[] individus = Animal.creation(nb_lievre,nb_lynx,nb_vautour);
		
		
		//entrée dans une boucle qui modélise notre écosysteme, avec tous nos individus qui peuvent 
		//boire, manger, se deplacer, se reproduire.
		//la boucle se termine quand ? extinction d'une espece? laps de temps donné? extinction de toutes les especes?
		
		fenetre fenetrePrincipale = new fenetre(individus,nb_flaque);
		fenetrePrincipale.setVisible(true);
		
		//fermeture de l'ecosysteme.
		
		
		//nouvelle fenetre affichant les statistiques de la modelisation.

	}

}
