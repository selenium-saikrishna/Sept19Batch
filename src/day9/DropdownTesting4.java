package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownTesting4 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://goair.in");
		//id of 'From' drop down;
		WebElement fromDrop=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> dropdown=fromDrop.findElements(By.tagName("option"));
		for(int i=0;i<dropdown.size();i++)
		{
			String city=dropdown.get(i).getText();
			dropdown.get(i).click();
			//id of 'To' drop down
			WebElement toDrop=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
			if(toDrop.getText().contains(city))
			{
				System.out.println(city+" is not working correctly");
			}
			else
			{
				System.out.println(city+" is  working correctly");
			}
		}
		driver.close();
		
		
	}

}
