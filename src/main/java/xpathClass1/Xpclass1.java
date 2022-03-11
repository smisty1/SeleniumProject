package xpathClass1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpclass1 {

	public static void main(String[] args) throws InterruptedException {
		
/*previously we learn direct locator id, name, class,type,link text, partial link text.

-today we will earn number 7 locator-xpath, then we will learn cssselector	
-without locator we can not find web element in selenium. web element na thakle Dom
e pawa jabena.
- alert is not a web element, there we switch to locator and accept or dismiss.

-An HTML document is a file containing hypertext markup language.
 HTML code is based on tags, or hidden keywords, 
 which provide instructions for formatting the document. html code start with html tag.
 ex: <!DOCTYPE html>
     <html>
     <body>
     
     <h1>My first heading</h1>
     <p>my first paragraph.</p>
     
     </body>
     </html>

-(xpath (customize locator),we can make or customize by ourselves, main name is xpath) 

-xpath is a technique in Selenium to navigate through the HTML structure of a page.
-xpath enables testers to navigate through the XLM structure of any document,
and this can be used on HTML documents.
XLM(extensible markup language file)-this is a name of a designing pattern, programme r name

what is xlm structure 
-XML documents have a hierarchical structure and can conceptually be interpreted 
as a tree structure, called an XML tree. XML documents must contain 
a root element (one that is the parent of all other elements). 
All elements in an XML document can contain sub elements, text and attributes.

- the xpath locator in selenium use to select various elements.

-by using html code we find our desire web element username , password etc.
-id="username" is atribute not called locator in code or DOM, ID ke selnium e locator bole, 
thats why we say some of the attributes we call locator in selenium
-xpath use kore amra akta web elemen pete pari, ai jonno atake xlm path bole. 

Two types of Xpath- 

1)Absolute Xpath- syntax: absolute xpath start with single slash /html...


direct way to find the element, it contains complete
path from root to desire element, ( it writes from root html tag to whole thing if i 
select copy full path), so disadvantage- if developer change anything in the path of the
element then that xpath(customize) gets failed 
that means code(ex:driver.findelementbyxpath("...code..") will not work.

-whatever we see change (ex: add a  pic)in the UI, there is corresponding change 
code in dom, so if we type previous xpath, it will not work, i have to type a new one. 
its not possible to change xpath all the time to time matter and too much work, so we do not use this xpath
 we use 2nd one

Interview ques-which one we use?
ans: abs xpath is a direct way to find an element because it contains the complete path
 from root to the desire element. it often change, It is unreliable way to find an element, 
 so we use relative xpath in real time, not abs xpath.

2) Relative xpath: starting simply by referencing the element we want and go from the
particular location. if we make any architectural or web element change on the website, 
the change wont affect the testing or selecting of the web element. 
 
 syntax: relative xpath startt with double slash //
 
          //tagname[@attribute='value']; ex: //input[@id='username'];
           there are 7 types of relative xpath. ex: attribute base xpath etc.
           */
 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
 
 ChromeDriver driver = new ChromeDriver();
		
 driver.get("http://leaftaps.com/opentaps/control/login");
 
 driver.manage().window().maximize();
 
 System.out.println(driver.getTitle());
 
 /* Relative xpath - 
  1) atribute base xpath: wring xpath based on attribute name and attribute value, 
    //tagname[@atribute='value'];
 ctrl+F in dom, type
 then tagname type in the below box, ex: input, the follow syntax and type, 
 1 of 1 hole and dom e  r line yellow mark hole, then click on the yellow, 
 then i can see in UI my desire element choose korese ex: username element select korbe with blue mark
  3 ta jinish thik hole bujte hobe correct type hoyese.
 
 usrname field r xpath:
 type in dom box then copy and paste //input[@id='username'], its [] square bracket
 */
 
 
 
//Enter user name by atribute base xpath
 driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
 //enter password by atribute base xpath
 driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
 //click login by atribute base xpath
 driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
//click crm/sfa by partial text base xpath
driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
//click create lead
driver.findElementByXPath("//a[contains(text(),'Create L')]").click();
 
 
 
 
 //enter company name by atribute base xpath
 //here we can use id, class, name, attribute base xpathe and partial base xpath
 //but correct to select locaor id, attribute base xpath and partial base xpath
 driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("ABC");
// enter first nameby atribute base xpath
 driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
 //enter frst name local by atribute xpath
 driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("john");
 //enter title by atribute xpath
 driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Mrs");

 //enter Description by atribute xpath
//driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("It is IT company");

 //OR enter description by partial base xpath
driver.findElementByXPath("//textarea[contains(@id,'createLeadForm_d')]").sendKeys("It is IT company");

/* 2) partial base xpath : this time the value will be short and syntax  is
Syntax:  //tagname[contains(@attribute,'partialValue')] ,here contains means partial 
value is contained in that full attribute value. 
Equal sign(=) hoi exact value r jonno, partial value r jonno koma(,)
always use 'contains' for partial value r jonno

ex: https://www.bankofamerica.com   
after inspect ID, select  placeholder(attribute) from DOM ,onekgulor modhe placholder nilam coz atai kaj kore,
onnogulo check kore dekte hobe, but trick is  online id highlighted kora ache, 
so atai check korlam. online id username placeholde e ache. aria-level=online id neini, 
coz its duplicate and xpath likle kaj korte pare, but always select stable one. here stable one is place holder

 //input[contains(@placeholder,'Online ID')]
 for partial 'On' porjonto kaj kore, big kisu likha hakle partial kore type korte pari 
 dekte hobe kototuku porjonto 1 of 1 hoi DOM box e. 
 
 Partial attribute xpath 
 //input[contains(@placeholder,'On')]  */
 
/* 3) Text base Xpath : : writing Xpath based on text of element design code, 
  if attribute is not available in the code or not usable or preferable, means if i cant
  use atribute , id ache but not usable
  other locator name, class, link text, partial linktext use korte na parle then
   text base use korte hobe, often in interview akta line r code diye bolbe oita theke koi dhoroner
   locator likha jai sob kisu likho.
   ex: Code:<h3>New Jersey</h3> ata akta line r code, ater text new jersey,
   attribute or tag name h3. if i was asked write a locator text base xpath of this line
   code: Code:<h3>New Jersey</h3>
   ans: Xpath: //h3[text()='New Jersey']
   
  *** Syntax: //tagname[text()='text']  //Note: text= text of code, text() is text node
      //tagname[text()='text of code']

    Example-from the below code we write Text base Xpath- 
    (website:- https://tepeople.com/contact.html )
     Code:<h3>New Jersey</h3>
     Xpath: //h3[text()='New Jersey'] 
     
 another eample click merge lead by using text base epath:
<a herf='/crmsfa/control/mergeleadsform class="selected" id="ext-gen595">Merge Leads<..
here merge Leads  is text

click merge leads by text base xpath 
syntax: //a[text()='Merge Leads']


**4.Partial Text base Xpath: writing Xpath based on partial text of element design code, if attribute is not available in the element design code or not usable or preferable.

Syntax: //tagname[contains(text(),'text')] 

Partial Text base Xpath- Website-(https://tepeople.com/services/api-testing.html )
Example-from the below code we write partial Text base Xpath-
Code: <h2 class="text-uppercase">API Development</h2>

Xpath://h2[contains(text(),'AP')]

Ex: API deve from https://tepeople.com/services/api-testing.html 
//p[contains(text(),'API developmen')]


click create lead by partial text base xpath
//a[contains(text(),'CRM')] 
 
 5.**Parent to child navigation/travel: writing Xpath base on parent basic Xpath and /(slash)child tagname
Syntax: Parent basic xpath/child tagname

Example 01: from the below code we can write Parent to child Xpath(website:-http://leaftaps.com/opentaps/control/main)
Code: 
    <p class="top">
            <label for="username">Username</label>
            <input class="inputLogin" type="text" id="username" name="USERNAME" size="50">
     </p>
Xpath://p[@class='top']/input   here //p[@class='top'] is parent , it stays on top
child is input tag , we r using usernam box not field (outside of box), 
so take input , not level, if i select input yellow line in dom, 
it will show i UI username, then i will know i have to select iput child not level child.


Example 02: from the below code we write Parent to child Xpath-(website:-https://jqueryui.com/selectable/[element-sortable])
Code:
       <ul id="sortable" class="ui-sortable">
	<li class="ui-state-default ui-sortable-handle"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 3</li>
	<li class="ui-state-default ui-sortable-handle"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 2</li>
		<li class="ui-state-default ui-sortable-handle"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 4</li>
	<li class="ui-state-default ui-sortable-handle"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 5</li>
	<li class="ui-state-default ui-sortable-handle"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 6</li>
	<li class="ui-state-default ui-sortable-handle"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 7</li>
         </ul>
         
         here li is list
Xpath: //ul[@id='sortable']/li[1]   here same as perent to child, just add index num at last

at end it will show index, 1 , 2 , 3, at top end li[3] means oi line select korbo.

//ol[@id='selectable'] 1 of 7 in dom
multiple number 1 of 7 in dom, atake unique korte index number dile single hoye jabe
line 5 r jonno: //ol[@id='selectable']/li[5] now 1 of 1 in dom

 
 6. Collections Xpath: write any type of Relative Xpath then keep it in a normal bracket, i.e.(//input[@id='username']) then indexing like [1]
or (any Xpath)[index]

Note: For avoid duplication or multiple matches, i.e. make it unique, we use collection Xpath
Example 01:from the below code we write Collections Xpath-
Code: 
        <input class="inputLogin" type="text" id="username" name="USERNAME" size="50">
Xpath: (//input[@class='inputLogin'])[1]
Example 02: from the below code we write Collections Xpath-(http://leaftaps.com/crmsfa/control/findLeads)-Find Leads-1st resulting lead
Code: 
         <div class="x-grid3-cell-inner x-grid3-col-partyId" unselectable="on" id="ext-gen875">
	<a class="linktext" href="/crmsfa/control/viewLead?partyId=10236">10236</a>
         </div>
Xpath: (//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]

 
 ***collection of xpath r kaj holo jokhon multiple value pawa jai setake unique banano
  1 of 1 , ex : class select in dom for usernam, if i donot take id = username,
  akhane class r value 1 of 2, so xpath likhe normal bracket e diye index num dite hobe, 
  1 o 2 thakle index 1 hobe.
  
  for username (//input[@class='inputLogin'])[1] 
  if i type 2 index vale it will select password in UI. 
  if i only type //input[@class='inputLogin'] it will select only username, 
  kokhonoi password e ashbena, coz by default selenium matching with 1st element
  so password e ante gele () bracket e( //input[@class='inputLogin'])enter diye 
  collection kore index e diye dibo. then index [1] means username, [2] means password.
  */


//enter country code by atribute xpath
driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("1");
//enter area code  by atribute xpath
driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("01");
//enter extension  by atribute xpath
driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneExtension']").sendKeys("222");
//enterDepartment  by atribute xpath
driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("MKT");
//enter number of employees by atribute xpath
driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("100");

//enter web Url by atribute xpath
driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("google.com");

//enter city by atribute xpath
driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("New york");

//enter Zip/postal code by atribute xpath
driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("75061");
//enter phone number by atribute xpath
driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("123456");
//enter email address by atribute xpath
driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("abc@gmail.com");

//select source (employee) by parent to child xpath
//Syntax: Parent basic xpath/child tagname

//by partial attribute
//driver.findElementByXPath("//select[contains(@id,'createLeadForm_da')]/option[5]").click();

//by attribute base as parent and child is option, if there is multiple line, use[] with ndex num, 
//multiiple value thakle unique korer jonno index [] with number jeta select korte chai.
driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']/option[5]").click();

//select industry (computer software)
driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']/option[4]").click();
//selectownership  (sole proprietorship)
driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']/option[2]").click();

//select state (Arizona)
driver.findElementByXPath("//select[contains(@id,'createLeadForm_generalS')]/option[5]").click();

//select country
driver.findElementByXPath("//select[contains(@id,'createLeadForm_generalC')]/option[232]").click();

//select Marketing Campaign
driver.findElementByXPath("//select[contains(@id,'createLeadForm_mark')]/option[3]").click();

//enter password by using collections of xpath
//i can also choose class instead of id, but it will show 1 of 2
//so () r modhe diye//input[@class='inputLogin'],,,,, [] e index num [2]diye dite hobe.
//then unique 1 of 1 hobe
driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");


//click merge leads by text base xpath , only need tag name and tex, 
//we don't need attribute and value
//driver.findElementByXPath("//a[text()='Merge Leads']").click();
    
 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
 
 
 
 
 
 Thread.sleep(3000);
 
 driver.close();
	}

}