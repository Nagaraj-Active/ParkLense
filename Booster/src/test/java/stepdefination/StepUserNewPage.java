package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import myBrowsers.Browser;
import pom.CUserNewPage;

public class StepUserNewPage 
{
	WebDriver driver;
	public CUserNewPage un;
	
	
	@When("click on the new button")
	public void click_on_the_new_button() 
	{
		un=new CUserNewPage(Browser.driver);
	    un.ClickOnNewButton();  
	}
	@Then("verify the client-user new page")
	public void verify_the_client_user_new_page() 
	{
	 Assert.assertEquals(un.CLientUserNewpageText(),"New Client User");
	}
}
