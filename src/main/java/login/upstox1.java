package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstox1 {
	@FindBy(xpath="//input[@name='userId']")
	private WebElement usid;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement uspass;
	
	@FindBy(xpath="//button[@id='submit-btn']")
	private WebElement click;
	
	public upstox1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setupstox1usid(String ab1)
	{
		usid.sendKeys(ab1);
	}
	public void setupstox1uspass(String ab2)
	{
		uspass.sendKeys(ab2);
	}
	public void clickupstox1usid()
	{
		click.click();
	}
	
	
}
