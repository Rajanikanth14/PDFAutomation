package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver 
{
	public WebDriver driver;
	
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void navigateToURL(String url)
	{
		driver.get(url);
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	

}
