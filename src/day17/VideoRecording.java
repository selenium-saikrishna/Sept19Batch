package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class VideoRecording {

	/**
	 * @param args
	 * @throws ATUTestRecorderException 
	 */
	public static void main(String[] args) throws ATUTestRecorderException {
		ATUTestRecorder recorder=new ATUTestRecorder("c:\\users\\sai\\desktop\\Recording\\","OrangeHRM",false);
		recorder.start();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.id("welcome")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		recorder.stop();

	}

}
