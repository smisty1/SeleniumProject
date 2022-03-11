package browserTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		//**launch/open/navigate/load Chrome browser		

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");

		//ChromeDriver is a class. obj = driver only can change, syntax of obj- Classname obj = new Classname();
		//why we create Chromedriver object?
		//Ans. we create Chromedriver object so that we can call all written steps again and again.
		ChromeDriver driver = new ChromeDriver();
				
		//**load URL
		driver.get("http://leaftaps.com/opentaps/control/login"); //with get method we can load URL
		//driver.navigate().to("http://leaftaps.com/opentaps/control/login"); 
		//we can use either one get(); command or navigate().to();


		// get page title- its on top, page title.
		driver.getTitle(); // type gett, then select title.
		System.out.println(driver.getTitle()); // we can't see title name with driver.gettitle , so use sysout.
		//then i can see title name (Leaftaps - TestLeaf Automation Platform) in console.



		//**Maximize window
		driver.manage().window().maximize();

		//when we use locator- when we locate a web element. ex: we use locator concept in enter username

		//**Enter  Username- manual action - Type- for type 2 methods- 1) click and 2 ) send keys. 

		//wait concept : 1) Implicitly wait - 
		//ex: If there is no login after username and password 
		//Selenium will give exception (tell us) no such elements- thats why we fix a time (20 or 30 seconds)
		//for selenium to wait before giving exception command, that is call implicitly wait.

		//2) Explicitly wait > a) WebDriver wait b) Thread.sleep

		//**Implicitly wait- work for all steps that we type top and bottoms, we give it at first to selenium so that
		//it can work below all steps.

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//type 20 seconds,then use tab arrow to go next, it will show TimeUnit<type same, then dot,then Seconds);

		//finding locator : select > inspect >locator>FindElement(By.locator)>click>sendsKey>
		driver.findElementById("username").sendKeys("DemoSalesManager"); //Anything type with Sendkeys method. 
		//id = Username; id is attribute, Username is value from inspect locator.

		//**Enter password
		driver.findElementById("password").sendKeys("crmsfa");

		//** Click Login- anything to click>use click method and anything type>use sendkeys method.
		driver.findElementByClassName("decorativeSubmit").click();

		//**click CRM/SFA, link text ex:; 
		driver.findElementByLinkText("CRM/SFA").click();
		
		//**click create lead
		//driver.findElementByLinkText("Create Lead").click();
		
		
		//**click merge leads, partial link text ex:
		//driver.findElementByPartialLinkText("Merge").click();
        //then close browser
		//driver.close();
		
		
		//**click logout
		driver.findElementByClassName("decorativeSubmit").click();

		//Explicit wait: Thread.sleep (thread.sleep is a java exception)

		Thread.sleep(3000); // before close browser it will wait 3 seconds, we use it in a particular step,
		//because if we use it in every steps , software will run slowly. we can't use in all steps, 
		//we will use it whenever we need.
		//here 3000 milli seconds=3s, click red line under thread.sleep, click 'add throws declaration', 
		//it will go to main method line.

		//**Close browser (only close running browser, not all)
		driver.close();


		//** For regression testing (repeated test)
		//we use automation, because once we create codes we can use again and again.



	

	}

}
