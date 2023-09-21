package stepdefination;

import static org.testng.Assert.fail;

import java.awt.AWTException;

import org.junit.Assert;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;

import myBrowsers.Browser;
import pom.GAttribute;

public class StepAttributePage 
{
   WebDriver driver;
   Iterations it;	
   GAttribute at;	
	
	
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

	@Then("the search text field should be enabled")
	public void the_search_text_field_should_be_enabled() 
	{
	    Assert.assertEquals(true, it.SearchFieldisEnabled());
	}

	@Then("the status dropdown should be enabled")
	public void the_status_dropdown_should_be_enabled() 
	{
	  Assert.assertEquals(it.VerifyStatusDrop(),true);
	}

	@Then("the new button should be enabled")
	public void the_new_button_should_be_enabled() {
	 Assert.assertEquals(it.VerifyNewButon(),true);   
	}

	@Then("the reset button should be enabled")
	public void the_reset_button_should_be_enabled() {
	   Assert.assertEquals(it.VerifyResetButton(),true);
	}

	@Then("the edit icon should be enabled")
	public void the_edit_icon_should_be_enabled() {
	    at=new GAttribute(Browser.driver);
	    Assert.assertEquals(at.VerifyEditIcon(),true); 
	}

	@Then("the pagination dropdown should be enabled")
	public void the_pagination_dropdown_should_be_enabled() {
	    Assert.assertEquals(true,it.PageDropDown());
	}

	@Then("the next page icon should be enabled")
	public void the_next_page_icon_should_be_enabled() {
	   Assert.assertEquals(true, it.VerifyNextPageDropDown());
	}

	//@When("they click on the new button")
	public void they_click_on_the_new_button() throws InterruptedException {
	    it.ClickOnNewButton();
	    Thread.sleep(2000);
	}

	@Then("user is on the Attribute new page")
	public void user_is_on_the_attribute_edit_page() {
	    Assert.assertEquals(it.VerifyCurrentPageText(), "New Attributes");
	}

	@Then("the name text field should be enabled")
	public void the_name_text_field_should_be_enabled() {
		 at=new GAttribute(Browser.driver);
		Assert.assertEquals(true,at.VerifyNameTextField());
	}

	@Then("the description text field should be enabled")
	public void the_description_text_field_should_be_enabled() {
		at=new GAttribute(Browser.driver);
	    Assert.assertEquals(at.VerifyDescriptionField(),true);
	}

	@Then("the status radio buttons should be enabled")
	public void the_status_radio_buttons_should_be_enabled() {
	    Assert.assertEquals(it.VerifyActiveRadiobuttons(),true);
	    Assert.assertEquals(it.VerifyInActiveRadiobuttons(),true);
	}

	@Then("the save button should be enabled")
	public void the_save_button_should_be_enabled() {
	    Assert.assertEquals(it.VerifySaveButon(),true);
	}

	@Then("the cancel button should be enabled")
	public void the_cancel_button_should_be_enabled() {
		 Assert.assertEquals(it.VerifyCancelButton(),true);
	}

	@When("enter the attribute name")
	public void enter_the_attribute_name() {
		at=new GAttribute(Browser.driver);
		at.EnterName("Devops");
	}

	@When("enter the description")
	public void enter_the_description() {
	   
	}

	@When("select the attribute's status")
	public void select_the_attribute_s_status() throws InterruptedException {
	   //it.Radiobutton(); 
	}

	@When("click on the save button")
	public void click_on_the_save_button() throws AWTException, InterruptedException {
	    it.ClickOnSaveButton();
	    Thread.sleep(2000);
	}

	@Then("the created attribute should be verified")
	public void the_created_attribute_should_be_verified() {
	    Assert.assertEquals(it.getSettingName(), "Devops");
	}

	@Then("they should exit from the browser")
	public void they_should_exit_from_the_browser() {
	    System.out.println("exit");
	}

	@When("they select a specific attribute and click on the edit button")
	public void they_select_a_specific_attribute_and_click_on_the_edit_button() throws InterruptedException {
		at=new GAttribute(Browser.driver);
		at.ClickOnEditIcon();
		Thread.sleep(2000);
	}

	@When("modify the name")
	public void modify_the_name() {
	    at.CleratExistText();
		at.EnterName("Tester");
	}

	@Then("the edited attribute should be verified")
	public void the_edited_attribute_should_be_verified() {
		Assert.assertEquals(it.getSettingName(),"Covered shelter");
	}

	@When("click on the delete button")
	public void click_on_the_delete_button() throws AWTException, InterruptedException {
	    it.ClickOnDeleteButton();
	    it.EmergencyEnterKey();
	    Thread.sleep(2000);
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

	@When("search for an Attribute by its ID")
	public void search_for_an_attribute_by_its_id() throws AWTException, InterruptedException {
	    it.SearchField("380");
	    it.EmergencyEnterKey();
	}

	@Then("the Attribute should be verified by its ID")
	public void the_attribute_should_be_verified_by_its_id() throws InterruptedException {
	    Assert.assertEquals(it.getsettingsID(),"380");
	}	
}
