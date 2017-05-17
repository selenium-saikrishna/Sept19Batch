package day26.testsuite;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.projectname.utility.Screenshots;

public class BaseClass {

	static FirefoxDriver driver=null;
	Screenshots sc=new Screenshots();
	String screenshotPath=".\\src\\com\\projectname\\screenshots\\";
	
}
