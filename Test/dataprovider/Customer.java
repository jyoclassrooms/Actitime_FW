package dataprovider;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

import Utility.ExcelRead;

public class Customer 
{

	@DataProvider(name = "createcustomer")
	public Object[][] createcustomer() throws InvalidFormatException, IOException
	{
		return new ExcelRead().Readdata();
	}
	
	
}
