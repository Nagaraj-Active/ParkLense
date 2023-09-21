package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LotPage {

	
	
	 WebDriver driver;
	 public LotPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
		
		
		@FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")WebElement newPageClientDrop;
		@FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")WebElement newPageSiteDrop;
		@FindBy(xpath="//input[@placeholder='Enter Lot Name']")WebElement lotNamefield;
		@FindBy(xpath="Enter Lot Title (Display Name)")WebElement lotTitlefield;
		public boolean VerifyclientDrop()
		{
			boolean verify=newPageClientDrop.isEnabled();
			return verify;
		}
		public void Selectclient()
		{
			newPageClientDrop.click();
		}
		public boolean VerifySitetDrop()
		{
			boolean verify=newPageSiteDrop.isEnabled();
			return verify;
		}
		public void Selectsite()
		{
			newPageSiteDrop.click();
		}
		public boolean VerifyLotNameField()
		{
			boolean verify=lotNamefield.isEnabled();
			return verify;
		}
		public void EnterLotName(String name)
		{
			lotNamefield.sendKeys(name);
		}
		
		public boolean VerifyLotTitleField()
		{
			boolean verify=lotTitlefield.isEnabled();
			return verify;
		}
		public void EnterLotTitle(String title)
		{
			lotTitlefield.sendKeys(title);
		}
		@FindBy(xpath="//input[@placeholder='Enter parking duration']")WebElement parkingDurationfield;
		public boolean VerifyParkingDuration()
		{
			boolean verify=parkingDurationfield.isEnabled();
			return verify;
		}
		public void EnterParkingDuration(String dur)
		{
			parkingDurationfield.sendKeys(dur);
		}
		@FindBy(xpath="//span[@id='basic-addon1']")WebElement uploadButton;
		public boolean VerifyOverlayUploadbutton()
		{
			boolean verify=uploadButton.isEnabled();
			return verify;
		}
		public void UploadOverlay()
		{
			uploadButton.click();
		}
		@FindBy(xpath="//input[@placeholder='Latitude']")WebElement lattitudeField;
		public boolean VerifyLattitudefield()
		{
			boolean verify=lattitudeField.isEnabled();
			return verify;
		}
		public void Enterlattitude(String lat)
		{
			lattitudeField.sendKeys(lat);
		}
		@FindBy(xpath="//input[@placeholder='Longitude']")WebElement longitudeField;
		public boolean VerifylongitudeField()
		{
			boolean verify=longitudeField.isEnabled();
			return verify;
		}
		public void EnterLongitude(String longitude)
		{
			longitudeField.sendKeys(longitude);;
		}
		@FindBy(xpath="(//input[@type='radio'])[3]")WebElement indoor;
		public boolean Verifyindoor()
		{
			boolean verify=indoor.isEnabled();
			return verify;
		}
		public void SelectLotLocation(int id)
		{
			if(id==2)
			{
				outDoor.click();
			}
		}
		@FindBy(xpath="(//input[@type='radio'])[4]") WebElement outDoor;
		public boolean VerifyOutDoor()
		{
			boolean verify=outDoor.isEnabled();
			return verify;
		}
		
		@FindBy(xpath="(//input[@type='radio'])[5]")WebElement activeStatus;
		public boolean VerifyactiveStatus()
		{
			boolean verify=activeStatus.isEnabled();
			return verify;
		}
		public void SelectLotStatus(int id)
		{
			if(id==2)
			{
				inActiveStatus.click();
			}
		}
		@FindBy(xpath="(//input[@type='radio'])[6]")WebElement inActiveStatus;
		public boolean VerifyinactiveStatus()
		{
			boolean verify=inActiveStatus.isEnabled();
			return verify;
		}
}
