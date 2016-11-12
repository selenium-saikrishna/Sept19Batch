package day32;

import org.junit.Test;
import org.openqa.selenium.By;


public class BookAFlight  extends BaseClass{
	@Test
	public void bookaFlightTest()
	{
		driver.findElement(By.name("passFirst0")).sendKeys("Sai");
		driver.findElement(By.name("passLast0")).sendKeys("Krishna");
		driver.findElement(By.name("creditnumber")).sendKeys("1111111111");
		driver.findElement(By.name("buyFlights")).click();
		
	}

}














