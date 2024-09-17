package Utilities;

import org.openqa.selenium.WebDriver;

public class GenericMethods 
{
	WebDriver driver;
	
	public GenericMethods(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		
		return null;
		
	}

}
