package tcConnectInheritanceConcept;

import org.testng.annotations.Test;

import Wrapper.ProjectSpecificWrapper1ParaameterandDataP;

public class editLead extends ProjectSpecificWrapper1ParaameterandDataP{ //typ proj ctrl+space

	//public static void main(String[] args) {
@Test
	public void editLead () throws InterruptedException {
		
		//click leads link
		driver.findElementByLinkText("Leads").click();
						
		//click Find leads link
		driver.findElementByLinkText("Find Leads").click();
						
		//Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gopi");
						
		//click Find lead button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
						
//			ExplicitlyWait-WebDriverWait
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
							
		Thread.sleep(2000);

		//click on first resulting lead
						
		String LeadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(LeadId);
						
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
						
		Thread.sleep(3000);

		//Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);

		if(title.contains("View")) 

		{System.out.println("Title matched");
				} 
		else { System.out.println("Not Matches");
						}
						
		//Click Edit
		driver.findElementByXPath("//a[text()='Edit']").click();
						
		//Change the company name
		driver.findElementById("updateLeadForm_companyName").sendKeys("S");
						
		//Click Update
		driver.findElementByXPath("//input[@value='Update']").click();
						
		//Confirm the changed name appears
						 
		String changedName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(changedName);
					 
		 if(changedName.contains("tcs")) {
		 System.out.println("Name is matched"); 
						  
		} else {
		 System.out.println("Not matched");
						 }
		 
		 //i can run directly from testNg without xlm file coz 
		 //inheritence concept extends use kora hoyese but sequential and parallel 
		 //korte hole Xlm file create korte hobe
		 
		 //in xlm file- multple test cases called suite
		 //in parallel we use classes word coz opening and closing tag classes deya ache
		
	}

}
