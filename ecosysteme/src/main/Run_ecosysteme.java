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
 *
 */

public class Run_ecosysteme {
	
	
	public static final String DEST = "compte_rendu/compteRendu.pdf";

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		boolean nouvelle_simulation =true;
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
		int presenceforet = info[8];
		
		//création de l'écosystème, ainsi que des différents individus
		
		ConteneurFenetre.NB_LIGNES = taille;
		ConteneurFenetre.NB_COLONNES = taille;
		
		ArrayList<Animal> individus = Animal.creation(nb_lievre,nb_lynx,nb_vautour);
		ArrayList<Animal> individus_morts = new ArrayList<Animal>(0);
		Ressource [] ressource = Ressource.creation(nb_flaque,presencelac,presenceriviere,presenceforet,ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES);
		int duree_ecoulee=0;
		
		//entrée dans une boucle qui modélise notre écosysteme, avec tous nos individus qui peuvent 
		//boire, manger, se deplacer, se reproduire.
		//la boucle se termine a la fin du laps de temps donné ou de l'extinction de toutes les especes
		
		if (duree!=0) {
			fenetre fenetrePrincipale = new fenetre(individus,individus_morts,ressource,duree_ecoulee,duree);
			fenetrePrincipale.setVisible(true);

			//fermeture de la fenetre
		
			fenetrePrincipale.setVisible(false);
		
			//affichage des informations de la simulation
		
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
		
		
		//affichage des informations de la simulation
		
		//System.out.println("Duree totale de la simulation : "+duree_ecoulee+" jours\n\n");
		
		//int p = individus.size();
		//for (int k=0;k<p;k++) {
		//	System.out.println(individus.get(k));
		//}
		
		//int n = individus_morts.size();
		//for (int k=0;k<n;k++) {
		//	System.out.println(individus_morts.get(k));
		// }
		
		
		int [] nbIndividuDebut = {nb_lievre, nb_lynx, nb_vautour};
		Calcul calcul= new Calcul(individus,individus_morts,duree, duree_ecoulee, nbIndividuDebut);
		


		int[] nbIndividusFin = calcul.compteurNbIndividusFin();
		int [] nbNaissance = calcul.nbNaissance();
		double [] nbMoyenNaissance = calcul.nbMoyenNaissance();
		int [] nbMort = calcul.nbMort();
		int [] nbMortNorm = calcul.nbMortNorm();
		int [] nbMortFaim = calcul.nbMortFaim();
		int [] nbMortSoif = calcul.nbMortSoif();
		int [] nbMortChasse = calcul.nbMortChasse();
		String nomFichier="nomfichier";
		
		Donnees donneeSimul = new Donnees( calcul.compteurNbIndividus(),calcul.MoyenneAgeParEsp(), calcul.MoyenAgeALaMort(), calcul.CauseFinSimul(), calcul.tSimulation(), calcul.nbEspeceDebut(), calcul.nbEspeceFin(), nbIndividuDebut, calcul.compteurNbIndividusFin(), calcul.nbMoyenNaissance(),  calcul.nbNaissance(), calcul.nbMortNorm(), calcul.nbMortFaim() , calcul.nbMortSoif(), calcul.nbMortChasse(), calcul.nbMort());
		

		
		PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
		Document document = new Document(pdf);

		// Creation d'une font pour pdf
		PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);

		// écriture du contenue du PDF
		
		// écriture du contenu de cahque paragraphe

		String para1 = "Dans ce PDF voud trouverez les statistiques que nous avons pu ressortir de votre simulation. Les données qui ont servie à leur élaboration vous seront donné en première partie.";  

		String para2 = "Voici les données jour par jour de la simulation:";
		
		String para3 = "Donnée génerale:";

		String para4 = "Pour les carnivores:";
		
		String para5 = "Pour les charognards:";
		
		String para6 = "Pour les herbivores:";

		String para7 = "Nous observons les graphiqes suivant:";

		String para8 = "Nous esperons que cette simulation a pu vous éclairez dans vos recherches.";   
		
		// création des paragraph via la methode paragraph de la class paragraph et rajout d'indentation avec setFirstLineIndent et aplication de la font crée en debut avec setFont     
		Paragraph paragraph1 = new Paragraph(para1).setFont(font).setFirstLineIndent(20);   // on précise la police
		Paragraph paragraph2 = new Paragraph(para2).setFirstLineIndent(20);
		Paragraph paragraph3 = new Paragraph(para3).setFirstLineIndent(40);
		Paragraph paragraph4 =  new Paragraph(para4).setFirstLineIndent(40);
		Paragraph paragraph5 = new Paragraph(para5).setFirstLineIndent(40);
		Paragraph paragraph6 = new Paragraph(para6).setFirstLineIndent(40);
		Paragraph paragraph7 = new Paragraph(para7).setFirstLineIndent(20);
		Paragraph paragraph8 = new Paragraph(para8).setFirstLineIndent(20);


		// création de listes de point:

		List listDonneSimulationGenerale = new List()
				.setSymbolIndent(12)// on précise l'indentatation
				.setListSymbol("\u2022")// on choisi le symbole à utiliser pour les points
				.setFont(font);// on précise la font qu'on utilise pour le text
		
		
		List listDonneSimulationCarnivore = new List()
				.setSymbolIndent(12)
				.setListSymbol("\u2022")
				.setFont(font);
		

		List listDonneSimulationCharognard =new List()
				.setSymbolIndent(12)
				.setListSymbol("\u2022")
				.setFont(font);
		
		
		
		List listDonneSimulationHerbivore =new List()
				.setSymbolIndent(12)
				.setListSymbol("\u2022")
				.setFont(font);

		
		
		// on ajoute dans la liste les points que l'on veut ecrire.
		
		listDonneSimulationGenerale.add(new ListItem("" + donneeSimul.tSimulation))
		.add(new ListItem(donneeSimul.causeFinSimulation))
		.add(new ListItem("Nombre d'espéce au debut de la simulation: " + donneeSimul.nbEspeceDebut))
		.add(new ListItem("Nombre d'individus au début de la simulation : " + donneeSimul.nbTotalIndivDebut))
		.add(new ListItem("Nombre d'espéce à la fin de la simulation: " + donneeSimul.nbEspeceFin))
		.add(new ListItem("Nombre d'individu à la fin de la simulation: " + donneeSimul.nbTotalIndiFin));
		


		listDonneSimulationCarnivore.add(new ListItem("Nombre totale de carnivore sur toute le simulation: " + donneeSimul.nbIndividus[1]))
		.add(new ListItem("Nombre d'individus au début de la simulation: " + donneeSimul.nbIndividuDebut[1]))
		.add(new ListItem("Nombre d'individus à la fin de la simulation: " + donneeSimul.nbIndividuFin[1]))
		.add(new ListItem("Age moyen de la populayion à la fin de la simulation: " + donneeSimul.moyenAgeParEspece[1]))
		.add(new ListItem("Nombre de Carnivore mort durant la simulation: " + donneeSimul.nbMort[1]))
		.add(new ListItem("Nombre moyen de carnivore mort par jour: " ))
		.add(new ListItem("Nombre moyen de naissance de carnivore par jour: " + donneeSimul.nbMoyenNaissance[1]))
		.add(new ListItem("Nombre de mort par viellesse durant la simulation: " + donneeSimul.nbMortNorm[1]))
		.add(new ListItem("Nombre moyen de décés par viellesse par jour: "))
		.add(new ListItem("Nombre moyen de décés du à la faim: " + donneeSimul.nbMortFaim[1]))
		.add(new ListItem("Nombre moyen de décés du à la Soif: " + donneeSimul.nbMortSoif[1]))
		.add(new ListItem("Nombre moyen de décés autre que viellesse par jour: "))
		.add(new ListItem("Age moyen à la mort: " + donneeSimul.moyenAgeALaMort[1]));

		
		listDonneSimulationCharognard.add(new ListItem("Nombre totale de charognard sur toute la simulation: "))
		.add(new ListItem("Nombre d'individus au début de la simulation: "))
		.add(new ListItem("Nombre d'individus à la fin de la simulation: "))
		.add(new ListItem("Nombre moyen de charognars mort par jour: "))
		.add(new ListItem("Nombre moyen de naissance de charognard par jour: "))
		.add(new ListItem("Nombre moyen de charognard en vie par jour: "))
		.add(new ListItem("Nombre moyen de décés par viellesse par jour: "))
		.add(new ListItem("Nombre moyen de décés autre que viellesse par jour: "))
		.add(new ListItem("Age moyen à la mort: "));

		
		
		listDonneSimulationHerbivore.add(new ListItem("Nombre totale d'Herbivore sur toute la simulation: "))
		.add(new ListItem("Nombre d'individus au début de la simulation: "))
		.add(new ListItem("Nombre d'individus à la fin de la simulation: "))
		.add(new ListItem("Nombre moyen d'herbivore mort par jour: "))
		.add(new ListItem("Nombre moyen de naissance d'herbivore par jour: "))
		.add(new ListItem("Nombre moyen d'herbivore en vie par jour: "))
		.add(new ListItem("Nombre moyen de décés par viellesse par jour: "))
		.add(new ListItem("Nombre moyen de décés autre que viellesse par jour: "))
		.add(new ListItem("Age moyen à la mort: "));
		

		// On ajoute les différentes partie cré precedement dans le pdf dans l'ordre soihaité.

		document.add(paragraph1)
		.add(paragraph2) 
		.add(paragraph3)
		.add(listDonneSimulationGenerale)
		.add(paragraph4)
		.add(listDonneSimulationCarnivore)
		.add(paragraph5)
		.add(listDonneSimulationCharognard)
		.add(paragraph6)
		.add(listDonneSimulationHerbivore)
		.add(paragraph7)
		.add(paragraph8);

		// on ferme le document. à noté que l'ouverture est automatique lors de sa création.
		document.close();
		
		// on prévient l'utilisatuer de la création du document et de son emplacement.
		System.out.println("Les données statistiques de cette modélisation sont disponible dans le dossier compte_rendu de l'application. Le document est en format PDF et se nomme: "+ nomFichier);


		}
	}
}
