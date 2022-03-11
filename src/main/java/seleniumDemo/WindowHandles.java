package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {


/*WindowHandles or Switch one window to another window

In Selenium world there is no Tab concept. Selenium consider each tab as a window.

So, Selenium has two different method to help us to find out the unique references/address of different window-

1. getWindowHandle();  - usually we do not use this concept so each coz it handle only 1 window
>This method [getWindowhandle()] return the unique reference/address of a current active
 window and data type is String.

So Code is-
driver.getwindowHandle(); and we need to store the reference value in a variable

That is-
String windowHandle = driver.getWindowhandle();

2. getWindowHandles();
>This method [getWindowHandles()] return all the window references which are opened in this current session,
not return any window references which were opened manually or previously.

This method also returns 1st and 2nd window references.

i.e >getWindowHandles() function return Collection of String 
Like: Set<String> allwin = driver.getWindowhandles();

For each window one by one Iterator, we use Foreach loop)

Syntax of Foreach loop:
for (Datatype VariableName : Collection ){

} 

Set<String> allwin = driver.getWindowhandles();
for (String eachwin : allwin ) {
//System,out.println(eachwin); 

driver.switchTo().window(eachwin);

//System.out.println(driver.getTitle());
		}

Note: For checking and verification purpose we can add below two lines-
System,out.println(eachwin);
System.out.println(driver.getTitle());		*/
		
		
		
//**launch browser, load url	
System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");

ChromeDriver driver = new ChromeDriver();

driver.get("https://www.w3schools.com/jsref/met_win_open.asp");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//Click on try it yourself
driver.findElementByPartialLinkText("Try it Yourself").click();
//or by partial link text xpath wih collection
//driver.findElementByXPath("(//a[contains(text(),'Try it Yo')])[1]").click();

/*String currentWindow = driver.getWindowHandle();

System.out.println(currentWindow);  
// after click try it yourself "By currentwindow" i will get current window reference
  number that opens */

	
//Get first window reference number
String FirstWindow = driver.getWindowHandle();
 
System.out.println(FirstWindow); //by firstwindow i will get the 1st window refernce 
//number before click "Try it Yourself"
 
//.................................	
//To get all window reference number i have to use Set interface, and r.numbers will
//store in allWin object. in cosole these numbers will show in a row way
//also 1 window to another window will open, i dont hav to use driver.switch().window();

Set<String> AllWins = driver.getWindowHandles();
	
System.out.println(AllWins);	

//....................................

//Another way to get 2 reference numbers by "for each loop", numbers will show in console
//as a column way but 1st i need to store in a variable Set<String> AllWins = driver.getWindowHandles();
	
for (String eachWin : AllWins)	{
	System.out.println(eachWin);

	
//driver.switchTo().window(eachWin); // use this method to switch 1 window to another window

System.out.println(driver.getTitle());
		
//driver.close();	

   }

//After switch to 2nd window click on "Try it" button
//Switch to frame for click on "Try it", because Try it button is inside a frame

driver.switchTo().frame("iframeResult");

//click on try it button
driver.findElementByXPath("//button[text()='Try it']").click();

//driver.quit();



//System.out.println("...........................................");



// I have added these 5 steps  after switching 2nd window: see below code-                                                                     // After switch to 2nd window click on "Try it" button
	
//Switch to frame for click on "Try it", because Try it button is inside a frame

//driver.switchTo().frame("iframeResult");

// Click on Try it button
//driver.findElementByXPath("//button[text()='Try it']").click();
	

//switch back to primary window/First window
driver.switchTo().window(FirstWindow);
	
//Get title of First window (after back to first window)
System.out.println(driver.getTitle());
	
// closing all the windows which open in this session/in this run
driver.quit(); 
	

	}

}
