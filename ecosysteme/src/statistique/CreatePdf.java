package statistique;

import java.io.IOException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

 

public class CreatePdf {    
   
      public static final String DEST = "compte_rendu/p.pdf";
      
      public static void main(String args[]) throws IOException {
        PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
        Document document = new Document(pdf);
        
        String para1 = "Suite a cette simulation voici les statistiques qui ont été observé:";  
        
        String para2 = "nous observons les graphiqe suivant:";
        
        String para3 = "Nous esperons que cette simulation a pus vous éclairer dans vos recherche.";              
        
        // Creating Paragraphs       
        Paragraph paragraph1 = new Paragraph(para1);             
        Paragraph paragraph2 = new Paragraph(para2);
        Paragraph paragraph3 = new Paragraph(para3);
        
        
        document.add(paragraph1);
        document.add(paragraph2);
        document.add(paragraph3);
        
        
        document.close();
        document.getPdfDocument();

        System.out.println("Awesome PDF just got created.");
      }
    }
      

   
   
