package stepdefination;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;

import myBrowsers.Browser;
import pom.HAttributeValue;
import pom.SAdminRole;
import pom.SClientRole;

public class StepAdminRolePage 
{
    WebDriver driver;
    SAdminRole ar;
    Iterations it;
    SClientRole cr;
    HAttributeValue av;
//*********************************Created*******************************************************	
	@When("click on Admin-roles link")
	public void click_on_admin_roles_link() throws InterruptedException {
	    it=new Iterations(Browser.driver);
	    it.ClickOnlinkByText("settings");
	    it.ClickOnSettingLinksByText("Admin Roles");
	    Thread.sleep(2000);
	}

	@Then("the user is on the admin-role home page")
	public void the_user_is_on_the_admin_role_home_page() {
	   Assert.assertEquals(it.VerifyCurrentPageText(),"Admin Roles");
	}

	@Then("user is on the Admin-role new page")
	public void user_is_on_the_admin_role_new_page() {
		Assert.assertEquals(it.VerifyCurrentPageText(),"Add Admin Roles");
	}
	
   @When("enter the admin-role title")
	public void enter_the_admin_role_title() throws InterruptedException {
	   ar=new SAdminRole(Browser.driver);
		ar.EnterPermissionTitle("amaz");
	
	}
  

	@Then("the created admin-role should be verified")
	public void the_created_admin_role_should_be_verified() throws InterruptedException {
	    
	    cr=new SClientRole(Browser.driver);
	    cr.ClickOnDescButton();
	    Thread.sleep(2000);
	    it=new Iterations(Browser.driver);
		Assert.assertEquals(it.getSettingName(),"amaz");
	}
	//******************************************************************Update***********************************************************************
	@When("they select a specific admin-role and click on the edit button")
	public void they_select_a_specific_client_role_and_click_on_the_edit_button() {
		cr=new SClientRole(Browser.driver);
		cr.ClickOnDescButton();
		it.ClickOnEditICon();
	}

	@Then("the edited role should be verified")
	  	public void the_edited_lot_should_be_verified() {
	  		Assert.assertEquals(it.VerifyFirstRecordName(), "amaz"); 
	  	}
	@Then("the deleted admin-role should be verified")
  	public void VerifyAdminRole() {
		cr.ClickOnDescButton();
  		Assert.assertNotEquals(it.VerifyFirstRecordName(), "amaz"); 
  	}
//**********************************************AdminDelete******************************************	
	@When("click on the Admin role delete button")
	public void ClickOnDeleteButton() throws AWTException, InterruptedException {
	   av=new HAttributeValue(Browser.driver);
	   ar=new SAdminRole(Browser.driver);
	   ar.ScrollPage();
	   av.ClickOnDeleteButton();
		it=new Iterations(Browser.driver);
	   it.KeyBoardEnterKey();
	}
	
	
}
