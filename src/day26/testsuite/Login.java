package day26.testsuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login  extends BaseClass{
	
	@Test
	public void loginTest() throws IOException
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		sc.captureScreenshot(driver,screenshotPath+"Login.png" );
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
	}

}











