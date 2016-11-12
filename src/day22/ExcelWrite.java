package day22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

		public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("c:/users/sai/desktop/Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		//to modify an existing cell
		Row r=ws.getRow(0);
		Cell c=r.getCell(1);
		c.setCellValue("abc");
		
		//to write into a blank cell in an existing  row
		r=ws.getRow(1);
		c=r.createCell(2);
		c.setCellValue("Xyz");
		
		//to write into a blank row and blank cell
		r=ws.createRow(3);
		c=r.createCell(0);
		c.setCellValue("AAA");
		
		FileOutputStream f=new FileOutputStream("c:/users/sai/desktop/Book1.xlsx");
		wb.write(f);
		
		
		

	}

}
