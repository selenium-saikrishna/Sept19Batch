package stepDefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	static FirefoxDriver driver=null;
	@Given("^we launch the browser and navigate to OrangeHRM page$")
	public void we_launch_the_browser_and_navigate_to_OrangeHRM_page() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com/");
	    
	    
	}

	@When("^we enter the username and password$")
	public void we_enter_the_username_and_password() throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    
	    
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^it should display welcome admin msg$")
	public void it_should_display_welcome_admin_msg() throws Throwable {
	    String expmsg="Welcome Admin";
	    String actmsg=driver.findElement(By.id("welcome")).getText();
	    Assert.assertEquals(expmsg, actmsg);
	    
	}
	
	@When("^we click on welcome admin$")
	public void we_click_on_welcome_admin() throws Throwable {
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("welcome")).click();
	    Sleeper.sleepTightInSeconds(2);
	}

	@When("^click on logout$")
	public void click_on_logout() throws Throwable {
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^it should come to the home page$")
	public void it_should_come_to_the_home_page() throws Throwable {
	    String expurl="http://opensource.demo.orangehrmlive.com/index.php/auth/login";
	   String acturl= driver.getCurrentUrl();
	   Assert.assertEquals(acturl, expurl);
	}



	
}
