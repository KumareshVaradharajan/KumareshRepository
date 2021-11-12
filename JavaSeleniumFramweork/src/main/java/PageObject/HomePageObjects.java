package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasePackage.DriverConfig;

public class HomePageObjects
{
	public WebDriver driver;
	
	By username = By.cssSelector("input[name='email-or-phone']");
	By password = By.xpath("//input[@id='password']");
	
	
	public HomePageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement Uname()
	{
		return driver.findElement(username);
	}
	
	public WebElement Pword()
	{
		return driver.findElement(password);		
	}

}
