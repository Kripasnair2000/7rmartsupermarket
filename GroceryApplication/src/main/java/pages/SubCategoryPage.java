package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.GeneralUtilities;

public class SubCategoryPage {

	public WebDriver driver;
	FileUploadUtility fu=new FileUploadUtility();
	GeneralUtilities gu=new GeneralUtilities();
	 
	public SubCategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']")WebElement newButton;
    @FindBy(xpath="//select[@id='cat_id']")WebElement enterCatergory;
    @FindBy(xpath="//input[@id='subcategory']")WebElement enterSubCategory;
    @FindBy(xpath="//input[@id='main_img']")WebElement imageUpload;
    @FindBy(xpath="//button[@class='btn btn-danger']")WebElement subcategorySaveButton;
    @FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement searchButton;
    @FindBy(xpath="//select[@id='un']")WebElement insideCategorySearch;
    @FindBy(xpath="//input[@class='form-control']")WebElement insideSubCategorySearch;
    @FindBy(xpath="//button[@type='submit']")WebElement searchInsideButton;
    @FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")WebElement resetButton;
    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/edit?edit=2059&page_ad=1']")WebElement editButton;
    @FindBy(xpath="//input[@id='subcategory']")WebElement enterUpdateSubCategory;
    @FindBy(xpath="//button[@type='submit']")WebElement updateButton;
    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/delete?del=2059&page_ad=1']")WebElement deleteButton;
    @FindBy(xpath="//h5[text()=' Alert!']") WebElement alertmessage;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertDeleteMessage;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertEditMessage;
    @FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultNotFoundMessage;
    @FindBy(xpath="//h4[text()='List Sub Categories']") WebElement tabletitle;
    
    public SubCategoryPage clickNewButton() {
		newButton.click();
		return this;
	}
	public SubCategoryPage enterCategoryField(){
		gu.selectDropdownWithIndex(enterCatergory,7);
		return this;
	}
	public SubCategoryPage enterSubCategory() {
		enterSubCategory.sendKeys("Cheese");
		return this;
	}
	public SubCategoryPage uploadImage() {
//		imageUpload.sendKeys("C:\\Users\\KRIPA S NAIR\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-01-07 141001.png");
		fu.fileuploadsendKeys(imageUpload);
		return this;
	}
	public SubCategoryPage clickSubCategorySaveButton() {
		 subcategorySaveButton.click();
		 return this;
	}
	public SubCategoryPage clickSearchButton() {
		searchButton.click();
		return this;
	}
	public SubCategoryPage enterSearchCategoryField() {
		gu.selectDropdownWithIndex(insideCategorySearch, 7);
		return this;
	}
	public SubCategoryPage enterSearchSubCategory() {
		insideSubCategorySearch.sendKeys("Ultimate");
		return this;
	}
	public SubCategoryPage clickSearchButtonInside() {
		searchInsideButton.click();
		return this;
	}
	public SubCategoryPage clickResetButton() {
		resetButton.click();
		return this;
	}
	public SubCategoryPage clickOnEditButton() {
		editButton.click();
		return this;
	}
	public SubCategoryPage enterUpdatedSubCategory() {
		enterUpdateSubCategory.sendKeys("toys");
		return this;
	}
	public SubCategoryPage clickUpdateButton() {
		updateButton.click();
		return this;
	}
	public SubCategoryPage clickOnDeleteButton() {
		deleteButton.click();
		return this;
	}
	public boolean getAlertMessage()
	{
		return alertmessage.isDisplayed();
	}
	public boolean checkOnResult()
	{
		return resultNotFoundMessage.isDisplayed();
	}
	
	public boolean checkOnTableTitleIsDisplayed() {
		
		return tabletitle.isDisplayed();
}
	public boolean getAlertMessageForEdit() {
		return alertEditMessage.isDisplayed();
	}
	public boolean getAlertMessageForDelete() {
		return alertDeleteMessage.isDisplayed();
	}
}
