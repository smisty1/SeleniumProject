package alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElementByLinkText("AGENT LOGIN").click();
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		//driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");

		//driver.findElementByXPath("//button[text()='Try it']").click();

		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");

		driver.findElementByXPath("//input[@value='Login']").click();

		driver.findElementByLinkText("CRM/SFA").click();
				
				
		//click Create lead (use LinkText locator)
		driver.findElementByXPath("//a[text()='Create Lead']").click(); //linkText()
		//Click Merge leads
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		//click merge
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		String ConfirmationAlert= driver.switchTo().alert().getText();
		System.out.println(ConfirmationAlert);
				
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
	}

}
