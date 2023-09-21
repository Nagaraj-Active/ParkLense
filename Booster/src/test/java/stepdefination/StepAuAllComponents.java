package stepdefination;

import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;
import myBrowsers.Browser;

public class StepAuAllComponents 
{
WebDriver driver;
Iterations it;

@When("click on Admin-Users link")
public void click_on_admin_users_link() {
    it=new Iterations(Browser.driver);
    it.ClickOnlinkByText("settings");
    it.ClickOnSettingLinksByText("Admin Users");
}

@Then("the user is on the Admin-Users home page")
public void the_user_is_on_the_admin_users_home_page() {
    
}

@Then("user is on the Admin-user new page")
public void user_is_on_the_admin_user_new_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the admin-users name text field should be enabled")
public void the_admin_users_name_text_field_should_be_enabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the Admin-Users mobile text field should be enabled")
public void the_admin_users_mobile_text_field_should_be_enabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the Admin-Users email text field should be enabled")
public void the_admin_users_email_text_field_should_be_enabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the Admin-Users role drop-down should be enabled")
public void the_admin_users_role_drop_down_should_be_enabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the Admin-Users password text field should be enabled")
public void the_admin_users_password_text_field_should_be_enabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the Admin-Users retype-password text field should be enabled")
public void the_admin_users_retype_password_text_field_should_be_enabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}





}
