package testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class LoginTest extends Base {
	@Test(priority = 1, groups = { "regression" }, retryAnalyzer = retry.Retry.class, description ="verifyloginWithValidCredentails")
	public void verifyloginWithValidCredentails() throws IOException {
		// String user="admin"; //webelement, method in page class
		// String passwd="admin";

		String user = ExcelUtility.readStringData(1, 0, "LoginPage"); // readIntegerData(int row, int col, String sheet)
		String passwd = ExcelUtility.readStringData(1, 1, "LoginPage"); // String passwd=ExcelUtility.readStringData(1,
																		// 1,"NewsPage");
		LoginPage loginpage = new LoginPage(driver); // pass value driver
		loginpage.enterTheUsername(user); // calling page methods, passvalue
		loginpage.enterThePasword(passwd); // calling page methods, passvalue
		loginpage.signin();
		boolean dashboardpage = loginpage.isHomePageDisplayed();
	//	if (!dashboardpage)
	//	{
		//	Assert.fail(Constant.NOLOGIN_WITHVALIDCREDENTIALS);
		//}
		Assert.assertTrue(dashboardpage,Constant.NOLOGIN_WITHVALIDCREDENTIALS); // hard assertion , classname.methodname
		// FakerUtility fakerutility=new FakerUtility();
		// String user=fakerutility.creatARandomFirstName();
		// String passwd=fakerutility.creatARandomFirstName();

	}

	@Test(priority = 2, description ="verifyloginInvalidPassword")
	public void verifyloginInvalidPassword() throws IOException {

		String user = ExcelUtility.readStringData(2, 0, "LoginPage");
		String passwd = ExcelUtility.readStringData(2, 1, "LoginPage");
		// String user="admin"; //webelement, method in page class
		// String passwd="admin234343";
		LoginPage loginpage = new LoginPage(driver); // pass value from test class to page class
		loginpage.enterTheUsername(user); // calling page methods, passvalue
		loginpage.enterThePasword(passwd); // calling page methods, passvalue
		loginpage.signin();

		boolean alertpage = loginpage.isAlertDisplayed();
	///	if (!alertpage)
	//	{
	//		Assert.fail(Constant.LOGIN_WITHINVALIDPASSOWRD);
	//	}
		Assert.assertTrue(alertpage, Constant.LOGIN_WITHINVALIDPASSOWRD); // hard assertion , classname.methodname
	}

	@Test(priority = 3, description ="verifyloginInvalidUsername")
	public void verifyloginInvalidUsername() throws IOException {
		// String user="admin243546"; //webelement, method in page class
		// String passwd="admin";
		String user = ExcelUtility.readStringData(3, 0, "LoginPage");
		String passwd = ExcelUtility.readStringData(3, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver); // pass value from test class to page class
		loginpage.enterTheUsername(user); // calling page methods, passvalue
		loginpage.enterThePasword(passwd); // calling page methods, passvalue
		loginpage.signin();
		boolean alertpage = loginpage.isAlertDisplayed();
	//	if(!alertpage)
	//	{
		//Assert.fail(Constant.LOGIN_WITH_INVALIDUSERNAME); // hard assertion , classname.methodname
	//}
		Assert.assertTrue(alertpage,Constant.LOGIN_WITH_INVALIDUSERNAME);
	}

	@Test(priority = 4, description ="verifyloginInvalidUsernamePassword", dataProvider="LoginProvider")  //dataprovider
	public void verifyloginInvalidUsernamePassword(String user, String passwd) throws IOException {
		//String user = ExcelUtility.readStringData(4, 0, "LoginPage");   for dataprovider commented
		//String passwd = ExcelUtility.readStringData(4, 1, "LoginPage");  for dataprovider commented
		// String user="admin243546w"; //webelement, method in page class
		// String passwd="admindsdsdw";
		LoginPage loginpage = new LoginPage(driver); // pass value from test class to page class
		loginpage.enterTheUsername(user); // calling page methods, passvalue
		loginpage.enterThePasword(passwd); // calling page methods, passvalue
		loginpage.signin();
		boolean alertpage = loginpage.isAlertDisplayed();
		//Assert.assertTrue(alertpage,Constant.LOGININVALIDUSERNAMEPASSWORD); // hard assertion , classname.methodname
	//	if(!alertpage)
	//	{
	//	Assert.fail(Constant.LOGIN_WITH_INVALIDUSERNAMEPASSWORD); // hard assertion , classname.methodname
	//}
		Assert.assertTrue(alertpage,Constant.LOGIN_WITH_INVALIDUSERNAMEPASSWORD);
	}
	
	@DataProvider(name="LoginProvider")  //dataprovider
	public Object[][] getDataFromTestData() throws IOException{
		return new Object[][] {{ExcelUtility.readStringData(4, 0,"loginpage"),ExcelUtility.readStringData(4,1,"loginpage")}};
	//	return new Object[][] {{ExcelUtility.readStringData(7, 0,"loginpage"),ExcelUtility.readStringData(7,1,"loginpage")}};
	
	
	}
}
