package TestExecution;



import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.PageObjectsClass;
import driverPackage.BaseClass;

public class TestProgram extends BaseClass {
	
	@BeforeTest
	public void OpenUrl()
	{
		driver = BrowserInvocation();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void ClickLanguage()
	{
		PageObjectsClass Po = new PageObjectsClass(driver);
		Po.facebookHomeScreen().click();
				
	}
	
	
}
