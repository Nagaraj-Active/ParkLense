package stepdefination;

import static org.testng.Assert.assertFalse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;

import com.github.dockerjava.api.model.Event;

import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.ALogin;
import pom.BClientPage;

public class StepClientPage
{
	ALogin lp;
	BClientPage bc;
	

	    @When("they log in to their account")
	    public void logInToAccount() 
	    {
	        lp=new ALogin(Browser.driver);
	        lp.enter_mail("devops@active.agency");
	        lp.enter_password("Devops@12345");
	        lp.button();
	        
	    }

	    @When("click on the client link")
	    public void clickOnClientLink() throws InterruptedException 
	    {
	    	bc=new BClientPage(Browser.driver);
	    	Thread.sleep(4000);
	        bc.ClickOnClientLink();
	        Thread.sleep(2000);
	       
	    }

	    @Then("the user on the client home page")
	    public void verifyHomeClientPage() 
	    {
	      if(bc.CLientHomeVerification().equalsIgnoreCase("clients"))
	      {
	    	  Assert.assertTrue(true);
	      }
	      else
	      {
            System.out.println("fail");	    	  
	      
	      }
	     }
	    

	    String id;
	    @When("search client by id")
	    public void SearchClientById() throws AWTException, InterruptedException
	    {
	       // id="247";
	    	bc.EnterIntoSearchField("247");
	    	
	    }
	    @Then("verify client by id")
	    public void VerifyCLient()
	    {
	    	Assert.assertEquals(bc.GetClientId(), id);
	    }
	    
	    
	    @When("Select one particular client and click on edit icon")
	    public void ClickOnEditICon() throws AWTException, InterruptedException 
	    {
	    	bc.EnterIntoSearchField("47");
	    	bc.EditClientICon();
	    }

	    @Then("the user on the client edit page")
	    public void the_user_on_the_client_edit_page() 
	    {
	       Assert.assertEquals(bc.VerifyEditPageText(),"Edit Client");
	    }

	    @When("update the client name")
	    public void update_the_client_name() 
	    {
	       bc.NameText("Nagaraj");
	    }

	    @When("update the mobile number")
	    public void update_the_mobile_number() 
	    {
	    bc.MobileField("7760633081");
	    }

	    @When("update the email")
	    public void update_the_email() 
	    {
	    bc.EditMail("rajmannale@123.com");
	    }

	    @When("click on save button")
	    public void click_on_save_button() throws AWTException 
	    {
	      bc.ClickOnSaveButton();
	    }

	    @Then("verify is the client get upadted")
	    public void verify_is_the_client_get_upadted() throws AWTException, InterruptedException 
	    {
	        ClickOnEditICon();
	        Assert.assertEquals(bc.VerifyUpdatedClientName(),"Nagaraj");
	        Assert.assertEquals(bc.VerifyUpdatedMail(),"rajmannale@123.com");
	        Assert.assertEquals(bc.VerifyUpdatedMobile(),"7760633081");
	        //Assert.assertEquals(bc.VerifyUpdatedAdress(),"Nagaraj");
	    }
	    
	      
}


