package statrtingPointOfFramework;

public interface WrapperMethods {
	

//**100% abstract methods 

public void launchBrowser(String url);
	
public void enterById(String locatorValue, String data);//data is sendkeys value and locator ex:id value is locatorvalue
	
	public void enterByName(String locatorValue, String data);
	
	public void enterByPartialLinkText(String locatorValue, String data);
	
	public void enterByXpath(String locatorValue, String data);
	
	public void enterByCssSelactor(String locatorValue, String data);
			
	public void clickByName(String locatorValue);
	
	public void clickByClassName(String locatorValue);
	
	public void clickByLinkText(String locatorValue);
			
	public void clickByXpath(String locatorValue);
		
	public void selectVisibleTextById(String Id, String Value);
		
	public void selectIndexByName(String Name, int Value);
		
	public void getTextById(String Id);
		
	public void closeBrowser(); }
	
	/*Just recall our existing learning: 

		[for example- CreateLead Testcase]

what ever Methods(steps)we did - for example. these exs are implementation methods
		sendKeys();
		click();
		selectByVisibleText
		switchTo().alert().accept()
		switchTo().frame()
		getWindowHandles()
		etc.

		click-methods:
		driver.findElementById("username").click();
		driver.findElementByName("createLeadForm_dataSourceId").click();
		driver.findElementByClassName("USERNAME").click();
		driver.findElementByXpath("//input[@id='createLeadForm_firstNameLocal']").click();
		driver.findElementByLinkText("Leads").click();

		sendKeys methods:
		driver.findElementById("username").sendKeys();
		driver.findElementByName("USERNAME").sendKeys();
		driver.findElementByLinkText("Leads").sendKeys();

		Dropdown: For ex element (Choose Source )
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
				Select dd = new Select(src);
				dd.selectByVisibleText("Website");


		for example- sendKeys(), if we write

		public void enterById(){
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("DemoSalesManager");
		}

		for- click(), if we write
		public void clickByName(){
		driver.findElementByName("createLeadForm_dataSourceId").click();
		}

		For Dropdown- selectByVisibleText(), selectByValue() and selectByIndex()

		public void selectVesibleTexById(){
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
				Select dd = new Select(src);
				dd.selectByVisibleText("Website");
		}

		Same like- Alert, Frame, AUI and window Handles

		driver.switchTo().alert().accept();

		driver.switchTo().frame("sidebar");

		Actions builder = new Actions(driver); [AUI]

		Set<String> allWin = driver.getWindowHandles();
		for (String eachWin : allWin) {			
					System.out.println(eachWin);			
					driver.switchTo().window(eachWin);

		So, look at the above code, we are writing same code again and again. That means
		we are duplicating. So, this is not a smart way of writing code, we have to do some
		thing for avoiding this duplication.

		# Crate a method- and pass Locator Value runtime-
		public void enterById(String Id, String value);

		public void selectVisibleTextById(String Id, String value){
		WebElement src = driver.findElementById(Id);
				Select dd = new Select(src);
				dd.selectByVisibleText(value);
		}

		Question: 1) Create a method to add two/three number, only method declaration.


		public void addTwoNum(); //abstract method
		public void addTreeNum();
		
		2. How to add two or three numbers in java, write a method for that
		ans: public void addThreeNum() {} //curly base dile java method






		public void addTwoNum();//this is a meaningful one

		public void addThreeNum(); //this is a meaningful one


		Starting point of Framework:(Designing Framework)

		Step 1: Create a package name "learnInterface" and inside it craete 
		an Interface name "WapperMethods"

		Note: The interface is not mandatory for framework, but very helpful

		Step 2: inside "WapperMethods" write all method declaration/signature
		and pass agguments for example-

		public void launchBrowser(String url);
		public void enterById(String Id, String value);
		public void clickByClass(String value);

		Step 3: Now create a class name- "GenericWrapper" and implements with 
		interface "WapperMethods", mouse hover on and click "Add unimplemented methods"
		-Then all methods come with body into "GenericWrapper" what ever we write in 
		"WapperMethods" interface.

		Step 4: In "GenericWrapper", inside launchBrowser(){
		write all steps of launchBrowser
		}
		-Then write others methods
		public void enterById(String locatorValue, String data){
		driver.findElementById(locatorValue).sendKeys(data);
		}

		-Same way write all required methods with implementations

		Step 5: Now create a class name- TC001_login{
		//and annotated with @Test and extends with "GenericWrapper"

		For ex-
		@Test
		public void login(){
		//inside login(), call launchBrowser() - for ex-
		launchBrowser("http://leaftaps.com/opentaps");

		//then call all other methods -for ex-
		enterById("username","DemoSalesManager");
		clickByClass("decorativeSubmit");
		}

		}

		Step 6: Execute TC001_Login Test case. */


		 






