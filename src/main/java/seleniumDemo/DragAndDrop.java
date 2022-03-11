package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
//launch browser
System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");

//syntax of object creation
//className obj = new calssName();

//create object of ChromeDriver class

ChromeDriver driver = new ChromeDriver(); 

//load URL
driver.get("https://jqueryui.com/droppable/");
//maximize window
driver.manage().window().maximize();

//use implicitly wait 
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

//Switch to Frame

driver.switchTo().frame(0);//here index 0 coz i want to switch in frame and select index 0
//select, start with 0

//select draggable(drag me to my target) and droppable(drop here) elements and 
//store in a variable, 

//by attribute path- drag me to my target inspect,
//here inspect in dom drag me to my target,

WebElement src = driver.findElementByXPath("//div[@id='draggable']");//src source
//also we can use driver.findelementby id
//WebElement src = driver.findElementById("draggable");

//inspect in dom droppable(drop here),
//choose id locator and use driver.findelementbyid
WebElement dest = driver.findElementById("droppable"); //dest means destination

//wait 3 seconds
Thread.sleep(3000);

//Create object of Actions class and pass the driver
Actions action = new Actions(driver);

//wait 3 seconds
Thread.sleep(3000);

//perform DragAndDrop action, pass the elements and use perform() method
//action.dragAndDrop(src,dest).perform();
action.dragAndDrop(src, dest).perform();

//switch back from frame
//driver.switchTo().defaultContent();
driver.switchTo().parentFrame();

//click selectable
driver.findElementByLinkText("Selectable").click();
		
Thread.sleep(5000);
driver.close();
		
		}


		
	}


