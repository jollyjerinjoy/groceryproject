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

import constant.Constant;
import pages.AdminPage;
import pages.CategoryPage;
import pages.ContactPage;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;
import utilities.RandomUtility;

public class CategoryTest extends Base {
	LogoutPage logoutpage; // =new LogoutPage(driver);
	CategoryPage categorypage;

	@Test(priority = 1, description ="To Add Category")
	public void verifyCategoryPageAdd() throws IOException, AWTException {
		// String user="admin"; //webelement, method in page class
		// String passwd="admin";
		String user = ExcelUtility.readStringData(1, 0, "LoginPage"); // readIntegerData(int row, int col, String sheet)
		String passwd = ExcelUtility.readStringData(1, 1, "LoginPage"); // String passwd=ExcelUtility.readStringData(1,
																		// 1,"NewsPage");

		LoginPage loginpage = new LoginPage(driver); // pass value driver
		loginpage.enterTheUsername(user).enterThePasword(passwd); // calling page methods, passvalue
		// loginpage.enterThePasword(passwd); //calling page methods, passvalue
		logoutpage = loginpage.signin();

		// LogoutPage logoutpage=new LogoutPage(driver);
		// logoutpage.returnhomepage();
		categorypage = logoutpage.ManageCategoryPageMoreInfo();
		// CategoryPage categorypage=new CategoryPage(driver);
		RandomUtility randomutility = new RandomUtility();
		String uniqueCategory = RandomUtility.getUniqueText("testCategory");
		categorypage.categoryPageNewButtonClick().categoryPageAddCategoryText(uniqueCategory).categoryPageSelectDiscountGroup().categoryPageFileUpload()
				.categoryPageCreateButtonClick();
		//System.out.println("=== PAGE SOURCE ===");
		//System.out.println(driver.getPageSource());
//		categorypage.ManageCategoryPageMoreInfo();
//		categorypage.CategoryPageNew();
//
//	//	RandomUtility randomutility=new RandomUtility();
//		categorypage.CategoryPageCategory("testCategory");
//	//	categorypage.selectDiscountGroup();
//
//		categorypage.CategoryPagefileupload();
//		categorypage.CategoryPagecreate();					
//boolean alertpage= categorypage.isAlertDisplayed();// classname.methodname
//	 Assert.assertTrue(alertpage, Constant.CATEGORY_CREATE_SUCCESS); //hard assertion ,
		


		boolean alertpage= categorypage.isAlertDisplayed();
		if (!alertpage) {
		    Assert.fail(Constant.CATEGORY_CREATE_FAILED);
		}
		Assert.assertTrue(alertpage, Constant.CATEGORY_CREATE_SUCCESS);

			}


}

