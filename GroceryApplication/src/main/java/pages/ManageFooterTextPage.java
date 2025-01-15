package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {
		public WebDriver driver;
		public ManageFooterTextPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement editButton;
	    @FindBy(xpath="//textarea[@id='content']")WebElement enterAddress;
	    @FindBy(xpath="//button[@type='submit']")WebElement updateButton;
	    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertmessage;
	    
	    
	    public ManageFooterTextPage clickEditButton(){
	    	editButton.click();
			   return this;
		   }
	    public ManageFooterTextPage updateAddress(){
	    	enterAddress.clear();
	    	enterAddress.sendKeys("Thrissur");
			return this;
		   }
	    public ManageFooterTextPage clickUpdateButton() {
	    	updateButton.click();
			return this;
		   }
	    public boolean alertMessage(){
			   return alertmessage.isDisplayed();
		   }

	
}
