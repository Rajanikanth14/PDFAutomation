package downloadingPDFFile;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;



public class CreatePDF 
{
	public static void main(String[] args) throws IOException 
	{
		// Create a new Pdf Document
		
		PDDocument document = new PDDocument();
		
		// Create a new Page
		
		PDPage page = new PDPage(PDRectangle.A4);
		
		document.addPage(page);
		
		// add pages
		
		 for (int i=0; i<4; i++) 
	      {
	         //Creating a blank page 
	         PDPage blankPage = new PDPage();

	         //Adding the blank page to the document
	         document.addPage( blankPage );
	      } 
		 
		 
		 //Removing the pages
	      document.removePage(2);
		
		// Create content stream
		
		PDPageContentStream contentstream = new PDPageContentStream(document, page);
		
		// Font & Size
		
		contentstream.setFont(PDType1Font.HELVETICA,12);  // version of 2.xx
		
	   
	//	contentstream.setFont(new PDType1Font(Standard14Fonts.FontName.HELVETICA), 12);  // version of 3.xx
		
		contentstream.beginText();
		contentstream.newLineAtOffset(50,800);
		contentstream.showText("Hello, Welcome to Pdf Automation Testing");
		contentstream.endText();
		
		contentstream.close();
		
		
		// Save pdf document
		
		document.save("C:\\Users\\hp\\Desktop\\Notes\\PDF\\sample2.pdf");
		
		document.close();
		
		System.out.println("PDF created successfully....");
		
       
	}
	
}
