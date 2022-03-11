package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead { //we will perform a creatlead test case.

	public static void main(String[] args) throws InterruptedException {
		
	
//**launch browser, load url		
System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
//on chromedriver location -ctrl+shift, then right click for copying as path "c//seleninum,,,,,,,
//then delete ""/ from  c and exe >/""C://.....exe"/"

//for each browser in selenium we use 1 driver, ex : for chrome driver -chrome driver , 
//for firefox driver firefox  driver , for ( i)internet explorer i driver, for microsoft s - s driver
//here we are using chorme browser, so we write chrome driver. so we set chrome driver property.
//and value is the location where it is located("c://...). this is the path of chrome driver. 
//webdriver.chrome.driver always will be lower case. it is property. 
//property ("webdriver.chrome.driver") is the combination of 3 things- 
//1) webdriver because we are using selenium webdriver,
//2)chrome means we are using chrome driver 3) chrome act as a driver in here, so we type driver. 

ChromeDriver driver = new ChromeDriver();

driver.get("http://leaftaps.com/opentaps/control/login"); //url
//driver.navigate().to("http://leaftaps.com/opentaps/control/login"); 
//here get(); and navigate().to(); same, we can use either one. navigate.to(); to same as get(); command

driver.manage().window().maximize(); //upto this step (3 steps) is mandatory 
//to launch browser, load url and maximize window

System.out.println(driver.getTitle()); //type sysout , then ctrl+space

driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//** now login, username, password  login etc Web elements, to locate web element we need locator. now
//we have to go to dom by click on inspect

//**enter the username
driver.findElementById("username").sendKeys("DemoSalesManager"); //have to type DemoSalesanager.

//** enter the password
driver.findElementById("password").sendKeys("crmsfa"); //crmsfa is password, so we type crmsfa
// findelements by id, coz by inspect we can see, we can take id attribute and its value.


//**click login
driver.findElementByClassName("decorativeSubmit").click();
//using locator concept we find out web element, so we findout username,password,login by locator concept.

//**click crm/sfa link
driver.findElementByLinkText("CRM/SFA").click();
//no id, name, class, so link text, anything starts with a tag its a link text. 
//so its a link text,,<a..,,herf="crmsfa/..." take CRM/SFA, its a text of that link(a) "crmsfa/...

//** click create lead link
driver.findElementByLinkText("Create Lead").click();
//a is a link ("crmsfa/,,,") , its code or text of the link is "Create Lead".
// text_textnum(ex: 567), dynamic . this number will keep changing, 
//text567-its also keep changing, not dynamic but can't use it,also if any number is id value,can't use it.
//if a webelement is a link, only in that case we will use link text.

//**enter company name
driver.findElementById("createLeadForm_companyName").sendKeys("ABC"); //we give ABC company name
//send keys because we enter ABC name. 

//**enter First name
driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
//driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Hema");

//**enter last name
driver.findElementById("createLeadForm_lastName").sendKeys("Mali"); 
//now test it, run as a java application, this test is called a regression testing. 
//when run a test it, it execute from  1st to last test, if i want to do  execute last name then 
//it will reapet again from beginning to last name, its a regression testing. 

//**enter title, here title is a example of web element. creat lead page is a UI, inspect page is a dom. 
driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs.");

//**enter Description
driver.findElementById("createLeadForm_description").sendKeys("It is IT company");

//**click create lead; (do not click it, coz so many lead will create- only for class)
//**driver.findElementByClassName("smallSubmit").click(); //can't use a id="ext_gen676; coz the number keep changing
//also select class , coz use ctrl+f then look under,
//copy class name and paste there, if its unique 1 to 1 then select that, 
//if 1 to 5 or 1 to 4 etc, then do not select.

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

//**enter web Url
//driver.findElementBy("").sendKeys("google.com");

//**enter city
driver.findElementById("createLeadForm_generalCity").sendKeys("New york");

//**enter Zip/postal code
driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");

//**enter phone number
driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456");

//**enter email address
driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");


//Verify the first name 
//for verifying first name, we use getText() and stored the value in a 
//variable and print
//String firstName = driver.findElementById("viewLead_firstName_sp").getText();
//System.out.println(firstName);			




//explictly wait; command selenium to wait 3 seconds before close.
//Thread.sleep(3000);  //hover over on- place cursor under the red line of thead.sleep, 
//then click add throw decleration- 
//it will send it to main method to handle it-(throws InterruptedException {, )

//close browser                                                                                                                                                                                                                                                         
//driver.close();










}
}
