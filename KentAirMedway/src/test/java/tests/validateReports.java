package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BaseDriver;
import pageClasses.HomePage;
import pageClasses.ReportsPage;

public class validateReports extends BaseDriver {
 
	HomePage h;
	
	ReportsPage r;
	
	@BeforeTest
	
	public void beforeTest()
	{
		launchBrowser();
		
		navigateToURL("https://www.kentair.org.uk/");
	}
	



	@Test
	
	public void displayReportDetails() throws Exception {
		
		h=new HomePage(driver);
		
		r=new ReportsPage(driver);
		
		h.clickOnAcceptCookies();
		
		r.validateReportDetails();
		
		
	}
	
	@AfterTest
	
	public void afterTest()
	{
		closeBrowser();
	}

	
	}