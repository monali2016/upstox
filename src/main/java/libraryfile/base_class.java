package libraryfile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {
	public WebDriver driver;

	public void initalizebrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\upstox_july2_batch\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//driver.get("https://login-v2.upstox.com/");

		driver.get(utility_class.getdatafrompropertiesfile("URL"));
	}

}
