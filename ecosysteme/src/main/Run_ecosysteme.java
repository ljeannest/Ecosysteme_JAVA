package main;


import affichage.ConteneurFenetre;

import affichage.FenetreInitOuverture; 
import affichage.fenetre;
import individus.Animal;
import ressources.Ressource;
import java.util.ArrayList;

/**
 * <b> Main de l'application.</b>
 * 
 * 
 *
 */

public class Run_ecosysteme {

	public static void main(String[] args) throws InterruptedException  {
		
		
		//ouverture d'une premiere fenetre permettant à l'utilisateur de sélectionner les paramètres de la simulation.
		//a la validation, une fenetre recapitulative s'ouvre

		int[] info = FenetreInitOuverture.recuperation_info();
		
		//une fois les paramètres validés, la fenetre se ferme, et les paramètres sont enregistrés.
		
		int nb_lievre = info[0];
		int nb_lynx = info[1];
		int nb_vautour =info[2];
		int nb_flaque = info[3];
		int duree = info[4];
		int presencelac=info[5];
		int presenceriviere=info[6];
		int taille = info[7];
		
		//création de l'écosystème, ainsi que des différents individus
		
		ConteneurFenetre.NB_LIGNES = taille;
		ConteneurFenetre.NB_COLONNES = taille;
		
		ArrayList<Animal> individus = Animal.creation(nb_lievre,nb_lynx,nb_vautour);
		ArrayList<Animal> individus_morts = new ArrayList<Animal>(0);
		Ressource [] ressource = Ressource.creation(nb_flaque,presencelac,presenceriviere,ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES);

		
		//entrée dans une boucle qui modélise notre écosysteme, avec tous nos individus qui peuvent 
		//boire, manger, se deplacer, se reproduire...
		//la boucle se termine quand ? extinction d'une espece? laps de temps donné? extinction de toutes les especes?
		
		fenetre fenetrePrincipale = new fenetre(individus,individus_morts,ressource,duree);
		fenetrePrincipale.setVisible(true);
		
		
		//fermeture de la fenetre
		
		fenetrePrincipale.setVisible(false);
		
		
		//recuperation informations
		
		int p = individus.size();
		for (int k=0;k<p;k++) {
			System.out.println(individus.get(k));
		}
		
		int n = individus_morts.size();
		for (int k=0;k<n;k++) {
			System.out.println(individus_morts.get(k));
		}
		
		//nouvelle fenetre affichant les statistiques de la modelisation.

	}

}
