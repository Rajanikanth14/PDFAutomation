package ReadPdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPDF 
{
	public static void main(String[] args) throws IOException 
	{
		File Pdffile = new File("C:\\Users\\hp\\Desktop\\Notes\\PDF\\CV.pdf");
		
		// Load PDF Document
		
		PDDocument document = PDDocument.load(Pdffile);
		
		// Counting Pages in a PDF
		
	//	PDPageTree pages = document.getPages();
     //   int pageCount = pages.getCount();
		
		int pageCount =document.getNumberOfPages();
        System.out.println("Number of Pages: " + pageCount);
		
        // Extracting Text from a PDF
        
        PDFTextStripper pdfStripper = new PDFTextStripper();
        String text = pdfStripper.getText(document);
        
        System.out.println("Extracted Text: ");
        System.out.println(text); 
        
        // Validating Text in a PDF
        
        if (text.contains("MySQL")) 
        {
            System.out.println("Validation passed!");
        } 
        else 
        {
            System.out.println("Validation failed: Keyword not found.");
        }
        
        // Extracting Metadata
        
        PDDocumentInformation info = document.getDocumentInformation();
        System.out.println("Title: " + info.getTitle());
        System.out.println("Author: " + info.getAuthor());
        System.out.println("Subject: " + info.getSubject());
        System.out.println("Keywords: " + info.getKeywords());
        
        
        // Checking PDF Encryption
        
        boolean isEncrypted = document.isEncrypted();
        System.out.println("Is PDF encrypted? " + isEncrypted);
       
        
        document.close();

	}

}
