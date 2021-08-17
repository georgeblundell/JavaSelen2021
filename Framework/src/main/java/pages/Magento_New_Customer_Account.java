package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;

import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://robotframework.cloud.testinsights.io/app/#!/module-collection/guid/d4838622-ee2c-4740-9f51-7adf3d176b52
@TestModellerModule(guid = "d4838622-ee2c-4740-9f51-7adf3d176b52")
public class Magento_New_Customer_Account extends BasePage
{
	public Magento_New_Customer_Account (WebDriver driver)
	{
		super(driver);
	}


	
	private By First_NameElem = By.xpath("//label[normalize-space()= 'First Name']/../div/input");

	private By Last_NameElem = By.xpath("//label[normalize-space()= 'Last Name']/../div/input");

	private By EmailElem = By.xpath("//label[normalize-space()= 'Email']/../div/input");

	private By PasswordElem = By.xpath("//label[normalize-space()= 'Password']/../div/input");

	private By _Confirm_Password_Elem = By.xpath("//label[normalize-space()= 'Confirm Password']/../div/input");

	private By _Create_an_Account_Elem = By.xpath("//BUTTON[@title='Create an Account']");


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://magento.nublue.co.uk/customer/account/create/";

        if (!currentUrl.equals("https://magento.nublue.co.uk/customer/account/create/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Create an Account 
     * @name Click  Create an Account 
     */
	public void Click__Create_an_Account_()
	{
        
		WebElement elem = getWebElement(_Create_an_Account_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Create_an_Account_", "Click__Create_an_Account_ failed. Unable to locate object: " + _Create_an_Account_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Create_an_Account_", "Click__Create_an_Account_ failed. Unable to locate object: " + _Create_an_Account_Elem.toString());

			Assert.fail("Unable to locate object: " + _Create_an_Account_Elem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click__Create_an_Account_");

		TestModellerLogger.PassStep(m_Driver, "Click__Create_an_Account_");
	}
      
	/**
 	 * Enter  Confirm Password 
     * @name Enter  Confirm Password 
     */
 	public void Enter__Confirm_Password_(String _Confirm_Password_)
 	{
 	    
 		WebElement elem = getWebElement(_Confirm_Password_Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter__Confirm_Password_", "Enter__Confirm_Password_ failed. Unable to locate object: " + _Confirm_Password_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter__Confirm_Password_", "Enter__Confirm_Password_ failed. Unable to locate object: " + _Confirm_Password_Elem.toString());

 			Assert.fail("Unable to locate object: " + _Confirm_Password_Elem.toString());
         }

 		elem.sendKeys(_Confirm_Password_);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter__Confirm_Password_ " + _Confirm_Password_);

  		TestModellerLogger.PassStep(m_Driver, "Enter__Confirm_Password_ " + _Confirm_Password_);
 	}
      
	/**
 	 * Enter Email
     * @name Enter Email
     */
 	public void Enter_Email(String Email)
 	{
 	    
 		WebElement elem = getWebElement(EmailElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Email", "Enter_Email failed. Unable to locate object: " + EmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Email", "Enter_Email failed. Unable to locate object: " + EmailElem.toString());

 			Assert.fail("Unable to locate object: " + EmailElem.toString());
         }

 		elem.sendKeys(Email);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Email " + Email);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Email " + Email);
 	}
      
	/**
 	 * Enter First Name
     * @name Enter First Name
     */
 	public void Enter_First_Name(String First_Name)
 	{
 	    
 		WebElement elem = getWebElement(First_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_First_Name", "Enter_First_Name failed. Unable to locate object: " + First_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_First_Name", "Enter_First_Name failed. Unable to locate object: " + First_NameElem.toString());

 			Assert.fail("Unable to locate object: " + First_NameElem.toString());
         }

 		elem.sendKeys(First_Name);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_First_Name " + First_Name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_First_Name " + First_Name);
 	}
      
	/**
 	 * Enter Last Name
     * @name Enter Last Name
     */
 	public void Enter_Last_Name(String Last_Name)
 	{
 	    
 		WebElement elem = getWebElement(Last_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Last_Name", "Enter_Last_Name failed. Unable to locate object: " + Last_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Last_Name", "Enter_Last_Name failed. Unable to locate object: " + Last_NameElem.toString());

 			Assert.fail("Unable to locate object: " + Last_NameElem.toString());
         }

 		elem.sendKeys(Last_Name);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Last_Name " + Last_Name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Last_Name " + Last_Name);
 	}
      
	/**
 	 * Enter Password
     * @name Enter Password
     */
 	public void Enter_Password(String Password)
 	{
 	    
 		WebElement elem = getWebElement(PasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

 			Assert.fail("Unable to locate object: " + PasswordElem.toString());
         }

 		elem.sendKeys(Password);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Password " + Password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Password " + Password);
 	}
	public void GoToUrl()
	{
		m_Driver.get("https://magento.nublue.co.uk/customer/account/create/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://magento.nublue.co.uk/customer/account/create/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://magento.nublue.co.uk/customer/account/create/");
	}
}