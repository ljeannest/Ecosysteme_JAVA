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
 * <b> Cette class permet de cr�er le squelette du pdf compte rendu de mod�lisation</b>
 * <p> Pour cela la libraire itext est necessaire. Il s'agit d'une librairie libre de droit dons vous trouverair les d�tails l�: @see pom.xml.</p>
 * <p> Les variables n�c�ssaire � l'�laboration du pdf sont les suivantes:</p>
 * <ul>
 * <li> Le nom du fichier qui peremt de � l'utilisateur de nommer le fichier</li>
 * <li> la list de donne qui permetra dde remplir le fichier pdf avec les donn�es de la mod�lisation</li>
 * </ul>
 * 
 * @author M�lodia
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
	 * 			Nom donn� au fichier non modifiable.
	 * @param doneeSimul
	 * 			Donn�es de la simulation non modifiable.
	 */
	public CreatePdf( String nomFichier, Donnees donneeSimul) {
		CreatePdf.nomFichier = nomFichier;
		this.donneeSimul = donneeSimul;

	}
	/**
	 * Cr�ation du chemin ou le pdf sera enregistr�.
	 */

	public static final String DEST = "compte_rendu/"+ nomFichier+".pdf";

	/**
	 * Cration du document via un main lors de la creation du doc tout est cr� d'un coup.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
		PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
		Document document = new Document(pdf);

		// Creation d'une font pour pdf
		PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);

		// �criture du contenue du PDF
		
		// �criture du contenu de cahque paragraphe

		String para1 = "Dans ce PDF voud trouverez les statistiques que nous avons pu ressortir de votre simulation. Les donn�es qui ont servie � leur �laboration vous seront donn� en premi�re partie.";  

		String para2 = "Voici les donn�es jour par jour de la simulation:";
		
		String para3 = "Donn�e g�nerale:";

		String para4 = "Pour les carnivores:";
		
		String para5 = "Pour les charognards:";
		
		String para6 = "Pour les herbivores:";

		String para7 = "Nous observons les graphiqes suivant:";

		String para8 = "Nous esperons que cette simulation a pu vous �clairez dans vos recherches.";   
		
		// cr�ation des paragraph via la methode paragraph de la class paragraph et rajout d'indentation avec setFirstLineIndent et aplication de la font cr�e en debut avec setFont     
		Paragraph paragraph1 = new Paragraph(para1).setFont(font).setFirstLineIndent(20);   // on pr�cise la police
		Paragraph paragraph2 = new Paragraph(para2).setFirstLineIndent(20);
		Paragraph paragraph3 = new Paragraph(para3).setFirstLineIndent(40);
		Paragraph paragraph4 =  new Paragraph(para4).setFirstLineIndent(40);
		Paragraph paragraph5 = new Paragraph(para5).setFirstLineIndent(40);
		Paragraph paragraph6 = new Paragraph(para6).setFirstLineIndent(40);
		Paragraph paragraph7 = new Paragraph(para7).setFirstLineIndent(20);
		Paragraph paragraph8 = new Paragraph(para8).setFirstLineIndent(20);


		// cr�ation de listes de point:

		List listDonneSimulationGenerale = new List()
				.setSymbolIndent(12)// on pr�cise l'indentatation
				.setListSymbol("\u2022")// on choisi le symbole � utiliser pour les points
				.setFont(font);// on pr�cise la font qu'on utilise pour le text
		
		
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
		
		listDonneSimulationGenerale.add(new ListItem(" Dur�e de la simulation (donn�e en jour) :"))
		.add(new ListItem("Raison de fin de simulation : "+ donneeSimul.causeFinSimulation))
		.add(new ListItem("Nombre d'esp�ce au debut de la simulation: "))
		.add(new ListItem("Nombre d'individus au d�but de la simulation : "))
		.add(new ListItem("Nombre d'esp�ce � la fin de la simulation: "))
		.add(new ListItem("Nombre d'individu � la fin de la simulation: "));
		


		listDonneSimulationCarnivore.add(new ListItem("Nombre totale de carnivore sur toute le simulation: " ))
		.add(new ListItem("Nombre d'individus au d�but de la simulation: "))
		.add(new ListItem("Nombre d'individus � la fin de la simulation: "))
		.add(new ListItem("Nombre moyen de carnivore mort par jour: "))
		.add(new ListItem("Nombre moyen de naissance de carnivore par jour: "))
		.add(new ListItem("Nombre moyen de carnivore en vie par jour: "))
		.add(new ListItem("Nombre moyen de d�c�s par viellesse par jour: "))
		.add(new ListItem("Nombre moyen de d�c�s autre que viellesse par jour: "))
		.add(new ListItem("Age moyen � la mort: "));

		
		listDonneSimulationCharognard.add(new ListItem("Nombre totale de charognard sur toute la simulation: "))
		.add(new ListItem("Nombre d'individus au d�but de la simulation: "))
		.add(new ListItem("Nombre d'individus � la fin de la simulation: "))
		.add(new ListItem("Nombre moyen de charognars mort par jour: "))
		.add(new ListItem("Nombre moyen de naissance de charognard par jour: "))
		.add(new ListItem("Nombre moyen de charognard en vie par jour: "))
		.add(new ListItem("Nombre moyen de d�c�s par viellesse par jour: "))
		.add(new ListItem("Nombre moyen de d�c�s autre que viellesse par jour: "))
		.add(new ListItem("Age moyen � la mort: "));

		
		
		listDonneSimulationHerbivore.add(new ListItem("Nombre totale d'Herbivore sur toute la simulation: "))
		.add(new ListItem("Nombre d'individus au d�but de la simulation: "))
		.add(new ListItem("Nombre d'individus � la fin de la simulation: "))
		.add(new ListItem("Nombre moyen d'herbivore mort par jour: "))
		.add(new ListItem("Nombre moyen de naissance d'herbivore par jour: "))
		.add(new ListItem("Nombre moyen d'herbivore en vie par jour: "))
		.add(new ListItem("Nombre moyen de d�c�s par viellesse par jour: "))
		.add(new ListItem("Nombre moyen de d�c�s autre que viellesse par jour: "))
		.add(new ListItem("Age moyen � la mort: "));
		

		// On ajoute les diff�rentes partie cr� precedement dans le pdf dans l'ordre soihait�.

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

		// on ferme le document. � not� que l'ouverture est automatique lors de sa cr�ation.
		document.close();
		
		// on pr�vient l'utilisatuer de la cr�ation du document et de son emplacement.
		System.out.println("Les donn�es statistiques de cette mod�lisation sont disponible dans le dossier compte_rendu de l'application. Le document est en format PDF et se nomme: "+ nomFichier);






	}



}




