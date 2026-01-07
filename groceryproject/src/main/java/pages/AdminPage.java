package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminPage {
	public WebDriver driver;
    PageUtility pageutility= new PageUtility(driver);
   // FileUploadUtility fileuploadutility =new FileUploadUtility();
		WaitUtility waitutility= new WaitUtility();
	
   //chaining @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement pageutility_ManageAdminMoreInfo;
   // @FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement pageutility_adminnewbutton;
    @FindBy(xpath="//a[@onclick='click_button(1)']")WebElement pageutility_adminnewbutton;
    @FindBy(xpath="//input[@id='username']")WebElement pageutilty_admininputusername;
    @FindBy(xpath="//input[@id='password']")WebElement pageutilty_admininputpassword;
    @FindBy(xpath="//select[@id='user_type']")WebElement pageutilty_admindropdownlist;
    @FindBy(xpath="//button[@name='Create']")WebElement pageutility_admincreate;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert; //User Created Successfully

public AdminPage(WebDriver driver) {
	this.driver=driver; //assign current class driver to global driver
	PageFactory.initElements(driver, this);  //static method ,hence called classname.method <2 para, local driver, current class instance driver
	//to initialize webelements we use initElements.
	}

//chaining public void ManageAdminMoreInfo()
//{
//   	waitutility.waitForElementToBeClickable(driver, pageutility_ManageAdminMoreInfo);	
//	pageutility.click_on_element(pageutility_ManageAdminMoreInfo);
//}
public AdminPage newsnewbutton()
{
	pageutility.click_on_element(pageutility_adminnewbutton);
	return this;
}
public AdminPage  enteradminUsername(String user1)
{
	//username.sendKeys(user);
	pageutility.send_data_to_element(pageutilty_admininputusername, user1);
	return this;
}
public AdminPage enteradminPasword(String passwd1)
{
//password.sendKeys(passwd);
	pageutility.send_data_to_element(pageutilty_admininputpassword, passwd1);
	return this;
}
public AdminPage admindropdownlist(String admindropdownlist)
{
	pageutility.selectByVisibleTextDropdownMethod(pageutilty_admindropdownlist, admindropdownlist);
	return this;
	//pageutility.send_data_to_element(pageutility_newsaddtestarea, "ABrainingsrtest");
}
public AdminPage admincreate()
{
	pageutility.click_on_element(pageutility_admincreate);
	return this;
}
public boolean isAlertDisplayed()
{
			//return alert.isDisplayed();
	return pageutility.alert_isDisplayed(alert);
}
}
