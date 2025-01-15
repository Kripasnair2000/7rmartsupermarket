package testcase;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;

public class SubCategoryTest extends BaseClass{
	LoginPage lp;
	HomePage hp;
	SubCategoryPage sub;
  @Test(priority=1)
  public void verifyAddSubCategoryWithValidDetails() throws IOException {
	  lp = new LoginPage(driver);
	  hp=lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub= hp.clickSubCategoryButton().clickNewSubCategoryButton().clickSelectCategoryOption().enterSubCategoryField()
			 .clickChoosefile().clickSaveButton();
	 boolean actualResult = sub.getAlertMessage();
	 boolean expectedResult = true;
	 Assert.assertEquals(actualResult,expectedResult,Constant.sub_verifyNewCatgoryButton);  
  }
  @Test(priority=2)
  public void verifySearchSubCategory() throws IOException{
	  lp = new LoginPage(driver);
	  hp=lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub= hp.clickSubCategoryButton().clickSearchButton().clickSelectSearchCategoryOption().enterSearchSubCategoryField()
			  .clickSearchOptionButton();
	  boolean expectedResult = true;
	  boolean actualResult = sub.checkResult();
	  Assert.assertEquals(expectedResult, actualResult,Constant.sub_verifySearchButton);
  }
  @Test(priority=3)
  public void verifyResetSubCategory() throws IOException{
	  lp = new LoginPage(driver);
	  hp=lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub= hp.clickSubCategoryButton().clickResetButton();
	  boolean expectedResult = true;
	  boolean actualResult = sub.checkOnTableTitleIsDisplayed();
	  Assert.assertEquals(expectedResult, actualResult,Constant.sub_verifyResetButton);
	  
}
}