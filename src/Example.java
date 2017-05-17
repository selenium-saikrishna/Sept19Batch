import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		List<WebElement> elements=driver.findElements(By.xpath("//form[@id='frmList_ohrmListComponent']/div[@class='top']/following::*"));
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getTagName());
			System.out.println(elements.get(i).getAttribute("id"));
		}
		

	}

}
