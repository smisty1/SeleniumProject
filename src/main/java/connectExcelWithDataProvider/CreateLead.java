package connectExcelWithDataProvider;

import java.io.IOException;

import org.testng.annotations.Test;


public class CreateLead extends ProjectSpecificWrapper{
	
@Test(dataProvider = "getData")

public void createLead (String CName, String FName, String LName) throws InterruptedException, IOException {			
		
	
//Click Create Leads Link
driver.findElementByXPath("//a[text()='Create Lead']").click();		

//Enter Company Name
driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys(CName);

//Enter First Name
driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys(FName);

//Enter Last Name 
driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys(LName);

//Enter Title 
driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Ms");

//Enter Description
driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("TCS");

//Enter Country Code 
driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("1");

//Enter Department
driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("MKT");

//Enter Number of Employee
driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("100");

//Enter Web Url 
driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("google.com");

//Enter Zip Code
driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("75061");

//Enter Phone Number 
driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("123456");

//Enter Email Address 
driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("abc@gmail.com");

// Click Create lead
driver.findElementByXPath("//input[@name='submitButton']").click();

Thread.sleep(3000);


		}	

	

}