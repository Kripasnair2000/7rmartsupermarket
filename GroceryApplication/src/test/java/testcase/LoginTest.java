package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	LoginPage login;
	HomePage hp;
	
  @Test
  public void verifyUserLoginWithValidCredentials() throws IOException {
	  login=new LoginPage(driver);
	  hp= login.loginByExcelData();
	  boolean actualresult=login.homePagedDisplayed();
	  boolean expectedresult=true;
	  Assert.assertEquals(expectedresult,actualresult,Constant.lp_verifyloginwithvalidcredentials);
	  
  }

	@Test(dataProvider = "data provider")
	public void verifyUserLoginWithInvalidUsernameAndValidPassword(String username, String password) {
		login = new LoginPage(driver);
		login.enterUserName(username);
		login.enterPassword(password);
		login.clicksigninButton();
		boolean expectedresult = true;
		boolean actualresult = login.getAlert().contains("Invalid Username/Password");
		Assert.assertEquals(expectedresult, actualresult, Constant.lp_loginWithInvalidUsernameAndValidPassword);

	}
	@DataProvider(name = "data provider")
	public Object[][] dpmethod() {
		return new Object[][] { { "adminda3", "admin" }, { "adminw", "admin" }, { "admin2345", "admin" } };
	}

	
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		login = new LoginPage(driver);
	    hp=login.loginByExcelData1();
	    boolean actualresult = login.getAlert().contains("Invalid Username/Password");
	    boolean expectedresult = true;
		Assert.assertEquals(expectedresult, actualresult,Constant.lp_loginWithValidUsernameAndInvalidPassword);

	}


	@Test
	public void verifyUserLoginWithInValidUsernameAndInvalidPassword() throws IOException {
		login = new LoginPage(driver);
	    hp=login.loginByExcelData2();
	    boolean actualresult = login.getAlert().contains("Invalid Username/Password");
	    boolean expectedresult = true;
		Assert.assertEquals(expectedresult, actualresult,Constant.lp_loginWithInValidUsernameAndInvalidPassword);

	}

}
	




