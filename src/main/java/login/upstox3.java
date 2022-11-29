package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstox3 {
	
	@FindBy(xpath="//div[text()='No, I’m good']") private WebElement wcpage;
	
	public upstox3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setupstox_page3wcpage()
	{
		wcpage.click();
     }
	
   

}
