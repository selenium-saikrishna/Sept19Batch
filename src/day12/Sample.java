package day12;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	//setting priority to test cases
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("This is for login functionality");
	}
	@Test(priority=1)
	public void registrationTest()
	{
		System.out.println("This is for registration");
	}
	//ignoring test cases
	@Test(enabled=false)
	public void logout()
	{
		System.out.println("This is for logout");
	}
	@BeforeMethod
	public void function()
	{
		System.out.println("ABCD");
	}

}
