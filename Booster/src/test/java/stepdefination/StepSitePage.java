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
	Iterations link;
   
	@When("they click on the site link")
	public void they_click_on_the_site_link() 
	{
		link=new Iterations(Browser.driver);
		link.ClickOnByText("Sites");
		//sp=new DSitePage(Browser.driver);  
	   //sp.ClickOnSiteLink();
	}

	@Then("they should be on the site page")
	public void they_should_be_on_the_site_page() throws InterruptedException 
	{
		sp=new DSitePage(Browser.driver);
		if(sp.VerifySiteText().equalsIgnoreCase("sites"))
	      {
	    	  Assert.assertTrue(true);
	      }
	      else
	      {
          System.out.println("fail");	    	  
	      
	      }
	}
      String id="4081";
	@When("they search for a site using the site ID from the search text field")
	public void they_search_for_a_site_using_the_site_id_from_the_search_text_field()  throws AWTException, InterruptedException
	{
		sp=new DSitePage(Browser.driver);
	 sp.SearchSiteBySearchField(id);
	 
	}

	@Then("they should see the search results for the site")
	public void They_should_see_the_search_results_for_the_site() throws InterruptedException  
	{
		Thread.sleep(5000);
		System.out.println(sp.VerifySiteById());
	    Assert.assertEquals(id,sp.VerifySiteById());
	}

	
}
