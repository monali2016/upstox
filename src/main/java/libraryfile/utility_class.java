package libraryfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility_class {

	public static String getTD(int rowindex, int cellindex) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\upstox_july2_batch\\Testdata\\new file1211.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");

		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
	}

	public static void screenshot(WebDriver driver, String testid) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\LENOVO\\eclipse-workspace\\monali\\screenshot\\screenshot_" + testid + ".jpg");
		FileHandler.copy(src, dest);
	}

	public static String getdatafrompropertiesfile(String key) throws IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\LENOVO\\eclipse-workspace\\upstox_july2_batch\\upstoxmavenpropeties.properties");

		Properties p = new Properties();
		p.load(file);

		String value = p.getProperty(key);
		return value;

	}

}
