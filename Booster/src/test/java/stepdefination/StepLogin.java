package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.ALogin;

public class StepLogin  
{
	public WebDriver driver;
	public ALogin lp;
	@Given("the user launches the application")
	public void launch_the_application() 
	{
		lp=new ALogin(Browser.driver);
        System.out.println("i am start");
	}

	@When("User enters the email into the user text field")
	public void user_enter_the_mail_into_user_text_field()
	{
		
		lp.enter_mail("devops@active.agency");
	   
	}
	@When("User enters the password into the password text field")
	public void UserEnterThePasswordIntoPasswordTextField()
	{
		lp.enter_password("Devops@12345");
	   
	}
	@When("clicks on the login button")
	public void click_on_login_button() 
	{
	lp.button();
	}

	@Then("the user is on the dashboard home page")
	public void verify_application_home_page() 
	{
	   Assert.assertEquals(true, lp.verify_home()); 
	}
	@And("they exit from the browser")
	public void LogoutFromAccount()
	{
		System.out.println("Iam quiet");
	}
	@When("User enters an invalid email into the user text field")
	public void UserEnterTheInvalidMailIntoUserText_field() 
	{
	lp.enter_mail("nagarj@123");
	}

	@When("User enters a valid password into the password text field")
	public void user_enter_the_valid_password_into_password_text_field() 
	{
	lp.enter_password("devops@12345");
	}

	@Then("Verify the sign-in page")
	public void verify_sign_in_page() 
	{
	   Assert.assertEquals(true,lp.verify_sign());
	}

	@When("User enters a valid email into the user text field")
	public void user_enter_the_valid_mail_into_user_text_field() 
	{
	 lp.enter_mail("nagaraj@active.agency");   
	}

	@When("User enters an invalid password into the password text field")
	public void user_enter_the_invvalid_password_into_password_text_field() 
	{
	   lp.enter_password("12345678");
	}

	@When("User leaves the email text field empty")
	public void user_keep_the_empty_mail_text_field() 
	{
	    
	}

	@When("User leaves the password text field empty")
	public void user_keep_the_empty_password_text_field() 
	{
		
	}
	

}

