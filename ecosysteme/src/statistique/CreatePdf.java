package statistique;

import java.io.IOException;


import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.IBlockElement;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.kernel.pdf.PdfName;
import statistique.Donnees;

/**
 * <b> Cette class permet de créer le squelette du pdf compte rendu de modélisation</b>
 * <p> Pour cela la libraire itext est necessaire. Il s'agit d'une librairie libre de droit dons vous trouverair les détails là: @see pom.xml.</p>
 * <p> Les variables nécéssaire à l'élaboration du pdf sont les suivantes:</p>
 * <ul>
 * <li> Le nom du fichier qui peremt de à l'utilisateur de nommer le fichier</li>
 * <li> la list de donne qui permetra dde remplir le fichier pdf avec les données de la modélisation</li>
 * </ul>
 * 
 * @author Mélodia
 * 
 *
 */




public class CreatePdf {  
	
	/**
	 * Permet de nommer le nom du fichier non modfiable.
	 */
	static String nomFichier;
	
	
	/**
	 * Donnees de la simulation
	 */
	
	Donnees donneeSimul;
	
	/**
	 * Constructeur de la classe.
	 * 
	 * @param nomFichier
	 * 			Nom donné au fichier non modifiable.
	 * @param doneeSimul
	 * 			Données de la simulation non modifiable.
	 */
	public CreatePdf( String nomFichier, Donnees donneeSimul) {
		CreatePdf.nomFichier = nomFichier;
		this.donneeSimul = donneeSimul;

	}
	/**
	 * Création du chemin ou le pdf sera enregistré.
	 */

	public static final String DEST = "compte_rendu/"+ nomFichier+".pdf";

	/**
	 * Cration du document via un main lors de la creation du doc tout est cré d'un coup.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
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
		
		listDonneSimulationGenerale.add(new ListItem(" Durée de la simulation (donnée en jour) :"))
		.add(new ListItem("Raison de fin de simulation : "+ donneeSimul.causeFinSimulation))
		.add(new ListItem("Nombre d'espéce au debut de la simulation: "))
		.add(new ListItem("Nombre d'individus au début de la simulation : "))
		.add(new ListItem("Nombre d'espéce à la fin de la simulation: "))
		.add(new ListItem("Nombre d'individu à la fin de la simulation: "));
		


		listDonneSimulationCarnivore.add(new ListItem("Nombre totale de carnivore sur toute le simulation: " ))
		.add(new ListItem("Nombre d'individus au début de la simulation: "))
		.add(new ListItem("Nombre d'individus à la fin de la simulation: "))
		.add(new ListItem("Nombre moyen de carnivore mort par jour: "))
		.add(new ListItem("Nombre moyen de naissance de carnivore par jour: "))
		.add(new ListItem("Nombre moyen de carnivore en vie par jour: "))
		.add(new ListItem("Nombre moyen de décés par viellesse par jour: "))
		.add(new ListItem("Nombre moyen de décés autre que viellesse par jour: "))
		.add(new ListItem("Age moyen à la mort: "));

		
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




