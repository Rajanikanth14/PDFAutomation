package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		
		return title;
		
	}
	
	public void clikOnElement(WebElement w) {
		
		w.click();
	}

}
