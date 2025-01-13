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
  @Test
  public void verifyAddNewCatgoryWithValidDetails() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.loginByExcelData();
	  hp=new HomePage(driver);
	  category=hp.clickCategoryButton().enterCategoryField().uploadImage().clickOptions().clickCategorySaveButton();
	  boolean actualResult = category.getAlertMessage();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constant.category_verifyAddCategory);  
  }
  @Test
  public void verifySearchExistingCategory() throws IOException{
	  lp=new LoginPage(driver);
	  hp=lp.loginByExcelData();
	  hp=new HomePage(driver);
	  category=hp.clickCategoryButton().clickSearchButton().enterSearchCategoryField().clickSearchButtonInside();
	  boolean actualResult = category.checkOnResultMessage();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constant.category_verifySearchCategory); 
  }
  @Test
  public void verifyReset() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  category=hp.clickCategoryButton().clickResetButton();
	  boolean actualResult =category.checkOnTableTitleIsDisplayed();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constant.category_verifyResetCategory); 

  }
  @Test
  public void verifyEditButton() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  category=hp.clickCategoryButton().clickOnEditButton().enterUpdateCategory().clickUpdateButton();
	  boolean actualResult = category.getAlertMessageForEdit();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constant.category_verifyEditButton);
  }
  @Test
  public void verifyDeleteButton() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  category=hp.clickCategoryButton().clickOnDeleteButton();
	  gu.acceptAlert();
	  boolean actualResult = category.getAlertMessageForDelete();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constant.category_verifyDeleteButton);  
  }
}
