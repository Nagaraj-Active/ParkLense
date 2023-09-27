package stepdefination;

import java.awt.AWTException;

import org.junit.Assert;

import ForEachLoop.Iterations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myBrowsers.Browser;
import pom.ALogin;
import pom.BClientPage;

public class BStepClientPage 
{
	ALogin lp;
	BClientPage cb;
	Iterations it;
	
	 @When("they log in to their account")
	    public void logInToAccount() 
	    {
	        lp=new ALogin(Browser.driver);
	        lp.enter_mail("devops@active.agency");
	        lp.enter_password("Devops@12345");
	        lp.button();                            /////take a look
	        
	    }
	 
	 @When("they click on the Client link")
	    public void clickOnClientLink() throws InterruptedException 
	    {
	    	it=new Iterations(Browser.driver);
	    	it.ClickOnlinkByText("Clients");
	    	Thread.sleep(2000);
	       
	    }
	 @When("they click on the new button")
		public void i_click_on_the_button() 
		{
		 it=new Iterations(Browser.driver);
			it.ClickOnNewButton();
		}
	 
	 @Then("the user on the New client page")
	    public void VerifyNewClientClientPage() 
	    {
	    	Assert.assertEquals(it.VerifyCurrentPageText(),"New Client");

	     }
	 @When("they enter  Name into the client name text field")
		public void i_enter_name_into_the_client_name_text_field() {
		   cb=new BClientPage(Browser.driver);
		   cb.EnterClientName("ClientB");
		}

		@When("they enter mobile number into the mobile number text field")
		public void i_enter_mobile_number_into_the_mobile_number_text_field() {
		  cb.EnterClientMobileNumber("1234567890");
		}

		@When("they enter email into the email text field")
		public void i_enter_email_into_the_email_text_field() {
			cb.EnterClientEMail("tester@gmail.com");
		}

		@When("they enter client adress into the address text field")
		public void i_enter_client_adress_into_the_address_text_field() {
		cb.EnterClientadress("bangalore");
		}

		@When("they select Country from the country dropdown")
		public void i_select_from_the_country_dropdown() {
		cb.SelectCountry();
		}

		@When("they select State from the state dropdown")
		public void i_select_from_the_state_dropdown() {
		cb.SelectState();
		}

		@When("they select City from the city dropdown")
		public void i_select_from_the_city_dropdown() {
		    cb.SelectCity();
		}

		@When("they select client type from the client type dropdown")
		public void i_select_from_the_client_type_dropdown() {
		cb.SelectClientType();
		}
		@When("they select the client start date and end date")
		public void SelectCLientDate() throws InterruptedException {
			it=new Iterations(Browser.driver);
		     cb.ClickOnClientStartDate();
		     it.DatePicker("2023/Sep/21");
		     cb.ClickOnClientEndDate();
		     it.DatePicker("2023/Sep/21");
		}

		@When("they select Status from the client status dropdown")
		public void i_select_from_the_client_status_dropdown()  {
			
			it.ClickOnRadiobutton(2);
		}
		
		@When("click on the Save button")
		public void ClickOntheSaveButton() throws AWTException  
		{
			it=new Iterations(Browser.driver); 
			
		it.ClickOnSaveButton();
		it.KeyBoardEnterKey();
		
		}
		@Then("the created client should be displayed on the client page")
		public void the_created_client_should_be_displayed_on_the_client_page() {
		Assert.assertEquals(cb.FeatchFirstRecordName(),"ClientB");
		} 
//*********************************Updating**************************	 
		@When("select one particular user click on edit icon")
		public void ClickOnClientEditLink() {
			it=new Iterations(Browser.driver); 
			it.ClickOnEditICon();
		}
		@When("the user on the edit client page")
		public void VerifyUserIsOnTheClientEditPage()  {
			Assert.assertEquals(it.VerifyCurrentPageText(),"Edit Client"); 
		}
	 
		@When("they update the client name")
		public void update_the_client_name() throws InterruptedException {
			cb=new BClientPage(Browser.driver);
			cb.EditClientName("ClientC");
			
		}
		@When("they update the mobile number")
		public void update_the_mobile_number() throws InterruptedException {
		    cb.EditClientMobileField("1234567880");
		}
		@When("they update the email")
		public void update_the_email() {
		   cb.EditClientMail("devops@gmail.com");
		}
		
		@Then("verify is the client get upadted")
		public void verify_is_the_client_get_upadted() {
		    Assert.assertEquals(cb.FeatchFirstRecordName(),"ClientC");
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
