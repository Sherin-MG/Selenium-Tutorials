package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		WebElement textbox=	driver.findElement(By.id("yschsp"));
		textbox.sendKeys("s");
		Thread.sleep(5000);//time for loading list of web elements
		
		List<WebElement>entirelist=	driver.findElements(By.xpath("//*[@id=\"sbq-wrap\"]/div/div/div/ul/li"));
		int size=	entirelist.size();
		System.out.println(size);//to check whether it has identified entire list
		for (WebElement webElement : entirelist) {
			if (webElement.getText().equals("songs")) {
				webElement.click();
				break;//to stop hyteration
				
			}
			
		}
	}

}
