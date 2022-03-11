package statrtingPointOfFramework;

import org.testng.annotations.Test;

public class TC_001_CreateLead extends GenericWrapper {
//we use extends between classes here genew superclass and tc_001 is a sub class
//TC_001_CreateLead is a test case for execution. 
//Then annotated @Test (coz ececution hobe) , then create a method public void login (), 
//after that extends with generic wrapper
//generic wrapper e method ache public void launch browser, avabe onek method typye korr
//to implement or use korer jonno, implement korte hole akta class r under e 
//oi method ulo call kori so TC_001 e login method r vitore gerenericw
// r method launchbrowser diyesi. 
//method r name login na diye createlead dilam, normally class r name e method
//create kori
	
@Test

public void createLead () throws InterruptedException {
	
launchBrowser ("http://leaftaps.com/opentaps/control/login");

enterById("username", "DemoSalesManager"); 
//type enter then ctrl+space,then select ById, then tyoe locator value as "username" and type value "DemoSalesManager"

enterById("password","crmsfa"); //enter coz sendkeys 

clickByXpath("//input[@class='decorativeSubmit']"); //click cox after string value click

clickByXpath("//a[contains(text(),'CRM')]");

clickByXpath("//a[contains(text(),'Create L')]");
    
Thread.sleep(2000);
    
enterByXpath("//input[@id='createLeadForm_companyName']","ABC");

enterById("createLeadForm_firstName","Nafisa");

enterById("createLeadForm_lastName","Hossain");


enterById("createLeadForm_firstNameLocal", "Nafi");

enterByXpath("//input[@id='createLeadForm_lastNameLocal']", "Hos");

enterByXpath("//input[@name='personalTitle']", "Ms.");

selectVisibleTextById("createLeadForm_dataSourceId", "Website");

enterByXpath("//input[@name='generalProfTitle']", "Ms");

enterByXpath("//input[@name='annualRevenue']", "1000");

selectVisibleTextById("createLeadForm_industryEnumId", "Insurance");
	
selectVisibleTextById("createLeadForm_ownershipEnumId", "Partnership");


enterByXpath("//input[@name='sicCode']", "1010");

enterByXpath("//textarea[@name='description']", "It is a Software Development company");

enterById("createLeadForm_importantNote", "It's a trusted company");

enterByXpath("//input[@id='createLeadForm_primaryPhoneCountryCode']", "0088");

enterByXpath("//input[@id='createLeadForm_primaryPhoneAreaCode']", "123");

enterByXpath("//input[@id='createLeadForm_primaryPhoneExtension']", "101");

enterByXpath("//input[@id='createLeadForm_departmentName']", "QA");

selectVisibleTextById("createLeadForm_currencyUomId", "BDT - Bangladesh Taka");

enterByXpath("//input[@id='createLeadForm_numberEmployees']", "1002");

enterByXpath("//input[@name='tickerSymbol']", "$");

enterByXpath("//input[@name='primaryPhoneAskForName']", "Nafisa");

enterByXpath("//input[@name='primaryWebUrl']", "www.google.com");

enterByXpath("//input[@name='generalToName']", "Ho");

enterByXpath("//input[@name='generalAddress1']", "8821 Saddlehorn Dr");

enterByXpath("//input[@name='generalAddress2']", "APT 252");

enterByXpath("//input[@id='createLeadForm_generalCity']", "DAL");

selectVisibleTextById("createLeadForm_generalStateProvinceGeoId", "Texas");

selectVisibleTextById("createLeadForm_generalCountryGeoId", "Bangladesh");

enterByXpath("//input[@id='createLeadForm_generalPostalCode']", "75061");

enterByXpath("//input[@id='createLeadForm_generalPostalCodeExt']", "111");

selectVisibleTextById("createLeadForm_marketingCampaignId", "Car and Driver");

enterById("createLeadForm_primaryPhoneNumber", "347-612-1535");

enterById("createLeadForm_primaryEmail", "abc@gmail.com");

Thread.sleep(2000);

clickByXpath("//input[@name='submitButton']");

Thread.sleep(2000);

verifyTextById("viewLead_firstName_sp", "Hema");
	
Thread.sleep(2000);
	
closeBrowser();

//1. advanttage of interface

//after clicking on "add unimplemented method" in  super class i will get 
//abstract methods from interface

//2. its not mandatory to use interface in frame work
//Ans: its optional, without interface i can work on frame work.
//but it is very easy to build our frame work by using interface coz 
//interface helps us all unimplemented methods will be implemented in a class

//multile inheritace interface and class hole multiple inheritance possible.
	
    
    
    
    
}


	
}


