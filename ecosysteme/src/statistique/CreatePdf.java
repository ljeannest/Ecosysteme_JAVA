package statistique;

import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 
import com.itextpdf.layout.Document; 
import com.itextpdf.layout.element.Paragraph;
 

public class CreatePdf {    
   public static void main(String args[]) throws Exception {
      // Creating a PdfWriter       
      String dest = "compte_rendu/pdf";       
      PdfWriter writer = new PdfWriter(dest);           
      
      // Creating a PdfDocument       
      PdfDocument pdf = new PdfDocument(writer);              
      
      // Creating a Document        
      Document document = new Document(pdf);              
      String para1 = "Suite a cette simulation voici les statistiques qui ont été observé:";  
      
      String para2 = "nous observons les graphiqe suivant:";
      
      String para3 = "Nous esperons que cette simulation a pus vous éclairer dans vos recherche.";              
      
      // Creating Paragraphs       
      Paragraph paragraph1 = new Paragraph(para1);             
      Paragraph paragraph2 = new Paragraph(para2);
      Paragraph paragraph3 = new Paragraph(para3);
      
      // Adding paragraphs to document       
      document.add(paragraph1);       
      document.add(paragraph2);           
      
      // Closing the document       
      document.close();             
      System.out.println("Paragraph added");    
   } 
   
   
}  
