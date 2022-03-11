package takeSnapShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnapShot {

	public static void main(String[] args) throws IOException {


System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");

ChromeDriver driver = new ChromeDriver();

driver.get("http://leaftaps.com/opentaps/control/login");

driver.manage().window().maximize();

System.out.println(driver.getTitle());

driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

driver.findElementById("username").sendKeys("DemoSalesManager"); 

driver.findElementById("password").sendKeys("crmsfa");

driver.findElementByClassName("decorativeSubmit").click();

driver.findElementByLinkText("CRM/SFA").click();

driver.findElementByLinkText("Create Lead").click();

driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

driver.findElementById("createLeadForm_firstName").sendKeys("Hema");

driver.findElementById("createLeadForm_lastName").sendKeys("Ma"); 

//driver is for selenium coz driver is a web element , web e kaj kore, driver
//chara kaj korena, webdriver manei selenium

//Take Snapshot/Screenshot

File src = driver.getScreenshotAs(OutputType.FILE); //take snapshot and store in a temporary file
//driver.getScreenshotAs(OutputType.FILE); temporary file e store kora ache
//then file src te store korlam ctrl+2 src variable diye


//Path/location-1 , where it will store after moved
File dest = new File ("C:\\Users\\FUAD HOSSAIN\\Desktop\\snaps\\img.png");//define the destination where src stores
//File class r object create kore kotha ata store hobe ter path diyesi.
//jokon kono image file hoi ter extension hoi png, here img name, 
//imageshohana or imgetc dite perbo but png hoche image file r extension

//add korte hobe\\img.png, then (FileUtils.copyFile(src, dest);) type kore run
//korle img snaps folder e save hoye jabe , img(pic) nibe last page create lead
// r hema, ma, tcs r. 


//*** OR, by project path,, 
//path/location-2 , , where it will store after moved
//project path is ./, we will create a snap1 folder in the project
//here my project is Selenium Project>new>folder type snap1 and create
//then run from eclipse, imgage.png automatic folder e save hobe.
//previously we did it in desktop as img.png,> File src = driver.getScreenshotAs(OutputType.FILE);
//we will do in our project eclipse r modhe

//***File dest = new File ("./snap1/image.png");

//after run from left side in project refresh it, then click snap1 data, 
//it will sow image.png file, click it and open

FileUtils.copyFile(src, dest); //moved file source to destination(img or image file)
//here FileUtils is a class copyFile is method. File src, File dest is move
//file source to destination.



//so for snap shot 2 rules:

//1. File src = driver.getScreenshotAs(OutputType.FILE);
//File dest = new File ("C:\\Users\\FUAD HOSSAIN\\Desktop\\snaps\\img.png");
//FileUtils.copyFile(src, dest);

//or 2. only 1 line > that is, File dest = new File ("./snap1/image.png");







/*Take Snapshot/ScreenShot:

What we do for taking a Screen Shot?

When we take a screenshot, 1st we manually, Press "Print Screen" btn from keyboard
and we copy the image and need to paste it some where or in a File. 

i.e. When we press "Print Screen" btn it will capture a image and store it in a Temp file.

> So, for copy/capture a file Selenium has a method "getScreenshotAs()", and it helps us to take a ScreenShot, 
like  "Print Screen" btn.

i.e. driver.getScreenshotAs(OutputType.FILE); 
// "getScreenshotAs()" is a method that take a screenshot of your visible screen. Now we need to store it in a variable 

i.e. 
1) File src = driver.getScreenshotAs(OutputType.FILE); 
// Take snapshot and store it in a variable, Temp File- (OutputType.FILE)- we don't know the extention of the file.
			
//Need to give a location/path -where it will store after move, for that we create a object of File class and pass the path
i.e.
2) File dest = new File("C:\\Users\\mamun\\Desktop\\snaps\\img.png"); //define the destination/location of file
OR				
// The path/location- where it will store after move, for that we create a object of File class and pass the path
//File dest = new File("./snap/image.png");

Note: For moving file source to target/destination we need to add a 
dependency called Commons-io(dependency thake pom.xml file e, pom is project
object model. and commons io is akta file ke ak jaiga theke r jaigai move
korte, so common io lagbe for moving file 1 destination to another 
destination), it's a third party tools. Under Commons-io there is a 
class called "FileUtils" and this class has one method name 
CopyFile(srcFile, desFile);

we use apache tool for excel file r joono

So, we use "FileUtils" class and CopyFile method for moving 	file from source to target.
i.e.
3) FileUtils.copyFile(src, dest); // moving file source to destination
		
*/
	}

}
