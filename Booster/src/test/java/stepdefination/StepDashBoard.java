package stepdefination;

import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.ADashboard;


public class StepDashBoard 
{
	WebDriver driver;
	ADashboard db;
	Iterations it;
	//BClientPage cp;

	@Then("verify the Prospects section")
	public void verify_the_prospects_section() 
	{
	    db=new ADashboard(Browser.driver);
	    it.ClickOnlinkByText("Clients");
	    //cp.
	}

	@Then("verify the Lots section")
	public void verify_the_lots_section() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the Stalls section")
	public void verify_the_stalls_section() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the Live Camera functionality")
	public void verify_the_live_camera_functionality() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the Down Camera functionality")
	public void verify_the_down_camera_functionality() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the Maintenance Lots section")
	public void verify_the_maintenance_lots_section() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("they exit the browser")
	public void they_exit_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
}
