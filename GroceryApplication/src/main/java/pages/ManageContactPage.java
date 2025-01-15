package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {
	public WebDriver driver;
	public ManageContactPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']")WebElement editButton;
    @FindBy(xpath="//textarea[@name='del_time']")WebElement enterDeliveryTime;
    @FindBy(xpath="//button[@type='submit']")WebElement updateButton;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertmessage;
    
    
    public ManageContactPage clickEditButton(){
    	editButton.click();
		   return this;
	   }
    public ManageContactPage updateDeliveryTime(){
    	enterDeliveryTime.clear();
    	enterDeliveryTime.sendKeys("70");
		return this;
	   }
    public ManageContactPage clickUpdateButton() {
    	updateButton.click();
		return this;
	   }
    public boolean alertMessage(){
		   return alertmessage.isDisplayed();
	   }
}
