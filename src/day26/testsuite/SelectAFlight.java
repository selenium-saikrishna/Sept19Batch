package day26.testsuite;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectAFlight  extends BaseClass{
	
	@Test
	public void selectFlightTest() throws IOException
	{
		sc.captureScreenshot(driver,screenshotPath+"SelectAFlight.png" );
		driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']")).click();
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
		
	}
	
	

}










