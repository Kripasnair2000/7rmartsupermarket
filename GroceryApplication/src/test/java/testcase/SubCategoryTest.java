package testcase;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class SubCategoryTest extends BaseClass{

    SubCategoryPage sub;
	LoginPage lp;
	HomePage hp;
@Test
public void verifyNewCatgoryButton() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub=hp.clickSubCategoryButton().clickNewButton().enterCategoryField().enterSubCategory().uploadImage().clickSubCategorySaveButton();
}
@Test
public void verifySearchButton() throws IOException{
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub=hp.clickSubCategoryButton().clickSearchButton().enterSearchCategoryField().enterSearchSubCategory().clickSearchButtonInside();

}
@Test
public void verifyResetButton() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub=hp.clickSubCategoryButton().clickResetButton();
}
@Test
public void verifyEditButton() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub=hp.clickSubCategoryButton().clickOnEditButton();
}
@Test
public void verifyDeleteButton() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  sub=hp.clickSubCategoryButton().clickOnDeleteButton();
	  driver.switchTo().alert().accept();
}
}
