package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("c:/users/sai/desktop/Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		int rowCount=ws.getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			Row r=ws.getRow(i);
			int cellCount=r.getLastCellNum();
			for(int j=0;j<cellCount;j++)
			{
				Cell c=r.getCell(j);
			    System.out.print(c.getStringCellValue()+"   ");
			}
			System.out.println();
		}
	}

}
