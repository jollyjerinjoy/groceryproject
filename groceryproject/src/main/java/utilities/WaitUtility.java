package utilities;

import java.time.Duration;
import java.util.function.Function;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	// imp in base
	public static final int IMPLICIT_WAIT = 5;
	public static final int EXPLICIT_WAIT = 5;

	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForElementalertIsPresent(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		//@Nullable
		//Alert until = wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public void waitForElementToBeSelected(WebDriver driver, WebElement element)
	{
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public void waitForElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
}
//Handles synchronization issues using:
//    Implicit Wait (base level)
//    Explicit Wait (condition-based)
//    Fluent Wait (polling-based, flexible)
