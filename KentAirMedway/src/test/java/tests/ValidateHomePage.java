package tests;



import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BaseDriver;
import Utilities.GenericMethods;
import pageClasses.HomePage;

public class ValidateHomePage extends BaseDriver
{
	GenericMethods g;
	
	HomePage h;
	
	@BeforeTest
	
	public void beforeTest()
	{
		launchBrowser();
		
		navigateToURL("https://www.kentair.org.uk/");
	}
	
	
	@Test
	
	public  void validateTitle()
	{
		g = new GenericMethods(driver);
		
		h = new HomePage(driver);
		
		Assert.assertEquals(g.getTitleOfPage(), "Kent and Medway Air Quality");
		
		h.clickOnAcceptCookies();
	}
	
	@AfterTest
	
	public void afterTest()
	{
		closeBrowser();
	}

}
