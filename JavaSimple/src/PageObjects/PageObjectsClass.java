package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverPackage.BaseClass;

public class PageObjectsClass extends BaseClass {
	
	public WebDriver driver;
	
	public PageObjectsClass(WebDriver driver)
	{
		this.driver = driver;
	}


	public WebElement facebookHomeScreen() {
		// TODO Auto-generated method stub
		
		By Language = By.xpath("//a[@class='_sv4']");
		
		WebElement English = driver.findElement(Language);
		return English;
		
	}

}
