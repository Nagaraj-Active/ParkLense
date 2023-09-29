package stepdefination;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;

import myBrowsers.Browser;
import pom.DSitePage;

public class DStepSitePage {

	WebDriver driver;
	DSitePage sp;
	Iterations it;
   
	@When("they click on the site link")
	public void they_click_on_the_site_link(){
		it=new Iterations(Browser.driver);
		it.ClickOnlinkByText("Sites");           }

	@Then("the user is on the site new page")
	public void the_user_is_on_the_site_new_page() {
	   Assert.assertEquals(it.VerifyCurrentPageText(),"New Site");
	}

	@Then("they enter  site Name into the  site text field")
	public void they_enter_site_name_into_the_site_text_field() {
		sp=new DSitePage(Browser.driver);
	    sp.EnterSiteName("active");
	}

	@Then("they enter  site title into the site title text field")
	public void they_enter_site_title_into_the_site_title_text_field() {
	    sp.EnterTitleName("tech");
	}
	
	@Then("Verify for the created site")
	public void VerifyForCreatedSite(){
	   Assert.assertEquals(it.GetFirstRecordName(),"active");
	}
	
//**********************************Update*****************************************

	@Then("the user on the edit site page")
	public void the_user_on_the_edit_site_page() {
		Assert.assertEquals(it.VerifyCurrentPageText(),"Edit Site");
	}

	@When("they update the site name")
	public void they_update_the_site_name() throws InterruptedException {
		sp=new DSitePage(Browser.driver);
		sp.ClearSiteName();
	    Thread.sleep(4000);
	   sp.EnterSiteName("Devops");
	}

	@Then("verify is the client-site is get upadted")
	public void verify_is_the_client_site_is_get_upadted() {
		Assert.assertEquals(it.GetFirstRecordName(), "Devops");
	}

	@When("click on the delete button")
	public void click_on_the_delete_button() throws AWTException, InterruptedException {
		it=new Iterations(Browser.driver);
		it.ClickOnDeleteButton();
	    
	   
	}
	
	
	
}
