package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		//1. Go to dashboard
		WebElement dashboardlink=	driver.findElement(By.linkText("Go to Dashboard"));
		dashboardlink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		//2.Where am i going
		WebElement wherelink=	driver.findElement(By.partialLinkText("Find the"));
		String where=	wherelink.getAttribute("href");
		System.out.println(where);
		//3.Verify am i broken
		WebElement brokenlink=	driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[3]/div/div/a"));
		brokenlink.click();
		String title=	driver.getTitle();
		if (title.contains("404")) {
			System.out.println("The link is broken");
			
		}
		Thread.sleep(2000);
		driver.navigate().back();
		//4.How many links in this layout
		List<WebElement>linkcount=	driver.findElements(By.tagName("a"));
		Thread.sleep(3000);
		int count=	linkcount.size();
		System.out.println(count);
		//5.Number of links in webpage
		WebElement webpagelink=	driver.findElement(By.linkText("How many links in this page?"));
		webpagelink.click();
		List<WebElement>	webpagelink2=	driver.findElements(By.tagName("img"));
		int imgcount=	webpagelink2.size();
		System.out.println(imgcount);
	}	

}
