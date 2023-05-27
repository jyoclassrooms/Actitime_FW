package TestScripts;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utility.CaptureScreenshot;

public class Customer extends Base
{
	@Test(dataProvider = "createcustomer",dataProviderClass =dataprovider.Customer.class )
	public void Verify_create_customer(String Customer_name,String Customer_description) throws InterruptedException, IOException
	{
		pageobjects.Customer  cust=new pageobjects.Customer(driver);
		
	    cust.gettask().click();
		Thread.sleep(500);
		cust.getproject_customer().click();
		Thread.sleep(500);
		cust.getCreate_New_customer().click();
		Thread.sleep(500);
		cust.getname().sendKeys(Customer_name);
		cust.getdescription().sendKeys(Customer_description);
		cust.getcreatecust_btn().click();
		new CaptureScreenshot().windowScreenshot("customercreation_"+Customer_name,driver);
		log.info("customercreation_"+Customer_name+"successfull");
	  
	}
	
	
	

}
