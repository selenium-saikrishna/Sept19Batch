package day33.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours {
	@FindBy(name="userName")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement signin;
	public void findAFlight(String u,String p)
	{
		userName.sendKeys(u);
		password.sendKeys(p);
		signin.click();
	}
	
	@FindBy(linkText="your destination")
	WebElement destinations;
	public void destinations()
	{
		destinations.click();
	}
	
	@FindBy(linkText="featured vacation destinations")
	WebElement vacations;
	public void vacations()
	{
		vacations.click();
	}
	@FindBy(linkText="Register here")
	WebElement register;
	public void register()
	{
		register.click();
	}
}



