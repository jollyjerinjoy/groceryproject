package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CategoryPage;
import pages.ContactPage;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;
import utilities.RandomUtility;

public class CategoryTest extends Base {
	@Test(priority=1)
	public void verifyCategoryPageUpdate () throws IOException, AWTException
	{
		//	String user="admin"; //webelement, method in page class
		//	String passwd="admin";
			String user=ExcelUtility.readStringData(1, 0, "LoginPage");   //readIntegerData(int row, int col, String sheet)
			String passwd=ExcelUtility.readStringData(1, 1,"LoginPage");   //  String passwd=ExcelUtility.readStringData(1, 1,"NewsPage");
			
			LoginPage loginpage=new LoginPage(driver);  //pass value driver 
			loginpage.enterTheUsername(user);  //calling page methods, passvalue 
			loginpage.enterThePasword(passwd); //calling page methods, passvalue
			loginpage.signin();
			
		LogoutPage logoutpage=new LogoutPage(driver);
		logoutpage.returnhomepage();
			
		CategoryPage categorypage=new CategoryPage(driver);
		categorypage.ManageCategoryPageMoreInfo();
		categorypage.CategoryPageNew();

	//	RandomUtility randomutility=new RandomUtility();
		categorypage.CategoryPageCategory("testCategory");
	//	categorypage.selectDiscountGroup();
		
	
		
		categorypage.CategoryPagefileupload();
		categorypage.CategoryPagecreate();					
		//boolean alertpage= categorypage.isAlertDisplayed();
		//Assert.assertTrue(alertpage, "Updated Successfully"); //hard assertion , classname.methodname
	
		
	}
	
	
	
}
