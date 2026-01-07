package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LogoutPage {
	public WebDriver driver;
    PageUtility pageutility= new PageUtility(driver);
   // FileUploadUtility fileuploadutility =new FileUploadUtility();
    
//@FindBy(xpath="//input[@name='username']")WebElement username;
//@FindBy(xpath="//input[@name='password']")WebElement password;
//@FindBy(xpath="//button[@type='submit']")WebElement submit;
@FindBy(xpath="//a[text()='Home']")WebElement returnhomepage;   
@FindBy(xpath="//li[@class='nav-item dropdown']")WebElement nav_item_dropdown;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/login']")WebElement Logindefaultpage;


public LogoutPage(WebDriver driver) {
	this.driver=driver; //assign current class driver to global driver
	PageFactory.initElements(driver, this);  //static method ,hence called classname.method <2 para, local driver, current class instance driver
	//to initialize webelements we use initElements.
	}
//public void enterTheUsername(String user)
//{

//pageutility.send_data_to_element(username, user);
//}
//public void enterThePasword(String passwd)
//{

//pageutility.send_data_to_element(password, passwd);
//}
//public void signin()
//{
//pageutility.click_on_element(submit);

//}
public void returnhomepage()
{
pageutility.click_on_element(returnhomepage);

}
public void nav_item_dropdown()
{
pageutility.click_on_element(nav_item_dropdown);
//submit.click();
}
public void logout()
{
pageutility.click_on_element(logout);
//submit.click();
}

public boolean isLogindefaultpageDisplayed()
{
			//return dashboard.isDisplayed();
	return pageutility.element_isDisplayed(Logindefaultpage);
}
}