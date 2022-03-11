package javaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInSelenium {

	public static void main(String[] args) throws InterruptedException {
			
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver(); 
			
//driver.get("https://jqueryui.com/selectable/");
			
//driver.get("https://www.w3schools.com/js/js_popup.asp");
driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
			
driver.manage().window().maximize();
			
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
/*Frame/iframe concept in Selenium:

Example of HTML code structure: (Html code structure start with HTML and end with HTML

HTML Structure of iframe-

<html>  [root/main tag]

	 <iframe      [frame start]
		
		<html>
			<button id="kit">
		</html>
	
	</iframe>	[frame close]

</html> [closing of root/main tag]

....................
-Html under Html, we called nested Html
-Nested Html file always design under the iframe/frame Tag

Step1:
## How to find/check iframe or frame in a web page?

way-1
Go to DOM and type Ctrl + F -> type iframe or //iframe
-it will show in DOM all codes that starts with ifram

way-2
Right click on the desire element and check it has ->
-view Frame source
-Reload frame, 
if you found these two, that means your desire elements inside the Frame.

When you confirm your desire Element is inside the Frame. So, need to move our 
control Main html to frame/iframe.

Step2:
## How to move your control main html to iframe?

-Moving control from main window to iframe/frame-
code: 	 switchTo().frame(index); ----by index- switchTo.frame(index)  or, 
	     switchTo().frame("value");-------by value diye switch korte hobe  or, 
         driver.findElementByLocator("value"); ....by web element driver.findele..
that means -we are enter into the iframe not in the element

step 3
## How to interact/get into the iframe?

Switching frame:-

way-1
If your frame has Id or name locator, then copy
and paste Id or name value directly to the code from frame. 

driver.switchTo().frame("value");


Note: Then perform your action with the elements

way-2
If your frame has no Id or name locator only, then directly go to index
driver.switchTo().frame(1);
ex.- index(0),index(1)

Note: Then perform your action with the elements

way-3
If there are a multiple index in frame then go for WebElement
driver.findElementByLocator("value");
Ex.driver.findElementByclassName("demo-frame");

Note: Then perform your action with the elements

Step4:
How Switch back to main Html page from frame?
driver.switchTo().defaultContent();
OR
driver.switchTo().parentFrame();

Summary:
Steps to follow to check, is the WebElemnt inside frame? Perform the actions, Comeout the frame.
* Inspect the element
* View the html source code
* To see if there any frame/iframe tag
* Enter into the frame
* perform actions
* after perform actions comeout of the frame

Practice websites:
Website: https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit

Website: https://jqueryui.com/selectable/
*/

			
			
			
//way-1 -Enter into the frame

//driver.switchTo().frame("iframeResult");
			
//way-2 ---- 1st frame r jonno index 0, java r index 0 theke start hoi.
//driver.switchTo().frame(0);
			
//way-3> WebElement
//driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));

//Or we can do it otherway--- 
//driver.find,, ke variable(iframe) e store kore driver.switc,, iframe pass kore frame e enter korte hobe
WebElement iframe = driver.findElementByXPath("//iframe[@id='iframeResult']");
driver.switchTo().frame(iframe);
			
System.out.println("Successfully enter into the frame"); //this is to test we enter into frame or not
			
//driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
			
//driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
			
driver.findElementByXPath("//input[@value='John']").clear();
//enter first name
driver.findElementByXPath("//input[@value='John']").sendKeys("Milton");
			
			
Thread.sleep(3000);
driver.findElementByXPath("//input[@id='lname']").clear();
//enter last name
driver.findElementByXPath("//input[@id='lname']").sendKeys("Islam");
//click submit
driver.findElementByXPath("//input[@value='Submit']").click();//type and value are not locators 
//in dom while inspecting, so we can choose either 'type' or 'value' 
//as attribute and use only xpath.
			
//Back to main/parent page	
driver.switchTo().parentFrame();
			
Thread.sleep(3000);
driver.close();
	}

}
