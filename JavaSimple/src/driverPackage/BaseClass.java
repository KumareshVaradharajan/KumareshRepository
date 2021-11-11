package driverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	 public WebDriver driver;
	 String Browser="Firefox";
	
	public WebDriver BrowserInvocation() 
	{
		if(Browser.equals("Chrome"))
		{		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\Driver\\Chrome driver folder\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(Browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium files\\Driver\\Gecko driver folder\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}
		return driver;
		
	}
	
	

}
