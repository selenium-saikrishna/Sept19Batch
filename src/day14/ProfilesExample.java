package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProfilesExample {
	
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumProfile");
		driver=new FirefoxDriver(fp);
		driver.get("http://msn.com");
	}
	
	@Test
	public void profilesTest()
	{
		driver.findElement(By.id("q")).sendKeys("Selenium");
		
	}

}
