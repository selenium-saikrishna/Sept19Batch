package day26.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindAFlight extends BaseClass {
	
	@Test
	public void findFlightTest()
	{
		driver.findElement(By.name("passCount")).sendKeys("2");
		driver.findElement(By.name("fromPort")).sendKeys("London");
		driver.findElement(By.name("findFlights")).click();
		
	}

}













