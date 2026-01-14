package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.CategoryPage;
import pages.ContactPage;
import pages.FooterTextPage;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;
import utilities.RandomUtility;

public class ContactTest extends Base {
	LogoutPage logoutpage; // =new LogoutPage(driver);
	ContactPage contactpage;

	@Test(priority = 1, description ="verifyContactPageUpdate")
	public void verifyContactPageUpdate() throws IOException {
		// String user="admin"; //webelement, method in page class
		// String passwd="admin";
		String user = ExcelUtility.readStringData(1, 0, "LoginPage"); // readIntegerData(int row, int col, String sheet)
		String passwd = ExcelUtility.readStringData(1, 1, "LoginPage"); // String passwd=ExcelUtility.readStringData(1,
																		// 1,"NewsPage");
		LoginPage loginpage = new LoginPage(driver); // pass value driver
		loginpage.enterTheUsername(user).enterThePasword(passwd);
		// loginpage.enterTheUsername(user); //calling page methods, passvalue
		// loginpage.enterThePasword(passwd); //calling page methods, passvalue
		logoutpage = loginpage.signin();

		// LogoutPage logoutpage=new LogoutPage(driver);
		// logoutpage.returnhomepage();
		contactpage = logoutpage.ManageContactPageMoreInfo();

//		ContactPage contactpage=new ContactPage(driver);
//		contactpage.ManageContactPageMoreInfo();
//		contactpage.ContactPageEdit();

		RandomUtility randomutility = new RandomUtility();

		String phone = ExcelUtility.readIntegerData(1, 0, "ContactPage");
		String Email = ExcelUtility.readStringData(1, 1, "ContactPage");
		String Address = ExcelUtility.readStringData(1, 2, "ContactPage"); // readIntegerData(int row, int col, String
																			// sheet)
		// FakerUtility fakerutility=new FakerUtility();
		// String user2=fakerutility.creatARandomUserName(user1);
		String uniqueAddress = randomutility.getUniqueText(Address);
		String CT = ExcelUtility.readIntegerData(1, 3, "ContactPage");
		String DCT = ExcelUtility.readIntegerData(1, 4, "ContactPage");
//		contactpage.ContactPagePhone(phone);
//		contactpage.ContactPageEmail(Email);
//		contactpage.ContactPageAddress(uniqueAddress);
//		contactpage.ContactPageCT(CT);
//		contactpage.ContactPageDCT(DCT);
//		contactpage.ContactPageUpdate();
		contactpage.contactPageEditButtonClick().contactPageEnterPhone(phone).contactPageEnterEmail(Email).contactPageEnterAddress(uniqueAddress)
				.contactPageEnterCT(CT).contactPageEnterDCT(DCT).ContactPageUpdateButtonClick();
	//	boolean alertpage = contactpage.isAlertDisplayed();
	//	Assert.assertTrue(alertpage, "Contact Updated Successfully"); // hard assertion , classname.methodname

		boolean alertpage= contactpage.isAlertDisplayed();
		//if (!alertpage) {
	//	    Assert.fail(Constant.CONTACT_CREATE_FAILED);
	//	}
		Assert.assertTrue(alertpage, Constant.CONTACT_CREATE_FAILED);

			}
		
		
	}


