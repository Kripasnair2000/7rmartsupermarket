package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newManageNewsButton;
	@FindBy(xpath = "//textarea[@id='news']")WebElement newsField;
	@FindBy(xpath = "//button[@type='submit']")WebElement saveButton;
	@FindBy(xpath = "//a[text()=' Search']")WebElement searchButton;
	@FindBy(xpath = "//input[@name='un']")WebElement searchNewstitlefield;
	@FindBy(xpath = "//button[@name='Search']")WebElement submitSearchButton;
	@FindBy(xpath = "//a[text()=' Reset']")WebElement resetButton;

	public ManageNewsPage clickOnNewManageNewsButton() {
		newManageNewsButton.click();
		return this;
	}

	public ManageNewsPage enterManageNewsField()

	{
		newsField.sendKeys("Heavy rain");
		return this;

	}

	public ManageNewsPage clickOnSaveButton() {
		saveButton.click();
		return this;
	}

	public ManageNewsPage clickOnManageNewsSearchButton() {
		searchButton.click();
		return this;
	}

	public ManageNewsPage enterSearchNewsTitleField()

	{
		searchNewstitlefield.sendKeys("Heavy rain");
		return this;

	}

	public ManageNewsPage clickOnSearchButton() {
		submitSearchButton.click();
		return this;
	}

	public ManageNewsPage clickOnResetButton() {
		resetButton.click();
		return this;
	}
}
