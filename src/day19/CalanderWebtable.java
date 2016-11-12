package day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalanderWebtable {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void calanderTest()
	{
		driver.findElement(By.id("OneWay")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		driver.findElement(By.id("ToTag")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
		driver.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		String doj="10/06/2018";
		String[] a=doj.split("/");
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int x=Integer.parseInt(a[1]);
		
		String month=months[x-1];
		String year=a[2];
		String day=a[0];
		String calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calYear.equals(year))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calMonth.equals(month))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		WebElement calander=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table"));
		List<WebElement> rows=calander.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(day))
				{
					cols.get(j).click();
					break;
				}
			}
		}
		driver.findElement(By.id("SearchBtn")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
