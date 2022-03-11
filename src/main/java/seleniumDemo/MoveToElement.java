package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://mrbool.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//class r object create hoi,
//object create na korle driver r under e method call korte perbona	

//1st a) element (ex:content) choose korte hobe,then find it in dom through locator driver.find....
// b) element(content) ke akta variable (webelement content) e store korte hobe
		//---driver.findelementbyclaa(""), then ctrl+2.. webelement content
//2nd actions class r object create korte hobe and driver pass korte hobe
//3rd perform move to element (mouse hover on) action, then pass the element
//4th then click the article element by xpath that belongs to content element
//(article ke drop down bolena, coz content e cursor rakle nicher element gulo dekhai)) 
		
		
//select content element and store it in a variable
		WebElement content = driver.findElementByClassName("menulink");


//Create object of class(Actions) and pass the driver 
		Actions action = new Actions(driver);

//perform moveToElement (Mouse Hover On) action, pass the element and use
		action.moveToElement(content).perform();
				
//Then click the Articles element
	    driver.findElementByXPath("//a[text()='Articles']").click();
		
//wait 3 seconds
	   Thread.sleep(3000);

			
//close the browser
	 //  driver.close();
				
				
		
		
	}

}
