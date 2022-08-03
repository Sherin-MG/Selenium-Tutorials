package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		//1.I Frame
		driver.switchTo().frame(0);
		WebElement clickme=	driver.findElement(By.id("Click"));
		clickme.click();
		String text=	driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		//2. Nested Frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement clickme2=	driver.findElement(By.id("Click1"));
		clickme2.click();
		driver.switchTo().defaultContent();
		
		//3.Find total number of frames
		List<WebElement> totalnumbers=	driver.findElements(By.tagName("iframe"));
		int total=	totalnumbers.size();
		System.out.println(total);
		
	
		
	}

}
