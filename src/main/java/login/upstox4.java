package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstox4 {
	
	 @FindBy(xpath="//span[text()='harshad r.']")
	    private WebElement mainpage;
		
		public upstox4(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
//		
//		public void setupstox4mainpage(String ab4)
//		{
//			String abc=mainpage.getText();
//		//	String xyz="harshad.R";
//			boolean result = abc.equalsIgnoreCase(ab4);
//			
//			if(result=true)
//			{
//				System.out.println("valid testcase");
//			}else
//			{
//				System.out.println("invalid testcase");
//			}


//}}
		public String setupstox4mainpage()
		{
			String userID = mainpage.getText();
			return userID;
		}
}