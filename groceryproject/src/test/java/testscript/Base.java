package testscript;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import constant.Constant;
import generateReport.Listeners;
import utilities.ExtentReportUtility;
import utilities.ScreenshotUtility;
import utilities.WaitUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Base {
	public WebDriver driver;
	public FileInputStream fileinputstream;
	public Properties properties;

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void browserInitialization(@Optional("chrome") String browser) throws Exception {
		try {
			properties = new Properties();
			fileinputstream = new FileInputStream(Constant.CONFIGFILE);
			properties.load(fileinputstream); // pass

		} catch (Exception e) {
			System.out.println(e);
		}

		if (browser.equalsIgnoreCase("chrome"))
		// WebDriver driver=new ChromeDriver();
		// Global – in framework, base class. After loading url. Since it si base class
		// – applicable to all. Static wait.
		{
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			throw new Exception("Invalid browser");
		}

		// driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.get(properties.getProperty("url")); // passing url from constant file from key(here it is url) valuepair
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICIT_WAIT));
		driver.manage().window().maximize();

	}

	@AfterMethod(alwaysRun = true)
	public void browserClose(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			ScreenshotUtility scrShot = new ScreenshotUtility(); // creating obj
			scrShot.getScreenShot(driver, iTestResult.getName());
		}
	//ExtentReportUtility extent=new ExtentReportUtility();
	//extent.createExtentReports();
	//extent.flush();
	//	Listeners ls=new Listeners();
	//	ls.onFinish();
		
		driver.quit();
	}

}
