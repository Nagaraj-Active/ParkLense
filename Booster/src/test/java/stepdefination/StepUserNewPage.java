package stepdefination;

import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import myBrowsers.Browser;
import pom.CUserNewPage;

public class StepUserNewPage 
{
	WebDriver driver;
	public CUserNewPage un;
	Iterations it;
	
	
	@When("I click on client-user new button")
	public void click_on_the_new_button() 
	{
		un=new CUserNewPage(Browser.driver);
	    un.ClickOnNewButton();  
	}
	@Then("the user is on the client-user new page")
	public void verify_the_client_user_new_page() 
	{
	 Assert.assertEquals(un.CLientUserNewpageText(),"New Client User");
	}
	
	@When("I select client from the client dropdown")
	public void i_select_client_from_the_client_dropdown(){
        it=new Iterations(Browser.driver);
		it.SelectClient("parklens");
	}

	@When("I enter  Name into the  name text field")
	public void i_enter_name_into_the_name_text_field() {
	  un.EnterNameIntoTextField("UserA");
	}

	@When("I enter  User name into the User name text field")
	public void i_enter_user_name_into_the_user_name_text_field() {
      un.EnterUserNameIntoTextField("User");
	}

	@When("I enter mobile number into the mobile text field")
	public void i_enter_mobile_number_into_the_mobile_text_field() throws InterruptedException {
       un.EnterMobileNumberIntoTextField("1234567890");
	Thread.sleep(2000);
	}

	@When("I select Role from the role dropdown")
	public void i_select_role_from_the_role_dropdown() {
	    un.SelectRole();
	}

	@When("I select Lot from the lot dropdown")
	public void i_select_lot_from_the_lot_dropdown() {
	    un.SelectLot();
	}

	@When("I enter  Password into the  password text field")
	public void i_enter_password_into_the_password_text_field() {
	   un.EnterNewPasswordIntoPasswordTextField("Tester@123");
	}

	@When("I enter  Retype-Password into the  retype-password text field")
	public void i_enter_retype_password_into_the_retype_password_text_field() {
	    un.EnterRetypePasswordIntoRetypePasswordField("Tester@123");
	}
	@Then("the created Client-User should be displayed on the client page")
	public void VerifyCreatedUser()
	{
		Assert.assertEquals(it.FeatchFirstRecordName(), "UserA");
	}
	
}
