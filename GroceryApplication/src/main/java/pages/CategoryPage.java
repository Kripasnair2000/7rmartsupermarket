package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.GeneralUtilities;

public class CategoryPage {
	public WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities(); 
	FileUploadUtility fu=new FileUploadUtility();
	public CategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@class='active nav-link']")WebElement categoryButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newButton;
	@FindBy(xpath="//input[@id='category']")WebElement enterCategory;
	@FindBy(xpath="//input[@id='main_img']")WebElement imageUpload;
	@FindBy(xpath="//li[@id='134-selectable']") WebElement selectGroupsCategoryList;
	@FindBy(xpath="//li[@id='134-selection']") WebElement selectedGroupsCategoryList;
	@FindBy(xpath="//label[text()='Show On Top Menu']") WebElement radioButton1;
	@FindBy(xpath="//label[text()='Show On Left Menu']") WebElement radioButton2;
	@FindBy(xpath="//button[@type='submit']")WebElement categorySaveButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement searchButton;
	@FindBy(xpath="//input[@class='form-control']")WebElement enterSearchCategory;
	@FindBy(xpath="//button[@type='submit']")WebElement searchButtonInside;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertMessage;
	@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultNotFoundMessage;
	@FindBy(xpath="//h4[text()='List Categories']") WebElement tableTitle;


	public CategoryPage clickNewButton() {
		newButton.click();
		return this;
	}
	public CategoryPage enterCategoryField(){
		enterCategory.sendKeys("LaysGreen1");
		return this;
	}
	public CategoryPage selectGroupsOnCategoryList(){
		selectGroupsCategoryList.click();
		return this;
	}
	public CategoryPage uploadImage() {
		fu.fileupload(imageUpload);
		return this;
	}
	public CategoryPage clickOnRadioButton1()
	{
		gu.scrollToElement(driver,radioButton1);
	    gu.hoverOverElement(driver,radioButton1);
		return this;
	}
	public CategoryPage clickOnRadioButton2()
	{
		gu.scrollToElement(driver,radioButton2);
		gu.hoverOverElement(driver,radioButton2);
		return this;
	}
	public CategoryPage clickCategorySaveButton() {
		 categorySaveButton.click();
		 return this;
	}
	public CategoryPage clickSearchButton() {
		searchButton.click();
		return this;
	}
	public CategoryPage enterSearchCategoryField() {
		enterSearchCategory.sendKeys("LapTop");
		return this;
	}
	public CategoryPage clickSearchButtonInside() {
		searchButtonInside.click();
		return this;
		
	}
	public CategoryPage clickResetButton() {
		resetButton.click();
		return this;
	}
	public boolean getAlertMessage(){
		return alertMessage.isDisplayed();
	}
	public boolean checkOnResultMessage(){
		return resultNotFoundMessage.isDisplayed();
	}
	public boolean checkOnTableTitleIsDisplayed() {
		return tableTitle.isDisplayed();
	}
}
	
