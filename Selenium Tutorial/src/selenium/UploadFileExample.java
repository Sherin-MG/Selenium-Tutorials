package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml;jsessionid=node0fzykm5m73aue1cnnzxjxor4e75505.node0");
		WebElement basicupload=	driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]"));
		Thread.sleep(2000);
		basicupload.click();
		//	Downloads\TestLeaf Logo.png
		//for convrting file loction to plain text format to transferable
		StringSelection selection = new StringSelection("Downloads\\TestLeaf Logo.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		//To perform mouse or keyboard related functions in windows use class:ROBOT
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
