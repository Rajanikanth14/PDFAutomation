package pageClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GenericMethods;

public class ReportsPage {
	
	WebDriver driver;

	GenericMethods g;
	
	
	@FindBy(xpath="//a[text()='Reports']")
	WebElement lnkReports;
	
	@FindBy(xpath="//tbody[@data-testid='reportItems_body']//tr//td[1]")
	List<WebElement> reportTitle;

	public ReportsPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	
	public void validateReportDetails() throws Exception {
		
		g=new GenericMethods(driver);
		
		g.clikOnElement(lnkReports);
		
		Thread.sleep(3000);
		
		for(WebElement rp : reportTitle) {
			
			System.out.println(rp.getText());
			
			
		}
		
		
	}
}
