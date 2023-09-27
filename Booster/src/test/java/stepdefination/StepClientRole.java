package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;

import myBrowsers.Browser;

import pom.HAttributeValue;
import pom.SClientRole;

public class StepClientRole 
{
  WebDriver driver;
  public Iterations it;
  public SClientRole cr;
  public HAttributeValue av;
	
	
	@When("click on client-roles link")
	public void click_on_client_roles_link()throws InterruptedException {
		    it=new Iterations(Browser.driver);
		    it.ClickOnlinkByText("Settings");
		    it.ClickOnSettingLinksByText("Client Roles");
		    Thread.sleep(2000);
	}

	@Then("the user is on the Client-role home page")
	public void the_user_is_on_the_client_role_home_page() {
	    Assert.assertEquals(it.VerifyCurrentPageText(),"Clients Roles");
	}

	@Then("user is on the client-role new page")
	public void user_is_on_the_client_role_new_page() {
		Assert.assertEquals(it.VerifyCurrentPageText(),"Add Client Roles");
	}

	@Then("the Permissoin title text field should be enabled")
	public void the_permissoin_title_text_field_should_be_enabled() {
	    cr=new SClientRole(Browser.driver);
	    Assert.assertEquals(cr.VerifyPermissionTitleField(),true);
	}

	

	@Then("the all check-boxes should be enabled")
	public void the_all_check_boxes_should_be_enabled() {
		Assert.assertEquals(cr.verifyAllCheckBox(),true);
	}

	@When("they click on the New Button")
	public void they_click_on_the_new_button() {
	  it.ClickOnNewButton();
	}

	@When("enter the client-role title")
	public void enter_the_client_role_title() throws InterruptedException {
		cr=new SClientRole(Browser.driver);
		cr.EnterPermissiontitle("officer");
		Thread.sleep(4000);
	}

	@When("in the clientRoleNew page select the client from client drop down")
	public void select_the_client_role_status() {
		av=new HAttributeValue(Browser.driver);
		av.ClickOnClientdrop();
	    av.SelectClientOnNewPage("parklens");
	    
	}
	@When("select the client-role status")
	public void ClickOnClientRoleStatus() throws InterruptedException
	{
		it=new Iterations(Browser.driver);
//	    it.Radiobutton(1);	
		//it.ClickONRadiobutton();
	//it.scrollforRadio(driver, null);
	}
	
	@Then("the created client-role should be verified")
	public void the_created_client_role_should_be_verified() throws InterruptedException {
	   cr.ClickOnDescButton();
	   Thread.sleep(5000);
		Assert.assertEquals(it.getSettingName(),"officer");
	}

	@When("they select a specific client-role and click on the edit button")
	public void they_select_a_specific_client_role_and_click_on_the_edit_button() {
		cr=new SClientRole(Browser.driver);
		cr.ClickOnDescButton();
		it.ClickOnEditICon();
	}

	@When("do some modification on client-role")
	public void modify_the_permissions() throws InterruptedException {
	   cr.ClearPermissiontitle();
	   Thread.sleep(4000);
	   cr.EnterPermissiontitle("tester");
	}

	@Then("the edited client-role should be verified")
	public void the_edited_client_role_should_be_verified() throws InterruptedException {
		cr.ClickOnDescButton();
		Thread.sleep(4000);
		Assert.assertEquals(it.getSettingName(),"tester"); 
	}

	@Then("the deleted client-role should be verified")
	public void the_deleted_client_role_should_be_verified() {
	    cr.ClickOnDescButton();
	    String name=it.getSettingName();
	    if(name.equalsIgnoreCase("tester"))
	    {
	    	System.out.println("deletion is not happen");
	    }
	    else
	    {
	    	System.out.println("deletion is happen");
	    }
	}

//	@When("search for an client-role by its ID")
//	public void search_for_an_client_role_by_its_id() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("the client-role should be verified by its ID")
//	public void the_client_role_should_be_verified_by_its_id() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
}
