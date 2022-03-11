package seleniumDemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_allLocatorPractice {

public static void main(String[] args) throws InterruptedException {

/*Selenium is a tool of automation testing, whereas Java is a programming language

To find out  web elements we use locators.
Selenium supports 8 different types of locators namely id, name, className, tagName,
linkText, partialLinkText, CSS selector and xpath. 

Here we will use id, name, class, linktext,partial linktext and xpath.

There are 2 types of xpath a)absolute and b)relative xpath

a)Absolute Xpath- syntax: absolute xpath start with single slash /html...
We do not use this xpath in real time
b) Relative xpath: We use relative xpath. 
syntax: relative xpath startt with double slash //
 //tagname[@attribute='value']; there are 7 types of relative xpath:
           
1)atribute base xpath: wring xpath based on attribute name and attribute value, 
    //tagname[@atribute='value']
2)partial base xpath : this time the value will be short and syntax  is
Syntax:  //tagname[contains(@attribute,'partialValue')] 
3) Text base Xpath : : writing Xpath based on text of element design code, 
  if attribute is not available in the code or not usable or preferable
  Syntax: //tagname[text()='text']
4) Partial Text base Xpath: writing Xpath based on partial text of element design code, if attribute is not available in the element design code or not usable or preferable.
Syntax: //tagname[contains(text(),'text')] 
5)Parent to child navigation/travel: writing Xpath base on parent basic Xpath and /(slash)child tagname
Syntax: Parent basic xpath/child tagname
Ex: //ul[@id='sortable']/li[1]
6)Collections Xpath: write any type of Relative Xpath then keep it in a normal bracket,
 i.e.(//input[@id='username']) then indexing like [1] or (any Xpath)[index]
 
7)Handling Dynamic Web Elements (using contains or starts with text): 
 -Use Relative XPath using contains or starts with text-
 
Sometimes IDs, names and classes attribute values of the web element keep changing. Such web elements are called Dynamic web elements. 
These are database based elements and its values get refreshed every time the database gets updated. For example, let’s take the below 
example of a input field on the Rediff.com Create a Rediffmail account /sign up page. It can be seen that the ID, name and class of 
the web element keep changing every time when the page is loaded/refresh. So, we cannot 
use this ID for web elements identification. 
Look at the below code of Rediff.com password field web element- name value “4aa8910a” 
is keep changing every time below example $.
Example $:
<input type="password" name="passwd4aa8910a" value="" style="width:185px;" maxlength="14" onblur="fieldTrack(this);">

 
Look at the above code of TestLeaf, Create Lead link web element- id value “636” is keep changing every time on example 2.
In this case we need to use some other methods to identify the web element. Here are some methods that we can use to identify such 
dynamic web elements in our web pages.
1. Use Relative XPath using contains or starts with text-
starts-with:
Syntax: //tagname[starts-with(@attribute,’start value of attribute’)]
xpath: (//a[starts-with(@id,’ ext-gen’)])[2]

Use Relative XPath using contains or starts with text, this is the preferred method for
handling dynamic web elements if we observe.

Examples: (starts-with and contains)
##starts-with:
Syntax: //tagname[starts-with(@attribute,’start value of attribute’)]
Example:1
<input type="password" name="passwd4aa8910a" value="" style="width:185px;" maxlength="14" onblur="fieldTrack(this);">
Xpath of example1: //input[starts-with(@name,’passwd’)]
ex: 2
<input type="submit" id=" submit_334350" value="Subscribe">
Xpath: //input[starts-with(@id, ‘submit_’)]
ex: 3
<a href="/crmsfa/control/createLeadForm" id="ext-gen636">Create Lead</a>
xpath : (//a[starts-with(@id,’ ext-gen’)])[2]


##contains:
Syntax: //tagname[contains(@attribute,’end value of attribute’)]
ex: 
<input type="submit" id=" 1002-subscribe" value="Subscribe">
In this case we can write XPath as:
XPath - //input[contains(@id, ‘subscribe’)]


Q:Why do we use locator in Selenium?
Ans:Locators in selenium- Locators provide a way to access the HTML elements from a web page. 
In Selenium, we can use locators to perform actions on the text boxes, links, checkboxes
and other web elements. They are the basic building blocks of a web page. 
A web developer must use a proper and consistent locator scheme for a website.
 
Q:What is a locator in testing?
Ans:Locators are basically the HTML attributes of a web element. They help identify 
unique web elements on a page and command testing frameworks, such as Selenium WebDriver,
to perform the action on those elements. Locators are also known as selectors.
 

Q:  How do u handle dynamic value/
 Ans: when an web element value is dynamic we use Relative xpath- 'contains' for end value and 'starts with' 
 for start value to handle dynamic value. 
*/


//Try all locators on each web element as much as possible
//Launch Browser
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");

//Create object(driver) of ChromeDriver class
ChromeDriver driver = new ChromeDriver();

//Load URL
driver.get("http://leaftaps.com/opentaps/control/login");

//Get page title
driver.getTitle();
System.out.println(driver.getTitle());

//Maximize window
driver.manage().window().maximize();

//use implicitly wait 
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

//Enter Username

driver.findElementById("username").sendKeys("DemoSalesManager"); //**BY ID locator
//driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager"); //**By attribute base Xpath
//driver.findElementByXPath("//input[ contains(@id,'u')]").sendKeys("DemoSalesManager");//**By Partial attribute base xpath
// driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys(""DemoSalesManager""); //**By Collections Xpath

//Enter Password

//driver.findElementById("password").sendKeys("crmsfa"); //**By Id locator
driver.findElementByName("PASSWORD").sendKeys("crmsfa");//**By Name locator
//driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");//**By attribute base Xpath
//driver.findElementByXPath("//input[contains(@id,'p')]").sendKeys("crmsfa");//By Partial attribute base xpath
//driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");// By Collections Xpath

//click login
//driver.findElementByClassName("decorativeSubmit").click();//**By Id locator
driver.findElementByXPath("//input[@class='decorativeSubmit']").click();//By attribute base Xpath
//driver.findElementByXPath("//input[contains(@class,'d')]").click();//By Partial attribute base xpath


//click crm/sfa link
driver.findElementByLinkText("CRM/SFA").click(); //By Linktext
//driver.findElementByPartialLinkText("//a[contains(text(),'C')]").click(); //By Partial link test base xpath

//click  leads link
//driver.findElementByLinkText("Leads").click(); //By Linktext
driver.findElementByXPath("//a[text()='Leads']").click();//By Text base xpath(can't use partial text base coz 1 0f 7),but can use it by collection base xpath
//driver.findElementByXPath("(//a[contains(text(),'Leads')])[5]").click();// By collection base Xpath

//click Find Leads
//driver.findElementByLinkText("Leads").click();
//driver.findElementByXPath("//a[text()='Find Leads']").click();//By Text base xpath
driver.findElementByXPath("//a[contains(text(),'Fi')]").click();//By Partial link test base xpath

//Enter First Name
//driver.findElementByXPath("(//input[contains(@name,'firstName')])[3]").sendKeys("Hema");//**By Collections Xpath
driver.findElementByXPath("(//input[starts-with(@id,'ext-gen')])[31]").sendKeys("Hema");//**By Handling Dynamic Web Elements xpath with collection base xpath
//collection base xpath: write any type of Relative Xpath then keep it in a normal bracket,
//i.e.(//input[@id='username']) then indexing like [1] or (any Xpath)[index]

//Click find leads button
//driver.findElementByLinkText("Find Leads").click();
driver.findElementByXPath("//button[text()='Find Leads']").click(); //By text base xpath coz id, name none of this are working as a locator
//driver.findElementByXPath("//button[contains(text(),'F')]").click();//By partial text base xpath
	
//Click on first resulting lead	
driver.findElementByXPath("//a[text()='10891']").click();//By link text xpath
//driver.findElementByLinkText("10891").click();//By link text locator

//Click Edit
//driver.findElementByXPath("//a[text()='Edit']").click(); //By link text xpath
driver.findElementByXPath("//a[contains(text(),'Ed')]").click(); //By partial link text xpath
//driver.findElementByLinkText("Edit").click();//By link text locator

//Change(clear) the company name
driver.findElementByXPath("//input[contains(@id,'updateLeadForm_c')]").clear();//By partial attribute xpath
//driver.findElementById("updateLeadForm_companyName").clear();//By ID locator
//driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();//By attribute xpath
//driver.findElementByXPath("(//input[contains(@class,'inputBox')])[1]").clear();//By coleection base xpath

//Enter Company name
//driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");//By ID locator
driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("CTS");//By attribute xpath
//driver.findElementByXPath("//input[contains(@id,'updateLeadForm_c')]").sendKeys("CTS");//By partial attribute xpath
//driver.findElementByXPath("(//input[contains(@class,'inputBox')])[1]").sendKeys("CTS");//By collection base xpath

//click update
driver.findElementByName("submitButton").click(); //By name locator
//driver.findElementByXPath("(//input[@name='submitButton'])[1]").click(); //By collection base xpath

//explicitly wait; command selenium to wait 3 seconds before close.
Thread.sleep(3000);

//Close the browser
driver.close();
}

}
