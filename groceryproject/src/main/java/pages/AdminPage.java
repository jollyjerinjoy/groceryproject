package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminPage {
	public WebDriver driver;
    PageUtility pageutility= new PageUtility();
   // FileUploadUtility fileuploadutility =new FileUploadUtility();


public AdminPage(WebDriver driver) {
	this.driver=driver; //assign current class driver to global driver
	PageFactory.initElements(driver, this);  //static method ,hence called classname.method <2 para, local driver, current class instance driver
	//to initialize webelements we use initElements.
	}


}
