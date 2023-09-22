package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import ForEachLoop.Iterations;
import io.cucumber.java.en.*;
import myBrowsers.Browser;
import pom.FCameraPage;

public class FStepCameraPage 
{
 WebDriver driver;
 Iterations it;
 FCameraPage cp;
	
	
 
	
	@When("they click on the camera link")
	public void they_click_on_the_camera_link() {
	    it=new Iterations(Browser.driver);
	    it.ClickOnlinkByText("Camera");
	}
 @When("they click on the camera new button")
	public void they_click_on_the_camera_new_button() {
	    
	    it.ClickOnCameraNewButton();
	}

	@When("they select the lot")
	public void they_select_the_lot() {
	   cp=new FCameraPage(Browser.driver);
		cp.SelectLot("as");
	}

	@When("they enter the camera name")
	public void they_enter_the_camera_name() {
	    cp.EnterCameraName("tech");
	}

	@When("they select the stalls")
	public void they_select_the_stalls() throws InterruptedException {
	    cp.selectStall(); 
	}

	@When("they Enter the camera url")
	public void they_enter_the_camera_url() {
	    cp.EnterCameraUrl("camera.url");
	}
	@Then("the created Camera should be verified")
	public void the_created_lot_should_be_verified() {
	    Assert.assertEquals(it.VerifyFirstRecordName(), "tech");
	}
//**********************CameraUpdate*************************************************************
	@When("they select a specific camera and click on the edit button")
	public void they_select_a_specific_camera_and_click_on_the_edit_button() {
	 it.ClickOnEditICon();
	}

	@When("modify the camera name")
	public void modify_the_camera_name() throws InterruptedException {
	 cp.ClearCameraName();
	 cp.EnterCameraName("active");
	}

	@Then("the updated camera should be verified")
	public void the_updated_camera_should_be_verified() {
	Assert.assertEquals(it.VerifyFirstRecordName(), "active");
	}
///*************************DeletedCamera***************************************************
	@Then("the deleted camera should be verified")
	public void the_deleted_camera_should_be_verified() {
	Assert.assertNotEquals(it.VerifyFirstRecordName(), "active");
	}	
	
}
