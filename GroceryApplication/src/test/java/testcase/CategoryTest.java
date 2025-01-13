package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;

public class CategoryTest extends BaseClass {
	CategoryPage category;
	LoginPage lp;
	HomePage hp;
  @Test
  public void verifyAddNewCatgoryWithValidDetails() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.loginByExcelData();
	  hp=new HomePage(driver);
	  category=hp.clickCategoryButton().enterCategoryField().uploadImage().clickOptions().clickCategorySaveButton();
  }
  @Test
  public void verifySearchExistingCategory() throws IOException{
	  lp=new LoginPage(driver);
	  hp=lp.loginByExcelData();
	  hp=new HomePage(driver);
	  category=hp.clickCategoryButton().clickSearchButton().enterSearchCategoryField().clickSearchButtonInside();

  }
  @Test
  public void verifyReset() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  category=hp.clickCategoryButton().clickResetButton();

  }
  @Test
  public void verifyEditButton() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  category=hp.clickCategoryButton().clickOnEditButton();
  }
  @Test
  public void verifyDeleteButton() throws IOException {
	  lp=new LoginPage(driver);
	  lp.loginByExcelData();
	  hp=new HomePage(driver);
	  category=hp.clickCategoryButton().clickOnDeleteButton();
	  driver.switchTo().alert().accept();
  }
}
