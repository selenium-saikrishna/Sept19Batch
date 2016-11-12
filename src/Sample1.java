import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.dice.com/jobs?q=sdet&l=&searchid=7390828143857");
		driver.findElement(By.xpath(".//*[@id='jobTypes']/div[1]/span")).click();

	}

}
