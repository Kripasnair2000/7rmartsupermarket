package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;

public class ManageContactTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	ManageContactPage mcp;
  @Test
  public void updateContactTextWithNewValidCredentials() throws IOException
  {	    
	   lp=new LoginPage(driver);
		hp= lp.loginByExcelData();
		mcp=hp.clickManageContactButton().clickEditButton().updateDeliveryTime().clickUpdateButton();
		boolean actualresult=mcp.alertMessage();
		boolean expectedresult=true;
		Assert.assertEquals(expectedresult, actualresult,Constant.mcp_editContact);
	
  }
}
