package stepdefination;



import java.awt.AWTException;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;

import myBrowsers.Browser;
import pom.FCameraPage;
import pom.GAttribute;


public class StepAttributePage 
{
   WebDriver driver;
   Iterations it;	
   GAttribute at;	
   FCameraPage cp;
	
	
	@When("they click on the setting page")
	public void they_click_on_the_setting_page() throws InterruptedException 
	{
	   it=new Iterations(Browser.driver);
			   it.ClickOnlinkByText("settings");
			   Thread.sleep(2000);
	}

	@Then("the user is on the Attribute home page")
	public void the_user_is_on_the_attribute_home_page() {
	   Assert.assertEquals(it.VerifyCurrentPageText(), "Attributes");
	}


//	@Then("the reset button should be enabled")
//	public void the_reset_button_should_be_enabled() {
//	   Assert.assertEquals(it.VerifyResetButton(),true);
//	}
//
//	@Then("the edit icon should be enabled")
//	public void the_edit_icon_should_be_enabled() {
//	    at=new ZAttribute(Browser.driver);
//	    Assert.assertEquals(at.VerifyEditIcon(),true); 
//	}
//
//	@Then("the pagination dropdown should be enabled")
//	public void the_pagination_dropdown_should_be_enabled() {
//	    Assert.assertEquals(true,it.PageDropDown());
//	}
//
//	@Then("the next page icon should be enabled")
//	public void the_next_page_icon_should_be_enabled() {
//	   Assert.assertEquals(true, it.VerifyNextPageDropDown());
//	}
//
//	//@When("they click on the new button")
//	public void they_click_on_the_new_button() throws InterruptedException {
//	    it.ClickOnNewButton();
//	    Thread.sleep(2000);
//	}
//
	@Then("user is on the Attribute new page")
	public void user_is_on_the_attribute_edit_page() {
	    Assert.assertEquals(it.VerifyCurrentPageText(), "New Attributes");
	}
//
//	@Then("the name text field should be enabled")
//	public void the_name_text_field_should_be_enabled() {
//		 at=new ZAttribute(Browser.driver);
//		Assert.assertEquals(true,at.VerifyNameTextField());
//	}
//
//	@Then("the description text field should be enabled")
//	public void the_description_text_field_should_be_enabled() {
//		at=new GAttribute(Browser.driver);
//	    Assert.assertEquals(at.VerifyDescriptionField(),true);
//	}


	@When("enter the attribute name")
	public void enter_the_attribute_name() {
		at=new GAttribute(Browser.driver);
		at.EnterName("Devops");
	}

	@When("Verify the description text field")
	public void enter_the_description() {
	   
	}

	@When("select the attribute status")
	public void select_the_attribute_s_status() throws InterruptedException {
	   //it.Radiobutton(); 
	}

	
	@Then("the created attribute should be verified")
	public void the_created_attribute_should_be_verified() {
	    Assert.assertEquals(it.getSettingName(), "Devops");
	}

	@When("they select a specific attribute and click on the edit button")
	public void they_select_a_specific_attribute_and_click_on_the_edit_button() throws InterruptedException {
		it.ClickOnEditICon();
		Thread.sleep(2000);
	}
	@When("modify the Attribute name")
	public void modify_the_name() {
		at=new GAttribute(Browser.driver);
		at.CleratExistText();
		at.EnterName("Tester");
	}
	@When("click on the attribute delete button")
	public void DeleteButton() throws InterruptedException, AWTException{
		at=new GAttribute(Browser.driver);
		at.DeleteButton();
		it=new Iterations(Browser.driver);
		it.KeyBoardEnterKey();
	}

	@Then("the edited attribute should be verified")
	public void the_edited_attribute_should_be_verified() {
		Assert.assertEquals(it.getSettingName(),"Covered shelter");
	}

	@Then("the deleted attribute should be verified")
	public void the_deleted_attribute_should_be_verified() {
	    String name=it.getSettingName();
	    if(name.equalsIgnoreCase("Tester"))
	    {
	    	System.out.println("delete is not happen");
	    }
	    else
	    {
	    	System.out.println("Deleted");
	    }
	}
	}

