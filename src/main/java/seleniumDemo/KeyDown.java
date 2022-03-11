package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) {

//launch browser
System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");

//syntax of object creation
//className obj = new calssName();

//create object of ChromeDriver class

ChromeDriver driver = new ChromeDriver(); 

//load URL
driver.get("https://jqueryui.com/selectable/");

//maximize window
driver.manage().window().maximize();

//use implicitly wait 
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

//Switch to Frame

driver.switchTo().frame(0);



WebElement Item1 = driver.findElementByXPath("//li[text()='Item 1']");

WebElement Item2 = driver.findElementByXPath("//li[text()='Item 2']");

WebElement Item3 = driver.findElementByXPath("//li[text()='Item 3']");

WebElement Item4 = driver.findElementByXPath("//li[text()='Item 4']");

WebElement Item5 = driver.findElementByXPath("//li[text()='Item 5']");

WebElement Item6 = driver.findElementByXPath("//li[text()='Item 6']");

WebElement Item7 = driver.findElementByXPath("//li[text()='Item 7']");

Actions action = new Actions(driver);
action.keyDown(Keys.CONTROL).click(Item1).click(Item2).click(Item3).click(Item4).click(Item5).click(Item6).click(Item7).perform();


//action.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).perform();

	

}

	
	
	
}
