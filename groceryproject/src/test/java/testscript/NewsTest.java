package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminPage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.NewsPage;
import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.RandomUtility;

public class NewsTest extends Base {
	LogoutPage logoutpage; // =new LogoutPage(driver);
	NewsPage newspage;

	@Test(priority = 1, description ="verifyNewsIsCreated")
	public void verifyNewsIsCreated() throws IOException, InterruptedException {
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
		// NewsPage newspage=new NewsPage(driver);
		// newspage.ManageNewsMoreInfo();
		// newspage.newsnewbutton();
		String addtestarea = ExcelUtility.readStringData(0, 0, "NewsPage");
		String uniqueNews = RandomUtility.getUniqueText(addtestarea);
		// newspage.newsaddtestarea(uniqueNews);

		newspage = logoutpage.ManageNewsMoreInfo();
		newspage.newsNewbuttonClick().newsAddNewsToTextarea(uniqueNews).newsCreateButtonClick();

		// newspage.newscreate();
		boolean alertpage = newspage.isAlertDisplayed();
	//	if (!alertpage) {
	//	    Assert.fail(Constant.NEWS_CREATE_FAILED);
	//	}
		Assert.assertTrue(alertpage, Constant.NEWS_CREATE_FAILED);

	//	Assert.assertTrue(alertpage, "News Created Successfully"); // hard assertion , classname.methodname

		// boolean dashboardpage=loginpage.isHomePageDisplayed();
		// Assert.assertTrue(dashboardpage); //hard assertion , classname.methodname
	}

}
