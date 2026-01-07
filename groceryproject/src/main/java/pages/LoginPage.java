package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
//import utilities.FileUploadUtility;
import utilities.PageUtility;



public class LoginPage {
//POM -page factory-login has two class page class and test class.
//page factory used to locate WebWlements , used "finbBy
//WebElements and methods	
	        public WebDriver driver;
	        PageUtility pageutility= new PageUtility(driver);
	       // FileUploadUtility fileuploadutility =new FileUploadUtility();
	        
	    @FindBy(xpath="//input[@name='username']")WebElement username;
	    @FindBy(xpath="//input[@name='password']")WebElement password;
		@FindBy(xpath="//button[@type='submit']")WebElement submit;
		@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
		@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")WebElement alert;   //  //div[contains(@class,'alert alert-danger alert-dismissible')]
public LoginPage(WebDriver driver) {
		this.driver=driver; //assign current class driver to global driver
		PageFactory.initElements(driver, this);  //static method ,hence called classname.method <2 para, local driver, current class instance driver
		//to initialize webelements we use initElements.
		}
public LoginPage enterTheUsername(String user)
{
	//username.sendKeys(user);
	pageutility.send_data_to_element(username, user);
	return this;
}
public LoginPage enterThePasword(String passwd)
{
//password.sendKeys(passwd);
	pageutility.send_data_to_element(password, passwd);
	return this;
}
public LogoutPage signin()
{
	pageutility.click_on_element(submit);
//	submit.click();
	return new LogoutPage(driver);
}

public boolean isHomePageDisplayed()
{
			//return dashboard.isDisplayed();
	return pageutility.element_isDisplayed(dashboard);
}

public boolean isAlertDisplayed()
{
			//return alert.isDisplayed();
	return pageutility.alert_isDisplayed(alert);
}
//public void countrydropdown()
//{
//	pageutility.selectByVisibleTextDropdownMethod(alert, "State"); //
//}

//public void fileupload() throws AWTException
//{
//	fileuploadutility.FileUploadusingRobotclass(alert,Constant.Apple);
	
//}

}
