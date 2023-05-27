package TestScripts;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import pageobjects.Login;

public class Base 
{
  public WebDriver driver=null;
  public Logger log=Logger.getLogger("devpinoyLogger");
   SoftAssert sft=new SoftAssert();
   
   @BeforeMethod
  public void login()
   {
	Login lgn=new Login(driver); 
	lgn.username().sendKeys("admin");
	lgn.password().sendKeys("manager");
	lgn.login_button().click();
	 Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
   }
	
	
  @AfterMethod
  public void logout()
  {
	  driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
  }
	
  @BeforeClass
  @Parameters({"browser","url"})
  public void launchbrowser(String browser,String url)
  {
	  System.out.println("launch browser");
	 
	  switch(browser)
	  {
	  case "chrome":
	  driver=new ChromeDriver();
	  break;
	  case "edge":
	  driver=new EdgeDriver();
	  break;
	  case "firefox":
	  driver=new FirefoxDriver();
	  break;	  
	  }
	  
	  driver.get(url);
  }
  
  @AfterClass
  public void closebrowser()
  {
	  System.out.println("close the browser");
	  driver.close();
	  sft.assertAll();
  }
  
  @BeforeTest
  public void dbconnection()
  {
	  System.out.println("DB connection");
  }
  
  @AfterTest
  public void closedbconnection()
  {
	  System.out.println("close DB connection");
  }
  
}
