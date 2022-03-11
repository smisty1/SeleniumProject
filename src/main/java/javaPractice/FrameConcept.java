package javaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

driver.get("https://jqueryui.com/selectable/");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//click Selectable (outside frame)
driver.findElementByLinkText("Selectable").click();

//Using index number- if your iframe has no Id or Name locator then go to Index number

//Switching to frame - way 2		
driver.switchTo().frame(0); // using index number - (Note: in java index starts from Zero[0])

//click item -2
//driver.findElementByXPath("//ol[@id='selectable']/li[2]").click();

//click item-7
//driver.findElementByXPath("//ol[@id='selectable']/li[7]").click();

//Switching to frame- way-3	
//driver.switchTo().frame(driver.findElementByClassName("demo-frame")); //Select WebElement by CalssName

//OR (we can do it other way)
//WebElement iframe = driver.findElementByClassName("demo-frame");
//driver.switchTo().frame(iframe);

//clicking Item 1 element 
driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
//clicking Item 2 element 
driver.findElementByXPath("//ol[@id='selectable']/li[2]").click();
//clicking Item 3 element
driver.findElementByXPath("//ol[@id='selectable']/li[3]").click(); 
//clicking Item 4 element 
driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();
////clicking Item 5 element 
driver.findElementByXPath("//ol[@id='selectable']/li[5]").click(); 	
//clicking Item 6 element 
driver.findElementByXPath("//ol[@id='selectable']/li[6]").click();
//clicking Item 7 element 
driver.findElementByXPath("//ol[@id='selectable']/li[7]").click(); 			

//switch back to main HTML page  
//driver.switchTo().defaultContent();
driver.switchTo().parentFrame();

//click Demos (outside frame)- to check if i am outside of the frame or not
Thread.sleep(3000); 
driver.findElementByLinkText("Demos").click();

Thread.sleep(3000);
//driver.close();
	}
	}


