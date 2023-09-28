package stepdefination;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import myBrowsers.Browser;
import pom.CUserPage;


public class CStepUser 
{
	WebDriver driver;
	public CUserPage up;
	Iterations it;
	@When("click on the client-User link")
	public void ClickOnCLientUserLink() 
	{
	  it=new Iterations(Browser.driver);
	  it.ClickOnlinkByText("Users");
	    
	}
	//***********************************************************************CreateUser**************************************************************
	@Then("the user is on the client-user new page")
	public void verify_the_client_user_new_page() 
	{
	 Assert.assertEquals(it.VerifyCurrentPageText(),"New Client User");
	}
	
	@When("they select client from the client dropdown")
	public void i_select_client_from_the_client_dropdown(){
		up=new CUserPage(Browser.driver);
		up.SelectUserclient("parklens");
	}

	@When("they enter  Name into the  name text field")
	public void i_enter_name_into_the_name_text_field() throws InterruptedException {
	  up.EnterNewUserName("UserA");
	}

	@When("they enter  User name into the User name text field")
	public void i_enter_user_name_into_the_user_name_text_field() {
      up.EnterUserNickName("User");
	}

	@When("they enter mobile number into the mobile text field")
	public void i_enter_mobile_number_into_the_mobile_text_field() {
       up.EnterUserMobileNumber("1234567890");
	
	}
	@When("they enter user-email into the email text field")
	public void EnterUserMailID() {
       up.EnterUserMailID("Tester@gmail.com");
	
	}

	@When("they select Role from the role dropdown")
	public void i_select_role_from_the_role_dropdown() {
	    up.SelectUserRole();
	}

	@When("they select Lot from the lot dropdown")
	public void i_select_lot_from_the_lot_dropdown() throws InterruptedException, AWTException {
	    
		up.SelectUserLot();
	    Thread.sleep(2000);
	}

	@When("they enter  Password into the  password text field")
	public void i_enter_password_into_the_password_text_field() {
	   up.EnterUserNewPassword("Tester@123");
	}

	@When("they enter Retype-Password into the  retype-password text field")
	public void i_enter_retype_password_into_the_retype_password_text_field() {
	    up.EnterRetypePasswordIntoRetypePasswordField("Tester@123");
	}
	@Then("the created Client-User should be displayed on the client page")
	public void VerifyCreatedUser()
	{
		Assert.assertEquals(it.VerifyFirstRecordName(), "UserA");
	}
//*****************************************************************UpdateUser*******************************************************************	

@Then("the user on the edit client-user page")
public void the_user_on_the_edit_client_user_page() {
   Assert.assertEquals(it.VerifyCurrentPageText(),"Edit Client User");
}

@When("they update the client-user name")
public void they_update_the_client_user_name()throws InterruptedException {
	up=new CUserPage(Browser.driver);
	up.ClearExistingName();
	Thread.sleep(4000);
	up.EnterNewUserName("devops");
}

@When("they update the user-mobile number")
public void they_update_the_user_mobile_number() throws InterruptedException {
	up.ClearExistingMobileNumber();
	Thread.sleep(2000);
	up.EnterUserMobileNumber("1234561234");
}

@When("they update the user-email")
public void they_update_the_user_email() {
	up.ClearExistingUserMailID();
	up.EnterUserMailID("devops@gmail.com");
}

@Then("verify is the client-User is get upadted")
public void verify_is_the_client_user_is_get_upadted() {
	Assert.assertEquals(it.VerifyFirstRecordName(), "devops");
}



}
