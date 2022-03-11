package Wrapper;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProjectSpecificWrapper1ParaameterandDataP {

	
	public ChromeDriver driver; 
	//here login method e (ChromeDriver driver;) rakle only login use 
	//korte perbe but closeBrowser method use korte perbena, so globally
	//aki class r modhe multiple method thake (login and closeBrowser ) and
	//variable declare such as driver thake then class level e declare korte hoi, 
	//that means after the class not inside the method , 
	//globally declare korte hobe, so (public ChromeDriver driver;)
	//at class level e declare kora hoyese. 

@Parameters({"url","uname","pwd"})	//parameters are static data..why we use parameters?
//Ans: to enter static data such as url, uname, pwd we use parameters.
@BeforeMethod //to execute a test case we use some common steps such as 
//launch browser, maximize browser, implicit wait, username, password, login etc. we can use These common steps
//to execute all test cases. 

public void login(String url, String uname, String pwd) { //shift+tab---if i want to move sentence to the left
	
//**launch browser, load url		
System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");

 driver = new ChromeDriver();
//ChromeDriver type fron e thakle prob nai , na thakleo chole coz we 
 //declare it in class level and createlead, edit lead extends projspew

//load URL
driver.get(url);

//maximize
driver.manage().window().maximize();
						
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
//Enter Username - (Element level)
driver.findElementById("username").sendKeys(uname);
						
//Enter Password - (Element level)
driver.findElementById("password").sendKeys(pwd);
						
// Click Login Button - (Element level)
driver.findElementByClassName("decorativeSubmit").click();
						
// click crm.sfa link
driver.findElementByLinkText("CRM/SFA").click();	
}

@AfterMethod
public void closeBrowser() {
driver.close();
}

//projectspecwrap(super class) e  @After method r por new method create korbo, public
//void getdata, inside getdata method create 2 dimension or 2D array. 
//array is a class. String[][]

@DataProvider // DataProvider provides Dynamic data, read excel file will read these dynamic data
public String[][] getData () {//i method r modhe 2 D array object create korbo
String[][] data = new String[3][3]; //so String[][] data = new String[3][3] is object
                     //String[] data = new String[3] single Dimension array. array is data
	                 //here[3][3] eans 3 ta row and column add korte perb
data[0][0] = "CTS";  //so data[][] madhome fname lastname enter korte 
data[0][1] = "Abdur";//perbo from readexcel, here we are not using row and
data[0][2] = "Rahman";//column num from excel sheet, we choose 0 row CTS
                       //CTS 0 row and 0 column, abdur 0 row and 1 column.... 
            

data[1][0] = "FGS";  //so data[][] madhome fname lastname enter korte 
data[1][1] = "Joseph";//perbo from readexcel, here we are not using row and
data[1][2] = "Smith";  

	                      
data[2][0] = "TCS";  //so data[][] madhome fname lastname enter korte 
data[2][1] = "Nafisa";//perbo from readexcel, here we are not using row and
data[2][2] = "Hossain";  

	return data  ;  //add return type, return data; purpose is 
	                //getdata method 2D data return korbe.
	               // void means kono kisu return korbena, so return data 
                   //under r red mark click korle void remove  (public void getdata )
	              //hoye String[][] hobe (public String[][] getdata ())
	         
	         //HERE method r name getdata under@DataProvider,ata
	        //2 dimension array create korbe and niche return type add korbe

//** 2 or 5 data hole ai data provider rule follow korbo, but so many data hole
//excel sheet connect kore korbo.
	
//**	@Test(dataProvider = "getData") in Parameter_createLead1 and projspwrp1
//e same method type korte hobe. so //**getData- D will be capital 
//letter if i type in superclass projspwrap1 e getData , then P_Crea1 eo
//@Test(dataProvider = "getData") 'D' capital letter.
	
	

}


}










/*Implement Inheritance concept in TestNG:-

1. Create a package name -wrapper
2. inside this package -create a class name-ProjectSpecificWrapper
3. inside this calss- create a Method name- login()
[copy all common steps from your testcase and paste inside the login() method]

i.e.-

@BeforeMethod
public void login(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//load URL
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//Enter Username - (Element level)
driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");
		
		// Click Login Button -(Element level)
		driver.findElementByClassName("decorativeSubmit").click();
		
		// click crm.sfa link
driver.findElementByLinkText("CRM/SFA").click();
}

4. all the TestCases extends with ProjectSpecificWrapper(super class)
5. declar ChromeDriver driver at class level and delete from method level
i.e. - driver = new ChromeDriver();
6. In supper class Add @BeforeMethod in first common Steps or above login() method
7. In super class create another Method name- closeBrowser()
i.e- 

@AfterMethod
public void closeBrowser(){
driver.close();
}

8. In supper class Add @AfterMethod in last step or above closeBrowser()

9. Run Sequencial- 
a) Select all TC's which you want to run Sequencial and right click on it>TestNG>Convert TestNG>Generate TestNG.xml 
window will open>Change the file name from location(if you want to change)>click Finish
b) open the TestNG.xml file by double click on it > run it from testng by right click on it> all the TC's will run one by one that is Sequencicl 
by one click.

10. Run Parallel-
a) Select all TC's which you want to run Parallel and right click on it >TestNG > Convert TestNG > Generate TestNG.xml 
window will open > Change the file name from location (if you want to change) > inside <suite tag, after name attibute add another attibute,
parallel ="classes" > click Finish

b) open the TestNG.xml file by double click on it > run it from testng by right click on it > all the TC's will run at a time that is parallel
by one click. */




/* Now we will excute creatlead 3 times by entering dynamic data such as, hema, ahsan etc use as first name 
we don't have to change testNg xml cause only using create lead
DataProvider:
Step 1: Declare test data (dynamic value) inside the 2D Array
Step 2: Make the connection with @Test, using @DataProvider and add return keyword with data object in DataProvider method 
Step 3: Inside the Testcase all dataprovider using dataProvider attribute.
i.e. @Test(DataProvider = ”getData”)
Step 4: declare the arguments to Java method
Step 5: pass the argument values to the implementation function.

How to create a 2D Array:
2D array (combination of Row and column)
CName	fName	lName
CTS 		Helal 		Islam 
TCS		Mohd.	Shakil
ABC		Mahbub	Islam	

R C
[0][0] = “CTS”;
[0][1] = “Helal”;
[0][2] = Islam
[1][0] = TCS
[1][1] = Mohd.
[1][2]= Shakil
[2][0]= ABC
[2][1]= Moriom
[2][2] = “Akter”;
 
 
 
 */


 
  



		
	


