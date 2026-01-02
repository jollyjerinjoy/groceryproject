package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(priority=1)
	public void verifyloginwithvalidcredentails() throws IOException
	{
	//	String user="admin"; //webelement, method in page class
	//	String passwd="admin";
		
		String user=ExcelUtility.readStringData(1, 0, "LoginPage");   //readIntegerData(int row, int col, String sheet)
		String passwd=ExcelUtility.readStringData(1, 1,"LoginPage");   //  String passwd=ExcelUtility.readStringData(1, 1,"NewsPage");
		LoginPage loginpage=new LoginPage(driver);  //pass value driver 
		loginpage.enterTheUsername(user);  //calling page methods, passvalue 
		loginpage.enterThePasword(passwd); //calling page methods, passvalue
		loginpage.signin();
		boolean dashboardpage=loginpage.isHomePageDisplayed();
		Assert.assertTrue(dashboardpage);  //hard assertion , classname.methodname
	}
	@Test(priority=2)
	public void verifylogininvalidpassword() throws IOException
	{
		
		String user=ExcelUtility.readStringData(2, 0, "LoginPage");
		String passwd=ExcelUtility.readStringData(2, 1,"LoginPage");
		//String user="admin"; //webelement, method in page class
		//String passwd="admin234343";
		LoginPage loginpage=new LoginPage(driver);  //pass value from test class to page class
		loginpage.enterTheUsername(user);  //calling page methods, passvalue
		loginpage.enterThePasword(passwd); //calling page methods, passvalue
		loginpage.signin();
		
		boolean alertpage=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertpage); //hard assertion , classname.methodname
	}
	@Test(priority=3)
	public void verifylogininvalidusername() throws IOException
	{
		//String user="admin243546"; //webelement, method in page class
		//String passwd="admin";
		String user=ExcelUtility.readStringData(3, 0, "LoginPage");
		String passwd=ExcelUtility.readStringData(3, 1,"LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);  //pass value from test class to page class
		loginpage.enterTheUsername(user);  //calling page methods, passvalue
		loginpage.enterThePasword(passwd); //calling page methods, passvalue
		loginpage.signin();
		boolean alertpage=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertpage); //hard assertion , classname.methodname
	}
	@Test(priority=4)
	public void verifylogininvalidusernamepwd() throws IOException
	{
		String user=ExcelUtility.readStringData(4, 0, "LoginPage");
		String passwd=ExcelUtility.readStringData(4, 1,"LoginPage");
		//String user="admin243546w"; //webelement, method in page class
		//String passwd="admindsdsdw";
		LoginPage loginpage=new LoginPage(driver);  //pass value from test class to page class
		loginpage.enterTheUsername(user);  //calling page methods, passvalue
		loginpage.enterThePasword(passwd); //calling page methods, passvalue
		loginpage.signin();
		boolean alertpage=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertpage); //hard assertion , classname.methodname
	}
}
