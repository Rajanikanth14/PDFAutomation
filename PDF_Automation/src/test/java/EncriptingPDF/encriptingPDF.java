package EncriptingPDF;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;

public class encriptingPDF 
{

	public static void main(String[] args) throws IOException 
	{
		    File Pdffile = new File("C:\\Users\\hp\\Desktop\\Notes\\PDF\\CV2.pdf");
	        
	        PDDocument document = PDDocument.load(Pdffile);
	        
	      //Creating access permission object
	        AccessPermission ap = new AccessPermission(); 
	        
	        // Creating StandardProtectionPolicy object
	        StandardProtectionPolicy spp = new StandardProtectionPolicy("1234", "1234", ap);
	        
	      //Setting the length of the encryption key
	        spp.setEncryptionKeyLength(128); // Options: 40, 128, 256
	        
	      //Protecting the document
	        spp.setPermissions(ap);

	        // Encrypt the document
	        document.protect(spp);
	        document.save("C:\\Users\\hp\\Desktop\\Notes\\PDF\\CV2.pdf");
	        document.close(); // Close the document
	        System.out.println("PDF encrypted successfully.");

	}

}
