package testscript;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.WaitUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Base {
	public WebDriver driver;
	@Parameters("browser") 

  @BeforeMethod(alwaysRun=true)
  public void browserInitialization(@Optional("chrome")String browser) throws Exception {
		if(browser.equalsIgnoreCase("chrome"))
		//WebDriver driver=new ChromeDriver();
		//Global – in framework, base class. After loading url. Since it si base class – applicable to all. Static wait.
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			throw new Exception("Invalid browser");
		}

		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICIT_WAIT));
		driver.manage().window().maximize()	;
		
		}

  @AfterMethod(alwaysRun=true)
  public void browserClose()  
	{
		driver.quit();
	}

}
