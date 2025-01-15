package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import constant.Constant;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.GeneralUtilities;

public class CategoryTest extends BaseClass {
	CategoryPage category;
	LoginPage lp;
	HomePage hp;
	GeneralUtilities gu=new GeneralUtilities();
  @Test(priority=1)
  public void verifyUserIsAbleToAddNewCatgoryWithValidDetails() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.loginByExcelData();
	  category=hp.clickCategoryButton().clickNewButton().enterCategoryField().selectGroupsOnCategoryList().uploadImage().clickOnRadioButton1().clickOnRadioButton2().clickCategorySaveButton();
	  boolean actualResult = category.getAlertMessage();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constant.category_verifyAddCategory);  
  }
  @Test(priority=2)
  public void verifyUserIsAbleToSearchExistingCategory() throws IOException{
	  lp=new LoginPage(driver);
	  hp=lp.loginByExcelData();
	  category=hp.clickCategoryButton().clickSearchButton().enterSearchCategoryField().clickSearchButtonInside();
	  boolean actualResult = category.checkOnResultMessage();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constant.category_verifySearchCategory); 
  }
  @Test(priority=3)
  public void verifyUserIsAbleToResetCategory() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  category=hp.clickCategoryButton().clickResetButton();
	  boolean actualResult =category.checkOnTableTitleIsDisplayed();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constant.category_verifyResetCategory); 

  }
}
