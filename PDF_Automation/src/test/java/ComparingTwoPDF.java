import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ComparingTwoPDF 
{

	public static void main(String[] args) throws IOException 
	{
		File file1 = new File("C:\\Users\\hp\\Desktop\\Notes\\PDF\\CV3.pdf");
		File file2 = new File("C:\\Users\\hp\\Desktop\\Notes\\PDF\\CV.pdf");
		
		PDDocument doc1 = PDDocument.load(file1);
		PDDocument doc2 = PDDocument.load(file2);

		boolean pageequals = doc1.getNumberOfPages() == doc2.getNumberOfPages(); // Compare page counts
		System.out.println("PDFs are number of pages: " + pageequals);

		String text1 = new PDFTextStripper().getText(doc1);
		String text2 = new PDFTextStripper().getText(doc2);
		boolean areEqual =  text1.equals(text2); // Check if text content is identical
		System.out.println("PDFs are equal: " + areEqual);

		doc1.close();
		doc2.close();

	}

}
