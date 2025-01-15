package constant;

public class Constant {
	public static final String lp_verifyloginwithvalidcredentials="Login Failed for valid credentials";
	public static final String lp_loginWithInvalidUsernameAndValidPassword="alert message is not as expected";
	public static final String lp_loginWithValidUsernameAndInvalidPassword="alert message is not as expected";
	public static final String lp_loginWithInValidUsernameAndInvalidPassword="alert message is not as expected";
	
	
	public static final String CONFIGFILE=System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties";
	public static final String TESTDATAFILE=System.getProperty("user.dir")+"\\src\\main\\resources\\TestData\\GroceryApplication.xlsx";
	
	public static final String category_verifyAddCategory="Alert message is not as expected";
	public static final String category_verifySearchCategory="Search result message is not as expected";
	public static final String category_verifyResetCategory="Table title is displayed not as expected";
	public static final String category_verifyEditButton="Alert message is not as expected";
	public static final String category_verifyDeleteButton="Alert message is not as expected";

	public static final String sub_verifyNewCatgoryButton="Alert message is not as expected";
	public static final String sub_verifySearchButton="Text message is not displayed as expected";
	public static final String sub_verifyResetButton="Table title is not displayed as expected";
	public static final String sub_verifyEditButton="Alert message is not as expected";
	public static final String sub_verifyDeleteButton="Alert message is not as expected";
	
	public static final String mnp_verifyAddManageNews="Alert message is not as expected";
	public static final String mnp_verifySearchManageNews="Table title is not displayed as expected";
	public static final String mnp_verifyResetManageNews="Table title is not displayed as expected";
	
	public static final String mfp_editFooterText="Alert message is not as expected";
}
