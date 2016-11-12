import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxLaunch 
{

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	{
		/*FirefoxDriver  driver=new FirefoxDriver();
		driver.get("http://google.com");*/
		String abc="org.openqa.selenium.firefox.FirefoxDriver";
		
		Class.forName(abc).newInstance();

	}

}
