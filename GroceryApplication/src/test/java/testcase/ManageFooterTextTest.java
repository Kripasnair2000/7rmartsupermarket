package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterTextPage;

public class ManageFooterTextTest extends BaseClass{
	LoginPage lp;
	HomePage hp;
	ManageFooterTextPage mfp;
  @Test
  public void editFooterTextWithNewValidCredentials() throws IOException
  {	    
	  lp=new LoginPage(driver);
		hp= lp.loginByExcelData();
		mfp=hp.clickManageFooterTextButton().clickEditButton().updateAddress().clickUpdateButton();
		boolean actualresult=mfp.alertMessage();
		boolean expectedresult=true;
		Assert.assertEquals(expectedresult, actualresult,Constant.mfp_editFooterText);
	
  }
  
}
