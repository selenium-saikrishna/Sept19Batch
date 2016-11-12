package day31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CloudTesting {
	
	@Parameters("browser")
	@Test
	public void cloudTest(String b) throws IOException
	{
		DesiredCapabilities caps=null;
		if(b.equals("firefox"))
		{
			caps = DesiredCapabilities.firefox();
			caps.setCapability("platform", "Windows 7");
			caps.setCapability("version", "45.0");
		}
		else if(b.equals("chrome"))
		{
			caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Linux");
			caps.setCapability("version", "48.0");
		}
		else if(b.equals("safari"))
		{
			caps = DesiredCapabilities.safari();
			caps.setCapability("platform", "OS X 10.11");
			caps.setCapability("version", "10.0");
		}
		
		String USERNAME = "mohanmotupalli";
		String ACCESS_KEY = "776f5ae1-c4b2-4605-99ec-db1f2ecbc0e7";
		String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("country"));
	    List<WebElement> dropdown=drop.findElements(By.tagName("option"));
	    System.out.println(dropdown.size());
	    for(int i=0;i<dropdown.size();i++)
	    {
	    	dropdown.get(i).click();
	    	if(dropdown.get(i).isSelected())
	    	{
	    	   System.out.println(dropdown.get(i).getText()+" is active");
	        }
	    	else
	    	{
	    		System.out.println(dropdown.get(i).getText()+" is inactive");
	    	}
	    }
	}

}
