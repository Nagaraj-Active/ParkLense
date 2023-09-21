package stepdefination;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import myBrowsers.Browser;
import pom.GAttribute;
import pom.GAttributeValue;

public class StepAttributeValue 
{
	WebDriver driver;
    Iterations it;
	GAttributeValue av;
	GAttribute at;
	
	@When("click on attributeValue link")
	public void click_on_attribute_value_link() throws InterruptedException {
	    it=new Iterations(Browser.driver);
	    it.ClickOnlinkByText("Settings");
	    it.ClickOnSettingLinksByText("Attribute Values");
	    Thread.sleep(2000);
	}

	@Then("the user is on the AttributeValue home page")
	public void the_user_is_on_the_attribute_value_home_page() {
	   Assert.assertEquals(it.VerifyCurrentPageText(),"Attribute Values");
	}

	@Then("the client dropdown should be enabled")
	public void the_client_dropdown_should_be_enabled() {
	    av=new GAttributeValue(Browser.driver);
		Assert.assertEquals(true,av.VerifyClientDropDown());
	}

	@Then("user is on the AttributeValue new page")
	public void user_is_on_the_attribute_value_edit_page() {
	    Assert.assertEquals(it.VerifyCurrentPageText(), "New Attribute Value");	
	    }

	@Then("Attribute drop-down should be enabled")
	public void attribute_drop_down_should_be_enabled() {
		av=new GAttributeValue(Browser.driver);
	    Assert.assertEquals(true, av.VerifyAttributeDropDown());
	}

	@Then("the Attribute name text field should be enabled")
	public void the_attribute_name_text_field_should_be_enabled() {
		Assert.assertEquals(true, av.VerifyNameTextField());
	}

	@Then("the attribute new page client dropdown should be enabled")
	public void the_attribute_new_page_client_dropdown_should_be_enabled() {
		Assert.assertEquals(true, av.AttributeValuePageClientDrop());
	}

	@When("select the attribute from drop-down")
	public void select_the_attribute_from_drop_down() {
		 av=new GAttributeValue(Browser.driver);
		av.SelectAttributeDropDown();
	}

	@When("enter the attribute value name")
	public void enter_the_attribute_value_name() {
	    av.EnterAttributeValue("Devops");
	}
	@When("modify the Attribute name")
	public void ModifyAttributeNmae() {
		av=new GAttributeValue(Browser.driver);
	    av.EnterAttributeValue("Devops");
	}

	@When("select the client from drop down")
	public void select_the_client_from_drop_down() {
		av=new GAttributeValue(Browser.driver);
		av.ClickOnClientNewpage();
	    av.SelectClientInNewPage("parklens");
	}

	@Then("the created attribute value should be verified")
	public void the_created_attribute_value_should_be_verified() {
	 Assert.assertEquals(it.getSettingName(),"Covered shelter");
	}

	@When("they select a specific attributeValue and click on the edit button")
	public void they_select_a_specific_attribute_value_and_click_on_the_edit_button() {
	    at=new GAttribute(Browser.driver);
	    at.ClickOnEditIcon();
	}

	

	@Then("the deleted attributevalue should be verified")
	public void the_deleted_attributevalue_should_be_verified() {
	   String verify=it.getSettingName();
		if(verify.equalsIgnoreCase("Tester"))
	   {
		   System.out.println("Not deleted");
	   }
		else
		{
			System.out.println("is deleted");
		}
	}

	@When("search for an Attributevalue by its ID")
	public void search_for_an_attributevalue_by_its_id() throws AWTException, InterruptedException {
	    it.SearchField("270");
	}

	@Then("the AttributeValue should be verified by its ID") 
	public void the_attribute_value_should_be_verified_by_its_id() throws InterruptedException {
	    Assert.assertEquals(it.getsettingsID(),"270");
	}
}
