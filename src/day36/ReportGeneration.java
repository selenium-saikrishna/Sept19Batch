package day36;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class ReportGeneration {

	public static void main(String[] args) throws ATUTestRecorderException, IOException {
		ExtentReports reports=new ExtentReports("c:\\users\\sai\\desktop\\myReport.html",true);
		ExtentTest test=reports.startTest("Sample Test");
		ATUTestRecorder recorder=new ATUTestRecorder("c:\\users\\sai\\desktop\\Recording\\","newTours",false);
		recorder.start();
		FirefoxDriver driver=new FirefoxDriver();
		test.log(LogStatus.INFO,"Browser launced");
		
		driver.get("http://newtours.demoaut.com");
		test.log(LogStatus.INFO,"Navigated to new tours");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		test.log(LogStatus.INFO,"Entered usser name");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("c:\\users\\sai\\Desktop\\newtours.png"));
		recorder.stop();
		test.addScreenCapture("c:\\users\\sai\\Desktop\\newtours.png");
		test.addScreencast("c:\\users\\sai\\desktop\\Recording\\newTours.mov");
		
		reports.endTest(test);
		reports.flush();
		
		
		

	}

}
