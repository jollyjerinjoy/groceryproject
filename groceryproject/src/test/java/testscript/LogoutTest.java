package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	LogoutPage logoutpage;// = new LogoutPage(driver);
	@Test(priority = 1, description ="verifylogout")
	public void verifylogout() throws IOException {
		// String user="admin"; //webelement, method in page class
		// String passwd="admin";

		String user = ExcelUtility.readStringData(1, 0, "LoginPage"); // readIntegerData(int row, int col, String sheet)
		String passwd = ExcelUtility.readStringData(1, 1, "LoginPage"); // String passwd=ExcelUtility.readStringData(1,
																		// 1,"NewsPage");
		LoginPage loginpage = new LoginPage(driver); // pass value driver
		loginpage.enterTheUsername(user).enterThePasword(passwd); // calling page methods, passvalue
		//loginpage.enterThePasword(passwd); // calling page methods, passvalue
		logoutpage=loginpage.signin();

	//	LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.returnHomePage().loginuser_Nav_Item_Dropdown_Select().logout_Button_Click();
		//logoutpage.nav_Item_Dropdown();
		//logoutpage.logout();
		boolean logindefaultpage = logoutpage.isLogindefaultpageDisplayed();
		if(!logindefaultpage)
		{
			Assert.fail(Constant.LOGOUT_FAILURE);
		}
		Assert.assertTrue(logindefaultpage,Constant.LOGOUT_SUCCESS); // hard assertion , classname.methodname
		// FakerUtility fakerutility=new FakerUtility();
		// String user=fakerutility.creatARandomFirstName();
		// String passwd=fakerutility.creatARandomFirstName();

	}

}
