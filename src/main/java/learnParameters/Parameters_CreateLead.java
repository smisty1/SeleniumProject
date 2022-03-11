package learnParameters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Parameters_CreateLead extends ProjectSpecificWrapper{//Parameters_CreateLead is a sub class
	
	
@Test
public void createLead () throws InterruptedException {

// click leads
driver.findElementByLinkText("Leads").click();

// click create lead link
driver.findElementByLinkText("Create Lead").click();

// Company name
driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
//driver.findElementById("createLeadForm_companyName").sendKeys(cName);

// enter firstName
driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
//driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys(fName);

// enter lastName
driver.findElementById("createLeadForm_lastName").sendKeys("mali");
//driver.findElementById("createLeadForm_lastName").sendKeys(lName);

Thread.sleep(2000);
// Choose source
WebElement src = driver.findElementById("createLeadForm_dataSourceId");
Select dd = new Select(src);
dd.selectByVisibleText("Website");

// choose industry
WebElement element = driver.findElementById("createLeadForm_industryEnumId");
Select dd1 = new Select(element);
dd1.selectByVisibleText("Insurance");

// choose ownership
WebElement ele = driver.findElementByName("ownershipEnumId");
Select dd2 = new Select(ele);
dd2.selectByVisibleText("Sole Proprietorship");

// Click Create lead
driver.findElementByXPath("//input[@name='submitButton']").click();

/*We have read 9 annotations before,
Today we will learn 2 more annotations. 2 more annotations are parameters and data provider, these two combination make parameterization. We can execute same test case multiple times, such as in create lead we can use different first name and last name to run same test case multiple times.
Static value that will not change. Username, password, url will not change

Parameterization in TestNG
TestNG Parameterization: Execute same code(createlead) with multiple set of data (hema, ahsan, etc name)
				
				Parameterization

Parameters							DataProvider
Static (Test Data)						Dynamic (Test Data)
TestNG.xml							2D (dimesion)Arrays means              


2D (dimesion)Arrays means   row and column

Parameter:
Step 1: Declare test data (passing the static value) inside the TestNG.xml
EX: for testleaf 3 static values url,username, password. i can type in xml as
url, uname, pwd...<parameter name=""...> at end greater sign use korle 
automatic </parameter> ashbe.

For Add Parameter in testing.xml (Select any class/test case which you want to create TestNG.xml) 
Step 2: Make connection between TestNG.xml and Java methods -@Parameters and receive the value using name(key)
Step 3: Declare the arguments to Java method
Step 4: pass the argument value to the implementation function/methods. 
Note: Once you declare @Prameters in “ProjectSpecificWrapper” you must Run it from TestNG file i.e. “ParametertestNg.xml” file because we put all key and value in the Testng.xml 
*/
 

	}
	
	
	

}
