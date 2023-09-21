package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.SAdminRole;

public class DStepAdminRoleCreation 
{
WebDriver driver;
SAdminRole ar;	
Iterations it;	

	@When("enter the admin-role title")
	public void enter_the_admin_role_title() {
	   ar=new SAdminRole(Browser.driver);
		ar.EnterPermissionTitle("amaz");
	}

	@Then("the created admin-role should be verified")
	public void the_created_admin_role_should_be_verified() {
	    it=new Iterations(Browser.driver);
		Assert.assertEquals(it.getSettingName(),"amaz");
	}
	
}
