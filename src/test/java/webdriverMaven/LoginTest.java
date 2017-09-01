package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Swathi\\Desktop\\Swathi-workspace\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin()
	{
		driver.get("http://www.gmail.com");
		//driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
		//driver.findElement(By.id("Passwd")).sendKeys("123");
		
	}

	@AfterSuite
	public void tearDown(){
		
		driver.quit();
	}
}
