package learnParameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper {

public ChromeDriver driver;

@Parameters({"url","uname","pwd"})//Before method r age parameter keys
//declare korte hobe from xml file theke.so i add url, uname, pwd in ({})
//here ex:name="url" , name is key and value is 
//value= "http://leaftaps.com/opentaps" 

@BeforeMethod 
public void login(String url, String uname, String pwd) {//al value lower case
//public void login is java method and normal bracket r modhe ja likbo seta argument bole
//so String url, String uname, String pwd are arguments. string hoyese coz url 
//etc data type or value{(key) name="uname" (value)} is string, integer hole int hoto

//public void login (String url, String uname, String pwd){} this is called
//parameterized method coz arguments or parameters pass koresi, we have learned
//in method signature.
	
//**launch browser, load url		
System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");

 driver = new ChromeDriver();
//ChromeDriver type fron e thakle prob nai , na thakleo chole coz we 
 //declare it in class level and createlead, edit lead extends projspew

//load URL
driver.get(url); //full url lagbena, coz ata xml file theke peye jabe

//maximize
driver.manage().window().maximize();
						
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
								
//Enter Username - (Element level)
driver.findElementById("username").sendKeys(uname);
//Id locator value is username, sendkeys r modhe key uname pass koresi instead of Demosalesmanager.
//when we will pass a key, then no need a double code. we in send keys e only uname
//likhesi without "". 
//sendkeys(); is a implementation method. when we pass a argument or key jer
//madhome that method is called implementation method.
						
//Enter Password - (Element level)
driver.findElementById("password").sendKeys(pwd);
						
// Click Login Button - (Element level)
driver.findElementByClassName("decorativeSubmit").click();
						
// click crm.sfa link
driver.findElementByLinkText("CRM/SFA").click();	
}

@AfterMethod
public void closeBrowser() {
driver.close();	

//once i declare parameterization in projspecwrapper , i have to run from xml file theke
//it will not work directly from test Ng, coz by parameterization method we
//pass keye or arguments and before method e key or argumennt(ex:uname)
//use koresi , driver.findElementById("username").sendKeys(uname)


	}

}
