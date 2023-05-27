package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer 
{
  WebDriver driver;
  
  @FindBy(xpath = "//a[@class='content tasks']//img[@class='sizer']")
  private WebElement task;
	
  @FindBy(xpath="//a[normalize-space()='Projects & Customers']")
  private WebElement project_customer;
  
  
  @FindBy(xpath = "//input[@value='Create New Customer']")
  private WebElement create_newCustomer;
  
  @FindBy(xpath = "//input[@name='name']")
  private WebElement name;
  
  @FindBy(xpath = "//textarea[@name='description']")
  private WebElement description;  
  
  @FindBy(xpath = "//input[@name='createCustomerSubmit']")
  private WebElement createcustomer_btn;
  
  public WebElement gettask()
  {
	  return task;
  }
	
  public WebElement getproject_customer()
  {
	  return project_customer;
  }
  public WebElement getCreate_New_customer()
  {
	  return create_newCustomer;
  }
  
  public WebElement getname()
  {
	  return  name;
  }
  
  public WebElement getdescription()
  {
	  return description;
  }
  
  public WebElement getcreatecust_btn()
  {
	  return createcustomer_btn;
  }
  
  public Customer(WebDriver driver) 
  {
	PageFactory.initElements(driver,this);
  }
  
	
}
