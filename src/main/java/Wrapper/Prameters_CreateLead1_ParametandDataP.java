package Wrapper;

import java.io.IOException;

import org.testng.annotations.Test;



public class Prameters_CreateLead1_ParametandDataP extends ProjectSpecificWrapper1ParaameterandDataP{
	
@Test(dataProvider = "getData")//sub class r por @Test (), then inside() include dataProvider="getdata"-method jeta select koresi super class Projectswrap e.
public void createLead (String cName, String fName, String lName) throws InterruptedException, IOException {			
//java method means createLead e argument pass korte hobe if i want to change company name , 1st and last name instead of hema. 		
//so we add String cName, String fName, String lastName
//now pass keys cName,fName,lName in implementation method sendkeys(cName) etc
//no need double code if i pass key in implementation method such as 
//sendkeys(fName)

	
//Click Create Leads Link
driver.findElementByXPath("//a[text()='Create Lead']").click();		
//Enter Company Name-----TCS
driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys(cName);
//Enter First Name------Hema
driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys(fName);
//Enter Last Name -------MaS
driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys(lName);
//Enter Title-----------Ms.  
driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Ms");
//Enter Description.....TCS
driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("TCS");
//Enter Country Code ----1
driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("1");
//Enter Department-----MKT
driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("MKT");
//Enter Number of Employee----100
driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("100");
//Enter Web Url ------------google.com
driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("google.com");
//Enter Zip Code ----------75061
driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("75061");
//Enter Phone Number ------123456
driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("123456");
//Enter Email Address ----abc@gmail.com
driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("abc@gmail.com");
// Click Create lead
driver.findElementByXPath("//input[@name='submitButton']").click();
	Thread.sleep(3000);
	}	

}
