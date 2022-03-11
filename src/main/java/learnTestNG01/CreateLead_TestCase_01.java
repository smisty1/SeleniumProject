package learnTestNG01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead_TestCase_01 {

	//public static void main(String[] args) {
@Test 
public void createLead () {//how to convert java class into testng and run it from testng 
//1) remove main method, 2) add @ annotation and write a java method 
//3) write all code inside the java method
//**launch browser, load url		
System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");

ChromeDriver driver = new ChromeDriver();

//load URL
driver.get("http://leaftaps.com/opentaps");

//maximize
driver.manage().window().maximize();
						
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
//Enter Username - (Element level)
driver.findElementById("username").sendKeys("DemoSalesManager");
						
//Enter Password - (Element level)
driver.findElementById("password").sendKeys("crmsfa");
						
// Click Login Button - (Element level)
driver.findElementByClassName("decorativeSubmit").click();
						
// click crm.sfa link
driver.findElementByLinkText("CRM/SFA").click();		

//** click create lead lin
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


//close browser                                                                                                                                                                                                                                                         
driver.close();

/*
 
 Covert Java Class/Test Case in TestNG:
Run Sequential & Parallel

We need at least two or more test cases for create TestNG xml file.

Sequential execution
Step1
Covert your Java code to TestNG, remove Java main method, create your own Java method 
and add @Test annotations.

Step2
Mouse hover on and import  from TestNG annotations

Step3
Run As > TestNG Test, that means this particular test case now umder TestNG

Step4
Create TestNG xml file, Select all testcases , select 1st one then shift, then go to last one ,  
> rightclick on it > TestNG > Convert to TestNG
(give a proper name) > click finish> a TestNG file will be create 
xml......
<classes>
<class name="learnTestNG01.EditLead_TestCase_02"/>
<class name="learnTestNG01.DuplicateLead_TestCase_04"/>...learnTestNG01 is package name....DuplicateLead is class name
<class name="learnTestNG01.DeleteLead_TestCase_03"/>
<class name="learnTestNG01.CreateLead_TestCase_01"/>

</classes> ......     closing tag finish with forward slash

another class we can create by typing <class name="learnTestNG01.mer.."/>
Step5
Open the xml file (and select source tab if not select) > Run it from TestNG
(it will run one by one inserting order/ **Sequential)....1 ta terminate  kore
next test case open hoi

The Extensible Markup Language (XML) is a simple text-based format.XML files
 are encoded in plaintext from where we can run test cases as sequencial 
 and parallel.


**Parallel Execution:
For Parallel execution we need to add a new attibute in xml file. 
That means after  <suite name="Suite" >, I need to add another
attibute parallel="classes", inside the bracket.
i.e. <suite name="Suite"  parallel="classes" >....parallel ak shathe
 test cases run hoi, sob test cases ak shathe sesh hoi. 

*/ 
}

}
