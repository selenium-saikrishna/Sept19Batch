package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownTesting2 {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		//id of the dropdown
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		System.out.println(drop.getText());
		
		
		/*List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		System.out.println("Total options in the dropdown is "+dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			System.out.println(dropdown.get(i).getText());
		}
		driver.close();*/

	}

}







