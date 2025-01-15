package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUtility {
	public void fileuploadsendKeys(WebElement element) 
	{
		element.sendKeys("C:\\Users\\KRIPA S NAIR\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-01-13 132651.png");
	}
	
	public void FileUploadUtility (WebDriver driver, String filePath, WebElement uploadButton)
	{
	String path= System.getProperty("user.dir")+filePath;
	System.out.println("Path:" +path);
	StringSelection ss = new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	Actions action= new Actions (driver);
	action.moveToElement(uploadButton).click().perform();
	Robot robot;
	try {
	robot= new Robot();
	robot.delay(1000);
	// Keyboard actions
	robot.keyPress (KeyEvent.VK_CONTROL);
	robot.keyPress (KeyEvent. VK_V);
	robot.delay(1000);
	robot.keyRelease (KeyEvent.VK_CONTROL);
	robot.keyRelease (KeyEvent. VK_V);
	robot.delay(1000);
	robot.keyPress (KeyEvent.VK_ENTER);
	robot.delay(1000);
	robot.keyRelease (KeyEvent. VK_ENTER);
	} catch (AWTException e) {

	e.printStackTrace();
	}
	}
}
