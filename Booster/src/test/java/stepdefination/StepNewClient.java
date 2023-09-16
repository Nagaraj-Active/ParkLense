package stepdefination;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;

import myBrowsers.Browser;
import pom.BClientNewPage;

public class StepNewClient 
{
   public WebDriver driver;
   public BClientNewPage cnp;
   public Iterations it;
	

	@When("I click on the New Client button")
	public void i_click_on_the_button() 
	{
		cnp=new BClientNewPage(Browser.driver);
        cnp.ClickOnNewButton();
	}

	@Then("the user on the new client page")
	public void the_user_on_the_new_client_page() {
		
		Assert.assertEquals(cnp.NewPageTextVerify(), "New Client");
	}

	@When("I enter  Name into the client name text field")
	public void i_enter_name_into_the_client_name_text_field() {
	    cnp.EnterName("ClientA");
	}

	@When("I enter mobile number into the mobile number text field")
	public void i_enter_mobile_number_into_the_mobile_number_text_field() {
	   cnp.EnterMobileNumber("1234567890");
	}

	@When("I enter email into the email text field")
	public void i_enter_email_into_the_email_text_field() {
		cnp=new BClientNewPage(Browser.driver);
		cnp.EnterEMail("tester@gmail.com");
	}

	@When("I enter client adress into the address text field")
	public void i_enter_client_adress_into_the_address_text_field() {
	cnp.adress("bangalore");
	}

	@When("I select Country from the country dropdown")
	public void i_select_from_the_country_dropdown() {
	cnp.SelectCountry();
	}

	@When("I select State from the state dropdown")
	public void i_select_from_the_state_dropdown() {
	cnp.SelectState();
	}

	@When("I select City from the city dropdown")
	public void i_select_from_the_city_dropdown() {
	    cnp.SelectCity();
	}

	@When("I select client type from the client type dropdown")
	public void i_select_from_the_client_type_dropdown() {
	cnp.SelectClientType();
	}
	@When("I select the client start date and end date")
	public void SelectCLientDate() throws InterruptedException {
		it=new Iterations(Browser.driver);
	     cnp.SelectStartDate();
	     it.DatePicker("2023/Sep/15");
	     cnp.SelectEndDate();
	     it.DatePicker("2023/Sep/15");
	}

	@When("I select Status from the client status dropdown")
	public void i_select_from_the_client_status_dropdown() {
	     cnp.Status(1);
	}
	
	
	@When("I click on the Save button")
	public void ClickOntheSaveButton() throws AWTException  
	{
	it.ClickOnSaveButton();
	}
	@Then("the created client should be displayed on the client page")
	public void the_created_client_should_be_displayed_on_the_client_page() {
	Assert.assertEquals(it.FeatchFirstRecordName(),"ClientA");
	}
}
