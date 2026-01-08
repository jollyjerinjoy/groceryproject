package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class FooterTextPage {
	public WebDriver driver;
	// PageUtility pageutility= new PageUtility();
	PageUtility pageutility;
	// = new PageUtility(driver);
	// FileUploadUtility fileuploadutility =new FileUploadUtility();
	WaitUtility waitutility = new WaitUtility();

	// @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")WebElement
	// pageutility_ManageFooterTextPageMoreInfo;
	// @FindBy(xpath="//a[contains(@href,'list-footertext')]")WebElement
	// pageutility_ManageFooterTextPageMoreInfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")
	WebElement pageutility_FooterTextEdit;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement pageutilty_FooterTextPageAddress;
	@FindBy(xpath = "//input[@name='email']")
	WebElement pageutilty_FooterTextPageEmail;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement pageutilty_FooterTextPagePhone;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement pageutilty_FooterTextPageUpdate;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert; // User Created Successfully

	public FooterTextPage(WebDriver driver) {
		this.driver = driver; // assign current class driver to global driver
		this.pageutility = new PageUtility(driver);
		PageFactory.initElements(driver, this); // static method ,hence called classname.method <2 para, local driver,
												// current class instance driver
		// to initialize webelements we use initElements.
	}
//public void ManageFooterTextPageMoreInfo()
//{

	// js.executeScript("window.scrollBy(0,550)",""); //xaxis0, yaxis 150
	// js.executeScript("window.scrollBy(0,-550)","");
	//// js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

	// waitutility.waitForElementToBeClickable(driver,
	// pageutility_ManageFooterTextPageMoreInfo);
	// pageutility.click_on_element(pageutility_ManageFooterTextPageMoreInfo);

//	pageutility.JSscrollToElement(pageutility_ManageFooterTextPageMoreInfo);
//	pageutility.click_on_element(pageutility_ManageFooterTextPageMoreInfo);
//}

	public FooterTextPage footerTextEditButtonClick() {
		pageutility.click_On_Element(pageutility_FooterTextEdit);
		return this;
	}

	public FooterTextPage footerTextPageEnterAddress(String address) {
		// username.sendKeys(user);
		pageutility.clear_Element_Data(pageutilty_FooterTextPageAddress);
		pageutility.send_Data_To_Element(pageutilty_FooterTextPageAddress, address);
		return this;
	}

	public FooterTextPage footerTextPageEnterEmail(String email) {
		// username.sendKeys(user);
		pageutility.clear_Element_Data(pageutilty_FooterTextPageEmail);
		pageutility.send_Data_To_Element(pageutilty_FooterTextPageEmail, email);
		return this;
	}

	public FooterTextPage footerTextPageEnterPhone(String phone) {
		// username.sendKeys(user);
		pageutility.clear_Element_Data(pageutilty_FooterTextPagePhone);
		pageutility.send_Data_To_Element(pageutilty_FooterTextPagePhone, phone);

		return this;
	}

	public FooterTextPage footerTextPageUpdateButtonClick() {
		pageutility.click_On_Element(pageutilty_FooterTextPageUpdate);
		// pageutility.clickByJS(pageutilty_FooterTextPageUpdate);
		return this;

	}

	public boolean isAlertDisplayed() {
		// return alert.isDisplayed();
		return pageutility.alert_isDisplayed(alert); // Footer Text Updated Successfully
	}
}
