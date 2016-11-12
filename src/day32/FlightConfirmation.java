package day32;

import org.junit.Test;
import org.openqa.selenium.By;


public class FlightConfirmation extends BaseClass {
	@Test
	public void flightConfirmTest()
	{
		String expmsg="Your itinerary has been booked!";
		String actmsg=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		if(actmsg.equals(expmsg))
		{
			System.out.println("Booking successfull");
		}
		else
		{
			System.out.println("Booking unsuccessfull");
		}
		driver.close();
	}

}
