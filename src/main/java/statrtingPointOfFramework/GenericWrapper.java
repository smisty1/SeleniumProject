package statrtingPointOfFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods{//ctrl+z for erase whole part
//GenericWrapper class(super class) and WrapperMethods is a interface, to connect class 
//and interface I need implements.

//when i use interface i will get auto suggestion. 
	
//There's no method body in interface. when i use interface i need a class (mandatory)
//coz onno akta class e method body gulo thake or implement hoi oi 
//class r modhe.

//when i will click under genericwra red mark-add unimplemented methods, it will 
//import all abstract methods from wrappermethods( interface)
//after that type driver.finf element by etc,,,,create body inside methods.
//click only string locator value, we don't need string data coz there's no send keys.	
	public ChromeDriver driver; //chromedriver ke class level or globally declare korte hobe, coz not only 1 method but also other methods can use it
	
	public void launchBrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url);//coz String url lower case
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Chrome browser launch usccessfully");
	}

	public void enterById(String locatorValue, String data) {
//string locator ex:xpath and value is username. string data is Demosalesmanager(jeta insert korbo in sendkeys value).
//string type use korsi bole string data not implementation method value after sendkeys(..)		

		driver.findElementById(locatorValue).sendKeys(data);//locatorValue from String locatorValue
		//here we are passing key not value, same way sendkeys e key - data diyesi.
	}

	public void enterByName(String locatorValue, String data) {

		driver.findElementByName(locatorValue).sendKeys(data);
		
		
	}
	
	public void enterByClassName(String locatorValue, String data) {
		
		driver.findElementByClassName(locatorValue).sendKeys(data);
	}

	public void enterByPartialLinkText(String locatorValue, String data) {

		driver.findElementByPartialLinkText(locatorValue).sendKeys(data);
	}

	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);
	}

	public void enterByCssSelactor(String locatorValue, String data) {

        driver.findElementByCssSelector(locatorValue).sendKeys(data);
		
	}
	
	public void clickById(String locator) {
		
		driver.findElementById(locator).click();
	}

	public void clickByName(String locatorValue) {
   
		driver.findElementByName(locatorValue).click();

		
	}

	public void clickByClassName(String locatorValue) {


		driver.findElementByClassName(locatorValue).click();
	}

	public void clickByLinkText(String locatorValue) {

       driver.findElementByLinkText(locatorValue).click();
		
	}

	public void clickByXpath(String locatorValue) {

       driver.findElementByXPath(locatorValue).click();
		
	}
	
	public void clickByPartialLinktext(String locator) {
		
		driver.findElementByPartialLinkText(locator).click();
	}

	public void selectVisibleTextById(String Id, String Value) {

       WebElement ele = driver.findElementById(Id); //Id from string Id
 //type driver.findElementById(Id) the ctrl+2 > WebElement, then type ele that is element
       Select dd = new Select(ele);
       
       dd.selectByVisibleText(Value);//value from string value
       
		
	}

	
	public void selectIndexByName(String Name, int Value) {

		 WebElement ele = driver.findElementById(Name);
	       Select dd = new Select(ele);
	       
	       dd.selectByIndex(Value); //int Value,so selectByIndex
					
	}
	
	public void selectValueById(String Id, String Value) {
		
		WebElement ele = driver.findElementById(Id);
		
		Select dd = new Select(ele);
		
		dd.selectByValue(Value);  //String Value, so selectByValue coz at top public void selectValueById ache
	}

	public void selectValueByName(String Name, String Value) {
		
		WebElement ele = driver.findElementByName(Name);
		
		Select dd = new Select (ele);
		
		dd.selectByValue(Value);
	}
	
	
	public void getTextById(String Id) {
    
		WebElement Text = driver.findElementById(Id);
        
		System.out.println(Text);
		
	}
	
	public void verifyTextById(String id, String text) {
		
		String txt = driver.findElementById(id).getText();
		
		if(txt.equals(text)) {
			System.out.println("Text is matched");
		} else {
			System.out.println("Text is not matched");
		}
			
		
	}
	

	public void closeBrowser() {


		driver.close();
	}
	
	

	
	
}
