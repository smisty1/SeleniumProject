package tcConnectInheritanceConcept;

import org.testng.annotations.Test;

import Wrapper.ProjectSpecificWrapper1ParaameterandDataP;

public class CreateLead extends ProjectSpecificWrapper1ParaameterandDataP {

	//public static void main(String[] args) {
@Test
	public void createLead () {
		
//** click create lead link
driver.findElementByLinkText("Create Lead").click();
		
//**enter company name
driver.findElementById("createLeadForm_companyName").sendKeys("ABC"); 
		
//**enter First name
driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
//driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Hema");

//**enter last name
driver.findElementById("createLeadForm_lastName").sendKeys("Mali"); 
		

//**enter title, here title is a example of web element. creat lead page is a UI, inspect page is a dom. 
driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs.");

//**enter Description
driver.findElementById("createLeadForm_description").sendKeys("It is IT company");

//**enter country code
driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");

//**enter area code
driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("01");

//**enter extension
driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("222");


//**enterDepartment
driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");

//**enter number of employees
driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");

		
//**enter city
driver.findElementById("createLeadForm_generalCity").sendKeys("New york");

//**enter Zip/postal code
driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");

//**enter phone number
driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456");

//**enter email address
driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");



		
	}

}
