package testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends BaseClass {
	ManageNewsPage mnp;
	LoginPage lp;
	HomePage hp;

	@Test
	public void verifyAddManageNews() throws IOException {
		lp = new LoginPage(driver);
		hp = lp.loginByExcelData();
		hp = new HomePage(driver);
		mnp = hp.clickManageNews().clickOnNewManageNewsButton().enterManageNewsField().clickOnSaveButton();
	}

	@Test
	public void verifySearchManageNews() throws IOException {
		lp = new LoginPage(driver);
		hp = lp.loginByExcelData();
		hp = new HomePage(driver);
		mnp = hp.clickManageNews().clickOnManageNewsSearchButton().enterSearchNewsTitleField()
				.clickOnSearchButton();

	}

	@Test
	public void verifyResetManageNews() throws IOException {

		lp = new LoginPage(driver);
		hp = lp.loginByExcelData();
		hp = new HomePage(driver);
		mnp = hp.clickManageNews().clickOnResetButton();
	}
}
