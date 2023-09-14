package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FCameraPage 
{
	@FindBy(xpath="//a[@href='/camera']")                                                  WebElement camera_link;
	@FindBy(xpath="//input[@placeholder='Search By Name']")						           WebElement Search_field;
	@FindBy(xpath="(//div[@class='dropdown-toggle'])[1]")                                  WebElement CLient_drop;
	@FindBy(xpath="(//div[@class='dropdown-toggle'])[2]")							   	   WebElement Site_drop;
	@FindBy(xpath="(//div[@class='dropdown-toggle'])[3]")							   	   WebElement Lot_drop;
	@FindBy(xpath="(//div[@class='dropdown-toggle'])[4]")							   	   WebElement Status_drop;
	@FindBy(xpath="//button[@class='btn-i-gray3 btn-icon-text commangap-3 mb-3']")         WebElement Reset_button;
    //@FindBy (xpath="")           WebElement Edit_btn;
    @FindBy (xpath="//select[@class='form-select form-select ms-2 me-2']") 	               WebElement page_drop;
}
