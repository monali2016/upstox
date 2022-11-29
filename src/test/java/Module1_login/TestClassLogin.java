package Module1_login;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import libraryfile.base_class;
import libraryfile.utility_class;
import login.upstox1;
import login.upstox2;
import login.upstox3;
import login.upstox4;

public class TestClassLogin extends base_class {

	upstox1 obj;
	upstox2 obj1;
	upstox3 obj2;
	upstox4 obj3;

	@BeforeClass
	public void openbrowser() throws IOException {

		initalizebrowser();

		obj = new upstox1(driver);
		obj1 = new upstox2(driver);
		obj2 = new upstox3(driver);
		obj3 = new upstox4(driver);

	}

	@BeforeMethod
	public void openmethod() throws EncryptedDocumentException, IOException {

		obj.setupstox1usid(utility_class.getTD(0, 0));
		obj.setupstox1uspass(utility_class.getTD(0, 1));
		obj.clickupstox1usid();
		obj1.setupstox2pin(utility_class.getTD(0, 2));
		obj2.setupstox_page3wcpage();

	}

	@Test
	public void verifyUN() throws EncryptedDocumentException, IOException {

		String actusername = obj3.setupstox4mainpage();
		String expectusername = utility_class.getTD(0, 3);
		Assert.assertEquals(actusername, expectusername, "failed:becz username are different");
	}

	@AfterMethod
	public void logoutapp() {

	}

	@AfterClass
	public void browserclose() {
		obj = null;
		obj1 = null;
		obj2 = null;
		obj3 = null;
		driver = null;
	}
}
