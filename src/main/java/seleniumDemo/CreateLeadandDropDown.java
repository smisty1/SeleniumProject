package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadandDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
driver.findElementById("username").sendKeys("DemoSalesManager"); 
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
driver.findElementById("createLeadForm_lastName").sendKeys("Ma"); 
 
//How do ypu handle dropdown?
//under select class we have  methods. with any method we can handle Dropdown. 1st choice
//selectByVisibleText, 2nd choice is SelectByValue, 3rd choice is selectByindex
 

//for webelement purpose and select class we r doing same thing either get text,
//or click or send keys. everyday learning new concept. 

//when we find a WebElement through locator we store in a variable which  is ex:source
//2nd thing select class r object create koresi and ai varible ke pass koresi, 
//then je object create koresi ter under e select class r je kono method call koresi.
//choose source
WebElement src = driver.findElementById("createLeadForm_dataSourceId");
Select dd = new Select(src);
dd.selectByVisibleText("Employee");

//choose industry
WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
Select dd1 = new Select(ind);
dd1.selectByVisibleText("Computer Hardware");

//choose ownership
WebElement owns = driver.findElementById("createLeadForm_ownershipEnumId");
Select bb = new Select(owns);
bb.selectByVisibleText("Partnership");

driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs.");
driver.findElementById("createLeadForm_description").sendKeys("It is IT company");
driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("01");
driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("222");
driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
driver.findElementByName("primaryWebUrl").sendKeys("google.com");

//choose state
WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
Select gg= new Select(state);
gg.selectByVisibleText("Arizona");

//choose country
WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
Select gg1=new Select(country);
gg1.selectByVisibleText("United States");


driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");

//Choose Marketing Campaign
WebElement mktca = driver.findElementById("createLeadForm_marketingCampaignId");
Select ee = new Select(mktca);
ee.selectByVisibleText("Automobile");


driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456");
driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");

Thread.sleep(3000);  

driver.close();



}
}