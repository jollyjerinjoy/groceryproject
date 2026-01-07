package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.FooterTextPage;
import utilities.ExcelUtility;
import utilities.RandomUtility;

public class FooterTextTest extends Base {
	@Test(priority=1)
	public void verifyFooterTextUpdate () throws IOException
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
			
		FooterTextPage footertextpage=new FooterTextPage(driver);
		footertextpage.ManageFooterTextPageMoreInfo();
		footertextpage.FooterTextEdit();
		RandomUtility randomutility=new RandomUtility();
		String Address=ExcelUtility.readStringData(1, 0,"FooterTextPage");   //readIntegerData(int row, int col, String sheet)
		//FakerUtility fakerutility=new FakerUtility();
		//String user2=fakerutility.creatARandomUserName(user1);
		
		String uniqueAddress=randomutility.getUniqueText(Address);
		String Email=ExcelUtility.readStringData(1, 1,"FooterTextPage");   //  String passwd=ExcelUtility.readStringData(1, 1,"NewsPage");
		String phone=ExcelUtility.readIntegerData(1, 2,"FooterTextPage");
			
		footertextpage.FooterTextPageAddress(uniqueAddress);
		footertextpage.FooterTextPageEmail(Email);
		footertextpage.FooterTextPagePhone(phone);
		footertextpage.FooterTextPageUpdate();
						
		boolean alertpage=footertextpage.isAlertDisplayed();
		Assert.assertTrue(alertpage, "Footer Text Updated Successfully"); //hard assertion , classname.methodname
	
		
	}
}
