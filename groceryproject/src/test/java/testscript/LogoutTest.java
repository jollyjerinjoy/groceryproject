package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	@Test(priority=1)
	public void verifylogout() throws IOException
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
	    logoutpage.nav_item_dropdown();
	    logoutpage.logout();
		boolean logindefaultpage=logoutpage.isLogindefaultpageDisplayed();
		Assert.assertTrue(logindefaultpage);  //hard assertion , classname.methodname
		//FakerUtility fakerutility=new FakerUtility();
		//String user=fakerutility.creatARandomFirstName();
		//String passwd=fakerutility.creatARandomFirstName();
		
		
	}

}
