package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;

public class SAdminRole 
{
 public WebDriver driver;
 public SAdminRole(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
//********************************Creation********************************************************** 
 @FindBy(xpath="//input[@placeholder='Permission Title']")WebElement permissionTitle;
 @FindBy(xpath="//input[@type='checkbox']")List<WebElement> allCheckBoxes;	

 public void EnterPermissionTitle(String name) throws InterruptedException
 {
	 Thread.sleep(2000);
	 permissionTitle.clear();
	 permissionTitle.sendKeys(name);
     
 }

 public void verifyAllCheckBox() 
 {
	    int count = 0;
	    int totalCheckboxes = allCheckBoxes.size();

	    for (WebElement checkbox : allCheckBoxes) {
	        if (checkbox.isSelected()) {
	            count++;
	        }
	    }

	    if (count == totalCheckboxes) {
	        String a="All checkboxes are selected";
	    } else {
	        System.out.println("Not all checkboxes are selected");
	    }
 }
//***********************************Deletion***************************************************
public void ScrollPage() throws AWTException, InterruptedException {	
	    Robot rt=new Robot();
	    rt.keyPress(KeyEvent.VK_DOWN);
	    Thread.sleep(2000);
	    rt.keyRelease(KeyEvent.VK_DOWN);
}

}
