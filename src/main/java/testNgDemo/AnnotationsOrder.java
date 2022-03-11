package testNgDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import cucumber.api.java.Before;

public class AnnotationsOrder {
	
/*We see some of the Scenarios below-

Scenario-1
Run all the Test cases together/Sequentially(by one single click) 
means 1 by 1, akta sesh hobe r akta start hobe by one single click

Scenario-2
Run all test cases in parallel/all at a time (by single click), at a time, 
akshathe start hobe 1, 2 ,3 ak shathe by a single click


Scenario-3
Run any test case 5 times before running others

Scenario-4
Lets say, Create lead failed in last run, re-run that alone

Scenario-5
Run only all create functionalities (Create lead, create account etc.)

Scenario-6
When test cases get executed, need report to say PASS or FAIL

Scenario-7
When more than 90% of test pass, report should say "PASS" or "FAIL"



TestNG Introduction:

TestNG: It's a unit testing Framework, mainly developer using it for design their unit testing Testcases.
	It is also called TDD framework(Test Driven Development)
TestNG open source and free for everyone, and available in JAR files. It's only for 
JAVA, so it also called Java Unit testing Framework, Junit also for JAVA.

Extension for TestNG "Test Next Generation". It's purely works based on .xml file, So, entire
TestNG Framework executed based on the .xml file

Purpose:	
>Design test cases in a systemitic way
>Its gives Html reports
>Its provide us lot of Annotations
>Its gives Priority/sequence of your test cases in execution/run time, ex:
if i want to run 5 number testcase to run first, then i can give priority
to num 5 test case than num 1, 2 , 3 , 4 test cases.

>Its gives Dependency (i.e which testcases depends of other test case)
>Its gives Grouping (like which groups you want to run). 

>Its gives Parameterization facility i.e.Paremeters(Static data) & DataProvidor(Dynamic data) facility
 (like you want to run same test cases multiple time,its a very important feature in TestNG,
 life will be easy by using this feature.)
ex: username and pass
for an application i dont have to change all the time, if any data is fixed it 
is called static data.  First name , last name change all the time inside application,
that is called dynamic data



TestNG Annotations:
Anything start with @ we call it's a Annotation
we use main method in java to execute any test case or a class, 
here we can use annotation @ to execute a test case, at test or @ test is 
test Annotation. @test - test case execute korbe jeta java main method 
r jaigai kaj korbe. 

TestNG has 9 common Annotations-
1. @BeforeSuite
2. @BeforeTest
3. @BeforeClass
4. @BeforeMethod    //1 to 4 is pre-requisite, lagle sobgulo use korbo, 
                     na lagle dorker nei, so 1 to 4 is optional
                    //1 to 9 is annotation order
5. @Test            //5 @ test mandatory, always kaj korbe.
6. @AfterMethod      //6 to 9 is post condition , 6 to 9 optional
7. @AfterClass
8. @AfterTest
9. @AfterSuite

** 1 to 9 order type na korleo run korle console result e order e ashbe
that is before method, @test , then after method
**we use before method and after method when we will run multiple
 test cases at a same time.

Annotations will maintain Annotations order, not inserting order (that is above 1-9).

How to install TestNG in Eclipse:

>URL(copy this url): https://dl.bintray.com/testng-team/testng-eclipse-release/7.0.0/
>Go to Eclipse help menu > Install New Software > paste this copied URL in Location field- 
> Hit Enter >Check TestNG> Next > Check the Radio  button 'I accept the terms of the license of agrement' > Install Anyway 
> Finish > Restart > ok


TestNG Prioprity:
1. No priority will run first
2.Priority = 0 will be run 2nd
3. Priority =1 will be run 3rd
4. Priority =2 will be run 4th
*/
 
/* when we use any testNg annotation we have to create a java method ( not 
 main method).  This is mandatory */
 
	@BeforeClass //type @Before ctrl+space, it will show @BeforeClass-org.tstng... slect this one
    public void beforeTest() { //method name start with lower class ex: beforeTest
		System.out.println("beforeTest");
	}//when we write method give () sign and body {}
		
	@BeforeSuite
	public void beforSuit() {
		System.out.println("BeforeSuit");
	}
			
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@Test
	public void test1() { //only test sobgulute type korle hobena, 
		//type test1 , test2, test3 coz multiple test is here. 
		System.out.println("Execute test1");
	}

	@Test
	public void test2() {
		System.out.println("Execute test2");
		
	}
	
	@Test
	public void test3() {
		System.out.println("Execute test3");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuit");
	}


}
