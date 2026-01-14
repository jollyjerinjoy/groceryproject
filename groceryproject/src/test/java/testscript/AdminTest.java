package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminPage;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;
import utilities.RandomUtility;

public class AdminTest extends Base {
	LogoutPage logoutpage; // =new LogoutPage(driver);
	AdminPage adminpage;

	@Test(priority = 1, description = "verifyAdminusersSave")
	public void verifyAdminusersSave() throws IOException {
		// String user="admin"; //webelement, method in page class
		// String passwd="admin";
		String user = ExcelUtility.readStringData(1, 0, "LoginPage"); // readIntegerData(int row, int col, String sheet)
		String passwd = ExcelUtility.readStringData(1, 1, "LoginPage"); // String passwd=ExcelUtility.readStringData(1,
																		// 1,"NewsPage");
		LoginPage loginpage = new LoginPage(driver); // pass value driver

		String user1 = ExcelUtility.readStringData(1, 0, "AdminPage"); // readIntegerData(int row, int col, String
																		// sheet)
		// FakerUtility fakerutility=new FakerUtility();
		// String user2=fakerutility.creatARandomUserName(user1);
		RandomUtility randomutility = new RandomUtility();
		String uniqueUserName = randomutility.getUniqueText(user1);

		String passwd1 = ExcelUtility.readStringData(1, 1, "AdminPage"); // String passwd=ExcelUtility.readStringData(1,
																			// 1,"NewsPage");
		String admindropdownlist = ExcelUtility.readStringData(1, 2, "AdminPage");
		loginpage.enterTheUsername(user).enterThePasword(passwd); // calling page methods, passvalue
		// loginpage.enterThePasword(passwd); //calling page methods, passvalue
		logoutpage = loginpage.signin();
		// AdminPage adminpage=new AdminPage(driver);
		// adminpage.ManageAdminMoreInfo();
		// adminpage.newsnewbutton();
		// adminpage.enteradminUsername(uniqueUserName);
		// adminpage.enteradminPasword(passwd1);
		// adminpage.admindropdownlist(admindropdownlist);
		// adminpage.admincreate();

		adminpage = logoutpage.ManageAdminMoreInfo();
		adminpage.adminNewButtonclick().enterAdminUsername(uniqueUserName).enterAdminPasword(passwd1).adminTypeDropdownlistSelection(admindropdownlist).adminCreateButtonClick();

		//boolean alertpage = adminpage.isAlertDisplayed();
		//Assert.assertTrue(alertpage,Constant.ADMIN_CREATE_SUCCESS); // hard assertion , classname.methodname
		//LogoutPage logoutpage = new LogoutPage(driver);
		//logoutpage.returnHomePage();
		boolean alertpage = adminpage.isAlertDisplayed();
		//if (!alertpage) {
	//	    Assert.fail(Constant.ADMIN_CREATE_FAILED);
	//	}
		Assert.assertTrue(alertpage, Constant.ADMIN_CREATE_FAILED);

		
	}

}

//Test Classes
//Test class Uses @Test annotation with priority, description, groups, retryAnalyzer 
//Assertions are added at the end of test cases

