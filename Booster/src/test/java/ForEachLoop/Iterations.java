package ForEachLoop;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iterations 
{
	WebDriver driver;

    @FindBy(xpath = "//a[@class='nav-link nav-link-ref']/../../li")
    List<WebElement> AllLinks;

    public Iterations(WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
   public void ClickOnByText(String feature)
   {
	 for(WebElement links:AllLinks)
	 {
		 if(links.getText().equals(feature))
		 {
			 links.click();
			 break;
		 }
	 }
   }
}
