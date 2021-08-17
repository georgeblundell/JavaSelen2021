package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://robotframework.cloud.testinsights.io/app/#!/model-engine/guid/18b7032e-b8b5-469f-bb0f-e0c43c4b5238
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 73, profileId = 100006)
public class demo_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"demo","demo - Default Profile"})
    @TestModellerPath(guid = "fcd6a777-005c-44e0-83f6-186f4e732b15")
    public void GoToUrlPositiveEnterEmailPositiveEnterPasswordPasswordClickSignIn()
    {
        
        pages.Magento_New_Customer_Account _Magento_New_Customer_Account = new pages.Magento_New_Customer_Account(driver);
    TestModellerLogger.SetLastNodeGuid("18dac431-ec16-490e-89be-a8897ace1940");
    _Magento_New_Customer_Account.GoToUrl();

    }


    @Test  (groups= {"demo","demo - Default Profile"})
    @TestModellerPath(guid = "81c63ff6-83c3-481c-9b5c-70db1f52c771")
    public void GoToUrlPositiveEnterEmailNegativeEnterPasswordPasswordClickSignIn()
    {
        
        pages.Magento_New_Customer_Account _Magento_New_Customer_Account = new pages.Magento_New_Customer_Account(driver);
    TestModellerLogger.SetLastNodeGuid("18dac431-ec16-490e-89be-a8897ace1940");
    _Magento_New_Customer_Account.GoToUrl();

    }


    @Test  (groups= {"demo","demo - Default Profile"})
    @TestModellerPath(guid = "96d0a762-1216-41aa-91f8-7722bbdf1b8f")
    public void GoToUrlNegativeEnterEmailPositiveEnterPasswordPasswordClickSignIn()
    {
        
        pages.Magento_New_Customer_Account _Magento_New_Customer_Account = new pages.Magento_New_Customer_Account(driver);
    TestModellerLogger.SetLastNodeGuid("18dac431-ec16-490e-89be-a8897ace1940");
    _Magento_New_Customer_Account.GoToUrl();

    }


    @Test  (groups= {"demo","demo - Default Profile"})
    @TestModellerPath(guid = "77c8e7ca-9f3b-464b-bf67-c7d3dc073328")
    public void GoToUrlNegativeEnterEmailNegativeEnterPasswordPasswordClickSignIn()
    {
        
        pages.Magento_New_Customer_Account _Magento_New_Customer_Account = new pages.Magento_New_Customer_Account(driver);
    TestModellerLogger.SetLastNodeGuid("18dac431-ec16-490e-89be-a8897ace1940");
    _Magento_New_Customer_Account.GoToUrl();

    }


}