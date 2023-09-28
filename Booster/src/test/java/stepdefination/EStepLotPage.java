package stepdefination;

import java.awt.AWTException;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.ELotPage;

public class EStepLotPage {
   WebDriver driver;
   ELotPage lp;
   Iterations it;
	
//**********************************************LotCreation****************************************************	
	@When("they click on the Lot links")
	public void they_click_on_the_lot_links() {
	    it=new Iterations(Browser.driver);
	    it.ClickOnlinkByText("Lots");
	}

	@When("they select the client")
	public void they_select_the_client() {
	    lp=new ELotPage(Browser.driver);
	    lp.Selectclient("Anil-Client");
	}

	@When("they select the site")
	public void they_select_the_site() {
	    lp.Selectsite("Anil-Site");
	}

	@When("they enter the lot name")
	public void they_enter_the_lot_name() {
	  lp.EnterLotName("LotA");
	}

	@When("they enter the lot title")
	public void they_enter_the_lot_title() {
	    lp.EnterLotTitle("lot");
	}

	@When("they enter the parking duration")
	public void they_enter_the_parking_duration() {
	    lp.EnterParkingDuration("65");
	}

	@When("they upload the overlay")
	public void they_upload_the_overlay() throws AWTException, InterruptedException {
	  //lp.uploadLotOverlayImage();
	}

	@When("they select the lots location")
	public void they_select_the_lots_location() {
	    lp.SelectLotLocation(2);
	}

	@When("they select the lots status")
	public void they_select_the_lots_status() {
	    lp.SelectLotStatus(1);
	}

	

	@Then("the created Lot should be verified")
	public void the_created_lot_should_be_verified() {
	    Assert.assertEquals(it.VerifyFirstRecordName(), "LotA");
	}
//***********************************************LotUpdate*****************************************************
	@When("they select a specific Lot and click on the edit button")
	public void they_select_a_specific_lot_and_click_on_the_edit_button() throws InterruptedException {
	    it.ClickOnEditICon();
	}

	@When("modify the lot name")   
	public void modify_the_lot_name() throws InterruptedException {
		 lp=new ELotPage(Browser.driver);
		lp.ClearLotName();
	   lp.EnterLotName("testerLot");
	}

	@Then("the edited Lot should be verified")
	public void the_edited_lot_should_be_verified() {
		Assert.assertEquals(it.VerifyFirstRecordName(), "testerLot"); 
	}
	@Then("the deleted Lot should be verified")
	public void deletedLotShouldBeVerified() {
		Assert.assertNotEquals(it.VerifyFirstRecordName(), "testerLot"); 
	}
	@When("click on the lot delete button")
	public void LotDeleting() throws AWTException, InterruptedException {
		it.KeyBoardEnterKey(1);
		it.ClickOnLotDeleteButton();
	    
	}
	
	
	
}
