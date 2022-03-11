package alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Click Submit 
		driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
	
		
		//switch control to Alert from HTML page and get the Alert text
		
		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
