package constant;

public class Constant {
	public static final String TESTDATAFILE = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx";
	public static final String SUPERMART = System.getProperty("user.dir") + "\\src\\test\\resources\\supermart.jpg";
	//public static final String IMAGEFILE = System.getProperty("user.dir") + "\\src\\test\\resources\\Apple.jpg";
    //	public static final String SUPERMART1="C:\\Users\\jkann\\git\\groceryproject\\groceryproject\\src\\test\\resources\\supermart.jpg";
	//public static final String SUPERMART = System.getProperty("user.dir") + "\\src\\test\\resources\\supermart.jpg";
	public static final String LOGIN_WITHVALIDCREDENTIALS ="Pass:Success login with correct username and password";
	public static final String NOLOGIN_WITHVALIDCREDENTIALS =  "Fail:Error occured: failed to login with correct username and password";
	
	public static final String LOGIN_WITHINVALIDPASSOWRD = "Fail:Error occured: logged in  with incorrect password";
	public static final String NOLOGIN_WITH_INVALIDPASSOWRD = "Pass:Login failed gracefully with incorrect password";
	
	
	public static final String LOGIN_WITH_INVALIDUSERNAME = "Fail:Error occured: logged in  with incorrect username";
	public static final String NOLOGIN_WITH_INVALIDUSERNAME= "Pass:Login failed gracefully with incorrect username";
	
	public static final String LOGIN_WITH_INVALIDUSERNAMEPASSWORD = "Fail:Error occured: logged in  with incorrect username and password";
	public static final String NOLOGIN_WITH_INVALIDUSERNAMEPASSWORD = "Pass:Login failed gracefully with  incorrect username and password";
	
	public static final String LOGOUT_SUCCESS = "Default relogin page displayed to login.";  
	public static final String LOGOUT_FAILURE = "Error occured: logout failed, still logged in  state";
	
	public static final String ADMIN_CREATE_SUCCESS = "User Created Successfully";
	public static final String ADMIN_CREATE_FAILED = "Error occured: Username already exists.!";
	public static final String CATEGORY_CREATE_SUCCESS = "Category Created Successfully";
	public static final String CATEGORY_CREATE_FAILED = "Error occured: Category already exists.!";
	public static final String CONTACT_CREATE_SUCCESS = "Contact Updated Successfully";
	public static final String CONTACT_CREATE_FAILED = "Error occured: Contact updation failed.!";
	public static final String FOOTERTEXT_CREATE_SUCCESS = "Contact Updated Successfully";
	public static final String FOOTERTEXT_CREATE_FAILED = "Error occured: Contact updation failed.!";
	public static final String NEWS_CREATE_SUCCESS = "News Created Successfully";
	public static final String NEWS_CREATE_FAILED = "Error occured: News Creation failed!";
	
	public static final String CONFIGFILE = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\config.properties";

	// not able to change, modify
}
