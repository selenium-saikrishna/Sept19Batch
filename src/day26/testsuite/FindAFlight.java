package day26.testsuite;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindAFlight extends BaseClass {
	
	@Test
	public void findFlightTest() throws IOException
	{
		sc.captureScreenshot(driver,screenshotPath+"FindAFlight.png" );
		driver.findElement(By.name("passCount")).sendKeys("2");
		driver.findElement(By.name("fromPort")).sendKeys("London");
		driver.findElement(By.name("findFlights")).click();
		
	}

}













