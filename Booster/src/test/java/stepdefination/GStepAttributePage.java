package stepdefination;



import java.awt.AWTException;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;

import myBrowsers.Browser;
import pom.FCameraPage;
import pom.GAttribute;


public class GStepAttributePage 
{
   WebDriver driver;
   Iterations it;	
   GAttribute at;	
   FCameraPage cp;
	
//********************************Creation******************************************************	
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

	@Then("user is on the Attribute new page")
	public void user_is_on_the_attribute_edit_page() {
	    Assert.assertEquals(it.VerifyCurrentPageText(), "New Attributes");
	}

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
	    Assert.assertEquals(it.VerifyFirstRecordName(), "Devops");
	}
//*********************************Update**********************************************************
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
	

	@Then("the Updated attribute should be verified")
	public void the_edited_attribute_should_be_verified() {
		Assert.assertEquals(it.VerifyFirstRecordName(),"Tester");
	}
//**********************************Deletion********************************************************
	@When("click on the attribute delete button")
	public void DeleteButton() throws InterruptedException, AWTException{
		it=new Iterations(Browser.driver);
		it.KeyBoardEnterKey(1);
		at=new GAttribute(Browser.driver);
		at.DeleteButton();
		it.ClickonOkButton();
	}
	@Then("the deleted attribute should be verified")
	public void the_deleted_attribute_should_be_verified() {
	    String name=it.VerifyFirstRecordName();
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

