package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LogoutPage {
	public WebDriver driver;
	PageUtility pageutility;// = new PageUtility(driver);
	WaitUtility waitutility = new WaitUtility();
	// FileUploadUtility fileuploadutility =new FileUploadUtility();

//@FindBy(xpath="//input[@name='username']")WebElement username;
//@FindBy(xpath="//input[@name='password']")WebElement password;
//@FindBy(xpath="//button[@type='submit']")WebElement submit;
	@FindBy(xpath = "//a[text()='Home']")
	WebElement returnhomepage;
	@FindBy(xpath = "//li[@class='nav-item dropdown']")
	WebElement nav_item_dropdown;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")
	WebElement logout;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/login']")
	WebElement loginReloginpage;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
	WebElement pageutility_ManageAdminMoreInfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	WebElement pageutility_ManageNewsMoreInfo;
	@FindBy(xpath = "//a[contains(@href,'list-footertext')]")
	WebElement pageutility_ManageFooterTextPageMoreInfo;
	@FindBy(xpath = "//a[contains(@href,'list-contact')]")
	WebElement pageutility_ManageContactPageMoreInfo;
	@FindBy(xpath = "//a[contains(@href,'list-category')]")
	WebElement pageutility_ManageCategoryPageMoreInfo;

	public LogoutPage(WebDriver driver) {
		this.driver = driver; // assign current class driver to global driver
		this.pageutility = new PageUtility(driver);
		PageFactory.initElements(driver, this); // static method ,hence called classname.method <2 para, local driver,
												// current class instance driver
		// to initialize webelements we use initElements.
	}

	public AdminPage ManageAdminMoreInfo() {
		waitutility.waitForElementToBeClickable(driver, pageutility_ManageAdminMoreInfo);
		pageutility.click_On_Element(pageutility_ManageAdminMoreInfo);
		return new AdminPage(driver);
	}

	public NewsPage ManageNewsMoreInfo() {

		waitutility.waitForElementToBeClickable(driver, pageutility_ManageNewsMoreInfo);
		pageutility.click_On_Element(pageutility_ManageNewsMoreInfo);
		// pageutility.click_on_element(pageutility_newsnewbutton);
		// pageutility.send_data_to_element(pageutility_newsaddtestarea, "ABrainings");
		// pageutility.click_on_element(pageutility_newscreate);
		return new NewsPage(driver);
	}

	public FooterTextPage ManageFooterTextPageMoreInfo() {

		// js.executeScript("window.scrollBy(0,550)",""); //xaxis0, yaxis 150
		// js.executeScript("window.scrollBy(0,-550)","");
		//// js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

		// waitutility.waitForElementToBeClickable(driver,
		// pageutility_ManageFooterTextPageMoreInfo);
		// pageutility.click_on_element(pageutility_ManageFooterTextPageMoreInfo);

		// waitutility.waitForElementToBeClickable(driver,
		// pageutility_ManageFooterTextPageMoreInfo);
		// pageutility.click_on_element(pageutility_ManageFooterTextPageMoreInfo);

		pageutility.JSscrollToElement(pageutility_ManageFooterTextPageMoreInfo);
		pageutility.clickByJS(pageutility_ManageFooterTextPageMoreInfo);
		// pageutility.click_on_element(pageutility_ManageFooterTextPageMoreInfo);
		return new FooterTextPage(driver);
	}

	public ContactPage ManageContactPageMoreInfo() {

		// js.executeScript("window.scrollBy(0,550)",""); //xaxis0, yaxis 150
		// js.executeScript("window.scrollBy(0,-550)","");
		//// js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

		// waitutility.waitForElementToBeClickable(driver,
		// pageutility_ManageFooterTextPageMoreInfo);
		// pageutility.click_on_element(pageutility_ManageFooterTextPageMoreInfo);

		pageutility.JSscrollToElement(pageutility_ManageContactPageMoreInfo);
		pageutility.click_On_Element(pageutility_ManageContactPageMoreInfo);
		return new ContactPage(driver);
	}

	public CategoryPage ManageCategoryPageMoreInfo() {

		// js.executeScript("window.scrollBy(0,550)",""); //xaxis0, yaxis 150
		// js.executeScript("window.scrollBy(0,-550)","");
		//// js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		// waitutility.waitForElementToBeClickable(driver,
		// pageutility_ManageFooterTextPageMoreInfo);
		// pageutility.click_on_element(pageutility_ManageFooterTextPageMoreInfo);
		pageutility.JSscrollToElement(pageutility_ManageCategoryPageMoreInfo);
		pageutility.click_On_Element(pageutility_ManageCategoryPageMoreInfo);
		return new CategoryPage(driver);
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
	public LogoutPage returnHomePage() {
		pageutility.click_On_Element(returnhomepage);
		return this;

	}

	public LogoutPage loginuser_Nav_Item_Dropdown_Select() {
		pageutility.click_On_Element(nav_item_dropdown);
//submit.click();
		return this;
	}

	public LogoutPage logout_Button_Click() {
		pageutility.click_On_Element(logout);
//submit.click();
		return this;
	}

	public boolean isLoginReloginpageDisplayed() {
		// return dashboard.isDisplayed();
		return pageutility.element_isDisplayed(loginReloginpage);
	}
}