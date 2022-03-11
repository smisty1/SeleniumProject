package connectExcelWithDataProvider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;


public class ProjectSpecificWrapper {

public ChromeDriver driver; 
		

@Parameters({"url","uname","pwd"})	
@BeforeMethod
public void login(String url, String uname, String pwd) { 
		
//**launch browser, load url		
System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");

driver = new ChromeDriver();
	

//load URL
driver.get(url);

//maximize
driver.manage().window().maximize();
							
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
							
//Enter Username 
driver.findElementById("username").sendKeys(uname);
							
//Enter Password 
driver.findElementById("password").sendKeys(pwd);
							
// Click Login Button 
driver.findElementByClassName("decorativeSubmit").click();
							
// click crm.sfa link
driver.findElementByLinkText("CRM/SFA").click();	
	}

@AfterMethod
public void closeBrowser() {
driver.close();
	}

	
@DataProvider
public String[][] getData () throws IOException {
		
ReadExcel r1 = new ReadExcel ();
	
return r1.readExcel();
	
		/*String[][] data = new String[3][3];  
	
	data[0][0] = "CTS";  
	data[0][1] = "Abdur";
	data[0][2] = "Rahman";
	            

	data[1][0] = "FGS";  
	data[1][1] = "Joseph";
	data[1][2] = "Smith";  

		                      
	data[2][0] = "TCS";  
	data[2][1] = "Nafisa";
	data[2][2] = "Hossain";  

		return data  ;  
		*/
		

	}


	}










	
			
	