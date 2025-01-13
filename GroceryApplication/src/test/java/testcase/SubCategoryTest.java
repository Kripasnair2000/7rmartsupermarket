package testcase;

import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.GeneralUtilities;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SubCategoryTest extends BaseClass{

    SubCategoryPage sub;
	LoginPage lp;
	HomePage hp;
	GeneralUtilities gu=new GeneralUtilities();
@Test
public void verifyNewCatgoryButton() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub=hp.clickSubCategoryButton().clickNewButton().enterCategoryField().enterSubCategory().uploadImage().clickSubCategorySaveButton();
	  boolean actualResult = sub.getAlertMessage();
	  boolean expectedResult = true;
	  Assert.assertEquals(actualResult,expectedResult,Constant.sub_verifyNewCatgoryButton);
}
@Test
public void verifySearchButton() throws IOException{
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub=hp.clickSubCategoryButton().clickSearchButton().enterSearchCategoryField().enterSearchSubCategory().clickSearchButtonInside();
	  boolean expectedResult = true;
	  boolean actualResult = sub.checkOnResult();
	  Assert.assertEquals(expectedResult, actualResult,Constant.sub_verifySearchButton);

}
@Test
public void verifyResetButton() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub=hp.clickSubCategoryButton().clickResetButton();
	  boolean expectedResult = true;
	  boolean actualResult = sub.checkOnTableTitleIsDisplayed();
	  Assert.assertEquals(expectedResult, actualResult,Constant.sub_verifyResetButton);
}
@Test
public void verifyEditButton() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub=hp.clickSubCategoryButton().clickOnEditButton().enterUpdatedSubCategory().clickUpdateButton();
	  boolean actualResult = sub.getAlertMessageForEdit();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constant.sub_verifyEditButton);
}
@Test
public void verifyDeleteButton() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub=hp.clickSubCategoryButton().clickOnDeleteButton();
	  gu.acceptAlert();
	  boolean actualResult = sub.getAlertMessageForDelete();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constant.sub_verifyDeleteButton);  
}
}
