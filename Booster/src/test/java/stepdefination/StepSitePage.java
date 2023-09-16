package stepdefination;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.DSitePage;

public class StepSitePage
{
	WebDriver driver;
	DSitePage sp;
	Iterations Cc;
   
	@When("they click on the site link")
	public void they_click_on_the_site_link(){
		Cc=new Iterations(Browser.driver);
		Cc.ClickOnByText("Sites");           }

	@Then("they should be on the site page")
	public void they_should_be_on_the_site_page()  
	{
		Assert.assertEquals(Cc.VerifyCurrentPageText(),"Sites");
	}
      String id="4081";
	@When("they search for a site using the site ID from the search text field")
	public void they_search_for_a_site_using_the_site_id_from_the_search_text_field()  throws AWTException, InterruptedException
	{
		Cc.SearchField(id);
	 
	}
	@Then("they should see the search results for the site")
	public void They_should_see_the_search_results_for_the_site() throws InterruptedException  
	{
		Thread.sleep(1000);
		Assert.assertEquals(id,Cc.FeatchFirstRecordId());
	}

	
}
