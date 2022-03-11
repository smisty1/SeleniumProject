package seleniumDemo;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {

	public static void main(String[] args) throws InterruptedException {

			

				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
				

				
				ChromeDriver driver = new ChromeDriver(); 
				
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

                driver.get("https://www.google.com");
				
				Thread.sleep(3000);
				
				
				driver.navigate().to("http://newtours.demoaut.com/");
				
				
				Thread.sleep(3000);
			
				
				driver.navigate().back(); //by navigate().back(); it will go google.com
				 
				Thread.sleep(3000);
				 
				driver.navigate().forward();
				
				Thread.sleep(3000);
				
				driver.navigate().refresh();


				//driver.getTitle(); 
				
				System.out.println(driver.getTitle());
				
				//**quit browser-close all browser in this session- when i run this code, there two browers open google and newtours, 
				//quit will close all browsers.
				driver.quit();
	
				//public class CreateLead { //we perform a creatlead test case. so 1 test case, 
					//if multiple test cases, then "quit" will close all browsers in this session.
				
				//close- only close current browser
				//quit- close all browsers that open on a session (it will not close other browsers that 
				//manually created such as open whats app)
		
				
				
	}

}
