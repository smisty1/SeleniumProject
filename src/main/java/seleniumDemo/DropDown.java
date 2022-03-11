package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

//launch browser
System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
//syntax of object creation
// className obj = new calssName();
ChromeDriver driver = new ChromeDriver();// create obj of ChromeDriver

//load URL
driver.get("http:leaftaps.com/opentaps");

//maximize window
driver.manage().window().maximize();

//implicitly wait
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

//print current title
System.out.println(driver.getTitle());

//Enter Username 
driver.findElementById("username").sendKeys("DemoSalesManager");

//Enter Password - (Element level)
driver.findElementById("password").sendKeys("crmsfa");

// Click Login Button 
driver.findElementByClassName("decorativeSubmit").click();

// click crm.sfa link
driver.findElementByLinkText("CRM/SFA").click();

//click create lead link
driver.findElementByLinkText("Create Lead").click();

//enter company name
driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

// enter firstName						
driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");

// enter lastName
driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Mali");
// driver.findElementById("createLeadForm_lastName").sendKeys("J");


//dropdown- how to handle by 3 steps- 1)1st element(ex.source) select,
//2)then select one value (partner)from that element, 
//then store that value in a variable(dd)

// when we use selenium concept there are some class and package, so selenium develope 1 concept for
//dropdown, that is select class. 
//ex: when we create driver for object, then under chromedriver whatever class has we findout by 
//driver.findelementby, sameway instead of chromedriver we use here select class

//for only dropdown  we use another class , it s called select class.

//all Dropdown methods under select class

//how do i know dropdown code in a dome?
//from html structure, tag name explanation we know that  any tag start with select it's a dropdown
//any tag start with "a" its a link. 
//any class start with select it's dropdown.

//**purpose of creating a object  of a class is - under the class jotogulo methods ache oi object dia 
//methods gulo use or call(java language) korte perbo.
//syntax of creation of a object- ClassName obj= new ClassName();
//Select (classname) dd (dropdown) = new Select(); we have to use obj dd so many times, so we use 
//shoertcut dd.

//select class has 3 methods in selenium
//1)SelectByVisibleText -1st preference , 2) SelectByValue,-2nd pre 3)SelectByIndex.-3rd pre
//we can use any methods, usally all methods are  present, but if 1st pre is not there, we ill use 2nd one.dri




//**select source-(DropDown)

WebElement src = driver.findElementById("createLeadForm_dataSourceId");
//1st type driver.findElementById("createLeadForm_dataSourceId");
//then ddo not enter, do not go next line, same line e theke,
//now ctrl+2, then enter or ctrl+2,L
//then type element- src

		
//createlead..from DOM,after inspect blankbox of src.
// we dont enter or click anything  here, so no sendkeys(); orclick(); methods.

//src ia a value, its a webelement, so its name webelement.

		
Select dd = new Select(src);//src r modhe list e jotogulo items(ex"partner) ache sob gulo store kora ache
//1)select dd = new select()> is a object creation, 2)now pass the varible src
//3)call any metohd under select class by using object ex: dd.selectByVisibleText. 

		
dd.selectByVisibleText("Partner"); // after inspect src . 
//then choose "partner" from visible text from DOM- option value= Lead partner....its under select clas
//then copy visible text black color - partner and paste here.
		
//Choose Marketing Campaign
		
WebElement mktCam = driver.findElementById("createLeadForm_marketingCampaignId");
		
Select dd1 = new Select(mktCam);
dd1.selectByVisibleText("Car and Driver");

//marketing campaign
WebElement mktcam = driver.findElementById("createLeadForm_marketingCampaignId");
Select cc1= new Select(mktcam);
cc1.selectByVisibleText("Car and Driver");
//dd1.selectByValue("CATRQ_CAMPAIGNS"); //option value="CATRQ_CAMPAIGNS">catalog generating marke..
//here "CATRQ_CAMPAIGNS"-blue color is value, we use it when we use SelectByvalue method, 
//catalog generating- black color is text.


		
//Choose Industry
WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
//java index start from 0> 0,1,2,3,4...	
//<option value>...=0
//option value = "IND_AEROSPACE">Aerospace... - 1
//option value value="IND_HARDWARE"Computer Hardware....-2**
//string likle double code lage, single code character e, 
//but  integer or num e koo code lagena, 

Select dd2 = new Select (ind);
dd2.selectByIndex(2); }//**2

}
//import java.util.List;
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
