package day27;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileuploadAutoit {

	
	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://imgur.com");
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.className("browse-btn")).click();
		Sleeper.sleepTightInSeconds(3);
		java.lang.Runtime.getRuntime().exec("c:\\users\\sai\\desktop\\upload.exe");

	}

}
