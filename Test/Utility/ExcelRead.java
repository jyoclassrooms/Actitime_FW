package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static Object[][]  Readdata() throws InvalidFormatException, IOException 
	{
		FileInputStream f=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\demo\\a.xlsx");
		Workbook  wb =new XSSFWorkbook(f);
		Sheet sh=wb.getSheet("Sheet1");

		String[][] obj=new String[sh.getLastRowNum()+1][sh.getRow(0).getLastCellNum()];
		//to convert excel to array format
	    for(int i=0;i<=sh.getLastRowNum();i++)
	    {
	    	for(int j=0;j<=sh.getRow(0).getLastCellNum()-1;j++)
	    	{
	    		obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
	    	}	
	    }
		return obj;
	}

}
