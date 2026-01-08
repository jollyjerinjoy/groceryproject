package constant;

public class Constant {
	public static final String TESTDATAFILE = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx";
	public static final String SUPERMART = System.getProperty("user.dir") + "\\src\\test\\resources\\supermart.jpg";
	
	public static final String LOGIN_WITHVALIDCREDENTIALS = "Error occured: failed to login with correct username and password";
	public static final String NOLOGIN_WITHVALIDCREDENTIALS = "Success login with correct username and password";
	
	public static final String LOGIN_WITHINVALIDPASSOWRD = "Error occured: logged in  with incorrect password";
	public static final String NOLOGIN_WITH_INVALIDPASSOWRD = " failed login successfully with incorrect password";
	
	
	public static final String LOGIN_WITH_INVALIDUSERNAME = "Error occured: logged in  with incorrect username";
	public static final String NOLOGIN_WITH_INVALIDUSERNAME= "failed login successfully with incorrect username";
	
	public static final String LOGIN_WITH_INVALIDUSERNAMEPASSWORD = "Error occured: logged in  with incorrect username and password";
	public static final String NOLOGIN_WITH_INVALIDUSERNAMEPASSWORD = "failed login successfully with  incorrect username and password";
	
	public static final String LOGOUT_SUCCESS = "Default login page displayed";  //
	public static final String LOGOUT_FAILURE = "Error occured: logout failed";
	public static final String ADMIN_CREATE_SUCCESS = "User Created Successfully";
	public static final String ADMIN_CREATE_FAILED = "Error occured: Username already exists.!";
	public static final String CATEGORY_CREATE_SUCCESS = "Category Created Successfully";
	public static final String CATEGORY_CREATE_FAILED = "Error occured: Category Creation failed.!";
	public static final String CONTACT_CREATE_SUCCESS = "Contact Updated Successfully";
	public static final String CONTACT_CREATE_FAILED = "Error occured: Contact updation failed.!";
	public static final String FOOTERTEXT_CREATE_SUCCESS = "Contact Updated Successfully";
	public static final String FOOTERTEXT_CREATE_FAILED = "Error occured: Contact updation failed.!";
	
	public static final String CONFIGFILE = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\config.properties";

	// not able to change, modify
}
