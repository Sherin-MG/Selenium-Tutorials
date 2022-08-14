package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Working with Selectables(keydown)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		List<WebElement> orderlistfull=	driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int size=	orderlistfull.size();
		System.out.println(size);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(orderlistfull.get(0))
		.click(orderlistfull.get(1))
		.click(orderlistfull.get(2))
		.build().perform();
		driver.quit();
		
		//2.Working with selectables(clickandhold)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://www.leafground.com/pages/selectable.html");
		List<WebElement> orderlistfulls=	driver2.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int size1=	orderlistfulls.size();
		System.out.println(size1);
		Actions action1 = new Actions(driver2);
		action1.clickAndHold(orderlistfulls.get(0));
		action1.clickAndHold(orderlistfulls.get(1));
		action1.build().perform();
		
		
		
		
		
	}

}
