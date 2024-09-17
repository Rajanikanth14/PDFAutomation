package pageClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	
	@FindBy(xpath = "//button[@id='banner-accept-cookies']")
	WebElement btnacceptCookies;
	
	@FindBy(xpath = "//li[@class='navbar__item']")
	List<WebElement> headers;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAcceptCookies()
	{
		btnacceptCookies.click();
	}
	
	public List<String> validateHeaders()
	{
		List<String> allheaders = new ArrayList<String>();
				for(WebElement w : headers)
				{
					allheaders.add(w.getText());
				}
		
		return allheaders;
	}
	
	

}
