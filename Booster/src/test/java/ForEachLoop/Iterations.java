package ForEachLoop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class Iterations 
{
	WebDriver driver;
//*****************************************For picking features link******************************************
    @FindBy(xpath = "//a[@class='nav-link nav-link-ref']/../../li")
    List<WebElement> AllLinks;

    public Iterations(WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
   public void ClickOnlinkByText(String feature)
   {
	 for(WebElement links:AllLinks)
	 {
		 if(links.getText().equalsIgnoreCase(feature))
		 {
			 links.click();
			 break;
		 }
	 }
   }
   
 //**************************************enter Save button And For keyboard**********************************************
   @FindBy(xpath="//button[text()='Save']")                                      WebElement saveButton ;
   @FindBy(xpath="//button[text()='Cancel']")                                    WebElement cancelButton ;
   public void scrollForEnter(WebDriver driver, WebElement element)
   {
  	 JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center', inline: 'center'});", element);
   }
   
   public boolean VerifySaveButon()
   {
	   boolean verify=saveButton.isEnabled();
      return verify;
   }
   public boolean VerifyCancelButton()
   {
	   boolean verify=cancelButton.isEnabled();
	   return verify;
   }
   
   public void ClickOnSaveButton() throws AWTException, InterruptedException
   {

		KeyBoardOption("scroll");
		Thread.sleep(2000);
        saveButton.click();
     	ClickonOkButton();
   }
   public void ClickOnCancelButton() throws AWTException, InterruptedException
   {
   	cancelButton.click();
   	KeyBoardOption("");
   }
    public void KeyBoardOption(String a) throws AWTException, InterruptedException
   {
    if(a.equalsIgnoreCase("scroll"))
    {
    	Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		rt.keyRelease(KeyEvent.VK_DOWN);
    }
    else
    {
   	Robot rb=new Robot();
   	rb.keyPress(KeyEvent.VK_ENTER);
   	rb.keyRelease(KeyEvent.VK_ENTER);
   }}

   
//*********************************************CLient Drop Down***********************************************
  @FindBy (xpath = "(//select[@formcontrolname='DropdownControl'])[1]") WebElement clientDrop;
  public void SelectClient(String name)
  {
	  Select sel=new Select(clientDrop);
	  sel.selectByVisibleText(name);
  }
//**********************************************First Record components****************************************** 
  @FindBy(xpath="//select[@class='form-select form-select ms-2 me-2']")         WebElement pageDropDown;
 public boolean PageDropDown()
 {
  boolean verify=pageDropDown.isEnabled();
  return verify;
 }
  @FindBy(xpath="//div[@class='table-responsive']//tbody/tr")               List<WebElement>     featchAllRecords;
    public void featchAllRecordData()
    {
	  
    }
  @FindBy(xpath="//input[@placeholder='Search By Name']/../following-sibling::div[1]//tbody/tr[1]/td[1]")      WebElement featchFirstRecordId;//Except client
  @FindBy(xpath="//input[@placeholder='Search By Name']/../following-sibling::div[1]//tbody/tr[1]/td[2]")        WebElement featchFirstRecordName;   //Except client and attributeValue
   public String GetFirstRecordName()
   {
	   String name=featchFirstRecordName.getText();
	   return name;
   }
   public String GetFirstRecordId()
   {
	   String id=featchFirstRecordId.getText();
	   return id;
   }
//********************************************Edit icon And Search text field*********************************************************************
   @FindBy(xpath ="(//span[@class='btn-sm-gray3 edit'])[1]")                      WebElement editIcon; 
      @FindBy (xpath="//input[@placeholder='Search By Name']")						  WebElement searchField;
   @FindBy(xpath="//button[@class='btn-i-secondary btn-icon-text commangap-3']")  WebElement newButton;     //not using for camera
   @FindBy(xpath="//button[@class='btn-i-secondary btn-icon-text commangap-3 mb-3']")WebElement cameraNewButton;
   public void ClickOnCameraNewButton()
   {
	   cameraNewButton.click();
   } 

   public void ClickOnNewButton()
   {
	   newButton.click();
   }

   public void ClickOnEditICon() 
   { 
	  editIcon.click();
   }
  
   public void SearchField(String id) throws AWTException, InterruptedException
   {
       searchField.sendKeys(id);
       Thread.sleep(4000);
       Robot rt=new Robot();
   	rt.keyPress(KeyEvent.VK_ENTER);
   	rt.keyRelease(KeyEvent.VK_ENTER);
   }
  
   public void NewButton()
   {
   	newButton.click();
   }
   @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[1]")         WebElement radioActive;   ////For lot its not working
   @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[2]")         WebElement radioInactive;
   
   
   
   
   public void scrollforRadio(WebDriver driver, WebElement element)
   {
  	 JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center', inline: 'center'});", element);
   }
   
   public boolean VerifyActiveRadiobuttons()
   {
	   boolean verify=radioActive.isEnabled();
   return verify;
   }
   public boolean VerifyInActiveRadiobuttons()
   {
       boolean verify=radioInactive.isEnabled();
   return verify;
   }
   public void ClickOnRadiobutton(int id) 
   {
//	   Thread.sleep(3000);
//	   scrollforRadio(driver, radioActive);
	   if (id==2)
	   {
		  radioInactive.click();
	   }
	   else
	   {
		   System.out.println("ByDefault Active In Status");
		   //scrollforRadio(driver, radioActive);
	   }
   }
//***************************************Page Text to verify the current page******************************************************   
   @FindBy(xpath="//div[@class='page-content']//h1")                             WebElement pageText;
     public String VerifyCurrentPageText()
     {
   	String text=pageText.getText();
   	return text;
     }
     
//*****************************************Setting page**********************************************************************
   @FindBy(xpath = "//div[@class='container-fluid']/ul/li") List<WebElement> settingLinks;
   public void ClickOnSettingLinksByText(String links) 
   {                                 
   for(WebElement a:settingLinks)           {
     if(a.getText().equals(links))       {
       a.click();
    	break;                           }
     }
                                                  }

   
   @FindBy (xpath="//div[@class='table-responsive']//tbody/tr[1]/td[1]") WebElement settingId;
  
   public String getsettingsID() throws InterruptedException
   {
	   String id=settingId.getText();
       Thread.sleep(2000);
	   return id;
   }
  
   @FindBy(xpath="//span[text()=' All Status']")WebElement statusDropDown;
   public boolean VerifyStatusDrop()
   {
	   boolean verify=statusDropDown.isEnabled();
	   return verify;
   }
   @FindBy(xpath="//div[@class='filter-dropdown']/../div[2]/ul/li") List<WebElement> statusOptions;
   public void SelectStatus(String status)
   {
	   statusDropDown.click();
	   for(WebElement a:statusOptions)
	   {
		   if(a.getText().equalsIgnoreCase(status))
		   {
			   a.click();
			   break;
		   }
	   }
   }
   @FindBy(xpath="//button[@class='btn-i-gray3 btn-icon-text commangap-3']")WebElement resetbutton;
   public boolean VerifyResetButton()
   {
	   boolean res=resetbutton.isEnabled();
       return res;
   }
   @FindBy(xpath="(//a[@aria-label='Next'])")WebElement nextPageDropDown;
   public boolean VerifyNextPageDropDown()
   {
	   boolean verify=nextPageDropDown.isEnabled();
       return verify;
   }
   @FindBy(xpath="(//button[@class='btn-wide-gray3'])[1]")WebElement lotDelete;
   public void ClickOnLotDeleteButton() throws AWTException
   { 
	  lotDelete.click(); 
	  okButton.click();
   }
   @FindBy (xpath="(//button[@type='button'])[1]")WebElement deleteButton;//Except Camera
   public void ClickOnDeleteButton() throws AWTException, InterruptedException
   { 
	  KeyBoardOption("scroll");
	  deleteButton.click();
	  okButton.click();
   }
   
   @FindBy(xpath="//button[.='OK']")WebElement okButton;
   public void ClickonOkButton() 
   {
	  okButton.click(); 
   }
   
   
   
   
   
}
