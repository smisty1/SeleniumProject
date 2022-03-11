package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

public static void main(String[] args) throws InterruptedException {
		
//launch browser
System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");

//syntax of object creation
//className obj = new calssName();

//create object of ChromeDriver class

ChromeDriver driver = new ChromeDriver(); 

//load URL
driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

//maximize window
driver.manage().window().maximize();

//use implicitly wait 
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

WebElement rightclick = driver.findElementByXPath("//span[text()='right click me']");

//create object of Actions class and pass the driver

Actions action = new Actions(driver);

action.contextClick(rightclick).perform();


Thread.sleep(3000);

driver.close();




}

}
