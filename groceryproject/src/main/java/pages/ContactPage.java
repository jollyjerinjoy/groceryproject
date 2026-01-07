package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ContactPage {
	public WebDriver driver;
	   // PageUtility pageutility= new PageUtility();
	    PageUtility pageutility;
	    //= new PageUtility(driver);
	   // FileUploadUtility fileuploadutility =new FileUploadUtility();
			WaitUtility waitutility= new WaitUtility();
		
	  //  @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")WebElement pageutility_ManageFooterTextPageMoreInfo;
//	    @FindBy(xpath="//a[contains(@href,'list-contact')]")WebElement pageutility_ManageContactPageMoreInfo;
	    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']")WebElement pageutility_ContactPageEdit;
	    @FindBy(xpath="//input[@name='phone']")WebElement pageutilty_ContactPagePhone;
	    @FindBy(xpath="//input[@name='email']")WebElement pageutilty_ContactPageEmail;
	    @FindBy(xpath="//textarea[@name='address']")WebElement pageutilty_ContactPageAddress;
	    @FindBy(xpath="//textarea[@name='del_time']")WebElement pageutilty_ContactPageCT;
	    @FindBy(xpath="//input[@name='del_limit']")WebElement pageutilty_ContactPageDCT;
	    @FindBy(xpath="//button[@type='submit']")WebElement pageutilty_ContactPageUpdate;
	    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert; //User Created Successfully

	public ContactPage(WebDriver driver) {
		this.driver=driver; //assign current class driver to global driver
		 this.pageutility = new PageUtility(driver);
		PageFactory.initElements(driver, this);  //static method ,hence called classname.method <2 para, local driver, current class instance driver
		//to initialize webelements we use initElements.
		}
//	public void ManageContactPageMoreInfo()
//	{
		
		
		//js.executeScript("window.scrollBy(0,550)","");  //xaxis0, yaxis 150
		//js.executeScript("window.scrollBy(0,-550)",""); 
		////js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
	   //	waitutility.waitForElementToBeClickable(driver, pageutility_ManageFooterTextPageMoreInfo);
	   	//pageutility.click_on_element(pageutility_ManageFooterTextPageMoreInfo);
		
//		pageutility.JSscrollToElement(pageutility_ManageContactPageMoreInfo);
//		pageutility.click_on_element(pageutility_ManageContactPageMoreInfo);
//	}


	public ContactPage ContactPageEdit()
	{
		pageutility.click_on_element(pageutility_ContactPageEdit);
		return this;
	}

	public ContactPage ContactPagePhone(String phone)
	{
		//username.sendKeys(user);
		pageutility.clear_element_data(pageutilty_ContactPagePhone);
		pageutility.send_data_to_element(pageutilty_ContactPagePhone, phone);
		return this;
	}
	public ContactPage ContactPageEmail(String email)
	{
		//username.sendKeys(user);
		pageutility.clear_element_data(pageutilty_ContactPageEmail);
		pageutility.send_data_to_element(pageutilty_ContactPageEmail, email);
		return this;
	}
	
	public ContactPage ContactPageAddress(String address)
	{
		//username.sendKeys(user);
		pageutility.clear_element_data(pageutilty_ContactPageAddress);
		pageutility.send_data_to_element(pageutilty_ContactPageAddress, address);
		return this;
	}
	public ContactPage ContactPageCT(String CT)
	{
		//username.sendKeys(user);
		pageutility.clear_element_data(pageutilty_ContactPageCT);
		pageutility.send_data_to_element(pageutilty_ContactPageCT, CT);
		return this;
	}
	public ContactPage ContactPageDCT(String DCT)
	{
		//username.sendKeys(user);
		pageutility.clear_element_data(pageutilty_ContactPageDCT);
		pageutility.send_data_to_element(pageutilty_ContactPageDCT, DCT);
		return this;
	}

	public ContactPage ContactPageUpdate()
	{
		//pageutility.click_on_element(pageutilty_ContactPageUpdate);
		pageutility.JSscrollToElement(pageutilty_ContactPageUpdate);
		//pageutility.click_on_element(pageutilty_ContactPageUpdate);
		pageutility.clickByJS(pageutilty_ContactPageUpdate); //click by Js action.
		return this;
		
	}
	public boolean isAlertDisplayed()
	{
				//return alert.isDisplayed();
		return pageutility.alert_isDisplayed(alert); //Footer Text Updated Successfully
	}
}
