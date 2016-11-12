package day24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenTesting3 {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://care.ideacellular.com/wps/portal/account/express-paybill?gclid=CJ-Tn76K9c8CFdERaAod2JoGAA#Z7_JH56H4K0K8MP90AS8PIGS60CN3?iFrameAction=com.idea.selfcare.action.UrlRedirectAction");
		driver.manage().window().maximize();
	}
	
	@Test
	public void ajaxTest() throws IOException
	{
		FileInputStream file=new FileInputStream(".\\src\\com\\projectname\\excelfiles\\Ajaxdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rowCount=ws.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			Row r=ws.getRow(i);
			String phno=r.getCell(0).getStringCellValue();
			driver.findElement(By.name("mobileNumber")).clear();
			driver.findElement(By.name("mobileNumber")).sendKeys(phno);
			driver.findElement(By.name("amountPaid")).click();
			WebElement ajax=driver.findElement(By.xpath("//*[@id='errorHolder']/label"));
			String actajax=null;
			if(ajax.getText().isEmpty())
			{
				actajax="No Ajax";
			}
			else
			{
				actajax=ajax.getText();
			}
			r.createCell(2).setCellValue(actajax);
			String expajax=r.getCell(1).getStringCellValue();
			if(actajax.equals(expajax))
			{
				r.createCell(3).setCellValue("PasseD");
			}
			else
			{
				r.createCell(3).setCellValue("Failed");
			}
		}
		FileOutputStream f=new FileOutputStream
	            (".\\src\\com\\projectname\\resultexcelfiles\\ajaxdata.xlsx");
wb.write(f);
driver.close();
	}
}
