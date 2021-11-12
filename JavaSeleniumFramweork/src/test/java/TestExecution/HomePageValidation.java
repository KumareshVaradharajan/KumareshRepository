package TestExecution;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePackage.DriverConfig;
import PageObject.HomePageObjects;

public class HomePageValidation extends DriverConfig 
{
	
	@BeforeTest
	public void LaunchUrl()
	{
		driver = BaseClass();
		driver.get("https://www.linkedin.com/signup");
	}
	
	@Test
	public void EnterUname()
	{
		HomePageObjects Home = new HomePageObjects(driver);
		Home.Uname().sendKeys("Hello");
		
	}

	@Test(priority=2)
	public void EnterPassword()
	{
		HomePageObjects Home = new HomePageObjects(driver);
		Home.Pword().sendKeys("Pwd");
	}
}
