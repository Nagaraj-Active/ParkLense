package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import myBrowsers.Browser;
import pom.CUserPage;

public class StepUserPage 
{
   WebDriver driver;
   CUserPage up;

   @When("click on the client-User link")
	public void ClickOnCLientUserLink() 
	{
	  up=new CUserPage(Browser.driver);
	  up.ClickOnLink();
	    
	}
	@Then("verify the client-User page")
	public void verify_the_client_user_page() 
	{
	 
	  Assert.assertEquals(up.UserPageText(),"Users");
	}

	@When("add client filter")
	public void add_client_filter() //throws InterruptedException  
	{
	    up.ClientDropDown("auburn");
	}

	@Then("verify the users")
	public void verify_the_users() 
	{
	    System.out.println("pass");
	}
}
