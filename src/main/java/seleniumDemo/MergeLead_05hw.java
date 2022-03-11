package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead_05hw {

	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

// load url
driver.get("http://leaftaps.com/opentaps/control/login"); 

//enter username
driver.findElementById("username").sendKeys("DemoSalesManager"); 

//enter password
driver.findElementById("password").sendKeys("crmsfa"); 

//click login
driver.findElementByClassName("decorativeSubmit").click();

//click crm/sfa
driver.findElementByLinkText("CRM/SFA").click(); 


//click leads link
driver.findElementByLinkText("Leads").click();

//click mergeleads
driver.findElementByLinkText("Merge Leads").click();

//click on icon near from lead
driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();

//Get first window reference number
String FirstWindow = driver.getWindowHandle();

System.out.println(FirstWindow); //to print ref. num of 1st window
//by single window handle we can get only reference num.

//Move to new window
Set<String> allWin = driver.getWindowHandles();

System.out.println(allWin);//print two winds ref nums.

for ( String eachwin: allWin) 

    { driver.switchTo().window(eachwin);
    System.out.println(driver.getTitle());
    
    }
	
//Move to new window(always use driver.getwindowhandles - to move new window, 
//store window ref. nums store in a variable, 
//then use for each loop(type for each then ctrl+space), 
//then driver.switchto().window(eachWin) --- to move on each window
//print new window title to confirm that i am in new window
	
//Enter lead id
driver.findElementByXPath("//input[starts-with(@id,'ext-gen')][1]").sendKeys("10131");

//click find leads button
driver.findElementByXPath("//button[text()='Find Leads']").click();

Thread.sleep(3000);

// Click First Resulting lead(use parent to child xpath that will select 1st element)
//String firsteleName = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
//System.out.println(firsteleName);

driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();;

//switching/back to primary window i.e. main/primary window
driver.switchTo().window(FirstWindow);






	}

}
