package main;


import affichage.ConteneurFenetre;
import affichage.FenetreInitOuverture; 
import affichage.FenetreInitOuverture; 
import affichage.fenetre;
import individus.Animal;
import ressources.Ressource;

public class Run_ecosysteme {

	public static void main(String[] args) throws InterruptedException  {
		
		
		//ouverture d'une premiere fenetre permettant � l'utilisateur de s�lectionner les param�tres de la simulation.
		//a la validation, une fenetre recapitulative s'ouvre

		int[] info = FenetreInitOuverture.recuperation_info();
		
		//une fois les param�tres valid�s, la fenetre se ferme, et les param�tres sont enregistr�s.
		
		int nb_lievre = info[0];
		int nb_lynx = info[1];
		int nb_vautour =info[2];
		int nb_flaque = info[3];
		int duree = info[4];
		int presencelac=info[5];
		int presenceriviere=info[6];
		
		//cr�ation de l'�cosyst�me, ainsi que des diff�rents individus
		
		Animal[] individus = Animal.creation(nb_lievre,nb_lynx,nb_vautour);
		Ressource [] ressource = Ressource.creation(nb_flaque,presencelac,presenceriviere,ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES);

		
		//entr�e dans une boucle qui mod�lise notre �cosysteme, avec tous nos individus qui peuvent 
		//boire, manger, se deplacer, se reproduire...
		//la boucle se termine quand ? extinction d'une espece? laps de temps donn�? extinction de toutes les especes?
		
		fenetre fenetrePrincipale = new fenetre(individus,ressource,duree);
		fenetrePrincipale.setVisible(true);
		
		
		//fermeture de l'ecosysteme
		
		
		//nouvelle fenetre affichant les statistiques de la modelisation.

	}

}
