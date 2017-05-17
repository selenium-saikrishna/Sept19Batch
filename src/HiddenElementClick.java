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
	}
	
	@Test
	public void alertTest()
	{
		//driver.navigate().refresh();
		
		//WebElement emailUs=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a"));
		Sleeper.sleepTightInSeconds(4);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String str=js.executeScript("return document.title;").toString();
		System.out.println(str);
	}
}
