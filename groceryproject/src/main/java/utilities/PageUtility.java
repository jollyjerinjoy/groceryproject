package utilities;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	JavascriptExecutor js; 
	Actions actions;
	
//to help page class, page class reusable methods are written here
	
	

	public void JavaScriptUtility(WebDriver driver) {
        js = (JavascriptExecutor) driver;
    }
	
	public void JSscrollDown() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)","");
    }

    public void JSscrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickByJSMessageButton(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    public void JSsetValueSingleInput(WebElement element, String value) {
        js.executeScript("arguments[0].value='" + value + "'", element);
    }
	public void click_on_element(WebElement element)
	{
		element.click();
	}
	public boolean element_isDisplayed(WebElement element)
	{
		return element.isDisplayed();
	}
	public boolean alert_isDisplayed(WebElement element)
	{
		return element.isDisplayed();
	}
	public void send_data_to_element(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	public void clear_element_data(WebElement element)
	{
		element.clear();
	}
	public void mousehover(WebElement element)
	{
		actions.moveToElement(element).perform();
	}
	public void rightclick(WebElement element)
	{
	actions.contextClick(element).perform();
		}
	public void doubleclick(WebElement element)
	{
		actions.doubleClick(element).perform();
		
	}
	public void draganddrop(WebElement source, WebElement target)
	{
		actions.dragAndDrop(source, target);
	}
	public void selectByVisibleTextDropdownMethod(WebElement element,String visibleText)
	{
		Select select =new Select(element);
		select.selectByVisibleText(visibleText);
	}
	//select by index, value , visibletext	
		public void selectByValueTextDropdownMethod(WebElement element,String value) 
		{
			Select select =new Select(element);
			select.selectByValue(value);
		//select by index, value , visibletext	
			}
				public void selectByindexDropdownMethod(WebElement element,int index) 
		{
			Select select =new Select(element);
			select.selectByIndex(index);
		//select by index, value , visibletext	
		
	}
		
		
		//action , javascript
}
