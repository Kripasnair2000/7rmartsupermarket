package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.FileUploadUtility;
import utilities.GeneralUtilities;



public class SubCategoryPage {
	public WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	FileUploadUtility fu=new FileUploadUtility();
	public SubCategoryPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newButton;
	@FindBy(xpath="//select[@id='cat_id']") WebElement selectCategory;
	@FindBy(xpath="//input[@id='subcategory']") WebElement enterSubCategory;
	@FindBy(xpath="//input[@type='file']") WebElement choosefile;
	@FindBy(xpath="//button[text()='Save']") WebElement saveButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchButton;
	@FindBy(xpath="//select[@id='un']") WebElement selectSearchCategoryOption;
	@FindBy(xpath="//input[@name='ut']") WebElement searchSubCategoryField;
	@FindBy(xpath="//button[@name='Search']") WebElement searchOptionButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetButton;
	@FindBy(xpath="//h5[text()=' Alert!']") WebElement alertmessage;
	@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultNotFoundMessage;
	@FindBy(xpath="//h4[text()='List Sub Categories']") WebElement tabletitle;
	
	public SubCategoryPage clickNewSubCategoryButton()
	{
		newButton.click();
		return this;
	}
	public SubCategoryPage clickSelectCategoryOption()
	{
		gu.selectDropdownWithIndex(selectCategory, 8);
		return this;
		
	}
	public SubCategoryPage enterSubCategoryField()
	{   
		enterSubCategory.sendKeys("super");
		return this;
	}
	public SubCategoryPage clickChoosefile()
	{
		fu.fileuploadsendKeys(choosefile);
	 	return this;
	}
	public SubCategoryPage clickSaveButton()
	{
		saveButton.click();
		return this;
	}
	public SubCategoryPage clickSearchButton()
	{
		searchButton.click();
		return this;
	}
	public SubCategoryPage clickSelectSearchCategoryOption()
	{
		gu.selectDropdownWithIndex(selectSearchCategoryOption, 7);
		return this;
	}
	public SubCategoryPage enterSearchSubCategoryField()

	{   
		searchSubCategoryField.sendKeys("ulitmate");
		return this;
	}
	public SubCategoryPage clickSearchOptionButton()
	{
		searchOptionButton.click();
		return this;
	}
	public SubCategoryPage clickResetButton()
	{
		resetButton.click();
		return this;
	}
	public boolean getAlertMessage()
	{
		return alertmessage.isDisplayed();
	}
	public boolean checkResult()
	{
		return resultNotFoundMessage.isDisplayed();
	}
	public boolean checkOnTableTitleIsDisplayed() {
		
		return tabletitle.isDisplayed();
	}
	
	
}