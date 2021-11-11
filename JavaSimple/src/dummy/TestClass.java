package dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	
	
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\Driver\\Chrome driver folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='email-or-phone']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pwd");
	}

}
