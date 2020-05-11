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
import individus.*;
import ressources.*;




public class CreatePdf {    

	static String nomFichier;
	List listDonne;

	public CreatePdf( String nomFichier, List listDonne) {

		CreatePdf.nomFichier = nomFichier;
		this.listDonne = listDonne;

	}

	public static final String DEST = "compte_rendu/"+ nomFichier+".pdf";

	// cr�ation du document
	public static void main(String args[]) throws IOException {
		PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
		Document document = new Document(pdf);

		// Creation d'une PdfFont
		PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);

		// �criture du contenue du PDF
		
		// Creating Paragraphs  

		String para1 = "Dans ce PDF voud trouverez les statistiques que nous avons pu ressortir de votre simulation. Les donn�es qui ont servie � leur �laboration vous seront donn� en premi�re partie.";  

		String para2 = "Voici les donn�es jour par jour de la simulation:";
		
		String para3 = "Donn�e g�nerale:";

		String para4 = "Pour les carnivores:";
		
		String para5 = "Pour les charognards:";
		
		String para6 = "Pour les herbivores:";

		String para7 = "Nous observons les graphiqes suivant:";

		String para8 = "Nous esperons que cette simulation a pu vous �clairez dans vos recherches.";              

		     
		Paragraph paragraph1 = new Paragraph(para1).setFont(font).setFirstLineIndent(20);   // on pr�cise la police
		Paragraph paragraph2 = new Paragraph(para2).setFirstLineIndent(20);
		Paragraph paragraph3 = new Paragraph(para3).setFirstLineIndent(40);
		Paragraph paragraph4 =  new Paragraph(para4).setFirstLineIndent(40);
		Paragraph paragraph5 = new Paragraph(para5).setFirstLineIndent(40);
		Paragraph paragraph6 = new Paragraph(para6).setFirstLineIndent(40);
		Paragraph paragraph7 = new Paragraph(para7).setFirstLineIndent(20);
		Paragraph paragraph8 = new Paragraph(para8).setFirstLineIndent(20);


		// cr�ation d'une liste de point:

		List listDonneSimulationGenerale = new List()
				.setSymbolIndent(12)
				.setListSymbol("\u2022")
				.setFont(font);
		
		listDonneSimulationGenerale.add(new ListItem(" Dur�e de la simulation (donn�e en jour) :"))
		.add(new ListItem("Raison de fin de simulation : "))
		.add(new ListItem("Nombre d'esp�ce au debut de la simulation: "))
		.add(new ListItem("Nombre d'individus au d�but de la simulation : "))
		.add(new ListItem("Nombre d'esp�ce � la fin de la simulation: "))
		.add(new ListItem("Nombre d'individu � la fin de la simulation: "));
		List listDonneSimulationCarnivore = new List()
				.setSymbolIndent(12)
				.setListSymbol("\u2022")
				.setFont(font);

		listDonneSimulationCarnivore.add(new ListItem("Nombre totale de carnivore sur toute le simulation: " ))
		.add(new ListItem("Nombre d'individus au d�but de la simulation: "))
		.add(new ListItem("Nombre d'individus � la fin de la simulation: "))
		.add(new ListItem("Nombre moyen de carnivore mort par jour: "))
		.add(new ListItem("Nombre moyen de naissance de carnivore par jour: "))
		.add(new ListItem("Nombre moyen de carnivore en vie par jour: "))
		.add(new ListItem("Nombre moyen de d�c�s par viellesse par jour: "))
		.add(new ListItem("Nombre moyen de d�c�s autre que viellesse par jour: "))
		.add(new ListItem("Age moyen � la mort: "));

		List listDonneSimulationCharognard =new List()
				.setSymbolIndent(12)
				.setListSymbol("\u2022")
				.setFont(font);
		
		listDonneSimulationCharognard.add(new ListItem("Nombre totale de charognard sur toute la simulation: "))
		.add(new ListItem("Nombre d'individus au d�but de la simulation: "))
		.add(new ListItem("Nombre d'individus � la fin de la simulation: "))
		.add(new ListItem("Nombre moyen de charognars mort par jour: "))
		.add(new ListItem("Nombre moyen de naissance de charognard par jour: "))
		.add(new ListItem("Nombre moyen de charognard en vie par jour: "))
		.add(new ListItem("Nombre moyen de d�c�s par viellesse par jour: "))
		.add(new ListItem("Nombre moyen de d�c�s autre que viellesse par jour: "))
		.add(new ListItem("Age moyen � la mort: "));
		
		List listDonneSimulationHerbivore =new List()
				.setSymbolIndent(12)
				.setListSymbol("\u2022")
				.setFont(font);
		
		listDonneSimulationHerbivore.add(new ListItem("Nombre totale d'Herbivore sur toute la simulation: "))
		.add(new ListItem("Nombre d'individus au d�but de la simulation: "))
		.add(new ListItem("Nombre d'individus � la fin de la simulation: "))
		.add(new ListItem("Nombre moyen d'herbivore mort par jour: "))
		.add(new ListItem("Nombre moyen de naissance d'herbivore par jour: "))
		.add(new ListItem("Nombre moyen d'herbivore en vie par jour: "))
		.add(new ListItem("Nombre moyen de d�c�s par viellesse par jour: "))
		.add(new ListItem("Nombre moyen de d�c�s autre que viellesse par jour: "))
		.add(new ListItem("Age moyen � la mort: "));
		

		// ajout des �lements dans le pdf

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


		document.close();

		System.out.println("Les donn�es statistiques de cette mod�lisation sont disponible dans le dossier compte_rendu de l'application. Le document est en format PDF et se nomme: "+ nomFichier);

		//try {
		//Desktop.getDesktop().browse(new URI ("compte_rendu/p10.pdf"));
		//} catch (IOException e) {
		//System.err.println("Impossible de trouver ce fichier.");
		//} catch (URISyntaxException e) {
		//System.err.println("L'URL fournie est incorrecte.");
		//}




	}



}




