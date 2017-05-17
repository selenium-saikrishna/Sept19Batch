package day34;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class DBTesting1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
		FileInputStream file=new FileInputStream("c:\\users\\sai\\desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		
		Connection conn=null;
		
		String url="jdbc:mysql://localhost:3306/";
		String dbname="sys";
		String DBdriver="com.mysql.jdbc.Driver";
		String userName="root";
		String password="krishna";
		
		Class.forName(DBdriver).newInstance();
		conn=DriverManager.getConnection(url+dbname,userName,password);
		
		PreparedStatement psmt=conn.prepareStatement("select * from emp");
		
		ResultSet rs=psmt.executeQuery();
		int i=0;
		while(rs.next())
		{
			r=ws.createRow(i);
			for(int j=1;j<=8;j++)
				//r.createCell(j-1).setCellValue(rs.getString(j));
				//driver.findElement(By.id(id)).sendKeys(rs.getString(j))
			i++;
		}
		
		conn.close();
		FileOutputStream f=new FileOutputStream("c:\\users\\sai\\desktop\\Book1.xlsx");
		wb.write(f);
		
		
		
		
		

	}

}
