package miscellaneuosConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Assertions { //assert means verification

	public static void main(String[] args) {
		
/*Assertion for Varifications:
	We can assert title of page 

	1. Assert.assertEquals(Actual, expected);
	i.e.   Assert.assertEquals(title, "Gogle");
or
Assert.assertEquals(Actual, expected, message);
      i.e. Assert.assertEquals(title, "Gogle", "Asserting the Title");

2. We can assert any Text
 Assert.assertEquals(Actual, expected);
      i.e.	Assert.assertEquals(firstName, "Hema");
or
Assert.assertEquals(Actual,expected,message);
i.e. Assert.assertEquals(firstName, "Hema", "Verifying firstName");

Note: Actual and expected both data type should be same, i.e. when you use String both should be
String and when use int both should be int. 

3. Assert.assertTrue() -return true/false
Assert.assertTrue(condition, message);
Assert.assertTrue(logo, "logo is displayed");
or for Google Searchbox
Assert.assertTrue(searchbox, "verify if the search box is displayed");



4. isDisplayed(), isEnabled() and isSelected() ***for verification purposes,
these are selenium methods

isDisplayed: is the method used to verify presence of a web element within the webpage. 
isDisplayed() method return true/false.

Verify any(box,button etc.) displayed or not in the page
-use isDisplayed() method
//it returns true or false
isEnabled: is the method used to verify if the web element is enabled or disabled within the webpage.Ex:
this radio button is working or not, check with is enabled

isSelected: is the method used to verify if the web element is selected or not. 

*/
		
System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");		

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

//Load url
//driver.get("https://opensource-demo.orangehrmlive.com/");

driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");

//get title of the page
//System.out.println(driver.getTitle());

//or, another way for getting title of the page
String title = driver.getTitle();
System.out.println(title);


//** Assert two methods assertEquals(math actual and expected) , assert(true/false) 

//Assertion hoche verify title that i got(title) right or wrong
//Assertion Syntax: Assert.assertEquals(Actual result,"Expected result","Assert Message");
Assert.assertEquals(title, "Bank of America | Online Banking | Log In | Online ID","Asserting page title");
//*expected true hole kisu msg dibena, assert msg nao dle chole
// 1Bank of America expected hole result console e ashbe 
//'assertion error' with assert msg(Asserting page title) coz actual r 
//shathe expected mileni.
	
//3 ways to verify
//**kono acta web element ache kina verify(title ache kina) korer jonno -is displyed
//is enabled- ex: from bank web e "get the app" visible kina
//web element select kina- is selected


//now verify bank of america logo ache kina by is displayed
//isDisplayed(); -"Bank of America" Logo is displayed (true/false)
boolean logo = driver.findElement(By.xpath("//img[@alt='Bank of America']")).isDisplayed();

//Assertion
//Assert.assertTrue(logo, "logo is displayed");
Assert.assertTrue(logo, "logo is displayed");// is displayed for is visible varification
		
//isEnabled() -Get The App link is Enable(true/false)
//is enabled means any link or pic is clickable, that means enable or not
//enable means active or disable
//enable assertion na, here we use if else, assetion and enable, both are verification 

//is enabled, is selected, is displayed are selenium methods
//assertion testNg r method  java diye use korci , if else java r method
boolean getTheAppLink = driver.findElement(By.xpath("//a[@id='choose-device-get-the-app']/span[1]")).isDisplayed();
if(getTheAppLink==true) {
System.out.println("The Get the App link is Enabled");
		}else {
System.out.println("The Get the App link is not Enabled"); 
		}
		
//isSelected();-to do this validation we can use only-RadioButton,a CheckBox & Drop-down (true/false)
//1st click on the "Save this online Id CheckBox"(select) then verify isSelected() otherwise else part will be work
//"String" data type start with uppercase letter. boolean data type type korte hoi lower case e
driver.findElement(By.xpath("//div[@class='remember-info']/input ")).click();
boolean SaveThisOnlineIdCheckbox = driver.findElement(By.xpath("//div[@class='remember-info']/input ")).isSelected();
System.out.println(SaveThisOnlineIdCheckbox);

//Assertion
Assert.assertTrue(SaveThisOnlineIdCheckbox, "SaveThisOnlineId CheckBox is selected");

//Validation
        if(SaveThisOnlineIdCheckbox==true) {
			System.out.println("The checkbox is Selected");
		}else {
			System.out.println("The checkbox is not Selected");
		}

		driver.quit();



		

	}

}
