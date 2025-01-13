package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
	public WebDriver driver;
	 
	public CategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@class='active nav-link']")WebElement categoryButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newButton;
	@FindBy(xpath="//input[@id='category']")WebElement enterCategory;
	@FindBy(xpath="//input[@id='main_img']")WebElement imageUpload;
	@FindBy(xpath="//input[@value='yes' and @name='top_menu']")WebElement showOnTopMenuOption;
	@FindBy(xpath="//input[@value='yes' and @name='show_home']")WebElement showOnLeftMenuOption;
	@FindBy(xpath="//button[@type='submit']")WebElement categorySaveButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement searchButton;
	@FindBy(xpath="//input[@class='form-control']")WebElement enterSearchCategory;
	@FindBy(xpath="//button[@type='submit']")WebElement searchButtonInside;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")WebElement resetButton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/category/edit?edit=614&page_ad=1']")WebElement editButton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/category/delete?del=604&page_ad=1']")WebElement deleteButton;

	
//	public void clickCategoryButton() {
//		categoryButton.click();
//	}
	public CategoryPage clickNewButton() {
		newButton.click();
		return this;
	}
	public CategoryPage enterCategoryField(){
		enterCategory.sendKeys("Lays");
		return this;
		
	}
	public CategoryPage uploadImage() {
		imageUpload.sendKeys("C:\\Users\\KRIPA S NAIR\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-01-07 141001.png");
		return this;
	}
	public CategoryPage clickOptions() {
		showOnTopMenuOption.click();
		showOnLeftMenuOption.click();
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
		enterSearchCategory.sendKeys("Icecream");
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
	public CategoryPage clickOnEditButton() {
		editButton.click();
		return this;
	}
	public CategoryPage clickOnDeleteButton() {
		deleteButton.click();
		return this;
	}
}
	
