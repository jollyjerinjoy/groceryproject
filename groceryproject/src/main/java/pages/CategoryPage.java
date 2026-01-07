package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class CategoryPage{
	//POM -page factory-login has two class page class and test class.
	//page factory used to locate WebWlements , used "finbBy
	//WebElements and methods	
		        public WebDriver driver;
		        //PageUtility pageutility= new PageUtility(driver);
		        FileUploadUtility fileuploadutility =new FileUploadUtility();
		        PageUtility pageutility;
			 	WaitUtility waitutility= new WaitUtility();
				
			  //  @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")WebElement pageutility_ManageFooterTextPageMoreInfo;
//			    @FindBy(xpath="//a[contains(@href,'list-category')]")WebElement pageutility_ManageCategoryPageMoreInfo;
			    @FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement pageutility_CategoryPageNew;
			    @FindBy(xpath="//input[@name='category']")WebElement pageutility_CategoryPageCategory;
			   // @FindBy(xpath="//option[text()='discount']")WebElement discountGroup;
			      @FindBy(xpath="//li[normalize-space()='discount']")WebElement discountGroup;
			      @FindBy(xpath="//button[@title='Move Right']")WebElement moveRightButton;
			
		       // @FindBy(xpath="//button[contains(@class,'move-right')]")WebElement moveRightButton;
			    
			  //  @FindBy(id="grp_id")WebElement groupSelect;
			    
			    @FindBy(xpath="//input[@id='main_img']")WebElement fileuploadutility_CategoryPagefileuploadChoosefile;
			  
			    @FindBy(xpath="//button[@name='create']")WebElement pageutilty_CategoryPagecreate;
			    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert; //User Created Successfully

			public CategoryPage(WebDriver driver) {
				this.driver=driver; //assign current class driver to global driver
				 this.pageutility = new PageUtility(driver);
				PageFactory.initElements(driver, this);  //static method ,hence called classname.method <2 para, local driver, current class instance driver
				//to initialize webelements we use initElements.
				}
//			public CategoryPage ManageCategoryPageMoreInfo()
//			{
//					
//				//js.executeScript("window.scrollBy(0,550)","");  //xaxis0, yaxis 150
//				//js.executeScript("window.scrollBy(0,-550)",""); 
//				////js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
//							   //	waitutility.waitForElementToBeClickable(driver, pageutility_ManageFooterTextPageMoreInfo);
//			   	//pageutility.click_on_element(pageutility_ManageFooterTextPageMoreInfo);
//				pageutility.JSscrollToElement(pageutility_ManageCategoryPageMoreInfo);
//				pageutility.click_on_element(pageutility_ManageCategoryPageMoreInfo);
//			}

			public CategoryPage CategoryPageNew()
			{
				waitutility.waitForElementToBeClickable(driver, pageutility_CategoryPageNew);
				pageutility.click_on_element(pageutility_CategoryPageNew);
				return this;
			}
		
			public CategoryPage CategoryPageCategory(String category)
			{
				//username.sendKeys(user);
				pageutility.clear_element_data(pageutility_CategoryPageCategory);
				pageutility.send_data_to_element(pageutility_CategoryPageCategory,category);
				return this;
			}
			public CategoryPage selectDiscountGroup() {
				// scroll to group section
			  //  pageutility.JSscrollToElement(discountGroup);

			    // click discount
			 //   waitutility.waitForElementToBeClickable(driver, discountGroup);
			 //   discountGroup.click();

			    // wait for arrow button
			 //   waitutility.waitForElementToBeClickable(driver, moveRightButton);

			    // move to selected list
			 //   pageutility.click_on_element(moveRightButton);
				
			    // select discount
			    waitutility.waitForElementToBeClickable(driver, discountGroup);
			    discountGroup.click();

			    // wait & click right arrow
			    waitutility.waitForElementToBeClickable(driver, moveRightButton);
			    moveRightButton.click();
				return this;
			}
			
				public CategoryPage CategoryPagefileupload() throws AWTException
{
		//fileuploadutility.FileUploadusingRobotclass(fileuploadutility_CategoryPagefileuploadChoosefile,Constant.SUPERMART);
		//pageutility.click_on_element(fileuploadutility_CategoryPagefileuploadChoosefile);
		fileuploadutility.FileUploadusingSendkeys(fileuploadutility_CategoryPagefileuploadChoosefile,Constant.SUPERMART);
		return this;
		
	}
			public CategoryPage CategoryPagecreate()
			{
				//pageutility.click_on_element(pageutilty_ContactPageUpdate);
				pageutility.JSscrollToElement(pageutilty_CategoryPagecreate);
			//	pageutility.click_on_element(pageutilty_CategoryPagecreate);
			//	pageutility.actionclick(pageutilty_CategoryPagecreate);
				pageutility.clickByJS(pageutilty_CategoryPagecreate);
				return this;
				
			}
			public boolean isAlertDisplayed()
			{
						//return alert.isDisplayed();
				return pageutility.alert_isDisplayed(alert); // Updated Successfully
			}

	
			
}
