package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;

import myBrowsers.Browser;
import pom.SAdminRole;

public class DStepAdminRoleComponents 
{
// public WebDriver driver;
    SAdminRole ar;
    Iterations it;
	
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

//	@Then("the admin-role permissoin title text field should be enabled")
	public void the_admin_role_permissoin_title_text_field_should_be_enabled() {
	    ar=new SAdminRole(Browser.driver);
	    Assert.assertEquals(true,ar.VerifyPermissionTitleField());
	}

	@Then("the admin-role all check-boxes should be enabled")
	public void the_admin_role_all_check_boxes_should_be_enabled() {
		ar=new SAdminRole(Browser.driver);
		ar.verifyAllCheckBox();
	}
}
