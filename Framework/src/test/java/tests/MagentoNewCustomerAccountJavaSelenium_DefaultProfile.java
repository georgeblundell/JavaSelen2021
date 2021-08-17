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

//https://robotframework.cloud.testinsights.io/app/#!/model-engine/guid/dd00374b-7d18-4a5a-a05d-4d49dec070c9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 65, profileId = 100049)
public class MagentoNewCustomerAccountJavaSelenium_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Magento New Customer Account - Java Selenium","Magento New Customer Account - Java Selenium - Default Profile"})
    @TestModellerPath(guid = "0ef0ce5f-547f-4eb9-88ea-cf349a718a77")
    public void GoToUrlPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterEmailPositiveEnterPasswordClick()
    {
        
        pages.Magento_New_Customer_Account _Magento_New_Customer_Account = new pages.Magento_New_Customer_Account(driver);
    TestModellerLogger.SetLastNodeGuid("dbfd97f5-b0f0-43d4-832a-2eff71b8d623");
    _Magento_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("f95719a1-48f9-4712-9a5e-1269571187cd");
    _Magento_New_Customer_Account.Enter_First_Name("Donald");

    TestModellerLogger.SetLastNodeGuid("3a3f0f7b-ad1c-42d6-9394-f1a33e935dbf");
    _Magento_New_Customer_Account.Enter_Last_Name("Marvin");

    TestModellerLogger.SetLastNodeGuid("741d5756-0ac2-49a1-9968-c97df03d259a");
    _Magento_New_Customer_Account.Enter_Email("Dion79");

    TestModellerLogger.SetLastNodeGuid("948357bd-7644-4c69-8657-af5c8892f798");
    _Magento_New_Customer_Account.Enter_Password("t_lUVMDl6V");

    TestModellerLogger.SetLastNodeGuid("5015dd07-fa82-4b4b-868d-e5d037488db4");
    _Magento_New_Customer_Account.Click__Create_an_Account_();

    }


    @Test  (groups= {"Magento New Customer Account - Java Selenium","Magento New Customer Account - Java Selenium - Default Profile"})
    @TestModellerPath(guid = "b70ba819-3522-4546-a72c-e424421be40f")
    public void GoToUrlPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterEmailNegativeEnterPasswordFail()
    {
        
        pages.Magento_New_Customer_Account _Magento_New_Customer_Account = new pages.Magento_New_Customer_Account(driver);
    TestModellerLogger.SetLastNodeGuid("dbfd97f5-b0f0-43d4-832a-2eff71b8d623");
    _Magento_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("f95719a1-48f9-4712-9a5e-1269571187cd");
    _Magento_New_Customer_Account.Enter_First_Name("Tania");

    TestModellerLogger.SetLastNodeGuid("3a3f0f7b-ad1c-42d6-9394-f1a33e935dbf");
    _Magento_New_Customer_Account.Enter_Last_Name("Schuster");

    TestModellerLogger.SetLastNodeGuid("741d5756-0ac2-49a1-9968-c97df03d259a");
    _Magento_New_Customer_Account.Enter_Email("Giovanni_Von25");

    TestModellerLogger.SetLastNodeGuid("c4d66d99-c3e6-4b02-920c-e763e8a15216");
    _Magento_New_Customer_Account.Enter_Password("#!_ @");

    }


    @Test  (groups= {"Magento New Customer Account - Java Selenium","Magento New Customer Account - Java Selenium - Default Profile"})
    @TestModellerPath(guid = "79bce611-9ba0-4ed0-8f40-d2cb8bfa8435")
    public void GoToUrlPositiveEnterFirstNamePositiveEnterLastNameNegativeEnterEmailFail()
    {
        
        pages.Magento_New_Customer_Account _Magento_New_Customer_Account = new pages.Magento_New_Customer_Account(driver);
    TestModellerLogger.SetLastNodeGuid("dbfd97f5-b0f0-43d4-832a-2eff71b8d623");
    _Magento_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("f95719a1-48f9-4712-9a5e-1269571187cd");
    _Magento_New_Customer_Account.Enter_First_Name("Rosalind");

    TestModellerLogger.SetLastNodeGuid("3a3f0f7b-ad1c-42d6-9394-f1a33e935dbf");
    _Magento_New_Customer_Account.Enter_Last_Name("Durgan");

    TestModellerLogger.SetLastNodeGuid("17311d3b-14b3-42a7-a14d-3b3e8ca58b20");
    _Magento_New_Customer_Account.Enter_Email("#!_ @");

    }


    @Test  (groups= {"Magento New Customer Account - Java Selenium","Magento New Customer Account - Java Selenium - Default Profile"})
    @TestModellerPath(guid = "4728f6cc-7923-4066-af11-1c10d40cc2ef")
    public void GoToUrlPositiveEnterFirstNameNegativeEnterLastNameFail()
    {
        
        pages.Magento_New_Customer_Account _Magento_New_Customer_Account = new pages.Magento_New_Customer_Account(driver);
    TestModellerLogger.SetLastNodeGuid("dbfd97f5-b0f0-43d4-832a-2eff71b8d623");
    _Magento_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("f95719a1-48f9-4712-9a5e-1269571187cd");
    _Magento_New_Customer_Account.Enter_First_Name("Alberta");

    TestModellerLogger.SetLastNodeGuid("2425dcf4-90cf-44c0-9f5f-1c4434c8004b");
    _Magento_New_Customer_Account.Enter_Last_Name("");

    }


    @Test  (groups= {"Magento New Customer Account - Java Selenium","Magento New Customer Account - Java Selenium - Default Profile"})
    @TestModellerPath(guid = "1744dfaa-309a-4944-af3a-5730d85ebf20")
    public void GoToUrlPositiveEnterFirstNameNegativeEnterLastNameFail1()
    {
        
        pages.Magento_New_Customer_Account _Magento_New_Customer_Account = new pages.Magento_New_Customer_Account(driver);
    TestModellerLogger.SetLastNodeGuid("dbfd97f5-b0f0-43d4-832a-2eff71b8d623");
    _Magento_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("f95719a1-48f9-4712-9a5e-1269571187cd");
    _Magento_New_Customer_Account.Enter_First_Name("Sylvia");

    TestModellerLogger.SetLastNodeGuid("2425dcf4-90cf-44c0-9f5f-1c4434c8004b");
    _Magento_New_Customer_Account.Enter_Last_Name("#!_ @");

    }


    @Test  (groups= {"Magento New Customer Account - Java Selenium","Magento New Customer Account - Java Selenium - Default Profile"})
    @TestModellerPath(guid = "4ed686cc-5306-49d9-ba5b-01ec6ea0f88d")
    public void GoToUrlNegativeEnterFirstNameFail()
    {
        
        pages.Magento_New_Customer_Account _Magento_New_Customer_Account = new pages.Magento_New_Customer_Account(driver);
    TestModellerLogger.SetLastNodeGuid("dbfd97f5-b0f0-43d4-832a-2eff71b8d623");
    _Magento_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("b7216c4f-ca89-48de-b73f-523891f7dda4");
    _Magento_New_Customer_Account.Enter_First_Name("");

    }


    @Test  (groups= {"Magento New Customer Account - Java Selenium","Magento New Customer Account - Java Selenium - Default Profile"})
    @TestModellerPath(guid = "52d9735b-43e2-4dd6-95d6-c5a0c96a7b0e")
    public void GoToUrlNegativeEnterFirstNameFail1()
    {
        
        pages.Magento_New_Customer_Account _Magento_New_Customer_Account = new pages.Magento_New_Customer_Account(driver);
    TestModellerLogger.SetLastNodeGuid("dbfd97f5-b0f0-43d4-832a-2eff71b8d623");
    _Magento_New_Customer_Account.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("b7216c4f-ca89-48de-b73f-523891f7dda4");
    _Magento_New_Customer_Account.Enter_First_Name("#!_ @");

    }


}