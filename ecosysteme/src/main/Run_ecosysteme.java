package main;


import affichage.ConteneurFenetre;

import affichage.FenetreInitOuverture; 
import affichage.fenetre;
import individus.Animal;
import ressources.Ressource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;

import statistique.*;

/**
 * <b> Main de l'application.</b>
 * 
 * 
 *@author Augustin & Lucie & M�lodia
 */

public class Run_ecosysteme {


	public static final String DEST = "compteRendu.pdf";

	public static void main(String[] args) throws InterruptedException, IOException  {


		boolean nouvelle_simulation =true;
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
		int taille = info[7];
		int presenceforet = info[8];
		int presencecompterendu = info[9];
		//cr�ation de l'�cosyst�me, ainsi que des diff�rents individus

		ConteneurFenetre.NB_LIGNES = taille;
		ConteneurFenetre.NB_COLONNES = taille;

		ArrayList<Animal> individus = Animal.creation(nb_lievre,nb_lynx,nb_vautour);
		ArrayList<Animal> individus_morts = new ArrayList<Animal>(0);
		Ressource [] ressource = Ressource.creation(nb_flaque,presencelac,presenceriviere,presenceforet,ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES);
		int duree_ecoulee=0;

		//entr�e dans une boucle qui mod�lise notre �cosysteme, avec tous nos individus qui peuvent 
		//boire, manger, se deplacer, se reproduire.
		//la boucle se termine a la fin du laps de temps donn� ou de l'extinction de toutes les especes




		//fermeture de la fenetre




		//affichage des informations de la simulation





		if (duree!=0) {
			fenetre fenetrePrincipale = new fenetre(individus,individus_morts,ressource,duree_ecoulee,duree);
			fenetrePrincipale.setVisible(true);

			//fermeture de la fenetre

			fenetrePrincipale.setVisible(false);

			//affichage des informations de la simulation

			duree_ecoulee=fenetrePrincipale.duree_ecoulee;
			System.out.println("Duree totale de la simulation : "+duree_ecoulee+" jours\n\n");


			int p = individus.size();
			for (int k=0;k<p;k++) {
				System.out.println(individus.get(k));
			}

			int n = individus_morts.size();
			for (int k=0;k<n;k++) {
				System.out.println(individus_morts.get(k));
			}

			fenetrePrincipale.setVisible(false);


			if (presencecompterendu==1) {

				int [] nbIndividuDebut = {nb_lievre, nb_lynx, nb_vautour};
				Calcul calcul= new Calcul(individus,individus_morts,duree, duree_ecoulee, nbIndividuDebut);


				Donnees donneeSimul = new Donnees( calcul.compteurNbIndividus(),calcul.MoyenneAgeParEsp(), calcul.MoyenAgeALaMort(), calcul.CauseFinSimul(), calcul.tSimulation(), calcul.nbEspeceDebut(), calcul.nbEspeceFin(), nbIndividuDebut, calcul.compteurNbIndividusFin(), calcul.nbMoyenNaissance(),  calcul.nbNaissance(), calcul.nbMortNorm(), calcul.nbMortFaim() , calcul.nbMortSoif(), calcul.nbMortChasse(), calcul.nbMort(),calcul.nbMoyenPetit());

				PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
				Document document = new Document(pdf);



				// Creation d'une font pour pdf
				PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);

				// �criture du contenue du PDF

				// �criture du contenu de cahque paragraphe



				String Titre = "Compte rendu de la simulation.\n\n";

				String para1 = "\nDans ce PDF voud trouverez les statistiques que nous avons pu ressortir de votre simulation. Les donn�es qui ont servi � leur �laboration vous seront donn�es en premi�re partie.";  

				String para2 = "\nVoici les donn�es jour par jour de la simulation:";

				String para3 = "\n Donn�e g�nerales:";

				String para4 = "\nPour les carnivores:";

				String para5 = "\nPour les charognards:";

				String para6 = "\nPour les herbivores:";

				String para7 = "\nNous esp�rons que cette simulation a pu vous �clairer dans vos recherches.";


				// cr�ation des paragraph via la methode paragraph de la class paragraph et rajout d'indentation avec setFirstLineIndent et aplication de la font cr�e en debut avec setFont     
				Paragraph TitreDocument = new Paragraph(Titre).setFirstLineIndent(200);
				Paragraph paragraph1 = new Paragraph(para1).setFirstLineIndent(20);   // on pr�cise la police
				Paragraph paragraph2 = new Paragraph(para2).setFirstLineIndent(20);
				Paragraph paragraph3 = new Paragraph(para3).setFirstLineIndent(40);
				Paragraph paragraph4 =  new Paragraph(para4).setFirstLineIndent(40);
				Paragraph paragraph5 = new Paragraph(para5).setFirstLineIndent(40);
				Paragraph paragraph6 = new Paragraph(para6).setFirstLineIndent(40);
				Paragraph paragraph7 = new Paragraph(para7).setFirstLineIndent(20);



				// cr�ation de listes de point:

				List listDonneSimulationGenerale = new List()
						.setSymbolIndent(12)// on pr�cise l'indentatation
						.setListSymbol("\u2022");// on choisi le symbole � utiliser pour les points


				List listDonneSimulationCarnivore = new List()
						.setSymbolIndent(12)
						.setListSymbol("\u2022");




				List listDonneSimulationCharognard =new List()
						.setSymbolIndent(12)
						.setListSymbol("\u2022");



				List listDonneSimulationHerbivore =new List()
						.setSymbolIndent(12)
						.setListSymbol("\u2022");





				// on ajoute dans la liste les points que l'on veut ecrire.

				listDonneSimulationGenerale.add(new ListItem("" + donneeSimul.tSimulation))
				.add(new ListItem(donneeSimul.causeFinSimulation))
				.add(new ListItem("Nombre d'esp�ces au debut de la simulation: " + donneeSimul.nbEspeceDebut))
				.add(new ListItem("Nombre d'individus au d�but de la simulation : " + donneeSimul.nbTotalIndivDebut))
				.add(new ListItem("Nombre d'esp�ces � la fin de la simulation: " + donneeSimul.nbEspeceFin))
				.add(new ListItem("Nombre d'individus � la fin de la simulation: " + donneeSimul.nbTotalIndiFin));






				listDonneSimulationCarnivore.add(new ListItem("Nombre total d'individus sur toute la simulation: " + donneeSimul.nbIndividus[1]))
				.add(new ListItem("Nombre d'individus au d�but de la simulation: " + donneeSimul.nbIndividuDebut[1]))
				.add(new ListItem("Nombre d'individus � la fin de la simulation: " + donneeSimul.nbIndividuFin[1]))
				.add(new ListItem("Age moyen de la population � la fin de la simulation: " + donneeSimul.moyenAgeParEspece[1]))
				.add(new ListItem("Nombre de morts durant la simulation: " + donneeSimul.nbMort[1]))
				.add(new ListItem("Nombre moyen de petits par femelle: " + donneeSimul.nbMoyenPetit))
				.add(new ListItem("Nombre moyen de naissances de carnivore par jour: " + donneeSimul.nbMoyenNaissance[1]))
				.add(new ListItem("Nombre de mort par vieillesse durant la simulation: " + donneeSimul.nbMortNorm[1]))
				.add(new ListItem("Nombre de d�c�s dus � la faim durant la simulation: " + donneeSimul.nbMortFaim[1]))
				.add(new ListItem("Nombre de d�c�s dus � la soif: " + donneeSimul.nbMortSoif[1]))
				.add(new ListItem("Age moyen � la mort: " + donneeSimul.moyenAgeALaMort[1]));




				listDonneSimulationCharognard.add(new ListItem("Nombre total d'individus sur toute la simulation: " + donneeSimul.nbIndividus[2]))
				.add(new ListItem("Nombre d'individus au d�but de la simulation: " + donneeSimul.nbIndividuDebut[2]))
				.add(new ListItem("Nombre d'individus � la fin de la simulation: " + donneeSimul.nbIndividuFin[2]))
				.add(new ListItem("Age moyen de la population � la fin de la simulation: " + donneeSimul.moyenAgeParEspece[2]))
				.add(new ListItem("Nombre de morts durant la simulation: " + donneeSimul.nbMort[2]))
				.add(new ListItem("Nombre moyen de petits par femelle:" + donneeSimul.nbMoyenPetit ))
				.add(new ListItem("Nombre moyen de naissances de carnivore par jour: " + donneeSimul.nbMoyenNaissance[2]))
				.add(new ListItem("Nombre de morts par vieillesse durant la simulation: " + donneeSimul.nbMortNorm[2]))
				.add(new ListItem("Nombre de d�c�s dus � la faim durant la simulation: " + donneeSimul.nbMortFaim[2]))
				.add(new ListItem("Nombre de d�c�s dus � la soif: " + donneeSimul.nbMortSoif[2]))
				.add(new ListItem("Age moyen � la mort: " + donneeSimul.moyenAgeALaMort[2]));



				listDonneSimulationHerbivore.add(new ListItem("Nombre total d'individus sur toute la simulation: " + donneeSimul.nbIndividus[0]))
				.add(new ListItem("Nombre d'individus au d�but de la simulation: " + donneeSimul.nbIndividuDebut[0]))
				.add(new ListItem("Nombre d'individus � la fin de la simulation: " + donneeSimul.nbIndividuFin[0]))
				.add(new ListItem("Age moyen de la population � la fin de la simulation: " + donneeSimul.moyenAgeParEspece[0]))
				.add(new ListItem("Nombre de mort durant la simulation: " + donneeSimul.nbMort[0]))
				.add(new ListItem("Nombre moyen de petits par femelle: " + donneeSimul.nbMoyenPetit ))
				.add(new ListItem("Nombre moyen de naissances de carnivore par jour: " + donneeSimul.nbMoyenNaissance[0]))
				.add(new ListItem("Nombre de morts par vieillesse durant la simulation: " + donneeSimul.nbMortNorm[0]))
				.add(new ListItem("Nombre de d�c�s dus � la faim durant la simulation: " + donneeSimul.nbMortFaim[0]))
				.add(new ListItem("Nombre de d�c�s dus � la pr�dation durant la simulation: " + donneeSimul.nbMortChasse[0]))
				.add(new ListItem("Nombre de d�c�s dus � la soif: " + donneeSimul.nbMortSoif[0]))
				.add(new ListItem("Age moyen � la mort: " + donneeSimul.moyenAgeALaMort[0]));



				// On ajoute les diff�rentes partie cr� precedement dans le pdf dans l'ordre soihait�.


				document.add(TitreDocument)
				.add(paragraph1)
				.add(paragraph2) 
				.add(paragraph3)
				.add(listDonneSimulationGenerale)
				.add(paragraph4)
				.add(listDonneSimulationCarnivore)
				.add(paragraph5)
				.add(listDonneSimulationCharognard)
				.add(paragraph6)
				.add(listDonneSimulationHerbivore)
				.add(paragraph7);



				// on ferme le document. � not� que l'ouverture est automatique lors de sa cr�ation.
				document.close();








				//nouvelle fenetre affichant les statistiques de la modelisation.


			}
		}
	}
}

