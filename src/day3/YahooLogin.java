package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLogin {
	
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("htto://yahoomail.com");
		driver.findElement(By.name("username")).sendKeys("saikrishna_rhce");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("asdfg");
		driver.findElement(By.id("login-signin")).click();
		
		
	}

}







