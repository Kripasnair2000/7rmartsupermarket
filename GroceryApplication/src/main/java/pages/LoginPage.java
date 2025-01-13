package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;

public class LoginPage {
	public WebDriver driver;
	 
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']")WebElement userName;
	@FindBy(xpath="//input[@name='password']")WebElement passWordField;
	@FindBy(xpath="//button[@type='submit']")WebElement signInButton;
	@FindBy(xpath="//span[text()='7rmart supermarket']") WebElement homepage;
    @FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alertmessage;
	
	public LoginPage enterUserName(String username)
	{
		userName.sendKeys(username);
		return this;
	}
	public LoginPage  enterPassword(String password) 
	{
		passWordField.sendKeys(password);
		return this;
	}
	public HomePage clicksigninButton() 
	{
		signInButton.click();
		return new HomePage(driver);
	}
	public boolean homePagedDisplayed()
	{
		return homepage.isDisplayed();
	}
	public String getAlert()
	{
		return alertmessage.getText();
	}
	
	public HomePage loginByExcelData() throws IOException
	{
		String username = ExcelUtility.readStringData(1, 0, "Sheet1");
		String password = ExcelUtility.readStringData(1, 1, "Sheet1");
		userName.sendKeys(username);
		passWordField.sendKeys(password);
		signInButton.click();
		return new HomePage(driver);
	}
	public HomePage loginByExcelData1() throws IOException
	{
		String username=ExcelUtility.readStringData(3,0,"Sheet1");
		String password=ExcelUtility.readStringData(3,1,"Sheet1");
		userName.sendKeys(username);
		passWordField.sendKeys(password);
		signInButton.click();
		return new HomePage(driver);
	}

	public HomePage loginByExcelData2() throws IOException
	{
		String username=ExcelUtility.readStringData(4,0,"Sheet1");
		String password=ExcelUtility.readStringData(4,1,"Sheet1");
		userName.sendKeys(username);
		passWordField.sendKeys(password);
		signInButton.click();
		return new HomePage(driver);
		
	}
}

