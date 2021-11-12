package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConfig {
	
	public WebDriver driver;
	String browser = "Mozilla";
	
	public WebDriver BaseClass()
	{
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\Driver\\Chrome driver folder\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("Mozilla"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium files\\Driver\\Gecko driver folder\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
		
	}

}
