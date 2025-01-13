package testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constant.Constant;
import utilities.ScreenShotUtility;
import utilities.WaitUtility;

public class BaseClass {
	Properties prop;
	FileInputStream fs;
	WaitUtility waitutilities=new WaitUtility();
	public WebDriver driver;

	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	public void initializeBrowser(String browser) throws Exception {

		prop = new Properties();
		fs = new FileInputStream(Constant.CONFIGFILE);
		prop.load(fs);
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			throw new Exception("Invalid browser");
		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		waitutilities.implicitWait(driver);
	}

	@AfterMethod(alwaysRun = true)
	public void driverQuit(ITestResult itestresult) throws IOException {

		if (itestresult.getStatus() == ITestResult.FAILURE) {
			ScreenShotUtility screenshot = new ScreenShotUtility();
			screenshot.getScreenShot(driver, itestresult.getName());
		}
	}

	// driver.quit();
}
