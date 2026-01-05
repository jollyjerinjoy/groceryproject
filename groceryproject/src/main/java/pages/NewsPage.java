package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class NewsPage {
	public WebDriver driver;
	
	PageUtility pageutility= new PageUtility();
	WaitUtility waitutility= new WaitUtility();
	
    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement pageutility_ManageNewsMoreInfo;
    @FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement pageutility_newsnewbutton;
    @FindBy(xpath="//textarea[@name='news']")WebElement pageutility_newsaddtestarea;
    @FindBy(xpath="//button[@name='create']")WebElement pageutility_newscreate;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
    public NewsPage(WebDriver driver) {
		this.driver=driver; //assign current class driver to global driver
		PageFactory.initElements(driver, this);  //static method ,hence called classname.method <2 para, local driver, current class instance driver
		//to initialize webelements we use initElements.
		 
		}
       
   
    public void ManageNewsMoreInfo()
    {
       
    	waitutility.waitForElementToBeClickable(driver, pageutility_ManageNewsMoreInfo);	
		pageutility.click_on_element(pageutility_ManageNewsMoreInfo);
    	//pageutility.click_on_element(pageutility_newsnewbutton);
    	//pageutility.send_data_to_element(pageutility_newsaddtestarea, "ABrainings");
    	//pageutility.click_on_element(pageutility_newscreate);
    }
    public void newsnewbutton()
    {
    	pageutility.click_on_element(pageutility_newsnewbutton);
    }
    public void newsaddtestarea(String addtestarea)
    {
    	pageutility.send_data_to_element(pageutility_newsaddtestarea, addtestarea);
    	//pageutility.send_data_to_element(pageutility_newsaddtestarea, "ABrainingsrtest");
    }
    public void newscreate()
    {
    	pageutility.click_on_element(pageutility_newscreate);
    	
    }
    public boolean isAlertDisplayed()
    {
    			//return alert.isDisplayed();
    	return pageutility.alert_isDisplayed(alert);
    }
    }
