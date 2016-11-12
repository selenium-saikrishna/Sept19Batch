package day2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://bing.com");

		
		String title1=driver.getTitle();
		driver.findElement(By.linkText("Help")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			String title2=driver.getTitle();
			if(!title1.equals(title2))
			{
				driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
				break;
			}
		}
		
		
	}

}












