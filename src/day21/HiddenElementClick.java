package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HiddenElementClick {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://yssofindia.org");
		driver.manage().window().maximize();
	}
	@Test
	public void hiddenElementTest()
	{
		
		
		//WebElement emailUs=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a"));
		Sleeper.sleepTightInSeconds(4);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='http://facebook.com';");
		//js.executeScript("arguments[0].click();",emailUs);*/
	}

}
