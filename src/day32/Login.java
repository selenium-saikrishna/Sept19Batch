package day32;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login  extends BaseClass{
	
	@Test
	public void loginTest()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
	}

}











