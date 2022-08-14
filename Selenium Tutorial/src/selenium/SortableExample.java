package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0107d9y0x57yww1tmqjm42l71s069558.node0");
		List<WebElement> total=	driver.findElements(By.xpath("//*[@id=\"form:j_idt94_data\"]/tr"));
		WebElement from=total.get(0);
		WebElement to=total.get(1);
		Actions action = new Actions(driver);
		action.clickAndHold(from);
		Thread.sleep(5000);
		action.moveToElement(to);
		action.release().build().perform();
	
	}

}
