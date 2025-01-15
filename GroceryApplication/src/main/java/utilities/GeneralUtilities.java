package utilities;

import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
	WebDriver driver;

	public String selectDropdownWithValue(WebElement element, String value) {
		Select object = new Select(element);
		object.selectByValue(value);
		WebElement selectedElement = object.getFirstSelectedOption();
		return selectedElement.getText();
	}

	public String selectDropdownWithIndex(WebElement element, int indexNumber) {
		Select object = new Select(element);
		object.selectByIndex(indexNumber);
		WebElement selectedElement = object.getFirstSelectedOption();
		return selectedElement.getText();
	}

	public void selectDropdownWithVisibleText(WebElement element, String text) {
		Select object = new Select(element);
		object.selectByVisibleText(text);
		WebElement selectedElement = object.getFirstSelectedOption();
		selectedElement.click();
	}

	public void clickOnElement(WebElement element) {
		element.click();
	}

	public void clearTextBox(WebElement textbox) {
		textbox.clear();
	}

	public String readAttribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public void hoverOverElement(WebDriver driver,WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void dragAndDrop(WebElement source, WebElement destination) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
	}

	public void keyPress() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
	}

	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	public void rightClickOnElement(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public void arrowDown() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).perform();
	}

	public void arrowUp() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_UP).perform();

	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	public void selectRadioButton(WebElement radioButton) {
		radioButton.click();
	}

	public void selectCheckbox(WebElement checkbox) {
		checkbox.click();
	}

	public void navigateToPage(String page) {
		driver.navigate().to(page);
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void backPage() {
		driver.navigate().back();
	}

	public void forwardPage() {
		driver.navigate().forward();
	}

	public void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public void clickJavaScriptExecutor(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");

	}

	public void scrollbottompage() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

	public void scrollToElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public boolean isElementEnabled(WebElement element) {
		try {
			return element.isEnabled();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
