package day21;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertHandling {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
	@Test
	public void alertTest()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello Friends');");
		Sleeper.sleepTightInSeconds(5);
		alertHandle();
		
		
		
	}
	public void alertHandle()
	{
		try
		{
			Alert myAlert=driver.switchTo().alert();
			myAlert.accept();
		}
		catch(Exception e)
		{
			
		}
	}

}
