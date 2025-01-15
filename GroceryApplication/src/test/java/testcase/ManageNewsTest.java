package testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends BaseClass {
	ManageNewsPage mnp;
	LoginPage lp;
	HomePage hp;

	@Test(groups="smoke")
	public void verifyAddManageNewswithValidCredentials() throws IOException {
		lp = new LoginPage(driver);
		hp = lp.loginByExcelData();
		mnp = hp.clickManageNews().clickOnNewManageNewsButton().enterManageNewsField().clickOnSaveButton();
		boolean actualResult = mnp.getAlertMessage();
		boolean expectedResult = true;
		Assert.assertEquals(expectedResult, actualResult, Constant.mnp_verifyAddManageNews);
	}

	@Test
	public void verifySearchManageNews() throws IOException {
		lp = new LoginPage(driver);
		hp = lp.loginByExcelData();
		mnp = hp.clickManageNews().clickOnManageNewsSearchButton().enterSearchNewsTitleField().clickOnSearchButton();
		boolean actualResult = mnp.checkOnTableTitleIsDisplayed();
		boolean expectedResult = true;
		Assert.assertEquals(expectedResult, actualResult, Constant.mnp_verifySearchManageNews);

	}

	@Test(groups="smoke")
	public void verifyResetManageNews() throws IOException {
		lp = new LoginPage(driver);
		hp = lp.loginByExcelData();
		mnp = hp.clickManageNews().clickOnResetButton();
		boolean actualResult = mnp.checkOnTableTitleIsDisplayed();
		boolean expectedResult = true;
		Assert.assertEquals(expectedResult, actualResult, Constant.mnp_verifyResetManageNews);

	}
}
